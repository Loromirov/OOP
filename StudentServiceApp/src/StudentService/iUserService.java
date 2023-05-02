package StudentService;

import java.util.List;
/** Пользовательский интерфейс с абстрактным типом Т */
public interface iUserService<T>
{
    /* Метод получения всех элементов */
    List<T> getAll();

    /* Создание нового элемента внутри сервиса */
    void create(String firstName, String lastName, int age);

}
