package Sem4;

//Создать класс УчительСервис и реализовать аналогично проедланному на семинаре

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {
    private Teacher teacher;

    public void removeTeacherByFIO(String firstName, String lastName, String middleName){
        Iterator<Teacher> iterator = teacher.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) &&
                    teacher.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }
    public List<Teacher> getSortedTeacherList(){
        List<Teacher> teacherList = new ArrayList<>(teacher.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList = new ArrayList<>(teacher.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        teacher.createTeacher(firstName, lastName, middleName);
    }
}
