package Sem4;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {

    private int count;
    private final List<Teacher> teacherList;

    public TeacherIterator(Teacher teacher) {
        this.count = 0;
        this.teacherList = teacher.getTeacherList();
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return teacherList.get(count);
    }

    @Override
    public void remove() {
        teacherList.remove(count);
    }
}