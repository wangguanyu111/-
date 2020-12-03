package Android.test;

import Android.pojo.Student;
import Android.service.StudentService;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        StudentService studentService=new StudentService();
        studentService.Add(new Student(5,"5","5",5,5,2));
    }


}
