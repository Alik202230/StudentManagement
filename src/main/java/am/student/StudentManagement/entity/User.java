package am.student.StudentManagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
  @Enumerated(EnumType.STRING)
  private UserType userType;
}
