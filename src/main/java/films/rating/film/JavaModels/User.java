package films.rating.film.JavaModels;

public class User {
    private String first_name;
    private String last_name;
    private String email_address;
    private String photo;
    private String password;
    private String confirm_password;

    public User() {
    }

    public User(String first_name, String last_name, String email_address, String photo, String password, String confirm_password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.photo = photo;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", photo='" + photo + '\'' +
                ", password='" + password + '\'' +
                ", confirm_password='" + confirm_password + '\'' +
                '}';
    }
}
