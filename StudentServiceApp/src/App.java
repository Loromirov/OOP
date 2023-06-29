import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentCourse;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentDomen.AverageAge;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;
//import StudentDomen.User;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        StudentService studServ = new StudentService();
        studServ.create("Екатерина", "Горшенина", 20);
        studServ.create("Алена", "Вайтеховская", 21);
        studServ.create("Владимир", "Арсеньев", 20);
        studServ.create("Алексей", "Бударин", 21);
        studServ.create("Олег", "Пневмослонович", 20);
        
        // System.out.println("============Список студентов до сортировки=========");
        // System.out.println(studServ.getAll());
        
        EmploeeService empService = new EmploeeService();
        empService.create("Олег", "Иванов", 41);
        empService.create("Алексей", "Пупкин", 25);
        empService.create("Евпатий", "Мишустин", 31);
        empService.create("Елисей", "Кривошеин", 65);
        empService.create("Ольга", "Иванова", 39);


        // System.out.println("============Список работников до сортировки=========");
        // System.out.println(empService.getAll());
        // System.out.println();
        // System.out.println("==========После сортировки==========");
        // System.out.println(empService.getSortedByFIOEmploeeGroup());

        TeacherService teachService = new TeacherService();
        teachService.create("Екатерина", "Михайлова", 25);
        teachService.create("Лидия", "Степанова", 35);
        teachService.create("Инна", "Федорова", 55);
        teachService.create("Арсений", "Аресович", 42);

        // System.out.println("============Список преподавателей до сортировки=========");
        // System.out.println(teachService.getAll());
        // System.out.println();
        // System.out.println("==========После сортировки==========");
        // System.out.println(teachService.getSortedByFIOTeacherGroup());

        AverageAge<Student> averAgeStudent = new AverageAge<>(studServ.getAll());
        System.out.println("Средний возраст студентов - "+ averAgeStudent.calcAverAge());

        AverageAge<Emploee> averAgeEmpl = new AverageAge<>(empService.getAll());
        System.out.println("Средний возраст работников - "+ averAgeEmpl.calcAverAge());

        AverageAge<Teacher> averAgeTeach = new AverageAge<>(teachService.getAll());
        System.out.println("Средний возраст преподавателей - "+ averAgeTeach.calcAverAge());

    }
}

