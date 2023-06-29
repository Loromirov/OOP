package Controllers;

import StudentDomen.User;
import StudentDomen.Emploee;
import StudentService.EmploeeService;

/** Класс контроллер работников импл. контрол. за пользователем  */
public class EmploeeController implements iUserController<Emploee>
{
    /* Данные сервиса работников */
    private final EmploeeService empService = new EmploeeService();

    /* Перегрузка метода создания экземпляра */
    @Override
    public void create(String firstName, String lastName, int age) 
    {
        empService.create(firstName, lastName, age);
    }

    /* Статический метод выплаты зп. */
    static public <T extends Emploee> void paySalary(T person)
    {
        System.out.println(((User) person).getLastName() + " Выплатили зп 10000р.");
    }
    
    /* Статический метод высчитывания среднего ариф. из переданного массива */
    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) 
        {
            sum +=num[i].doubleValue();
            sum /= num.length;
            return sum;
        }
        return sum;
    } 
}
