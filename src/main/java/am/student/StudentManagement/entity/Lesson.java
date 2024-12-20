package am.student.StudentManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lesson")
public class Lesson {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private int duration;
  private double price;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date startDate;
  @ManyToOne
  @JoinColumn(name = "teacher_id")
  private User teacherId;
}
