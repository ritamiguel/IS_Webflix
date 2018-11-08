package data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Movie extends Content {
	
	private static final long serialVersionUID = 1L;

	public Movie(){

	}

	public Movie(String title, String director, int year, String category) {

		super(title, director, year, category);
	}	
}
