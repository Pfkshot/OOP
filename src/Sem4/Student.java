package Sem4;

/**
 * Создать класс Студент
 *
 * Модифицировать класс Студент, заставив его реализовать интерфейс
 * Comparable
 *
 * Реализовать контракт compareTo () со сравнением по какому-либо
 * параметру (пример studentId)
 */

public class Student extends User implements Comparable<Student> {

    private Long studentId;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
