package Sem3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    List<StudentGroup> studentGroupList;

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator();

    }
}
