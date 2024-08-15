package rs.ac.bg.fon.njt.profile;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.role.Role;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaff;

import java.util.Objects;

@Entity
@Table(name = "profile", uniqueConstraints = {
        @UniqueConstraint(columnNames = "teaching_staff_id", name = "UNIQUE_teaching_staff_id")
})
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "FK_profile_role"))
    private Role role;

    @OneToOne
    @JoinColumn(name = "teaching_staff_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "FK_profile_teaching_staff"))
    private TeachingStaff teachingStaff;



    public Profile() {
    }

    public Profile(String username, String password, Role role, TeachingStaff teachingStaff) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.teachingStaff = teachingStaff;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public TeachingStaff getTeachingStaff() {
        return teachingStaff;
    }

    public void setTeachingStaff(TeachingStaff teachingStaff) {
        this.teachingStaff = teachingStaff;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role.getName() +
                ", teachingStaff=" + teachingStaff +
                '}';
    }
}
