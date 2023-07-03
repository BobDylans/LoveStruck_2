package com.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 舒润
 */
@Slf4j
@SpringBootApplication
public class MakeFriendServer {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MakeFriendServer.class, args);
        print_info(applicationContext);
    }
    private static void print_info(ConfigurableApplicationContext context) {
        Environment env = context.getEnvironment();
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String port = env.getProperty("server.port");
        String active = env.getProperty("spring.profiles.active");
        String contextPath = env.getProperty("server.servlet.context-path");
        if (contextPath == null) {
            contextPath = "";
        }
        log.info("\n----------------------------------------------------------\n\t" +
                "示例程序【" + active + "】环境已启动! 地址如下:\n\t" +
                "Local: \t\thttp://localhost:" + port + contextPath + "\n\t" +
                "External: \thttp://" + ip + ':' + port + contextPath + '\n' +
                "Swagger文档: \thttp://" + ip + ":" + port + contextPath + "/doc.html\n" +
                "----------------------------------------------------------");
    }
}
