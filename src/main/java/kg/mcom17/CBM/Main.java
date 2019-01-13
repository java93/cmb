package kg.mcom17.CBM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
public class Main {

    @ResponseBody
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World!!!";
    }


}