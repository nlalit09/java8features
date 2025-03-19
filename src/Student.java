public class Student {

    private String fname;
    private String lname;
    private String city;
    private double score;
    private int age;
    private String subject;
    public Student(String fname, String lname, String city, double score, int age, String subject) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.score = score;
        this.age = age;
        this.subject = subject;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString() {
        return subject + " " + fname + " " + lname+" " + city + " " + score + " " + age + " " + subject;
    }
}
