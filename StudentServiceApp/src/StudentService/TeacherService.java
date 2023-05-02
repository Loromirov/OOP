package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

/** Класс сервиса преподавателей импл. интерфейс пользователей  */
public class TeacherService implements iUserService<Teacher>
{

    private List<Teacher> teachers;
    private int count;

    /* Конструктор класса */
    public TeacherService() 
    {
        this.teachers = new ArrayList<Teacher>();

    }

    /**
     * @param firstName
     * @param lastName
     * @param age
     * @param academicDegree
     */
    /* Перегрузка метода создания элемента */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        Teacher person1 = new Teacher(firstName, lastName, age, count, lastName);
        count++;    
        teachers.add(person1);
    }

    /* Перегрузка метода получения всех элементов */
    @Override
    public List<Teacher> getAll() 
    {
        return teachers;
    }
    
    /* Метод сортировки преподавателей по ФИО */
    public List<Teacher> getSortedByFIOTeacherGroup() 
    {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}
