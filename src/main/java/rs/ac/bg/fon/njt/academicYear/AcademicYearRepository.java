package rs.ac.bg.fon.njt.academicYear;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicYearRepository extends JpaRepository<AcademicYear, Long> {
    AcademicYear getAcademicYearByName(String name);
}
