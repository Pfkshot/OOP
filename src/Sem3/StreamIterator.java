package Sem3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;
    private final List<StudentGroup> studentGroupList;
    public StreamIterator(List<StudentGroup> studentGroupList) {
        this.count = 0;
        this.studentGroupList = studentGroupList.getStudentGroupList;
    }
    @Override
    public boolean hasNext() {
        return count < studentGroupList.size() - 1;
    }
    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentGroupList.get(count);
    }
    @Override
    public void remove() {
        studentGroupList.remove(count);
    }
}
