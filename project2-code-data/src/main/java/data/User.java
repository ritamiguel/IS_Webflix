package data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "Users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int creditcard;
	private int isManager;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    //@JoinTable(name = "Content_user",
    //        joinColumns=@JoinColumn(name="USER_ID", referencedColumnName="id"),
    //        inverseJoinColumns=@JoinColumn(name="POST_ID", referencedColumnName="id"))
	private List<Content> watchlist;

	public User(String firstName, String lastName, String email, String password, int creditcard, int isManager) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.creditcard = creditcard;
		this.isManager = isManager;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public User() {
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



	public int isManager() {
		return isManager;
	}


	public void setManager(int isManager) {
		this.isManager = isManager;
	}


	public List<Content> getWatchlist() {
		return watchlist;
	}


	public void setWatchlist(List<Content> watchlist) {
		this.watchlist = watchlist;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", creditcard="
				+ creditcard + "]";
	}

}