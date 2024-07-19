package rs.ac.bg.fon.njt.classCoveragePlan;

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

    @Column(name="amount_of_lecture_classes", nullable = false)
    private Integer amountOfLectureClasses;

    @Column(name="amount_of_practical_classes", nullable = false)
    private Integer amountOfPracticalClasses;

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

    public ClassCoveragePlan(Integer amountOfLectureClasses, Integer amountOfPracticalClasses, TeachingStaff teachingStaff, Subject subject, AcademicYear academicYear) {
        this.amountOfLectureClasses = amountOfLectureClasses;
        this.amountOfPracticalClasses = amountOfPracticalClasses;
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

    public Integer getAmountOfLectureClasses() {
        return amountOfLectureClasses;
    }

    public void setAmountOfLectureClasses(Integer amountOfLectureClasses) {
        this.amountOfLectureClasses = amountOfLectureClasses;
    }

    public Integer getAmountOfPracticalClasses() {
        return amountOfPracticalClasses;
    }

    public void setAmountOfPracticalClasses(Integer amountOfPracticalClasses) {
        this.amountOfPracticalClasses = amountOfPracticalClasses;
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
        if (!(o instanceof ClassCoveragePlan)) return false;
        ClassCoveragePlan that = (ClassCoveragePlan) o;
        return Objects.equals(id, that.id) && Objects.equals(amountOfLectureClasses, that.amountOfLectureClasses) && Objects.equals(amountOfPracticalClasses, that.amountOfPracticalClasses) && Objects.equals(teachingStaff, that.teachingStaff) && Objects.equals(subject, that.subject) && Objects.equals(academicYear, that.academicYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amountOfLectureClasses, amountOfPracticalClasses, teachingStaff, subject, academicYear);
    }

    @Override
    public String toString() {
        return "ClassCoveragePlan{" +
                "id=" + id +
                ", amountOfLectureClasses=" + amountOfLectureClasses +
                ", amountOfPracticalClasses=" + amountOfPracticalClasses +
                ", teachingStaff=" + teachingStaff +
                ", subject=" + subject +
                ", academicYear=" + academicYear +
                '}';
    }
}
