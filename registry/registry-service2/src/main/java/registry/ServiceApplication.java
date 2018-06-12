package registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huawei
 * @create 2018-04-13
 **/
@Configuration
@EnableDiscoveryClient
@EnableAutoConfiguration
public class ServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }


    @RestController
    class ServiceInstanceRestController {
        @RequestMapping("/")
        public String home() {
            return "Hello World";
        }

        @RequestMapping("/hello/{name}")
        public String helloWorld(@PathVariable("name") String name){
            return  "hello,"+name;
        }
        @RequestMapping("/name")
        public String name(){
            return  "huawei1";
        }
    }
}
