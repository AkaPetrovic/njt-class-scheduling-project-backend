package rs.ac.bg.fon.njt.classCoveragePlan;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import rs.ac.bg.fon.njt.academicYear.AcademicYear;
import rs.ac.bg.fon.njt.subject.Subject;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaff;

import java.util.Objects;

@Entity
@Table(name = "class_coverage_plan", uniqueConstraints = {
        @UniqueConstraint(name = "UK_teaching_subject_academic", columnNames = {"teaching_staff_id", "subject_id", "academic_year_id"})
})
public class ClassCoveragePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount_of_lecture_classes_per_teaching_staff", nullable = false)
    private Integer amountOfLectureClassesPerTeachingStaff;

    @Column(name="amount_of_practical_classes_per_teaching_staff", nullable = false)
    private Integer amountOfPracticalClassesPerTeachingStaff;

    @Column(name="amount_of_lab_practical_classes_per_teaching_staff", nullable = false)
    private Integer amountOfLabPracticalClassesPerTeachingStaff;

    @ManyToOne
    @JoinColumn(name = "teaching_staff_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "FK_class_coverage_plan_teaching_staff"))
    private TeachingStaff teachingStaff;

    @ManyToOne
    @JoinColumn(name = "subject_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "FK_class_coverage_plan_subject"))
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "academic_year_id",
                nullable = false,
                foreignKey = @ForeignKey(name = "FK_class_coverage_plan_academic_year"))
    private AcademicYear academicYear;



    public ClassCoveragePlan() {
    }

    public ClassCoveragePlan(Integer amountOfLectureClassesPerTeachingStaff, Integer amountOfPracticalClassesPerTeachingStaff, Integer amountOfLabPracticalClassesPerTeachingStaff, TeachingStaff teachingStaff, Subject subject, AcademicYear academicYear) {
        this.amountOfLectureClassesPerTeachingStaff = amountOfLectureClassesPerTeachingStaff;
        this.amountOfPracticalClassesPerTeachingStaff = amountOfPracticalClassesPerTeachingStaff;
        this.amountOfLabPracticalClassesPerTeachingStaff = amountOfLabPracticalClassesPerTeachingStaff;
        this.teachingStaff = teachingStaff;
        this.subject = subject;
        this.academicYear = academicYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmountOfLectureClassesPerTeachingStaff() {
        return amountOfLectureClassesPerTeachingStaff;
    }

    public void setAmountOfLectureClassesPerTeachingStaff(Integer amountOfLectureClassesPerTeachingStaff) {
        this.amountOfLectureClassesPerTeachingStaff = amountOfLectureClassesPerTeachingStaff;
    }

    public Integer getAmountOfPracticalClassesPerTeachingStaff() {
        return amountOfPracticalClassesPerTeachingStaff;
    }

    public void setAmountOfPracticalClassesPerTeachingStaff(Integer amountOfPracticalClassesPerTeachingStaff) {
        this.amountOfPracticalClassesPerTeachingStaff = amountOfPracticalClassesPerTeachingStaff;
    }

    public Integer getAmountOfLabPracticalClassesPerTeachingStaff() {
        return amountOfLabPracticalClassesPerTeachingStaff;
    }

    public void setAmountOfLabPracticalClassesPerTeachingStaff(Integer amountOfLabPracticalClassesPerTeachingStaff) {
        this.amountOfLabPracticalClassesPerTeachingStaff = amountOfLabPracticalClassesPerTeachingStaff;
    }

    public TeachingStaff getTeachingStaff() {
        return teachingStaff;
    }

    public void setTeachingStaff(TeachingStaff teachingStaff) {
        this.teachingStaff = teachingStaff;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public AcademicYear getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(AcademicYear academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassCoveragePlan that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(amountOfLectureClassesPerTeachingStaff, that.amountOfLectureClassesPerTeachingStaff) && Objects.equals(amountOfPracticalClassesPerTeachingStaff, that.amountOfPracticalClassesPerTeachingStaff) && Objects.equals(amountOfLabPracticalClassesPerTeachingStaff, that.amountOfLabPracticalClassesPerTeachingStaff) && Objects.equals(teachingStaff, that.teachingStaff) && Objects.equals(subject, that.subject) && Objects.equals(academicYear, that.academicYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amountOfLectureClassesPerTeachingStaff, amountOfPracticalClassesPerTeachingStaff, amountOfLabPracticalClassesPerTeachingStaff, teachingStaff, subject, academicYear);
    }

    @Override
    public String toString() {
        return "ClassCoveragePlan{" +
                "id=" + id +
                ", amountOfLectureClassesPerTeachingStaff=" + amountOfLectureClassesPerTeachingStaff +
                ", amountOfPracticalClassesPerTeachingStaff=" + amountOfPracticalClassesPerTeachingStaff +
                ", amountOfLabPracticalClassesPerTeachingStaff=" + amountOfLabPracticalClassesPerTeachingStaff +
                ", teachingStaff=" + teachingStaff.getName() + " " + teachingStaff.getSurname() +
                ", subject=" + subject.getName() +
                ", academicYear=" + academicYear.getName() +
                '}';
    }
}
