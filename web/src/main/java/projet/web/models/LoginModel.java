package projet.web.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {
    @NotNull(message = "username is required")
    @Size(min = 3, max = 10, message = "username must between 3 and 15 character")

    private String username;
    @NotNull(message = "password is required")
    @Size(min = 8, max = 10, message= "password must between 8 and 15 character")
    private String password;

    @Override
    public String toString() {
        return "LoginModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public LoginModel() {
        super();
    }


    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
