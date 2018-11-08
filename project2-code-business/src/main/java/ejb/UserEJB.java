package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

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


    public String login(String email, String password){
        try {
            Query logQuery = em.createQuery("SELECT email, password FROM user WHERE email=? AND password=?");
            User user = (User) logQuery.getSingleResult();
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return "Sucess";
            } else {
                return "The email and/or password are incorrect";
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error login.");
            return "Error login";
        }
    }

    public String createAccount(String firstName, String lastName, String email, String password, int creditcard)
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
                User newUser = new User(firstName,lastName, email, password, creditcard);
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
    public void addMovie(String title, String director, String year, String category){

        try {
            Query newQuery = em.createQuery("insert into content (title,director,year,category) values (?1,?2,?3,?4) ");
            newQuery.setParameter(1, title);
            newQuery.setParameter(2, director);
            newQuery.setParameter(3, year);
            newQuery.setParameter(4, category);
            newQuery.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList watchList(){


        try {
            Query newQuery = em.createQuery("select title, director, year, category from content");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
