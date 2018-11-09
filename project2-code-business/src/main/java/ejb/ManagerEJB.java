package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

import dto.ContentDTO;
import dto.UserDTO;
import data.Content;
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
    public void addContent(ContentDTO contentdto, int option) {
        try {
            Query newQuery = em.createNativeQuery("insert into contents (title,director,year,category,id) values (?1,?2,?3,?4,?5) ");
            newQuery.setParameter(1, contentdto.getTitle());
            newQuery.setParameter(2, contentdto.getDirector());
            newQuery.setParameter(3, contentdto.getYear());
            newQuery.setParameter(4, contentdto.getCategory());
            newQuery.setParameter(5, contentdto.getId());
            newQuery.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
        Content contentToPersist = new Content(contentdto.getTitle(), contentdto.getDirector(), contentdto.getYear(), contentdto.getCategory());
        try{
            em.persist(contentToPersist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Edit the multimedia content
    public String updateContent(String option, String newAttribute, String title){
        System.out.println(option);
        Content contentToUpdate = (Content) em.find(Content.class, title);

        if(contentToUpdate != null) {
            int x = 0;
            if ("Title".equals(option)) {
                contentToUpdate.setTitle(newAttribute);

            } else if ("Director".equals(option)) {
                contentToUpdate.setDirector(newAttribute);

            } else if ("Year".equals(option)) {
                int year = Integer.parseInt(newAttribute);
                contentToUpdate.setYear(year);

            } else if ("password".equals(option)) {
                contentToUpdate.setCategory(newAttribute);

            } else {
                x = 1;

            }
            if (x == 0)
                return "Success";
        }
        return "Error";
    }


    //Delete content
    public void deleteContent(ContentDTO contentdto){
        try {
            Query newQuery = em.createQuery("delete from Contents where title = ?1");
            newQuery.setParameter(1, contentdto.getTitle());
            newQuery.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
