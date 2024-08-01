package Sem3;

import Sem4.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Sem4.StudentGroup> {
    private List<Sem4.StudentGroup> studentGroups = new ArrayList<>();

    public void addGroup(Sem4.StudentGroup group) {
        studentGroups.add(group);
    }

    public List<Sem4.StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<Sem4.StudentGroup> studentGroups) {
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
