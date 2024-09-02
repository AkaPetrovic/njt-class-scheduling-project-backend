package rs.ac.bg.fon.njt.classCoveragePlan;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<ClassCoveragePlan> getAllClassCoveragePlans() {
        return classCoveragePlanService.getAllClassCoveragePlans();
    }

    @GetMapping(path = "/class-coverage-plans/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public ClassCoveragePlan getClassCoveragePlanById(@PathVariable Long id) {
        return classCoveragePlanService.getClassCoveragePlanById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(path = "/class-coverage-plans/edit")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ResponseEntity<String> updateClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        ClassCoveragePlan updatedClassCoveragePlan = classCoveragePlanService.updateClassCoveragePlan(classCoveragePlan);
        if (updatedClassCoveragePlan != null) {
            return new ResponseEntity<>("Success: Class coverage plan updated successfully.", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Error: Class coverage plan update failed.", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/class-coverage-plans/add")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ResponseEntity<String> addClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        ClassCoveragePlan addedClassCoveragePlan = classCoveragePlanService.addClassCoveragePlan(classCoveragePlan);
        if (addedClassCoveragePlan != null) {
            return new ResponseEntity<>("Success: Class coverage plan added successfully.", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("Error: Class coverage plan has not been added successfully.", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(path = "/class-coverage-plans/delete")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ResponseEntity<String> deleteClassCoveragePlan(@RequestBody ClassCoveragePlan classCoveragePlan) {
        classCoveragePlanService.deleteClassCoveragePlan(classCoveragePlan);
        return new ResponseEntity<>("Success: Class coverage plan deleted successfully.", HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/class-coverage-plans/{academicYearName}/{subjectName}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public List<ClassCoveragePlan> getClassCoveragePlansByAcademicYearNameAndBySubjectName(@PathVariable String academicYearName, @PathVariable String subjectName) {
        return classCoveragePlanService.getClassCoveragePlansByAcademicYearNameAndBySubjectName(academicYearName.replace("-", "/"), subjectName);
    }
}
