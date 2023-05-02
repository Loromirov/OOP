package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.UserComparator;

/** Класс сервиса студентов импл. интерфейс пользователей  */
public class StudentService implements iUserService<Student>
{
    private List<Student> students;
    private int count;
    
    /* Конструктор класса */
    public StudentService() 
    {
        this.students = new ArrayList<Student>();

    }

    /* Перегрузка метода получения всех элементов */
    public List<Student> getAll()
    {
        return students;
    }

    /* Перегрузка метода создания элемента */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        Student person1 = new Student(firstName, lastName, age, count);
        count++;    
        students.add(person1);
    }

    /* Метод сортировки студентов по ФИО */
    public List<Student> getSortedByFIOEmploeeGroup() 
    {
        List<Student> empl = new ArrayList<>();
        empl.sort(new UserComparator<Student>());
        return empl;    
    }

}
