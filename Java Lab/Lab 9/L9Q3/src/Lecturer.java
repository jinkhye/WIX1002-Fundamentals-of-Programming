
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lecturer extends PersonProfile {
    
    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] creditHour;
    private int[] registeredStudents;

    public Lecturer(String name, char gender, String dob, String filename) {
        super(name, gender, dob);
        
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            int lines = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                lines++;
            }
            inputStream.close();
            
            int arraysize = lines / 6;
            
            courseName = new String[arraysize];
            courseCode = new String[arraysize];
            semester = new int[arraysize];
            session = new int[arraysize];
            creditHour = new int[arraysize];
            registeredStudents = new int[arraysize];
            
            inputStream =  new Scanner(new FileInputStream(filename));
            
            for (int i = 0; inputStream.hasNextLine(); i++) {
                courseCode[i] = inputStream.nextLine();
                courseName[i] = inputStream.nextLine();
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                creditHour[i] = inputStream.nextInt();
                registeredStudents[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) inputStream.nextLine();
            }
            
            inputStream.close();
            computeCreditHour();
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }
    }
    
    private void computeCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            if (registeredStudents[i] >= 150) creditHour[i] *= 3;
            else if (registeredStudents[i] >= 100) creditHour[i] *= 2;
            else if (registeredStudents[i] >= 50) creditHour[i] *= 1.5;
            else creditHour[i] *= 1;
        }
    }
    
    @Override
    public String toString() {
        String s = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) {
            s += "\nCourse name: " + courseName[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nSession: " + session[i] +
                    "\nCredit hour: " + creditHour[i] +
                    "\nRegistered students: " + registeredStudents[i] + "\n";

        }
        return s.substring(0, s.length() - 1); // remove the last newline character
    }
}