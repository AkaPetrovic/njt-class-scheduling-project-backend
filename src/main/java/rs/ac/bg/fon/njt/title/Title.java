package rs.ac.bg.fon.njt.title;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaff;

import java.util.List;
import java.util.Objects;

@Entity
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 35)
    private String title;

    @OneToMany(mappedBy = "title")
    private List<TeachingStaff> teachingStaff;



    public Title() {
    }

    public Title(String title, List<TeachingStaff> teachingStaff) {
        this.title = title;
        this.teachingStaff = teachingStaff;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(o instanceof Title title1)) return false;
        return Objects.equals(id, title1.id) && Objects.equals(title, title1.title) && Objects.equals(teachingStaff, title1.teachingStaff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, teachingStaff);
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", teachingStaff=" + teachingStaff +
                '}';
    }
}
