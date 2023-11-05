package RandomLearnings;

public class StringDemo {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Aishwarya");
        s.setCharAt(4,'W');
        s.insert(4,' ');
        System.out.println(s);

        String st= new String("Aish");
        //st. no set method

        StringBuilder stb = new StringBuilder("Sharmajee");
        stb.setCharAt(0,'d');
        System.out.println(stb);
        //System.exit(0); - ends the Java Virtual machine.
        System.out.println("bye");

        String sn = "namaste";
        System.out.println(sn.hashCode());
        sn += "and welcome";
        System.out.println(sn.hashCode());
    }
}
