package rs.ac.bg.fon.njt.department;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaff;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<TeachingStaff> teachingStaff;



    public Department() {
    }

    public Department(String name) {
        this.name = name;
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

    public List<TeachingStaff> getTeachingStaff() {
        return teachingStaff;
    }

    public void setTeachingStaff(List<TeachingStaff> teachingStaff) {
        this.teachingStaff = teachingStaff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(teachingStaff, that.teachingStaff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teachingStaff);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachingStaff=" + teachingStaff +
                '}';
    }
}
