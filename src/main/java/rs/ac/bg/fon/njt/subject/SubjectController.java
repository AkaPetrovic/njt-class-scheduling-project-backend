package rs.ac.bg.fon.njt.subject;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping(path = "/subjects")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping(path = "/subject/{name}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public Subject getSubjectByName(@PathVariable String name) {
        return subjectService.getSubjectByName(name);
    }
}
