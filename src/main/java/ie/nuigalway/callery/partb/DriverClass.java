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
 */

public class DriverClass {
    private Module m;

    public static void main(String[] args){
    
        ArrayList<CourseProgramme> Courses = new ArrayList<>();
        ArrayList<Student> Students1 = new ArrayList<>();
        ArrayList<Student> Students2 = new ArrayList<>();
        ArrayList<Module> Modules1 = new ArrayList<>();
        ArrayList<Module> Modules2 = new ArrayList<>();
        
        CourseProgramme course1 = new CourseProgramme("4BCT", new DateTime("2003-01-11"), new DateTime("2008-01-11"), Modules1, Students1);
        Courses.add(course1);
        CourseProgramme course2 = new CourseProgramme("3BCT", new DateTime("2014-01-11"), new DateTime("2009-01-11"), Modules2, Students2);
        Courses.add(course2);
        
        Student s1 = new Student("Mike", 21, new DateTime("1997-05-02"), 1542, course1);
        Student s2 = new Student("Niall", 29, new DateTime("1989-04-12"), 1543, course1);
        Students1.add(s1);
        Students1.add(s2);
        Student[] stuArr1 = Students1.toArray(new Student[Students1.size()]);
        course1.setStudents(stuArr1);
        Student s3 = new Student("Ritchy", 32, new DateTime("1986-06-08"), 1544, course2);
        Student s4 = new Student("Joel", 28, new DateTime("1990-12-09"), 1545, course2);
        Students2.add(s3);
        Students2.add(s4);
        Student[] stuArr2 = Students2.toArray(new Student[Students2.size()]);
        course2.setStudents(stuArr2);
        Students2.add(s1);
        Students2.add(s2);
        
        Module m1 = new Module("Bio414", null, course1);
        m1.setStudents(stuArr1);
        Module m2 = new Module("His413", null, course2);
        m2.setStudents(stuArr2);
        Modules1.add(m1);
        Modules1.add(m2);
        Module[] modArr1 = Modules1.toArray(new Module[Modules1.size()]);
        Module m3 = new Module("CT415", null, course1);
        Student[] stuArr3 =  Students2.toArray(new Student[Students2.size()]);
        m3.setStudents(stuArr3);
        Module m4 = new Module("GEO517", null, course2);
        m4.setStudents(stuArr3);
        Modules2.add(m3);
        Modules2.add(m4);
        Module[] modArr2 = Modules2.toArray(new Module[Modules2.size()]);
        
        course1.setModules(modArr1);
        course2.setModules(modArr2);
        
        System.out.println("Course:" +course1.getCourseName());
        Module[] modArr3 = course1.getModules();
       for(int i = 0; i < (modArr3.length/2); i++)
       {
           System.out.println("Module: "+modArr3[i].getName());
           stuArr3 = modArr3[i].getStudent();
           for(int j = 0; j < stuArr3.length; j++)
           { 
               System.out.println("Student:"+stuArr3[j].getName()+" Username: "+ stuArr3[j].getUserame());
           }
       }
       System.out.println("\n Course:" +course2.getCourseName());
        modArr3 = course2.getModules();
       for(int i = 0; i < (modArr3.length/2); i++)
       {
           System.out.println("Module: "+modArr3[i].getName());
           stuArr3 = modArr3[i].getStudent();
           for(int j = 0; j < stuArr3.length; j++)
           {
               System.out.println("Student:"+stuArr3[j].getName()+" Username: "+ stuArr3[j].getUserame());
           }
       }
    } 
}