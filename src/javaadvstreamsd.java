import java.util.*;
import java.util.stream.Collectors;

public class javaadvstreamsd {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
                new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
                new Student("Michael", "Peterson", "New York", 7.5, 20, "Civil"),
                new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
                new Student("John", "Miller", "Miami", 7.83, 20, "Civil")
        );

        // 1. Find students from Miami with a grade greater than 8.0
        List<Student> listofstudents=students.stream().filter(n->n.getCity().equals("Miami")&&n.getScore()>4.0).collect(Collectors.toList());
        System.out.println(listofstudents);

        // 2. Find the student with the highest grade
        Optional<Student> studentwithhighestgrade=students.stream().max(Comparator.comparingDouble(s->s.getScore()));
        System.out.println(studentwithhighestgrade.get());

        // 3. Count the number of students in each department
        Map<String,Long> countstudents=students.stream().collect(Collectors.groupingBy(s->s.getSubject(),Collectors.counting()));
        System.out.println(countstudents);

         // 4. Find the average grade per department
        Map<String,Double> avggrade=students.stream().collect(Collectors.groupingBy(s->s.getSubject(),Collectors.averagingDouble(s->s.getScore())));
        System.out.println(avggrade);

        // 5. List students sorted by age and then by grade
        List<Student>  sortlist=students.stream().sorted(Comparator.comparingInt(n->n.getAge())).sorted(Comparator.comparingDouble(s->s.getScore())).collect(Collectors.toList());
        System.out.println(sortlist);

        // 6. Create a comma-separated list of student names
        String commanames=students.stream().map(Student::getFname).collect(Collectors.joining(","));
        System.out.println(commanames);

        // 7. Check if all students are above 18
        boolean checkage=students.stream().allMatch(n->n.getAge()>18);
        System.out.println(checkage);


    }
}
