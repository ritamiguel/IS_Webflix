package dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int creditcard;
    private int isManager;

    private List<ContentDTO> watchlist;


    public UserDTO(String firstName, String lastName, String email, String password, int creditcard, int isManager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.creditcard = creditcard;
        this.isManager = isManager;
    }


    public UserDTO() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(int creditcard) {
        this.creditcard = creditcard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int isManager() {
        return isManager;
    }

    public void setManager(int manager) {
        isManager = manager;
    }

    public List<ContentDTO> getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(List<ContentDTO> watchlist) {
        this.watchlist = watchlist;
    }

    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", creditcard="
                + creditcard + "]";
    }


}
