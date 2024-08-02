package Sem5.model;

/**
 * Реализовать абстрактный класс User и его наследники Student и Teacher.
 * Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
 * наследники собственные параметры (какие, по вашему выбору – Пример:
 * studentId для Student, teacherId для Teacher)
 */
public abstract class User {
    private String firstName;
    private String lastName;
    private String middleName;

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
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
}
