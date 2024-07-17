package rs.ac.bg.fon.njt.teachingStaff;

import org.springframework.stereotype.Service;

@Service
public class TeachingStaffService {
    private final TeachingStaffRepository teachingStaffRepository;

    public TeachingStaffService(TeachingStaffRepository teachingStaffRepository) {
        this.teachingStaffRepository = teachingStaffRepository;
    }
}
