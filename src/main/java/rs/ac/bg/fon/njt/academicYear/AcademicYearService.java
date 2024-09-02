package rs.ac.bg.fon.njt.academicYear;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicYearService {
    private final AcademicYearRepository academicYearRepository;

    public AcademicYearService(AcademicYearRepository academicYearRepository) {
        this.academicYearRepository = academicYearRepository;
    }

    public List<AcademicYear> getAllAcademicYears() {
        return academicYearRepository.findAll();
    }

    public AcademicYear getAcademicYearByName(String name) {
        return academicYearRepository.getAcademicYearByName(name);
    }
}
