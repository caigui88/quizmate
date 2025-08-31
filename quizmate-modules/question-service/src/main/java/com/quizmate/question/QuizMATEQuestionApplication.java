package com.quizmate.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author moru
 * @since 2025/8/27 21:21
 * @Description
 */
@SpringBootApplication
@MapperScan("com.quizmate.question.mapper")
@EnableScheduling
@ServletComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableDiscoveryClient      // 注册到 Nacos
@EnableFeignClients         // 启用 Feign
public class QuizMATEQuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizMATEQuestionApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  面试伙伴——题目服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ___    _   _   ___   _____  __  __      _      _____   _____ \n" +
                "  / _ \\  | | | | |_ _| |__  / |  \\/  |    / \\    |_   _| | ____|\n" +
                " | | | | | | | |  | |    / /  | |\\/| |   / _ \\     | |   |  _|  \n" +
                " | |_| | | |_| |  | |   / /_  | |  | |  / ___ \\    | |   | |___ \n" +
                "  \\__\\_\\  \\___/  |___| /____| |_|  |_| /_/   \\_\\   |_|   |_____|\n" +
                "                                 ");
    }
}