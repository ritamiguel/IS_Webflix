package ejb;

import javax.ejb.Remote;

import data.Content;
import data.User;
import dto.UserDTO;
import dto.ContentDTO;

import java.util.List;

@Remote
public interface UserEJBRemote {

    public String hashPassword(String password);
    public String createAccount(String firstName, String lastName, String email, String password, int creditcard, int isManager);
    public User recognizeUser(String email, String password);
    public String addMovie(String title, long id);
    public String updateUser(String option, String newAttribute, long id);
    public String deleteAccount(long id);
    public List<Content> watchList(long id);
  
}
