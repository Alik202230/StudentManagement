package am.student.StudentManagement.service.impl;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import am.student.StudentManagement.repository.TeacherRepository;
import am.student.StudentManagement.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

  private final TeacherRepository teacherRepository;

  public TeacherServiceImpl(TeacherRepository teacherRepository) {
    this.teacherRepository = teacherRepository;
  }

  @Override
  public User createTeacher(User user) {
    return this.teacherRepository.save(user);
  }

  @Override
  public List<User> getAllTeachers(UserType userType) {
    return this.teacherRepository.getUserByUserType(userType);
  }
}
