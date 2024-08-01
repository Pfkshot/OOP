package Sem4;

/**
 * Создайте новый интерфейс UserController
 * Опишите в нем метод create
 * Типизировать его T наследующегося от типа Юзер
 */

public interface UserConrtroller<T extends User> {
    void create(String firstName, String lastName, String middleName);

}
