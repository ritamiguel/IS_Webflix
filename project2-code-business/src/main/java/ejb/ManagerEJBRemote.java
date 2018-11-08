package ejb;

import javax.ejb.Remote;

import data.User;

import dto.UserDTO;
import dto.ContentDTO;

@Remote
public interface ManagerEJBRemote {
    public void addContent(ContentDTO content);
    public void editContent(ContentDTO content);
}
