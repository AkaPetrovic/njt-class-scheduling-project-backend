package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.stereotype.Service;

@Service
public class ClassCoveragePlanService {
    private final ClassCoveragePlanRepository classCoveragePlanRepository;

    public ClassCoveragePlanService(ClassCoveragePlanRepository classCoveragePlanRepository) {
        this.classCoveragePlanRepository = classCoveragePlanRepository;
    }
}
