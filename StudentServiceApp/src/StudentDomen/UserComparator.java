package StudentDomen;

import java.util.Comparator;

/** Универсальный класс сравнения пользователей */
public class UserComparator<T extends User> implements Comparator<T> 
{
    /* Перегрузка метода сравнения */
    @Override
    public int compare(T o1, T o2) 
    {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) 
        {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            return resultOfComparing;
        } 
        else 
        {
            return resultOfComparing;    
        }
    }
    
}