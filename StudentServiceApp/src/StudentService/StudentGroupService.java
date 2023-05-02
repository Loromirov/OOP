package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/** Класс сервис групп студентов */
public class StudentGroupService 
{
    //private int count;
    private List<StudentGroup> groups;

    /* Конструктор класса */
    public StudentGroupService() 
    {
        this.groups = new ArrayList<StudentGroup>();
    }
    
    /* Метод получения всех групп */
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }

    /* Метод сортировки студентов по ФИО */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) 
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<>());
        return students;
    }

}
