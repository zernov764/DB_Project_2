package zernov.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student_courses_grade")
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseGrade {

    @Id
    private long id;
    @Column(name = "student_id")
    private long studentId;

    @Column(name = "course_id")
    private long courseId;

    @Column(name = "grade_id")
    private long gradeId;

}
