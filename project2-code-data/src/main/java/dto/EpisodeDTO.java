package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

public class EpisodeDTO {

    private static final long serialVersionUID = 1L;

    private long id;
    private int title;
    private String sinopse;

    public EpisodeDTO(int title, String sinopse) {
        super();
        this.title = title;
        this.sinopse = sinopse;
    }


    public EpisodeDTO() {

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getTitle() {
        return title;
    }
    public void setTitle(int title) {
        this.title = title;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


}