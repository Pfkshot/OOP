package Sem4;

/**
 * Создать класс УчебнаяГруппаСервис, добавив в него метод удаления студента по ФИО
 *
 * Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по id
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) &&
                    student.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
