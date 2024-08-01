package Sem4;


import java.util.Iterator;
import java.util.List;

public class Teacher extends User implements Comparable<Teacher> {

    private long teacherId;
    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    public void setTeacherList (List<Teacher> teacherList){
        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    public Iterator<Teacher> iterator(){
        return new TeacherIterator(this);
    }

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
