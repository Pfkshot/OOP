package Sem5.View;
/**
 * Создать package – view. Работу продолжаем в нем
 * Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход
 * */

import Sem5.model.Student;
import Sem5.model.User;

import java.util.List;

public class StudentView {
   public void printOnConsole(Student student){
       System.out.println(student.toString());
   }
}
