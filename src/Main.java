import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Employee> employees = employeeAndProductDB.getAllEmployees();
       employees.stream().forEach(System.out::println);
       employees.forEach(e->System.out.println(e.getName()));
                List<Employee> emp2=employees.stream().filter(e->e.getDepartment().equals("Development"))
                                .collect(Collectors.toList());

                System.out.println(emp2);

        //filter
        Map<Integer,String> SalesEmployees=employees.stream()
                .filter(s->s.getDepartment().equals("Sales") && s.getSalary()>6000)
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(SalesEmployees);

        //tofetch all dept names
        //map
        //distinct
        List<String> depts=employees.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
        System.out.print(depts);

        //flatmap to extract values from nested loops
        List<String> projectnames=employees.stream().flatMap(e->e.getProjects().stream()).map(p->p.getName()).distinct().collect(Collectors.toList());
        System.out.print(projectnames);

        List<Employee> n=employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).collect(Collectors.toList());
        System.out.println(n);

        //max
        Optional<Employee> higpayjobs=employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest paid employee : "+higpayjobs);
        //min
        Optional<Employee> lowpayjob=employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Lowest paid employee : "+lowpayjob);


        //groupby
        Map<String,String> malegender=employees.stream().filter(e->e.getGender().equals("Male")).collect(Collectors.toMap(Employee::getGender, Employee::getName));
        List<Employee> femalegender=employees.stream().filter(e->e.getGender().equals("Female")).collect(Collectors.toList());
    }
}