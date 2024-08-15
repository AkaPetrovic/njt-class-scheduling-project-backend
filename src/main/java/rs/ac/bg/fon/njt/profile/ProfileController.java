package rs.ac.bg.fon.njt.profile;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    @PostMapping("/login")
    public String login(@RequestBody Profile profile) {
        return profileService.login(profile);
    }
}
