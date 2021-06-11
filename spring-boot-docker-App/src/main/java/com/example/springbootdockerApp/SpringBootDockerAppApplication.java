package com.example.springbootdockerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.context.ConfigurableApplicationContext;
// import java.util.Map;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringBootDockerAppApplication {

    // @RequestMapping("/")
    // String hello() {
    //     return "Hello Spring Boot!";
    // }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerAppApplication.class, args);
        // try (ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDockerAppApplication.class, args)) {
        //     SpringBootDockerAppApplication m = ctx.getBean(SpringBootDockerAppApplication.class);
        //     m.method();
        // }
    }

    // DB接続確認用
    // @Autowired
    // private JdbcTemplate jdbc;

    // public void method() {
    //     List<Map<String, Object>> list = this.jdbc.queryForList("SELECT * FROM employee");
    //     list.forEach(System.out::println);
    // }
}
