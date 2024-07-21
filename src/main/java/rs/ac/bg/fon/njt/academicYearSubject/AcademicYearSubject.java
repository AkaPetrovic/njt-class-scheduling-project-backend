package rs.ac.bg.fon.njt.academicYearSubject;

import jakarta.persistence.*;
import rs.ac.bg.fon.njt.academicYear.AcademicYear;
import rs.ac.bg.fon.njt.subject.Subject;

import java.util.Objects;

@Entity
@Table(name = "academic_year_subject")
public class AcademicYearSubject {
    @EmbeddedId
    private AcademicYearSubjectId id;

    @Column(name = "number_of_lecture_classes", nullable = false)
    private Integer numberOfLectureClasses;

    @Column(name = "number_of_practical_classes", nullable = false)
    private Integer numberOfPracticalClasses;

    @Column(name = "number_of_lab_practical_classes", nullable = false)
    private Integer numberOfLabPracticalClasses;

    @ManyToOne
    @MapsId("academicYearId")
    @JoinColumn(name = "academic_year_id",
                foreignKey = @ForeignKey(name = "FK_academic_year"))
    private AcademicYear academicYear;

    @ManyToOne
    @MapsId("subjectId")
    @JoinColumn(name = "subject_id",
                foreignKey = @ForeignKey(name = "FK_subject"))
    private Subject subject;



    public AcademicYearSubject() {
    }

    public AcademicYearSubject(Integer numberOfLectureClasses, Integer numberOfPracticalClasses, Integer numberOfLabPracticalClasses, AcademicYear academicYear, Subject subject) {
        this.numberOfLectureClasses = numberOfLectureClasses;
        this.numberOfPracticalClasses = numberOfPracticalClasses;
        this.numberOfLabPracticalClasses = numberOfLabPracticalClasses;
        this.academicYear = academicYear;
        this.subject = subject;
        this.id = new AcademicYearSubjectId(academicYear.getId(), subject.getId());
    }

    public AcademicYearSubjectId getId() {
        return id;
    }

    public void setId(AcademicYearSubjectId id) {
        this.id = id;
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

    public AcademicYear getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(AcademicYear academicYear) {
        this.academicYear = academicYear;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AcademicYearSubject that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(numberOfLectureClasses, that.numberOfLectureClasses) && Objects.equals(numberOfPracticalClasses, that.numberOfPracticalClasses) && Objects.equals(numberOfLabPracticalClasses, that.numberOfLabPracticalClasses) && Objects.equals(academicYear, that.academicYear) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfLectureClasses, numberOfPracticalClasses, numberOfLabPracticalClasses, academicYear, subject);
    }

    @Override
    public String toString() {
        return "AcademicYearSubject{" +
                "id=" + id +
                ", numberOfLectureClasses=" + numberOfLectureClasses +
                ", numberOfPracticalClasses=" + numberOfPracticalClasses +
                ", numberOfLabPracticalClasses=" + numberOfLabPracticalClasses +
                ", academicYear=" + academicYear.getName() +
                ", subject=" + subject.getName() +
                '}';
    }
}
