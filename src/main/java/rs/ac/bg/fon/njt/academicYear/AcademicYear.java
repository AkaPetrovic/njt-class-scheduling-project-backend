package rs.ac.bg.fon.njt.academicYear;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubject;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlan;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "academic_year")
public class AcademicYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 7)
    private String name;

    @OneToMany(mappedBy = "academicYear", fetch = FetchType.EAGER)
    private List<AcademicYearSubject> academicYearSubjects;

    @OneToMany(mappedBy = "academicYear", fetch = FetchType.EAGER)
    private List<ClassCoveragePlan> classCoveragePlans;



    public AcademicYear() {
    }

    public AcademicYear(String name) {
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

    public List<AcademicYearSubject> getAcademicYearSubjects() {
        return academicYearSubjects;
    }

    public void setAcademicYearSubjects(List<AcademicYearSubject> academicYearSubjects) {
        this.academicYearSubjects = academicYearSubjects;
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
        if (!(o instanceof AcademicYear that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(academicYearSubjects, that.academicYearSubjects) && Objects.equals(classCoveragePlans, that.classCoveragePlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, academicYearSubjects, classCoveragePlans);
    }

    @Override
    public String toString() {
        return "AcademicYear{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", academicYearSubjects=" + academicYearSubjects +
                ", classCoveragePlans=" + classCoveragePlans +
                '}';
    }
}
