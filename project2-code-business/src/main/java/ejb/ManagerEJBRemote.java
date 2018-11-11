package ejb;

import javax.ejb.Remote;
import java.util.List;
import data.Content;
import data.User;

import dto.UserDTO;
import dto.ContentDTO;

@Remote
public interface ManagerEJBRemote {
    public String addContent(ContentDTO contentdto, int option);
    public String updateContent(int option, String newAttribute, String title);
    public String deleteContent(String title);
    public List<ContentDTO> searchByCategory(String category);
    List<ContentDTO> searchByDirector(String director);
    public List<ContentDTO> searchByTitle(String title);
    public List<ContentDTO> searchByYear(String year);
    public List<ContentDTO> getAllContent();
}