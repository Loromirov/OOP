package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/** Класс контроллер студентов импл. контрол. за пользователем  */
public class StudentController implements iUserController<Student>
{
        /* Данные сервиса студентов */
    private final StudentService dataService = new StudentService();

        /* Данные сервиса студенческих групп */
    private final StudentGroupService groupService = new StudentGroupService();
    
    /* Перегрузка метода создания экземпляра */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        dataService.create(firstName, lastName, age);
    }
    

}
