package Sem4;

import java.util.Iterator;
import java.util.List;

/**
 * Создать класс Учебная группа
 */

public class StudentGroup implements Iterable<Student> {
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    private List<Student> studentList;

    public void createStudent(String firstName, String lastName, String middleName) {
        studentList.add(new Student(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
