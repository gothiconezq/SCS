package top.kinggg.scs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@MapperScan("top.kinggg.scs.mapper")
@SpringBootApplication(scanBasePackages="top.kinggg.scs")
//开启定时
@EnableScheduling
public class ScsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScsApplication.class, args);
	}

}

