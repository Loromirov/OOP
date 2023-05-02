package Controllers;

import StudentDomen.User;
import StudentDomen.Teacher;
import StudentService.TeacherService;
/** Класс контроллер преподавателей импл. контрол. за пользователем  */
public class TeacherController implements iUserController<Teacher>
{
    /* Данные сервиса преподавателей */
    private final TeacherService teachService = new TeacherService();

    /* Перегрузка метода создания экземпляра */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        teachService.create(firstName, lastName, age);
    }
}
