package ink.whi.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: qing
 * @Date: 2023/10/16
 */
@EnableAsync
@EnableCaching
@ServletComponentScan
@SpringBootApplication
@MapperScan(basePackages = "ink.whi.project.modules.**.repo")
@EnableAspectJAutoProxy
@EnableScheduling
public class ApplicationRun {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationRun.class).allowCircularReferences(true).run(args);
    }
}