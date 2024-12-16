package am.student.StudentManagement.controller;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import am.student.StudentManagement.repository.StudentRepository;
import am.student.StudentManagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping
  public String getStudent(ModelMap model) {
    List<User> students = this.studentService.getAllStudents(UserType.STUDENT);
    model.put("students", students);
    return "student/students";
  }

  @GetMapping("/add")
  public String createStudentPage() {
    return "student/addStudent";
  }

  @PostMapping("/add")
  public String createStudent(@ModelAttribute User user) {
    this.studentService.createStudent(user);
    return "redirect:/students";
  }

}
