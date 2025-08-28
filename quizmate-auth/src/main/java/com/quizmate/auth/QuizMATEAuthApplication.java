package com.quizmate.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.quizmate.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author moru
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QuizMATEAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATEAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   _____  ___   __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |__  / |_ _| |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |   / /   | |  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  / /_   | |  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  /____| |___| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}
