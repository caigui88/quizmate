package com.quizmate.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.quizmate.common.security.annotation.EnableCustomConfig;
import com.quizmate.common.security.annotation.EnableRyFeignClients;

/**
 * 定时任务
 *
 * @author moru
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class QuizMATEJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATEJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   _____  ___   __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |__  / |_ _| |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |   / /   | |  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  / /_   | |  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  /____| |___| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}
