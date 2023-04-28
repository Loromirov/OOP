package StudentDomen;

import java.util.List;

import java.util.Iterator;
/* Альтернативный способ итерации обьектов, в работе использован не он.
 * Этот способ закоменчен в StudentGroupe
 */
public class StudentGroupIterator implements Iterator<Student>
{
    private int counter;
    private final List<Student> students;
    public StudentGroupIterator(List<Student> studentGroup) 
    {
        this.students = studentGroup;
        this.counter = 0;
    }
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

}
