package data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Content implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private long id;
	private String title;
	private String director;
	private int year;
	private String category;

	@ManyToMany(mappedBy ="watchlist")
	private List <User> subscribers;
	@OneToMany
	private List<Episode> episodes; // seasons/ep



	public Content(String title, String director, int year, String category) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.category = category;
		this.episodes = episodes;
	}

	public Content() {}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}


}