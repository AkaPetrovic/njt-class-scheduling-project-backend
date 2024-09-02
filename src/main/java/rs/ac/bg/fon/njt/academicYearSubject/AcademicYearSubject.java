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

    @Column(name = "number_of_student_groups", nullable = false)
    private Integer numberOfStudentGroups;

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

    public AcademicYearSubject(Integer numberOfStudentGroups, AcademicYear academicYear, Subject subject) {
        this.numberOfStudentGroups = numberOfStudentGroups;
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

    public Integer getNumberOfStudentGroups() {
        return numberOfStudentGroups;
    }

    public void setNumberOfStudentGroups(Integer numberOfStudentGroups) {
        this.numberOfStudentGroups = numberOfStudentGroups;
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
        return Objects.equals(id, that.id) && Objects.equals(numberOfStudentGroups, that.numberOfStudentGroups) && Objects.equals(academicYear, that.academicYear) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfStudentGroups, academicYear, subject);
    }

    @Override
    public String toString() {
        return "AcademicYearSubject{" +
                "id=" + id +
                ", numberOfStudentGroups=" + numberOfStudentGroups +
                ", academicYear=" + academicYear.getName() +
                ", subject=" + subject.getName() +
                '}';
    }
}
