package zernov.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zernov.repositories.StudentRepo;

import java.util.List;

@Service
@Slf4j
public class CalculatingService implements CalculatingServiceInterface {

    @Autowired
    private StudentRepo repo;

    @Override
    @SneakyThrows
    public double calculateAverageMark(long courseId, long groupId) {

        List<String> courseGrades = repo.getCourseGrades(courseId, groupId);
        long sum = 0;

        for (int i = 0; i < courseGrades.size(); i++){
            sum += Long.parseLong(courseGrades.get(i));
        }
        return (double) sum / courseGrades.size();
    }
}