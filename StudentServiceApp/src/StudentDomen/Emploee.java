package StudentDomen;

/** Класс работников */
public class Emploee extends User
{
    
        private int empId;
    /*Конструктор класса  */
    public Emploee(String firstName, String lastName, int age, int empId) {
        super(firstName, lastName, age);
        this.empId = empId;
    }

    /* Получение идентификационного номера */
    public int getEmpId() {
        return empId;
    }

    /* Изменение идентификационного номера */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /* Переопределение метода распечатки */
    public String toString()
    {
        return "Emploee {"
        + "First Name - " + super.getFirstName()
        + ", Last Name - " + super.getLastName()
        + ", Age - " + super.getAge() 
        + ", emploeeID - " + empId + '}';
    }
    

}
