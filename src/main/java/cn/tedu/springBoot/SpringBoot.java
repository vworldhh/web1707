package cn.tedu.springBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by LYJ on 2017/10/17.
 */
@SpringBootApplication
@MapperScan("cn.tedu.springBoot.mapper")  //扫描接口 为接口创建代理对象
public class SpringBoot {

    public static void main(String[] args){
        SpringApplication.run(SpringBoot.class,args);
    }
}
