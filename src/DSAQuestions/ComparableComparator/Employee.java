package DSAQuestions.ComparableComparator;

public class Employee implements Comparable<Employee>{
    int id;
    int salary;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id == o.id){
            if(this.salary > o.salary){
                return 1;
            } else if(this.salary < o.salary){
                return -1;
            } else {
                return 0;
            }
        } else {
            return this.id - o.id;
        }
    }

    @Override
    public String toString() {
        return "Employee id:"+ this.id + " name:" + this.name + " salary:"+ this.salary;
    }
}
