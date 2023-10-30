package DSAQuestions.ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableComparatorDemo {

    public static void main(String[] args) {
        Employee e3 = new Employee(2,30, "MithunR Das");
        Employee e1 = new Employee(1,10, "Arun");
        Employee e2 = new Employee(1,20, "Apoorna");
        Employee e4 = new Employee(3,40, "Arunadhita Chatterjee");
        Employee e5 = new Employee(3,45, "Varunadhit Bhai");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e5); list.add(e4); list.add(e3); list.add(e2); list.add(e1);
        list.sort(new NameLengthComparator());
        for(Employee e : list){
            System.out.println(e);
        }
        System.out.println();
        list.sort(new SalaryComparator());
        for(Employee e : list){
            System.out.println(e);
        }

        /*Employee[] eArr = new Employee[5];
        eArr[0] = e1;  eArr[1] = e3;  eArr[2] = e5;  eArr[3] = e2;  eArr[4] = e4;
        Arrays.sort(eArr);
        for(Employee e: eArr){
            System.out.println(e);
        }*/
    }
}


class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary < o2.salary){
            return -1;
        } else if(o1.salary > o2.salary){
            return 1;
        }else {
            return 0;
        }
    }
}

class NameLengthComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.length() - o2.name.length();
    }
}
