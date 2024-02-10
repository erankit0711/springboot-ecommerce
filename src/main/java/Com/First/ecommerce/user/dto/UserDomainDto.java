package Com.First.ecommerce.user.dto;

public class UserDomainDto {
    private String userId;
    private String username;
    private String email;

    public UserDomainDto(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
