package am.student.StudentManagement.service.impl;

import am.student.StudentManagement.entity.Lesson;
import am.student.StudentManagement.repository.LessonRepository;
import am.student.StudentManagement.service.LessonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

  private final LessonRepository lessonRepository;

  public LessonServiceImpl(LessonRepository lessonRepository) {
    this.lessonRepository = lessonRepository;
  }

  @Override
  public Lesson createLesson(Lesson lesson) {
    return this.lessonRepository.save(lesson);
  }

  @Override
  public List<Lesson> findAllLessons() {
    return this.lessonRepository.findAll();
  }
}
