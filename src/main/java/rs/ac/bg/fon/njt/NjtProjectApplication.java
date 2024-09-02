package rs.ac.bg.fon.njt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rs.ac.bg.fon.njt.academicYear.AcademicYearRepository;
import rs.ac.bg.fon.njt.academicYearSubject.AcademicYearSubjectRepository;
import rs.ac.bg.fon.njt.classCoveragePlan.ClassCoveragePlanRepository;
import rs.ac.bg.fon.njt.department.DepartmentRepository;
import rs.ac.bg.fon.njt.profile.ProfileRepository;
import rs.ac.bg.fon.njt.role.RoleRepository;
import rs.ac.bg.fon.njt.subject.SubjectRepository;
import rs.ac.bg.fon.njt.teachingStaff.TeachingStaffRepository;
import rs.ac.bg.fon.njt.title.TitleRepository;

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
//			Role roleNew1 = new Role("admin");
//			roleRepository.save(roleNew1);
//
//			Role roleNew2 = new Role("user");
//			roleRepository.save(roleNew2);
//
////			for(Role role : roleRepository.findAll()){
////				System.out.println(role);
////			}
//
//			AcademicYear academicYearNew1 = new AcademicYear("2023/24");
//			academicYearRepository.save(academicYearNew1);
//
//			AcademicYear academicYearNew2 = new AcademicYear("2024/25");
//			academicYearRepository.save(academicYearNew2);
//
//			AcademicYear academicYearNew3 = new AcademicYear("2025/26");
//			academicYearRepository.save(academicYearNew3);
//
////			for(AcademicYear academicYear : academicYearRepository.findAll()){
////				System.out.println(academicYear);
////			}
//
//			Title titleNew1 = new Title("Redovni profesor");
//			titleRepository.save(titleNew1);
//
//			Title titleNew2 = new Title("Vanredni profesor");
//			titleRepository.save(titleNew2);
//
//			Title titleNew3 = new Title("Asistent");
//			titleRepository.save(titleNew3);
//
////			for(Title title : titleRepository.findAll()){
////				System.out.println(title);
////			}
//
//			Department departmentNew1 = new Department("SILAB");
//			departmentRepository.save(departmentNew1);
//
//			Department departmentNew2 = new Department("ELAB");
//			departmentRepository.save(departmentNew2);
//
////			for(Department department : departmentRepository.findAll()){
////				System.out.println(department);
////			}
//
//			Optional<Department> departmentOptional1 = departmentRepository.findById(1L);
//			Department department1 = departmentOptional1.get();
//
//			Optional<Title> titleOptional1 = titleRepository.findById(3L);
//			Title title1 = titleOptional1.get();
//
//			TeachingStaff teachingStaffNew1 = new TeachingStaff("Aleksa", "Petrovic", "aleksa.petrovic@fon.bg.ac.rs", LocalDate.of(2000, 7, 12), department1, title1);
//			teachingStaffRepository.save(teachingStaffNew1);
//
//			Optional<Department> departmentOptional2 = departmentRepository.findById(1L);
//			Department department2 = departmentOptional2.get();
//
//			Optional<Title> titleOptional2 = titleRepository.findById(2L);
//			Title title2 = titleOptional2.get();
//
//			TeachingStaff teachingStaffNew2 = new TeachingStaff("Aleksandar", "Radin", "aleksandar.radin@fon.bg.ac.rs", LocalDate.of(2000, 12, 1), department2, title2);
//			teachingStaffRepository.save(teachingStaffNew2);
//
////			for(TeachingStaff teachingStaff : teachingStaffRepository.findAll()){
////				System.out.println(teachingStaff);
////			}
//
//			Subject subjectNew1 = new Subject("Programiranje 1", 6, 2, 2, 0);
//			subjectRepository.save(subjectNew1);
//
//			Subject subjectNew2 = new Subject("NJT", 4, 2, 2, 0);
//			subjectRepository.save(subjectNew2);
//
//			Subject subjectNew3 = new Subject("Softverski paterni", 4, 2, 2, 1);
//			subjectRepository.save(subjectNew3);
//
////			for(Subject subject : subjectRepository.findAll()){
////				System.out.println(subject);
////			}
//
//			Optional<TeachingStaff> teachingStaffOptional1 = teachingStaffRepository.findById(2L);
//			TeachingStaff teachingStaff1 = teachingStaffOptional1.get();
//
//			Optional<Role> roleOptional1 = roleRepository.findById(1L);
//			Role role1 = roleOptional1.get();
//
//			Profile profileNew1 = new Profile("Aleksandar", new BCryptPasswordEncoder(12).encode("Nuts152001"), role1, teachingStaff1);
//			profileRepository.save(profileNew1);
//
//			Optional<TeachingStaff> teachingStaffOptional2 = teachingStaffRepository.findById(1L);
//			TeachingStaff teachingStaff2 = teachingStaffOptional2.get();
//
//			Optional<Role> roleOptional2 = roleRepository.findById(2L);
//			Role role2 = roleOptional2.get();
//
//			Profile profileNew2 = new Profile("Aleksa", new BCryptPasswordEncoder(12).encode("AkaDiplo123"), role2, teachingStaff2);
//			profileRepository.save(profileNew2);
//
////			for(Profile profile : profileRepository.findAll()){
////				System.out.println(profile);
////			}
//
//			Optional<Subject> subjectOptional1 = subjectRepository.findById(2L);
//			Subject subject1 = subjectOptional1.get();
//
//			Optional<AcademicYear> academicYearOptional1 = academicYearRepository.findById(1L);
//			AcademicYear academicYear1 = academicYearOptional1.get();
//
//			AcademicYearSubject academicYearSubjectNew1 = new AcademicYearSubject(7, academicYear1, subject1);
//			academicYearSubjectRepository.save(academicYearSubjectNew1);
//
//			Optional<Subject> subjectOptional2 = subjectRepository.findById(1L);
//			Subject subject2 = subjectOptional2.get();
//
//			Optional<AcademicYear> academicYearOptional2 = academicYearRepository.findById(1L);
//			AcademicYear academicYear2 = academicYearOptional2.get();
//
//			AcademicYearSubject academicYearSubjectNew2 = new AcademicYearSubject(8, academicYear2, subject2);
//			academicYearSubjectRepository.save(academicYearSubjectNew2);
//
//			Optional<Subject> subjectOptional3 = subjectRepository.findById(3L);
//			Subject subject3 = subjectOptional3.get();
//
//			Optional<AcademicYear> academicYearOptional3 = academicYearRepository.findById(1L);
//			AcademicYear academicYear3 = academicYearOptional3.get();
//
//			AcademicYearSubject academicYearSubjectNew3 = new AcademicYearSubject(5, academicYear3, subject3);
//			academicYearSubjectRepository.save(academicYearSubjectNew3);
//
////			for(AcademicYearSubject academicYearSubject : academicYearSubjectRepository.findAll()){
////				System.out.println(academicYearSubject);
////			}
//
//			Optional<Subject> subjectOptional11 = subjectRepository.findById(2L);
//			Subject subject11 = subjectOptional11.get();
//
//			Optional<AcademicYear> academicYearOptional11 = academicYearRepository.findById(1L);
//			AcademicYear academicYear11 = academicYearOptional11.get();
//
//			Optional<TeachingStaff> teachingStaffOptional11 = teachingStaffRepository.findById(1L);
//			TeachingStaff teachingStaff11 = teachingStaffOptional11.get();
//
//			ClassCoveragePlan classCoveragePlanNew1 = new ClassCoveragePlan(12, 8, 0, teachingStaff11, subject11, academicYear11);
//			classCoveragePlanRepository.save(classCoveragePlanNew1);
//
//			Optional<Subject> subjectOptional22 = subjectRepository.findById(2L);
//			Subject subject22 = subjectOptional22.get();
//
//			Optional<AcademicYear> academicYearOptional22 = academicYearRepository.findById(1L);
//			AcademicYear academicYear22 = academicYearOptional22.get();
//
//			Optional<TeachingStaff> teachingStaffOptional22 = teachingStaffRepository.findById(2L);
//			TeachingStaff teachingStaff22 = teachingStaffOptional22.get();
//
//			ClassCoveragePlan classCoveragePlan2 = new ClassCoveragePlan(14, 18, 0, teachingStaff22, subject22, academicYear22);
//			classCoveragePlanRepository.save(classCoveragePlan2);
//
////			for(ClassCoveragePlan classCoveragePlan : classCoveragePlanRepository.findAll()){
////				System.out.println(classCoveragePlan);
////			}
		};
	}

}
