package rs.ac.bg.fon.njt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rs.ac.bg.fon.njt.academicYear.AcademicYear;
import rs.ac.bg.fon.njt.academicYear.AcademicYearRepository;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubject;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubjectRepository;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlan;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlanRepository;
import rs.ac.bg.fon.njt.department.Department;
import rs.ac.bg.fon.njt.department.DepartmentRepository;
import rs.ac.bg.fon.njt.profile.Profile;
import rs.ac.bg.fon.njt.profile.ProfileRepository;
import rs.ac.bg.fon.njt.role.Role;
import rs.ac.bg.fon.njt.role.RoleRepository;
import rs.ac.bg.fon.njt.subject.Subject;
import rs.ac.bg.fon.njt.subject.SubjectRepository;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaff;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaffRepository;
import rs.ac.bg.fon.njt.title.Title;
import rs.ac.bg.fon.njt.title.TitleRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class NjtProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NjtProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RoleRepository roleRepository,
							 AcademicYearRepository academicYearRepository,
							 TitleRepository titleRepository,
							 TeachingStaffRepository teachingStaffRepository,
							 DepartmentRepository departmentRepository,
							 SubjectRepository subjectRepository,
							 ProfileRepository profileRepository,
							 AcademicYearSubjectRepository academicYearSubjectRepository,
							 ClassCoveragePlanRepository classCoveragePlanRepository){
		return args -> {
//			Role role1 = new Role("administrator", new ArrayList<>());
//			roleRepository.save(role1);
//
//			Role role2 = new Role("user", new ArrayList<>());
//			roleRepository.save(role2);
//
//			for(Role role : roleRepository.findAll()){
//				System.out.println(role);
//			}

//			AcademicYear academicYear1 = new AcademicYear("2023/24");
//			academicYearRepository.save(academicYear1);
//
//			AcademicYear academicYear2 = new AcademicYear("2024/25");
//			academicYearRepository.save(academicYear2);
//
//			AcademicYear academicYear3 = new AcademicYear("2025/26");
//			academicYearRepository.save(academicYear3);
//
//			for(AcademicYear academicYear : academicYearRepository.findAll()){
//				System.out.println(academicYear);
//			}

//			Title title1 = new Title("Redovni profesor");
//			titleRepository.save(title1);
//
//			Title title2 = new Title("Vanredni profesor");
//			titleRepository.save(title2);
//
//			Title title3 = new Title("Asistent");
//			titleRepository.save(title3);
//
//			for(Title title : titleRepository.findAll()){
//				System.out.println(title);
//			}

//			Department department1 = new Department("SILAB");
//			departmentRepository.save(department1);
//
//			Department department2 = new Department("ELAB");
//			departmentRepository.save(department2);
//
//			for(Department department : departmentRepository.findAll()){
//				System.out.println(department);
//			}

//			Optional<Department> departmentOptional1 = departmentRepository.findById(1L);
//			Department department1 = departmentOptional1.get();
//
//			Optional<Title> titleOptional1 = titleRepository.findById(3L);
//			Title title1 = titleOptional1.get();
//
//			TeachingStaff teachingStaff1 = new TeachingStaff("Aleksa", "Petrovic", "aleksa.petrovic@fon.bg.ac.rs", LocalDate.of(2000, 7, 12), department1, title1);
//			teachingStaffRepository.save(teachingStaff1);
//
//			Optional<Department> departmentOptional2 = departmentRepository.findById(1L);
//			Department department2 = departmentOptional2.get();
//
//			Optional<Title> titleOptional2 = titleRepository.findById(2L);
//			Title title2 = titleOptional2.get();
//
//			TeachingStaff teachingStaff2 = new TeachingStaff("Aleksandar", "Radin", "aleksandar.radin@fon.bg.ac.rs", LocalDate.of(2000, 12, 1), department2, title2);
//			teachingStaffRepository.save(teachingStaff2);
//
//			for(TeachingStaff teachingStaff : teachingStaffRepository.findAll()){
//				System.out.println(teachingStaff);
//			}

//			Subject subject1 = new Subject("Programiranje 1", 6);
//			subjectRepository.save(subject1);
//
//			Subject subject2 = new Subject("NJT", 4);
//			subjectRepository.save(subject2);
//
//			Subject subject3 = new Subject("Softverski paterni", 4);
//			subjectRepository.save(subject3);
//
//			for(Subject subject : subjectRepository.findAll()){
//				System.out.println(subject);
//			}

//			Optional<TeachingStaff> teachingStaffOptional1 = teachingStaffRepository.findById(2L);
//			TeachingStaff teachingStaff1 = teachingStaffOptional1.get();
//
//			Optional<Role> roleOptional1 = roleRepository.findById(1L);
//			Role role1 = roleOptional1.get();
//
//			Profile profile1 = new Profile("Aleksandar", "aca123", role1, teachingStaff1);
//			profileRepository.save(profile1);
//
//			for(Profile profile : profileRepository.findAll()){
//				System.out.println(profile);
//			}

//			Optional<Subject> subjectOptional1 = subjectRepository.findById(2L);
//			Subject subject1 = subjectOptional1.get();
//
//			Optional<AcademicYear> academicYearOptional1 = academicYearRepository.findById(1L);
//			AcademicYear academicYear1 = academicYearOptional1.get();
//
//			AcademicYearSubject academicYearSubject1 = new AcademicYearSubject(26, 26, 0, academicYear1, subject1);
//			academicYearSubjectRepository.save(academicYearSubject1);
//
//			Optional<Subject> subjectOptional2 = subjectRepository.findById(1L);
//			Subject subject2 = subjectOptional2.get();
//
//			Optional<AcademicYear> academicYearOptional2 = academicYearRepository.findById(1L);
//			AcademicYear academicYear2 = academicYearOptional2.get();
//
//			AcademicYearSubject academicYearSubject2 = new AcademicYearSubject(26, 26, 13, academicYear2, subject2);
//			academicYearSubjectRepository.save(academicYearSubject2);
//
//			for(AcademicYearSubject academicYearSubject : academicYearSubjectRepository.findAll()){
//				System.out.println(academicYearSubject);
//			}

//			Optional<Subject> subjectOptional1 = subjectRepository.findById(2L);
//			Subject subject1 = subjectOptional1.get();
//
//			Optional<AcademicYear> academicYearOptional1 = academicYearRepository.findById(1L);
//			AcademicYear academicYear1 = academicYearOptional1.get();
//
//			Optional<TeachingStaff> teachingStaffOptional1 = teachingStaffRepository.findById(1L);
//			TeachingStaff teachingStaff1 = teachingStaffOptional1.get();
//
//			ClassCoveragePlan classCoveragePlan1 = new ClassCoveragePlan(12, 8, 0, teachingStaff1, subject1, academicYear1);
//			classCoveragePlanRepository.save(classCoveragePlan1);

//			Optional<Subject> subjectOptional2 = subjectRepository.findById(2L);
//			Subject subject2 = subjectOptional2.get();
//
//			Optional<AcademicYear> academicYearOptional2 = academicYearRepository.findById(1L);
//			AcademicYear academicYear2 = academicYearOptional2.get();
//
//			Optional<TeachingStaff> teachingStaffOptional2 = teachingStaffRepository.findById(2L);
//			TeachingStaff teachingStaff2 = teachingStaffOptional2.get();
//
//			ClassCoveragePlan classCoveragePlan2 = new ClassCoveragePlan(14, 18, 0, teachingStaff2, subject2, academicYear2);
//			classCoveragePlanRepository.save(classCoveragePlan2);

//			for(ClassCoveragePlan classCoveragePlan : classCoveragePlanRepository.findAll()){
//				System.out.println(classCoveragePlan);
//			}
		};
	}

}
