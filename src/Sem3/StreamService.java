package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    public  void sortStreams(List<Stream> streams){
        Collections.sort(streams, new StreamComparator());
    }

//    private StudentGroup studentGroup;
//
//    public List<StudentGroup> getSortedStudentGroupList(){
//        List<StudentGroup> studentGroupList = new ArrayList<>(studentGroup.getStudentList());
//        Collections.sort(studentGroupList);
//        return studentGroupList;
//    }
}
