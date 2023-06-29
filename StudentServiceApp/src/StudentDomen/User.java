package StudentDomen;
/**
 Основной класс, родительский для Студентов, роботников и преподавателей
 */
public class User 
{

    private String firstName;
    private String lastName;
    //private String address;
    private int age;
    
    /**
     * Конструктор класса
     * 
     * @param firstName     Имя 
     * @param lastName      Фамилия 
     * @param age           Возраст
     */
    public User(String firstName,String lastName,int age) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /* Получение имени */
    public String getFirstName() 
    {
        return firstName;
    }

    /* Изменение имени */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }    

    /* Получение фамилии */
    public String getLastName() 
    {
        return lastName;
    }

    /* Изменение фамилии */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /* Получение возраста */
    public int getAge() 
    {
        return age;
    }

    /* Изменение возраста */
    public void setAge(int age) 
    {
        this.age = age;   
    }    

    /* Перегрузка метода вывода */
    @Override
    public String toString()
    {
        return "User{" + "First Name - '" + firstName + '\'' +
        ", Last Name - '" + lastName + '\'' +
        ", Age - " + age + '}';
    }
}
