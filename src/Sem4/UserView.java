package Sem4;

import java.util.List;
/**Создать интерфейс ЮзерВью
 *
 * Типизировать его T наследующегося от типа Юзер
 *
 * Создать в нем метод sendOnConsole(List<Student> students) используя типизацию
 * */

public interface UserView <T extends User> {
    void sendOnConsole(List<T> list);

}
