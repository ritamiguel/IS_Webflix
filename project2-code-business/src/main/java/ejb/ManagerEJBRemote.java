package ejb;

import javax.ejb.Remote;

import data.Content;
import data.User;

import dto.UserDTO;
import dto.ContentDTO;

@Remote
public interface ManagerEJBRemote {
    public void addContent(ContentDTO contentdto, int option);
    public String updateContent(String option, String newAttribute, String title);
    public void deleteContent(ContentDTO contentdto);
}