package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ClassCoveragePlanController {
    private final ClassCoveragePlanService classCoveragePlanService;

    public ClassCoveragePlanController(ClassCoveragePlanService classCoveragePlanService) {
        this.classCoveragePlanService = classCoveragePlanService;
    }
}
