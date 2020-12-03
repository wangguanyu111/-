package Android.controller;

import Android.pojo.Student;
import Android.service.StudentService;
import Android.utils.ResponseBo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Controller
public class Studentcontroller {
    @RequestMapping("students")
    @ResponseBody
    public List<Student> getUsers(Student student) throws IOException {
        StudentService studentService = new StudentService();
        List<Student> list = studentService.findAll(student);
        return list;
    }

    @RequestMapping(value = "Add")
    public String Add(Student student) throws IOException {
        System.out.println(student);
        StudentService studentService = new StudentService();
        studentService.Add(student);
        return "index.jsp";
    }

    @RequestMapping(value = "delete")
    public String delete(int id) throws IOException {
        System.out.println(id);
        StudentService studentService = new StudentService();
        studentService.delete(id);
        return "index.jsp";
    }
    @RequestMapping(value = "update")
    public String update(Student student) throws IOException {
        System.out.println(student);
        StudentService studentService = new StudentService();
        studentService.update(student);
        return "index.jsp";
    }

}
