package ie.nuigalway.callery.partb;

import ie.nuigalway.callery.mavenproject1.CourseProgramme;
import ie.nuigalway.callery.mavenproject1.Module;
import ie.nuigalway.callery.mavenproject1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
Part b) acts as a driver project creating a handful of fictional students with mock data,
adding the students to a number of modules and adding a number of modules to a course.
Further on, the program should print out a list of all the courses, their respective modules,
and all students, their usernames, assigned modules and the course(s) they are registered
for to the console. 
* 
* c = new CourseProgramme("4BCT", new DateTime("2000-01-11"), new DateTime("2004-01-11"), Modules, Students);
        s = new Student("Naoise Callery", 22, new DateTime("1996-06-09"), 1542, c);
        m = new Module("CT414", s, c);

 */

public class DriverClass {
    private Student s;
    private Module m;
    private CourseProgramme c;
    
    private ArrayList<CourseProgramme> Courses = new ArrayList<>();
    private ArrayList<Student> Students = new ArrayList<>();
    private ArrayList<Module> Modules = new ArrayList<>();
    
    public static void main(String[] args){
    
        newCourses();
           
        newStudents();
 
        newModules();

       }
    
    public void newStudents(){
        Student stu = new Student(name, age, dob, id, course);
    }
    
    public void newModules(){
        Module mod = new Module(name, student, course);
    }
    
    public void newCourses() {
        CourseProgramme course1 = new CourseProgramme("4BCT", new DateTime("2000-01-11"), new DateTime("2004-01-11"), Modules, Students);
        CourseProgramme course2 = new CourseProgramme("4BCT", new DateTime("2000-01-11"), new DateTime("2004-01-11"), Modules, Students);
    }
    
    public void printResults(){
        //list of courses
        //their respective modules
        //Students for a module + usernames
    }
}