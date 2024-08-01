package Sem4;

import Sem3.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Sem3.Stream> {

    @Override
    public int compare(Sem3.Stream o1, Stream o2) {
        return Integer.compare(o1.getStudentGroups().size(), o2.getStudentGroups().size());
    }
}
