package StudentDomen;
/**
 Класс студент, дочерный от пользователя, с добавлением Comparable
 */
public class Student extends User implements Comparable<Student>{
    private long studentId;
    /**
     * Конструктор класса
     * 
     * @param firstName     Имя 
     * @param lastName      Фамилия 
     * @param age           Возраст
     * @param studentId     Идентификационный номер
     */
    public Student(String firstName, String lastName, int age, long studentId)
    {
        super(firstName, lastName, age);
        this.studentId = studentId;
    }

    /* Получение идентификационного номера */
    public long getStudentId()
    {
        return studentId;
    }

    /* Редактирование идентификационного номера */
    public void setStudentId(long studentId)
    {
        this.studentId = studentId;
    }

    /* Перегрузка метода ввода */
    @Override
    public String toString()
    {
        return "Student {"
        + "First Name - " + super.getFirstName()
        + ", Last Name - " + super.getLastName()
        + ", Age - " + super.getAge() 
        + ", studentID - " + studentId + '}';
    }
    
    /* Перегрузка метода сравнения двух студентов
     * 3 варианта. 1 - по возрасту, 2 по ID, 3 - по возрасту и ID
     */
    @Override
    public int compareTo(Student o) 
    // {
    //     if(super.getAge() == o.getAge())
    //     {
    //         return 0;
    //     }
    //     if (super.getAge() < o.getAge()) {
    //         return -1;
    //     }
    //     return 1;
    // };

    // {
    //     if(getStudentId() == o.getStudentId())
    //     {
    //         return 0;
    //     }
    //     if (this.studentId < o.studentId) {
    //         return -1;
    //     }
    //     return 1;
    // };
    
        {
        if(super.getAge() == o.getAge())
        {
            if(getStudentId() == o.getStudentId())
            {
                return 0;
            }
            if (this.studentId < o.studentId) {
                return -1;
            }
            return 1;

        }
        if (super.getAge() < o.getAge()) {
            return -1;    
        }
        return 1;
    };

    
}
