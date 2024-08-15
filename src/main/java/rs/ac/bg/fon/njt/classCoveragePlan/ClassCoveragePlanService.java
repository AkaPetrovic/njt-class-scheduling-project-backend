package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassCoveragePlanService {
    private final ClassCoveragePlanRepository classCoveragePlanRepository;

    public ClassCoveragePlanService(ClassCoveragePlanRepository classCoveragePlanRepository) {
        this.classCoveragePlanRepository = classCoveragePlanRepository;
    }

    public List<ClassCoveragePlan> getAllClassCoveragePlans() {
        return classCoveragePlanRepository.findAll();
    }

    public ClassCoveragePlan getClassCoveragePlanById(Long id) {
        Optional<ClassCoveragePlan> optionalClassCoveragePlan = classCoveragePlanRepository.findById(id);
        if(optionalClassCoveragePlan.isPresent()) {
            return optionalClassCoveragePlan.get();
        }else{
            throw new IllegalArgumentException("There is no class coverage plan with the given ID: " + id);
        }
    }

    public ClassCoveragePlan updateClassCoveragePlan(ClassCoveragePlan classCoveragePlan) {
        return classCoveragePlanRepository.save(classCoveragePlan);
    }

    public ClassCoveragePlan addClassCoveragePlan(ClassCoveragePlan classCoveragePlan) {
        return classCoveragePlanRepository.save(classCoveragePlan);
    }

    public void deleteClassCoveragePlan(ClassCoveragePlan classCoveragePlan) {
        classCoveragePlanRepository.deleteById(classCoveragePlan.getId());
    }
}
