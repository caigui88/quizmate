package com.quizmate.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.quizmate.common.security.annotation.EnableCustomConfig;
import com.quizmate.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 *
 * @author moru
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class QuizMATESystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATESystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  面试伙伴——后台系统服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   ___   _____  __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |_ _| |__  / |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |  | |    / /  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  | |   / /_  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  |___| /____| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}
