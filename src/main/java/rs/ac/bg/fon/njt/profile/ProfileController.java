package rs.ac.bg.fon.njt.profile;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping(path = "/profiles")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public String login(@RequestBody Profile profile) {
        return profileService.login(profile);
    }
}
