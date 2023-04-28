import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentCourse;
import StudentDomen.StudentGroup;
//import StudentDomen.User;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //User u1 = new User("Сергей","Иванов", 25);
        Student s1 = new Student("Любовь", "Любовна", 45, 1520);
        Student s2 = new Student("Андрей", "Андреев", 32, 1029);
        Student s3 = new Student("Иван", "Иванов", 32, 109);
        Student s4 = new Student("Анастасия", "Анастасиевна", 19, 10);
        Student s5 = new Student("Дарья", "Дарьевна", 32, 24);
        Student s6 = new Student("Роман", "Романов", 20, 3985);
        Student s7 = new Student("Артем", "Артемов", 25, 109);
        Student s8 = new Student("Алина", "Алинина", 19, 10);
        Student s9 = new Student("Сергей", "Сергеев", 32, 24);
        Student s10 = new Student("Александр", "Александров", 20, 3985);

        

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        listStud3.add(s10);

        StudentGroup group1 = new StudentGroup(listStud1, (int)41);
        StudentGroup group2 = new StudentGroup(listStud2, (int)21);
        StudentGroup group3 = new StudentGroup(listStud3, (int)31);
        /* 
        for (Student student : group1) {
            System.out.println(student);
        }

        System.out.println("======================После сортировки========================");


        Collections.sort(group1.getStudents());

        for (Student student : group1) {
            System.out.println(student);
        }
*/
        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);
        StudentCourse course = new StudentCourse(listGroup);

        System.out.println("======Перед сортировкой======");  

        for (StudentGroup group : course)
        {
            System.out.println("Group " + group.getGroupId());
            for (Student student : group) 
            {
                System.out.println(student);
            }

        }

        System.out.println();
        System.out.println("======================После сортировки========================");
        System.out.println();
        Collections.sort(course.getCourse());

        for (StudentGroup group : course)
        {
            Collections.sort(group.getStudents());
        }
        for (StudentGroup group : course)
        {
            System.out.println("Group " + group.getGroupId());
            for (Student student : group) 
            {
                System.out.println(student);
            }        
        }

    }
}
