package Sem3;

import java.util.List;
/**
 * Создать класс Контроллер, добавив в него метод удаления студента и вызывать в нем созданный метод из УчебнаяГруппаСервис
 *
 * Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по id и вызывать в нем созданный
 * метод из УчебнаяГруппаСервис
 *
 * Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по ФИО и вызывать в нем созданный
 * метод из УчебнаяГруппаСервис
 *
 */

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}