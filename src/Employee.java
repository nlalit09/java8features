import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String gender;
    private double salary;
    private List<Project> projects;

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getName() + " " + getDepartment() + " " + getGender() + " " + getSalary();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department, List<Project> projects, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.gender=gender;
        this.department = department;
        this.salary=salary;
        this.projects = projects;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }


}
