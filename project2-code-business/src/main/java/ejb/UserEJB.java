package ejb;

import security.BCrypt;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;
import dto.ContentDTO;
import dto.UserDTO;
import data.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Session Bean implementation class UserEJB
 */
@Stateless
@LocalBean
public class UserEJB implements UserEJBRemote {
	
	@PersistenceContext
    EntityManager em;

    /**
     * Default constructor. 
     */
    public UserEJB() {
        // TODO Auto-generated constructor stub
    }


    public String hashPassword(String password)
    {
        String hashed =  BCrypt.hashpw(password,BCrypt.gensalt());
        return hashed;
    }
    
    public String createAccount(String firstName, String lastName, String email, String password, int creditcard, int isManager)
    {
        try {
            Query newQuery = em.createQuery("FROM User user where user.email=?1");
            newQuery.setParameter(1, email);
            User user = (User) newQuery.getSingleResult();
            if (user != null) {
                return "Email already in use!";
            }
        } catch (NoResultException NRE) {
            try {
                User newUser = new User(firstName,lastName, email, hashPassword(password), creditcard, isManager);
                
                em.persist(newUser);
                return "Success";
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error creating user.");
                return "Error creating a new user!";
            }
        }
        return "Error creating a new user!";
    }

    // get user with email and password
    public User recognizeUser(String email, String password) {
        try{

	            Query newQuery = em.createQuery(" FROM User user where user.email=?1");
	            newQuery.setParameter(1, email);
	            User userToAuth = (User) newQuery.getSingleResult();
	            if(userToAuth != null) 
	            {
	            	if(BCrypt.checkpw(password, userToAuth.getPassword()) == true) {
	            		return userToAuth;
	            	}
	            }
	                       
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }

  //add movie or episode to watch list
    public String addMovie(String title, long id){
        Content content = null;
        User user = null;
        try {
            Query pickMovie = em.createQuery("FROM Content t where t.title=?1");
            pickMovie.setParameter(1, title);

            user = em.find(User.class, id);

            content = (Content) pickMovie.getSingleResult();
            user.getWatchlist().add(content);

            return "Success";
        } catch(NoResultException e){
            e.printStackTrace();
            System.out.println("Error addMovie !");
            return "Error adding a content to list!";
        }
    }

    public String updateUser(String option, String newAttribute, long id) {
        System.out.println(option);
        User userToUpdate = (User) em.find(User.class, id);

        if(userToUpdate != null) {
            int x = 0;
            if ("First Name".equals(option)) {
                userToUpdate.setFirstName(newAttribute);

            } else if ("Last Name".equals(option)) {
                userToUpdate.setLastName(newAttribute);

            } else if ("email".equals(option)) {// verify email example@email.com format
                userToUpdate.setEmail(newAttribute);
                userToUpdate.setPassword(hashPassword(newAttribute));

            } else if ("password".equals(option)) {
                userToUpdate.setPassword(hashPassword(newAttribute));

            } else if ("Credit Card".equals(option)) {// verify int
                int ccnum = Integer.parseInt(newAttribute);
                userToUpdate.setCreditcard(ccnum);

            } else {
                x = 1;

            }
            if (x == 0)
                return "Success";
        }
        return "Error";
    }


  
    //print watch list
      public List<Content> watchList(long id){
          User user = em.find(User.class, id);
          List<Content> listu = user.getWatchlist();

          return listu;
      }

    public String deleteAccount(long id)
    {
        try{
            User user = em.find(User.class, id);
            em.remove(user);
            return "Success";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Error";

    }
    
    
}
