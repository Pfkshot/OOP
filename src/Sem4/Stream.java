package Sem4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups = new ArrayList<>();

    public void addGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

}
//    public List<StudentGroup> getStudentGroupList() {
//        return studentGroupList;
//    }
//    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
//        this.studentGroupList = studentGroupList;
//    }
//
//    private List<StudentGroup> studentGroupList;
//    @Override
//    public Iterator<StudentGroup> iterator() {
//        return new StreamIterator(this);
//
//    }
//}
