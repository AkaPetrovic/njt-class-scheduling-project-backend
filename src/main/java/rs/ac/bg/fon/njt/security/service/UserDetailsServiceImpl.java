package rs.ac.bg.fon.njt.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.njt.profile.Profile;
import rs.ac.bg.fon.njt.profile.ProfileRepository;
import rs.ac.bg.fon.njt.security.model.UserDetailsImpl;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final ProfileRepository profileRepository;

    public UserDetailsServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Profile user = profileRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found by the given username: " + username);
        }

        return new UserDetailsImpl(user);
    }
}
