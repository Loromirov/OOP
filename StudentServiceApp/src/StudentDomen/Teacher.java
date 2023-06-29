package StudentDomen;

/* Класс преподавателей */
public class Teacher extends User
{
    private int teachId;
    private String academicDegree;

    /* Конструктор класса */
    public Teacher(String firstName, String lastName, int age,int teachId, String academicDegree) {
        super(firstName, lastName, age);
        this.teachId = teachId;
        this.academicDegree = academicDegree;
    }

    /* Получение идентификационного номера */
    public int getTeachId() {
        return teachId;
    }

    /* Изменение идентификационного номера */
    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    /* Получение ученой степени */
    public String getLvl() {
        return academicDegree;
    }

    /* Изменение ученой степени */
    public void setLvl(String academicDegree) {
        this.academicDegree = academicDegree;
    }
    
    /* Переопределение метода распечатки */
    public String toString()
    {
        return "Teacher {"
        + "First Name - " + super.getFirstName()
        + ", Last Name - " + super.getLastName()
        + ", Age - " + super.getAge() 
        + ", TeacherId - " + teachId 
        + ", Academic Degree - " + academicDegree + '}';
    }
    
    
}
