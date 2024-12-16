package am.student.StudentManagement.service;

import am.student.StudentManagement.entity.Lesson;

import java.util.List;

public interface LessonService {

  Lesson createLesson(Lesson lesson);
  List<Lesson> findAllLessons();

}
