package com.quizmate.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.quizmate.common.security.annotation.EnableCustomConfig;
import com.quizmate.common.security.annotation.EnableRyFeignClients;

/**
 * 代码生成
 *
 * @author moru
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class QuizMATEGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATEGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  面试伙伴——代码生成服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   ___   _____  __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |_ _| |__  / |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |  | |    / /  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  | |   / /_  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  |___| /____| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}
