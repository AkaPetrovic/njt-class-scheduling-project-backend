package rs.ac.bg.fon.njt.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.njt.security.service.JWTService;

import java.util.List;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    public ProfileService(ProfileRepository profileRepository, AuthenticationManager authenticationManager, JWTService jwtService) {
        this.profileRepository = profileRepository;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public String login(Profile profile) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(profile.getUsername(), profile.getPassword()));

        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(profile.getUsername());
        }

        return null;
    }
}
