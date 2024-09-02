package rs.ac.bg.fon.njt.academicYearSubject;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AcademicYearSubjectService {
    private final AcademicYearSubjectRepository academicYearSubjectRepository;

    public AcademicYearSubjectService(AcademicYearSubjectRepository academicYearSubjectRepository) {
        this.academicYearSubjectRepository = academicYearSubjectRepository;
    }


    public AcademicYearSubject getAcademicYearSubjectByAcademicYearNameAndBySubjectName(String academicYearName, String subjectName) {
        Optional<AcademicYearSubject> optionalAcademicYearSubject =  academicYearSubjectRepository.findByAcademicYear_NameAndSubject_Name(academicYearName, subjectName);
        if(optionalAcademicYearSubject.isPresent()){
            return optionalAcademicYearSubject.get();
        }
        return null;
    }
}
