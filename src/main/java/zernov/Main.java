package zernov;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zernov.service.CalculatingService;

import java.sql.SQLException;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws SQLException {

        ApplicationContext context = SpringApplication.run(Main.class, args);
        CalculatingService service = context.getBean((CalculatingService.class));

        System.out.println("Средняя оценка в группе по данному курсу: " + service.calculateAverageMark(2,1));

        Console.main(args);
    }
}
