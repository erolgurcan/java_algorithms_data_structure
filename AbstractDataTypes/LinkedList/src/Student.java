public class Student {

    private int id;
    private String name;
    private String email;
    private String major;
    private double CGPA;
    private String[] courses;

    public Student() {
    };

    public Student(int id, String name, String email, String major, double CGPA, String[] courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.major = major;
        this.CGPA = CGPA;
        this.courses = courses;
    };

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Student ID: " + id + " Name: " + name + " Email: " + email + " Major: " + major + " CGPA: " + CGPA
                + " Courses: ";

    }

}
