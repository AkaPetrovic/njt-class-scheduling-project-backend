package rs.ac.bg.fon.njt.role;


import jakarta.persistence.*;
import rs.ac.bg.fon.njt.profile.Profile;

import java.util.List;
import java.util.Objects;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy="role")
    List<Profile> profiles;



    public Role() {
    }

    public Role(String name, List<Profile> profiles) {
        this.name = name;
        this.profiles = profiles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role role)) return false;
        return id == role.id && Objects.equals(name, role.name) && Objects.equals(profiles, role.profiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profiles);
    }

    @Override
    public String toString() {
        return name;
    }
}
