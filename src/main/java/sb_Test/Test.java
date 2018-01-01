package sb_Test;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class Test {
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(Test.class, args);
	}

}
