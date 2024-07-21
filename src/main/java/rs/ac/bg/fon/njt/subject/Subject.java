package rs.ac.bg.fon.njt.subject;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubject;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlan;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "espb", nullable = false)
    private Integer espb;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
    private List<AcademicYearSubject> academicYearSubjects;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
    private List<ClassCoveragePlan> classCoveragePlans;

    public Subject() {
    }

    public Subject(String name, Integer espb) {
        this.name = name;
        this.espb = espb;
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

    public Integer getEspb() {
        return espb;
    }

    public void setEspb(Integer espb) {
        this.espb = espb;
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
        if (!(o instanceof Subject subject)) return false;
        return Objects.equals(id, subject.id) && Objects.equals(name, subject.name) && Objects.equals(espb, subject.espb) && Objects.equals(academicYearSubjects, subject.academicYearSubjects) && Objects.equals(classCoveragePlans, subject.classCoveragePlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, espb, academicYearSubjects, classCoveragePlans);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", espb=" + espb +
                ", academicYearSubjects=" + academicYearSubjects +
                ", classCoveragePlans=" + classCoveragePlans +
                '}';
    }
}
