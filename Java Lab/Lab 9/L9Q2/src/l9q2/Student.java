package l9q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
The Student class has a list of course name and course code, semester,
session, mark and a file name. The class consists of a constructor with student profile
and file input name. All the information is retrieved from a text file named
course.txt. (Please download the file from the Web site.). Create a getGrade method
for the mark base on the table below:
*/
 
public class Student extends PersonProfile {
    
    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] mark;
    private String filename;

    
    public Student(String name, char gender, String dob, String filename) {
        
        super(name, gender, dob);
        this.filename = filename;
        
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            int lines = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                lines++;
            }
            inputStream.close();
            
            int arraysize = lines / 5;
            
            courseName = new String[arraysize];
            courseCode = new String[arraysize];
            semester = new int[arraysize];
            session = new int[arraysize];
            mark = new int[arraysize];
            
            inputStream =  new Scanner(new FileInputStream(filename));
            
            for (int i = 0; inputStream.hasNextLine(); i++) {
                courseCode[i] = inputStream.nextLine();
                courseName[i] = inputStream.nextLine();
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                mark[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) inputStream.nextLine();
            }
            
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }
    }
    
    public String getGrade(int mark) {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }
    
    @Override
    public String toString() {
        String s = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) {
            s += "\nCourse name: " + courseName[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nMark: " + mark[i] +
                    "\nGrade: " + getGrade(mark[i]) + "\n";
        }
        return s.substring(0, s.length() - 1); // remove the last newline character
    }

}