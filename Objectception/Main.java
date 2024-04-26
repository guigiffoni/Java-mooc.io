package Objectception;

public class Main {
    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        
        System.out.println(register.averageOfPoints());
    }
}
