

/*
Define a class PersonProfile. The class has a name, gender and date of birth. The
class consists of a constructor and a display method. Derived a Student class from
PersonProfile. The Student class has a list of course name and course code, semester,
session, mark and a file name. The class consists of a constructor with student profile
and file input name. All the information is retrieved from a text file named
course.txt. (Please download the file from the Web site.). Create a getGrade method
for the mark base on the table below:
*/

public class PersonProfile {
    
    private String name;
    private char gender;
    private String dob;
   
    public PersonProfile(String name, char gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
    
    @Override
    public String toString() {
        return "Name: " + name +
                "\nGender: " + gender +
                "\nDate of birth: " + dob;
    }

}