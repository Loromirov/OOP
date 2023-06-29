package Controllers;

import StudentDomen.User;

/** Интерфейс контроллера за пользователем */ 
public interface iUserController<T extends User> 
{
    /* Метод создания универсального экземпляра */
    void create(String firstName, String lastName, int age);

}
