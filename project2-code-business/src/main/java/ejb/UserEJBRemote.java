package ejb;

import javax.ejb.Remote;

import data.User;
import dto.UserDTO;
import dto.ContentDTO;

@Remote
public interface UserEJBRemote {

    public String createAccount(String firstName, String lastName, String email, String password, int creditcard, int isManager);
    public User recognizeUser(String email, String password);
    public void addMovie(ContentDTO content, UserDTO user);
    public String updateUser(String option, String newAttribute, long id);
    public ContentDTO searchByCategory(String category);
    public void searchByDirector(String director);
}
