package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by vincent on 4/20/2016.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
