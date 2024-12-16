package am.student.StudentManagement.repository;

import am.student.StudentManagement.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface UserRepository<T, ID> extends JpaRepository<T, ID> {
  List<T> getUserByUserType(UserType userType);
}
