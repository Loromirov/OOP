package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

/** Класс сервис работников, импл. интерфейс пользователей */
public class EmploeeService implements iUserService<Emploee>{

    private List<Emploee> emploees;
    private int count;
    
    /* Конструктор класса */
    public EmploeeService() 
    {
        this.emploees = new ArrayList<Emploee>();

    }

    /* Перегрузка метода создания элемента */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        Emploee person = new Emploee(firstName, lastName, age, count);
        count++;
        emploees.add(person);
    }

    /* Перегрузка метода получения всех элементов */
    @Override
    public List<Emploee> getAll() 
    {
        return emploees;
    }

    /* Метод сортировки работников по ФИО */
    public List<Emploee> getSortedByFIOEmploeeGroup() 
    {
        List<Emploee> empl = new ArrayList<>(emploees);
        empl.sort(new UserComparator<Emploee>());
        return empl;
    }
}
