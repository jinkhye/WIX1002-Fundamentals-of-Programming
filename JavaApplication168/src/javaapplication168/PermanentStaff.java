package javaapplication168;

public class PermanentStaff extends Staff {

    public String grade;
    
    public PermanentStaff(String name, String IC, String grade) {
        super(name,IC);
        this.grade = grade;
    }
    
    public int getSalary() {
        switch (grade) {
            case "EM01":
                return 7000;
            case "EM02":
                return 5000;
            case "EM03":
                return 3000;
            default:
                return 1000;
        }
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        return result + 
                "\nGrade: " + grade +
                "\nSalary: RM " + getSalary() + "\n";
    }
}