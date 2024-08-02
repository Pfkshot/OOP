package Sem5.Service;

import Sem5.model.Student;
import Sem5.model.StudyGroup;
import Sem5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(int numberGroup, Teacher teacher, List<Student> students) {
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudyGroup(numberGroup, teacher, students);
    }

//    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
//        return new StudyGroup(teacher, students);
//    }
}
