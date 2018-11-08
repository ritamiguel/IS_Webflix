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
public class ManagerEJB implements ManagerEJBRemote {

    @PersistenceContext
    EntityManager em;

    /**
     * Default constructor.
     */
    public ManagerEJB() {
        // TODO Auto-generated constructor stub
    }

    //add content to table of contents
    public void addContent(ContentDTO content){
        try {
            Query newQuery = em.createQuery("insert into content (title,director,year,category) values (?1,?2,?3,?4) ");
            newQuery.setParameter(1, content.getTitle());
            newQuery.setParameter(2, content.getDirector());
            newQuery.setParameter(3, content.getYear());
            newQuery.setParameter(4, content.getCategory());
            newQuery.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    //Edit the multimedia content
    public void editContent(ContentDTO content){

    }

}
