package zernov.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class StudentRepo implements StudentRepoInterface{

    @PersistenceContext
    private final EntityManager em;

    public StudentRepo(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Long> getIdByName(String name) {
        TypedQuery<Long> query = em.createQuery("select s.id " +
                        "from Student s " +
                        "where s.name = :name",
                Long.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public List<Long> getCourseGradesId(long courseId, long groupId) {
        TypedQuery<Long> query = em.createQuery("select scg.gradeId from StudentCourseGrade scg " +
                        "where scg.courseId = :course_id and " +
                        "scg.studentId in (select s.id from Student s where s.group_id = :group_id)",
                Long.class);
        query.setParameter("course_id", courseId);
        query.setParameter("group_id", groupId);

        return query.getResultList();
    }

    @Override
    public List<String> getCourseGrades(long courseId, long groupId) {

        List<Long> courseGradesId = getCourseGradesId(courseId, groupId);
        List<String> courseGrades = new ArrayList<>();

        for (int i=0; i < courseGradesId.size(); i++) {
            long id = courseGradesId.get(i);
            TypedQuery<String> query = em.createQuery("select g.grade from Grade g where g.id = :id",
                    String.class);
            query.setParameter("id", id);
            courseGrades.add(query.getSingleResult());
        }
        return courseGrades;
    }

}
