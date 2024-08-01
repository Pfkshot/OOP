package Sem4;

import Sem3.StreamService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserConrtroller<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }
    public void removeTeacherByFIO(String firstName, String lastName, String middleName){
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList(){
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

}
