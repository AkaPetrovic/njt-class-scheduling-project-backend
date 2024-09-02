package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassCoveragePlanRepository extends JpaRepository<ClassCoveragePlan, Long> {
    List<ClassCoveragePlan> findByAcademicYear_NameAndSubject_Name(String academicYearName, String subjectName);
}
