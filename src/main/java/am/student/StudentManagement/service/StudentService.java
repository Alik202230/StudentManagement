package am.student.StudentManagement.service;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;

import java.util.List;

public interface StudentService {

  User createStudent(User user);
  List<User> getAllStudents(UserType userType);

}
