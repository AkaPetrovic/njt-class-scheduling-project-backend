package rs.ac.bg.fon.njt.role;


import jakarta.persistence.*;
import rs.ac.bg.fon.njt.profile.Profile;

import java.util.List;
import java.util.Objects;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy="role")
    List<Profile> profiles;



    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(String name, List<Profile> profiles) {
        this.name = name;
        this.profiles = profiles;
    }

    public Role(long id, String name, List<Profile> profiles) {
        this.id = id;
        this.name = name;
        this.profiles = profiles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
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
