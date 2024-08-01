package Sem4;

import java.util.Comparator;

/**
 * Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 * */

public class UserComparator<T extends User>  implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0){
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfComparing == 0){
               return o1.getMiddleName().compareTo(o2.getMiddleName());
            }else{
                return resultOfComparing;
            }
        }else{
            return resultOfComparing;
        }
    }
}
