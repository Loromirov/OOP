package StudentDomen;

import java.util.List;

/** Класс подсчета среднего возраста студентов, преподавателей и работников */
public class AverageAge <T extends User>
{
    private List<T> persons;   

    /* Конструктор класса  */
    public AverageAge(List<T> persons) 
    {
        this.persons = persons;
    }
    
    /* Универсальный расчет среднего возраста */
    public Double calcAverAge()
    {
        double sum = 0.0;
        for (T persons : persons) 
        {
            sum +=persons.getAge();
        }
        return sum / persons.size();
    } 


    
}
