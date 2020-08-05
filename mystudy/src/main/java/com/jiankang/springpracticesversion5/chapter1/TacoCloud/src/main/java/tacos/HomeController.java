package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *@create by jiankang
 *@date 2020/8/5 time 16:50
 */
@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "home";
    }
}


