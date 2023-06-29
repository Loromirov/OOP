package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 Класс Группа студентов с интерфейсами Iterable и Comparable 
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>
{

    private List<Student> students;
    private int groupId;
    /**
     * Конструктор класса   
     * 
     * @param students  Список студентов
     * @param groupId   Номер группы
     */
    public StudentGroup(List<Student> students, int groupId) 
    {
        this.students = students;
        this.groupId = groupId;
    }

    /* Получение номера группы */
    public int getGroupId() 
    {
        return groupId;
    }

    /* Редактирование номера группы */
    public void setGroupId(int groupId) 
    {
        this.groupId = groupId;
    }

    /* Получение списка студентов */
    public List<Student> getStudents() 
    {
        return students;
    }

    /* Редактирование списка студентов */
    public void setStudents(List<Student> students) 
    {
        this.students = students;
    }

    /* Переопределение итератора */
    // @Override
    // public Iterator<Student> iterator() 
    // {
    //     return new StudentGroupIterator(students);
    // }

    /* Перегрузка Итератора */
    public Iterator<Student> iterator() 
    {
        return new Iterator<Student>()
        {
            private int counter = 0;

            @Override
            public boolean hasNext()
            {
                return counter < students.size();
            }

            @Override
            public Student next() 
            {
                if (!hasNext()) {
                    return null;
                }
                return students.get(counter++);
            }
        };

    }

    /* Перегрузка метода сравнения двух групп */
    @Override
    public int compareTo(StudentGroup o) 
    {

        if (getGroupId() == o.getGroupId()) 
        {
            return 0;
        }
        if (this.getGroupId() < o.getGroupId()) 
        {
            return -1;
        }
        return 1;

    }


}
