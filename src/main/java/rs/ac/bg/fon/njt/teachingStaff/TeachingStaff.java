package rs.ac.bg.fon.njt.teachingStaff;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlan;
import rs.ac.bg.fon.njt.department.Department;
import rs.ac.bg.fon.njt.profile.Profile;
import rs.ac.bg.fon.njt.title.Title;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "teaching_staff", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email", name = "UNIQUE_email")
})
public class TeachingStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "surname", nullable = false, length = 55)
    private String surname;

    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "department_id",
                nullable = false,
                foreignKey = @ForeignKey(name="FK_teaching_staff_department"))
    private Department department;

    @ManyToOne
    @JoinColumn(name = "title_id",
                nullable = false,
                foreignKey = @ForeignKey(name="FK_teaching_staff_title"))
    private Title title;

    @OneToOne(mappedBy = "teachingStaff", fetch = FetchType.EAGER)
    @JsonIgnore
    private Profile profile;

    @OneToMany(mappedBy = "teachingStaff", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<ClassCoveragePlan> classCoveragePlans;



    public TeachingStaff() {
    }

    public TeachingStaff(String name, String surname, String email, LocalDate birthDate, Department department, Title title) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.department = department;
        this.title = title;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<ClassCoveragePlan> getClassCoveragePlans() {
        return classCoveragePlans;
    }

    public void setClassCoveragePlans(List<ClassCoveragePlan> classCoveragePlans) {
        this.classCoveragePlans = classCoveragePlans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeachingStaff that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(birthDate, that.birthDate) && Objects.equals(department, that.department) && Objects.equals(title, that.title) && Objects.equals(profile, that.profile) && Objects.equals(classCoveragePlans, that.classCoveragePlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, birthDate, department, title, profile, classCoveragePlans);
    }

    @Override
    public String toString() {
        return "TeachingStaff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department.getName() +
                ", title=" + title.getTitle() +
                ", profile=" + (profile != null ? profile.getUsername() : null) +
                ", classCoveragePlans=" + classCoveragePlans +
                '}';
    }
}
