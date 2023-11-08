package pojos;

import java.time.LocalDate;

public class User {

    /*
    "createdAt": "2023-11-07T16:12:50.451Z",
        "name": "Mrs. Angelina Runolfsson",
        "avatar": "https://cloudflare-ipfs.com/ipfs/Qmd3W5DuhgHirLHGVixi6V76LhCkZUz6pnFt5AJBiyvHye/avatar/1180.jpg",
        "id": "1"
     */

    private String createdAt;
    private String name;
    private String avatar;
    private int id;
    private String email;

    public User() {
    }

    public User(String createdAt, String name, String avatar, int id, String email) {
        this.createdAt = createdAt;
        this.name = name;
        this.avatar = avatar;
        this.id = id;
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "createdAt=" + createdAt +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
