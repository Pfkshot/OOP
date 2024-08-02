package Sem5.model;

// -Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;

import java.util.List;

public class StudyGroup {
    private int numberGroup;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(int numberGroup, Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.numberGroup = numberGroup;
        this.students = students;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "numberGroup=" + numberGroup +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
