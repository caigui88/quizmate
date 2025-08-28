package com.quizmate.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author moru
 * @date 2025/8/27 21:21
 * @Description
 */
@SpringBootApplication
@MapperScan("com.quizmate.question.mapper")
@EnableScheduling
@ServletComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class QuizMATEQuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATEQuestionApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  题库服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   _____  ___   __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |__  / |_ _| |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |   / /   | |  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  / /_   | |  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  /____| |___| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}