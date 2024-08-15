package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ClassCoveragePlanController {
    private final ClassCoveragePlanService classCoveragePlanService;

    public ClassCoveragePlanController(ClassCoveragePlanService classCoveragePlanService) {
        this.classCoveragePlanService = classCoveragePlanService;
    }

    @GetMapping(path = "/class-coverage-plans")
    public List<ClassCoveragePlan> getAllClassCoveragePlans() {
        return classCoveragePlanService.getAllClassCoveragePlans();
    }

    @GetMapping(path = "/class-coverage-plans/{id}")
    public ClassCoveragePlan getClassCoveragePlanById(@PathVariable Long id) {
        return classCoveragePlanService.getClassCoveragePlanById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(path = "/class-coverage-plans/edit")
    public ResponseEntity<String> updateClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        System.out.println(classCoveragePlan);
//        return new ResponseEntity<>("Success: Class coverage plan edited successfully.", HttpStatus.OK);
        ClassCoveragePlan updatedClassCoveragePlan = classCoveragePlanService.updateClassCoveragePlan(classCoveragePlan);
        if (updatedClassCoveragePlan != null) {
            return new ResponseEntity<>("Success: Class coverage plan updated successfully.", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Error: Class coverage plan update failed.", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/class-coverage-plans/add")
    public ResponseEntity<String> addClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        System.out.println(classCoveragePlan);
//        return new ResponseEntity<>("Success: Class coverage plan added successfully.", HttpStatus.OK);
        ClassCoveragePlan addedClassCoveragePlan = classCoveragePlanService.addClassCoveragePlan(classCoveragePlan);
        if (addedClassCoveragePlan != null) {
            return new ResponseEntity<>("Success: Class coverage plan added successfully.", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("Error: Class coverage plan has not been added successfully.", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "/class-coverage-plans/delete")
    public ResponseEntity<String> deleteClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        System.out.println(classCoveragePlan);
//        return new ResponseEntity<>("Success: Class coverage plan deleted successfully.", HttpStatus.OK);
        classCoveragePlanService.deleteClassCoveragePlan(classCoveragePlan);
        return new ResponseEntity<>("Success: Class coverage plan deleted successfully.", HttpStatus.OK);
    }
}
