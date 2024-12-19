package am.student.StudentManagement.repository;

import am.student.StudentManagement.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
