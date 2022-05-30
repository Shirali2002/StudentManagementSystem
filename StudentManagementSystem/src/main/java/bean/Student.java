package bean;

public class Student extends Person {

    private String schoolName;
    private double schoolarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(double schoolarship) {
        this.schoolarship = schoolarship;
    }

    @Override
    public String toString() {
        return "schoolName=" + schoolName + ", schoolarship=" + schoolarship;
    }

}
