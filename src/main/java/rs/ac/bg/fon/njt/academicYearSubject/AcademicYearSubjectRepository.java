package rs.ac.bg.fon.njt.academicYearSubject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcademicYearSubjectRepository extends JpaRepository<AcademicYearSubject, AcademicYearSubjectId> {
    Optional<AcademicYearSubject> findByAcademicYear_NameAndSubject_Name(String academicYearName, String subjectName);
}
