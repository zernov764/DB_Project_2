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
@Table(name = "grades")
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    @Id
    private long id;
    @Column(name = "grade", updatable = false)
    private String grade;
}
