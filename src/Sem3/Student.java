package Sem3;

/**
 * Создать класс Студент
 *
 * Модифицировать класс Студент, заставив его реализовать интерфейс
 * Comparable
 *
 * Реализовать контракт compareTo () со сравнением по какому-либо
 * параметру (пример studentId)
 */

public class Student implements Comparable<Student> {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String middleName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
