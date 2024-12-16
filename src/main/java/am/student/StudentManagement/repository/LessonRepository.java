package am.student.StudentManagement.repository;

import am.student.StudentManagement.entity.Lesson;
import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
