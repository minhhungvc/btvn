package vn.com.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class RequestParamExampleController {
  
  @RequestMapping("/user")
  public String userInfo(Model model,
          @RequestParam(value = "name", defaultValue = "MinhHung") String name) {
 
      model.addAttribute("name", name);
 
      if ("admin".equals(name)) {
          model.addAttribute("email", "admin@example.com");
      } else {
          model.addAttribute("email", "hungtranvc1001@gmail.com");
      }
      return "userInfo";
  }
 
}
