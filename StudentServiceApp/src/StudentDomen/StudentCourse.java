package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * Класс курс студентов с интерфейсом Iterable
 */
public class StudentCourse implements Iterable<StudentGroup>
{
    private List<StudentGroup> course;

    /**
     * Конструктор класса   
     * 
     * @param course    Список групп студентов
     */
    public StudentCourse(List<StudentGroup> course) 
    {
        this.course = course;
    }

    /* Получение списка групп в курсе */
    public List<StudentGroup> getCourse() 
    {
        return course;
    }

    /* Редктирование списка групп в курсе */
    public void setCourse(List<StudentGroup> course) 
    {
        this.course = course;
    }

    @Override
    /* Перегрузка итератора */
    public Iterator<StudentGroup> iterator() 
    {
        return new Iterator<StudentGroup>() 
        {
            private int index = 0;

            @Override
            public boolean hasNext() 
            {
                return index < course.size();
            }

            @Override
            public StudentGroup next() 
            {
                if (!hasNext()) 
                {
                    return null;
                }
        // counter++;
            return course.get(index++);
            }

        };
    }


}

