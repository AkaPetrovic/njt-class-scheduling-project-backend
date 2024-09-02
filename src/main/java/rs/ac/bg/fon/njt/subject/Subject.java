package rs.ac.bg.fon.njt.subject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubject;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlan;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "subject", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name", name = "UNIQUE_name")
})
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "espb", nullable = false)
    private Integer espb;

    @Column(name = "number_of_lecture_classes", nullable = false)
    private Integer numberOfLectureClasses;

    @Column(name = "number_of_practical_classes", nullable = false)
    private Integer numberOfPracticalClasses;

    @Column(name = "number_of_lab_practical_classes", nullable = false)
    private Integer numberOfLabPracticalClasses;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<AcademicYearSubject> academicYearSubjects;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<ClassCoveragePlan> classCoveragePlans;

    public Subject() {
    }

    public Subject(String name, Integer espb, Integer numberOfLectureClasses, Integer numberOfPracticalClasses, Integer numberOfLabPracticalClasses) {
        this.name = name;
        this.espb = espb;
        this.numberOfLectureClasses = numberOfLectureClasses;
        this.numberOfPracticalClasses = numberOfPracticalClasses;
        this.numberOfLabPracticalClasses = numberOfLabPracticalClasses;
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

    public Integer getNumberOfLectureClasses() {
        return numberOfLectureClasses;
    }

    public void setNumberOfLectureClasses(Integer numberOfLectureClasses) {
        this.numberOfLectureClasses = numberOfLectureClasses;
    }

    public Integer getNumberOfPracticalClasses() {
        return numberOfPracticalClasses;
    }

    public void setNumberOfPracticalClasses(Integer numberOfPracticalClasses) {
        this.numberOfPracticalClasses = numberOfPracticalClasses;
    }

    public Integer getNumberOfLabPracticalClasses() {
        return numberOfLabPracticalClasses;
    }

    public void setNumberOfLabPracticalClasses(Integer numberOfLabPracticalClasses) {
        this.numberOfLabPracticalClasses = numberOfLabPracticalClasses;
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
        return Objects.equals(id, subject.id) && Objects.equals(name, subject.name) && Objects.equals(espb, subject.espb) && Objects.equals(numberOfLectureClasses, subject.numberOfLectureClasses) && Objects.equals(numberOfPracticalClasses, subject.numberOfPracticalClasses) && Objects.equals(numberOfLabPracticalClasses, subject.numberOfLabPracticalClasses) && Objects.equals(academicYearSubjects, subject.academicYearSubjects) && Objects.equals(classCoveragePlans, subject.classCoveragePlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, espb, numberOfLectureClasses, numberOfPracticalClasses, numberOfLabPracticalClasses, academicYearSubjects, classCoveragePlans);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", espb=" + espb +
                ", numberOfLectureClasses=" + numberOfLectureClasses +
                ", numberOfPracticalClasses=" + numberOfPracticalClasses +
                ", numberOfLabPracticalClasses=" + numberOfLabPracticalClasses +
                ", academicYearSubjects=" + academicYearSubjects +
                ", classCoveragePlans=" + classCoveragePlans +
                '}';
    }
}
