package zernov.repositories;

import java.util.List;

public interface StudentRepoInterface {

    public List<Long> getIdByName(String name);

    public List<Long> getCourseGradesId(long courseId, long groupId);

    public List<String> getCourseGrades(long courseId, long groupId);

//    public List<String> getCourseMarksInGroup(long courseId, long groupId);
}
