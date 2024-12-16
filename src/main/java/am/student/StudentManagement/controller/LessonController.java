package am.student.StudentManagement.controller;

import am.student.StudentManagement.entity.Lesson;
import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import am.student.StudentManagement.repository.TeacherRepository;
import am.student.StudentManagement.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/lessons")
public class LessonController {

  private final LessonService lessonService;
  private final TeacherRepository teacherRepository;

  public LessonController(LessonService lessonService, TeacherRepository teacherRepository) {
    this.lessonService = lessonService;
    this.teacherRepository = teacherRepository;
  }

  @GetMapping
  public String getLessonPage(ModelMap model) {
    List<Lesson> lessons = this.lessonService.findAllLessons();
    model.put("lessons", lessons);
    return "lesson/lessons";
  }

  @GetMapping("/add")
  public String getAllLessons(ModelMap model) {
    List<User> teachers = this.teacherRepository.getUserByUserType(UserType.TEACHER);
    model.put("teachers", teachers);
    return "lesson/addLesson";
  }

  @PostMapping("/add")
  public String addLesson(@ModelAttribute Lesson lesson) {
    this.lessonService.createLesson(lesson);
    return "redirect:/lessons";
  }
}
