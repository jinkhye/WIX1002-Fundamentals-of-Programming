package pkg2017.pkg2.q5;

public class PermanentStaff extends Staff {

    public String grade;
    
    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade = grade;
    }
    
    public int getSalary() {
        if (grade.equals("EM01")) return 7000;
        else if (grade.equals("EM02")) return 5000;
        else if (grade.equals("EM03")) return 3000;
        else return 1000;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        return result +
                "\nGrade: " + grade +
                "\nSalary: RM " + getSalary() + "\n";
    }
}