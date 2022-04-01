package films.rating.film.Models;

import javax.persistence.*;

@Entity
@Table(name="comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int user_id;

    @Column(name="text")
    private String text;

    @Column(name="film_id")
    private int film_id;

    private String userPhoto;

    private String userName;

    public Comments() {
    }

    public Comments(int user_id, String text, int film_id) {
        this.user_id = user_id;
        this.text = text;
        this.film_id = film_id;
    }

    public Comments(int user_id, String text, int film_id, String userPhoto, String userName) {
        this.user_id = user_id;
        this.text = text;
        this.film_id = film_id;
        this.userPhoto = userPhoto;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }
}
