package rs.ac.bg.fon.njt.academicYear;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class AcademicYearController {
    private final AcademicYearService academicYearService;

    public AcademicYearController(AcademicYearService academicYearService) {
        this.academicYearService = academicYearService;
    }

    @GetMapping(path = "/academic-years")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<AcademicYear> getAllAcademicYears() {
        return academicYearService.getAllAcademicYears();
    }
}
