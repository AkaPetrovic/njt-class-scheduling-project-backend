package rs.ac.bg.fon.njt.academicYearSubject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicYearSubjectRepository extends JpaRepository<AcademicYearSubject, AcademicYearSubjectId> {
}
