public class Teacher extends Person{
    private String courseName;

    public Teacher(){
        super();
    }

    public Teacher(String name, String surname, String courseName){
        this();
        setName(name);
        setSurname(surname);
        setCourseName(courseName);
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
