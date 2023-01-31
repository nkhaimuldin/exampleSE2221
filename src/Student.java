public class Student extends Person{

    private double gpa;
    public Student(){ //no arg constructor
        super();
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void eat() {
        System.out.println("Eating junk food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping not good because of exams");
    }

    @Override
    public String toString() {
        return super.getId() + ": " + super.getName() + " " + super.getSurname() + " - " + gpa;
    }
}
