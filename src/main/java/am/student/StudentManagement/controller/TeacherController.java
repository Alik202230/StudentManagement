package am.student.StudentManagement.controller;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import am.student.StudentManagement.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

  private final TeacherService teacherService;

  public TeacherController(TeacherService teacherService) {
    this.teacherService = teacherService;
  }

  @GetMapping
  public String getAllTeachers(ModelMap modelMap) {
    List<User> teachers = this.teacherService.getAllTeachers(UserType.TEACHER);
    modelMap.put("teachers", teachers);
    return "teacher/teachers";
  }

  @GetMapping("/add")
  public String getTeacherPage() {
    return "teacher/addTeacher";
  }

  @PostMapping("/add")
  public String addTeacher(@ModelAttribute User user) {
    this.teacherService.createTeacher(user);
    return "redirect:/teachers";
  }

}
