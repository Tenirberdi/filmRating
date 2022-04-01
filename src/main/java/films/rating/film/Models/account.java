package films.rating.film.Models;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="account")
public class account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String first_name;
    
    @Column(name="last_name")
    private String last_name;
    
    @Column(name="photo")
    private String photo;

    //login
    @Column(name="email")
    private String email;

    //password
    @Column(name="password")
    private String password;

    //active
    @Column(name="active")
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public account() {
    }


    public account(String first_name, String last_name, String photo, String email, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.photo = photo;
        this.email = email;
        this.password = password;
    }

    public account(String first_name, String last_name, String photo, String email, String password, boolean active) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.photo = photo;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
}
