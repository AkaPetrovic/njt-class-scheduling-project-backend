package rs.ac.bg.fon.njt.profile;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.njt.security.model.UserDetailsImpl;
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
            UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();

            String username = principal.getUsername();
            GrantedAuthority[] authorities = principal.getAuthorities().toArray(new GrantedAuthority[0]);
            String authority = authorities[0].getAuthority();

            return jwtService.generateToken(username, authority);
        }

        return null;
    }
}
