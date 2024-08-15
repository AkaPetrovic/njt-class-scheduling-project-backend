package rs.ac.bg.fon.njt.teachingStaff;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingStaffService {
    private final TeachingStaffRepository teachingStaffRepository;

    public TeachingStaffService(TeachingStaffRepository teachingStaffRepository) {
        this.teachingStaffRepository = teachingStaffRepository;
    }

    public List<TeachingStaff> getAllTeachingStaff() {
        return teachingStaffRepository.findAll();
    }
}
