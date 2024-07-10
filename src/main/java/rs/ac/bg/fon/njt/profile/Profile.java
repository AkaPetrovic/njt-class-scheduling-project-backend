package rs.ac.bg.fon.njt.profile;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.role.Role;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(nullable = false,
                foreignKey = @ForeignKey(name="FK_profile_role"))
    private Role role;

    public Profile() {
    }

    public Profile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return username + password;
    }
}
