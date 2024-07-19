package rs.ac.bg.fon.njt.academicYearSubject;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class AcademicYearSubjectId {
    private Long academicYearId;
    private Long subjectId;



    public AcademicYearSubjectId() {
    }

    public AcademicYearSubjectId(Long academicYearId, Long subjectId) {
        this.academicYearId = academicYearId;
        this.subjectId = subjectId;
    }

    public Long getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Long academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AcademicYearSubjectId that)) return false;
        return Objects.equals(academicYearId, that.academicYearId) && Objects.equals(subjectId, that.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(academicYearId, subjectId);
    }

    @Override
    public String toString() {
        return "AcademicYearSubjectId{" +
                "academicYearId=" + academicYearId +
                ", subjectId=" + subjectId +
                '}';
    }
}
