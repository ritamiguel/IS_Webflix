package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;
import dto.*;
import data.*;
import java.util.*;



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
    public String addContent(ContentDTO contentdto, int option) {
        try {
            Query newQuery = em.createQuery("FROM Content cont where cont.title=?1");
            newQuery.setParameter(1, contentdto.getTitle());
            Content content = (Content) newQuery.getSingleResult();
            if (content != null) {
                return "Error! Content with that title already exists!";
            }
        }  catch (NoResultException NRE) {
             try{
            	 Content contentToPersist = new Content(contentdto.getTitle(), contentdto.getDirector(), contentdto.getYear(), contentdto.getCategory());
                 em.persist(contentToPersist);
                 return "Success";
             } catch (Exception e) {
                 e.printStackTrace();
                 System.out.println("Error new content!");
                 return "Error creating new content!";
             }
        }
        
        return "Error creating new content!";
    }

    //Edit the multimedia content
    public String updateContent(int option, String newAttribute, String title){
    	
    	try {
            Query newQuery = em.createQuery("FROM Content cont where cont.title=?1");
            newQuery.setParameter(1, title);
            Content content = (Content) newQuery.getSingleResult();
            if (content != null) {  	
	        	switch(option) {
	        		case 1: content.setTitle(newAttribute); break;
	        		case 2: content.setDirector(newAttribute); break;
	        		case 3:	int year = Integer.parseInt(newAttribute);
	        		content.setYear(year);
	                	break;
	        		case 4:content.setCategory(newAttribute); break;
	        	}
	          return "Success";
	        }
    	 }  catch (NoResultException NRE) {
    		return "Error! Did not found movie with that title";
    	}
    	return "Error!";
    }


    //Delete content
    public String deleteContent(String title){
        try {
        	Query newQuery = em.createQuery("FROM Content cont where cont.title=?1");
            newQuery.setParameter(1, title);
            Content content = (Content) newQuery.getSingleResult();
            if (content != null) { 
            	em.remove(content);
            	return "Success";
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }
    
    public List<ContentDTO> searchByCategory(String category){
        try {
            Query newQuery = em.createQuery("from Content cont where cont.category = ?1");
            newQuery.setParameter(1, category);
            List<Content> result = newQuery.getResultList();
            ArrayList<ContentDTO> resultDTO = new ArrayList<ContentDTO>();
            for (Content content : result) {
            	List <EpisodeDTO> episodeDTO = new ArrayList<EpisodeDTO>();
            	for(Episode ep : content.getEpisodes()) {
            		episodeDTO.add(new EpisodeDTO(ep.getTitle(),ep.getSinopse()));
            	}
            	ContentDTO contentToContentDTO = new ContentDTO(content.getTitle(), content.getDirector(), content.getYear(), content.getCategory(), episodeDTO);
                resultDTO.add(contentToContentDTO);
            }
            return resultDTO;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<ContentDTO> searchByDirector(String director){
    	try {
            Query newQuery = em.createQuery("from Content cont where cont.director = ?1");
            newQuery.setParameter(1, director);
            List<Content> result = newQuery.getResultList();
            ArrayList<ContentDTO> resultDTO = new ArrayList<ContentDTO>();
            for (Content content : result) {
            	List <EpisodeDTO> episodeDTO = new ArrayList<EpisodeDTO>();
            	for(Episode ep : content.getEpisodes()) {
            		episodeDTO.add(new EpisodeDTO(ep.getTitle(),ep.getSinopse()));
            	}
            	ContentDTO contentToContentDTO = new ContentDTO(content.getTitle(), content.getDirector(), content.getYear(), content.getCategory(), episodeDTO);
                resultDTO.add(contentToContentDTO);
            }
            return resultDTO;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<ContentDTO> searchByYear(String yearstr){
    	int year = Integer.parseInt(yearstr);
    	try {
            Query newQuery = em.createQuery("from Content cont where cont.year = ?1");
            newQuery.setParameter(1, year);
            List<Content> result = newQuery.getResultList();
            ArrayList<ContentDTO> resultDTO = new ArrayList<ContentDTO>();
            for (Content content : result) {
            	List <EpisodeDTO> episodeDTO = new ArrayList<EpisodeDTO>();
            	for(Episode ep : content.getEpisodes()) {
            		episodeDTO.add(new EpisodeDTO(ep.getTitle(),ep.getSinopse()));
            	}
            	ContentDTO contentToContentDTO = new ContentDTO(content.getTitle(), content.getDirector(), content.getYear(), content.getCategory(), episodeDTO);
                resultDTO.add(contentToContentDTO);
            }
            return resultDTO;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<ContentDTO> searchByTitle(String title){
    	try {
            Query newQuery = em.createQuery("from Content cont where cont.title = ?1");
            newQuery.setParameter(1, title);
            List<Content> result = newQuery.getResultList(); 
            ArrayList<ContentDTO> resultDTO = new ArrayList<ContentDTO>();
            
            for (Content content : result) {
            	List <EpisodeDTO> episodeDTO = new ArrayList<EpisodeDTO>();
            	for(Episode ep : content.getEpisodes()) {
            		episodeDTO.add(new EpisodeDTO(ep.getTitle(),ep.getSinopse()));
            	}
            	ContentDTO contentToContentDTO = new ContentDTO(content.getTitle(), content.getDirector(), content.getYear(), content.getCategory(), episodeDTO);
                resultDTO.add(contentToContentDTO);
            }
            return resultDTO;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
  
    public List<ContentDTO> getAllContent(){
    	try {
            Query newQuery = em.createQuery("from Content");
            List<Content> result = newQuery.getResultList();
            ArrayList<ContentDTO> resultDTO = new ArrayList<ContentDTO>();
            for (Content content : result) {
            	List <EpisodeDTO> episodeDTO = new ArrayList<EpisodeDTO>();
            	for(Episode ep : content.getEpisodes()) {
            		episodeDTO.add(new EpisodeDTO(ep.getTitle(),ep.getSinopse()));
            	}
            	ContentDTO contentToContentDTO = new ContentDTO(content.getTitle(), content.getDirector(), content.getYear(), content.getCategory(), episodeDTO);
                resultDTO.add(contentToContentDTO);
            }
            return resultDTO;
        } catch (NoResultException nre) {
 
            return null;
        } 
    }
}


