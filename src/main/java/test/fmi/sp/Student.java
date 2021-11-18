package test.fmi.sp;

public class Student extends Element {
    private String nume, email;

    public Student(String nume, String email){
        this.nume = nume;
        this.email = email;
    }

    @Override
    public Element add(Element element) {
        return null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
