package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

import dto.ContentDTO;
import dto.UserDTO;

import data.User;

import java.util.ArrayList;

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
                User newUser = new User(firstName,lastName, email, password, creditcard, isManager);
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
                return userToAuth;
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }

    //add movie or episode to watch list
    public void addMovie(ContentDTO content, UserDTO user){
        try {
            Query pickMovie = em.createQuery("select title from content where title = ?1");
            pickMovie.setParameter(1, content.getTitle());
            user.getWatchlist().add(content);
        } catch(Exception e){
            e.printStackTrace();
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
                userToUpdate.setPassword(newAttribute);

            } else if ("password".equals(option)) {
                userToUpdate.setPassword(newAttribute);

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

    //Imprimir watch list
    public ArrayList watchList(){
        try {
            Query newQuery = em.createQuery("select title, director, year, category from content");
            newQuery.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
