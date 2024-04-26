package DSAQuestions;


public class Employee{
    int id;
    String name;

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

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CloningDemo{
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(1,"AISH");
        Employee e2 = (Employee) e1.clone();
    }
}