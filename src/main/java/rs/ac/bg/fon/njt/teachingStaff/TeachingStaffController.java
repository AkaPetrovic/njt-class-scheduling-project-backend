package rs.ac.bg.fon.njt.teachingStaff;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class TeachingStaffController {
    private final TeachingStaffService teachingStaffService;

    public TeachingStaffController(TeachingStaffService teachingStaffService) {
        this.teachingStaffService = teachingStaffService;
    }

    @GetMapping(path = "/teaching-staff")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<TeachingStaff> getAllTeachingStaff() {
        return teachingStaffService.getAllTeachingStaff();
    }
}
