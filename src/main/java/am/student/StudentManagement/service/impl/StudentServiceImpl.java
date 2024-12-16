package am.student.StudentManagement.service.impl;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;
import am.student.StudentManagement.repository.StudentRepository;
import am.student.StudentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public User createStudent(User user) {
    return this.studentRepository.save(user);
  }

  @Override
  public List<User> getAllStudents(UserType userType) {
    return this.studentRepository.getUserByUserType(userType);
  }
}
