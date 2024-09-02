package rs.ac.bg.fon.njt.academicYearSubject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class AcademicYearSubjectController {
    private final AcademicYearSubjectService academicYearSubjectService;

    public AcademicYearSubjectController(AcademicYearSubjectService academicYearSubjectService) {
        this.academicYearSubjectService = academicYearSubjectService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/academic-year-subject/{academicYearName}/{subjectName}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public ResponseEntity<?> getAcademicYearSubjectByAcademicYearNameAndBySubjectName(@PathVariable String academicYearName, @PathVariable String subjectName) {
        AcademicYearSubject academicYearSubject = academicYearSubjectService.getAcademicYearSubjectByAcademicYearNameAndBySubjectName(academicYearName.replace("-", "/"), subjectName);

        if (academicYearSubject == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Number of groups for the particular subject is yet to be determined for the given academic year.");
        }
        
        return ResponseEntity.ok(academicYearSubject);
    }
}
