package com.mkaszynski.wpm.demo;


import com.mkaszynski.wpm.demo.db.DbCarDao;
import com.mkaszynski.wpm.demo.db.DbCarRepository;
import com.mkaszynski.wpm.demo.db.FakeHireRepository;
import com.mkaszynski.wpm.demo.domain.CarDao;
import com.mkaszynski.wpm.demo.domain.HireResource;
import com.mkaszynski.wpm.demo.domain.HireService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CarDao carDao(DbCarRepository carRepository) {
        return new DbCarDao(carRepository);
    }

    @Bean
    public HireResource hireResource(CarDao carDao) {
        return new HireResource(new HireService(carDao, new FakeHireRepository()));
    }

}
