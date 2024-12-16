package am.student.StudentManagement.service;

import am.student.StudentManagement.entity.User;
import am.student.StudentManagement.entity.UserType;

import java.util.List;

public interface TeacherService {

  User createTeacher(User user);
  List<User> getAllTeachers(UserType userType);

}
