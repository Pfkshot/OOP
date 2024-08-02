package Sem5.controller;

import Sem5.Service.DataService;
import Sem5.Service.StudyGroupService;
import Sem5.View.StudentView;
import Sem5.model.*;

import java.util.List;
/**
 * Создать package – controller. Работу продолжаем в нем
 * Создать класс Controller агрегирующий в себе необходимые классы в виде
 * полей, а инициализируем прям в поле.
 * Создаем метод созданиеСтудента – реализующий логику, путем вызова
 * соответствующих методов интерфейсов:
 * Создания Студента в сервисе
 * Возвращение всех студентов в сервисе
 * Вызов view и передача списка найденных студентов
 * */
public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService serviceGroup = new StudyGroupService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName,lastName,middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudents();
        for(User user : userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
    public StudyGroup createStudyGroup(int numberGroup, Teacher teacher, List<Student> students) {
        return serviceGroup.createStudyGroup(numberGroup,teacher, students);
    }

}
