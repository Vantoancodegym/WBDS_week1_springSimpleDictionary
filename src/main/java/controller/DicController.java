package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DicService;

@Controller
@RequestMapping("/dictionary")
public class DicController {
    DicService dicService=new DicService();
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("home");
        return modelAndView;
    }
    @PostMapping("")
    public ModelAndView search(@RequestParam String vnWord){
        ModelAndView modelAndView=new ModelAndView("home");
        String result=dicService.findByKey(vnWord);
        if (result==null) result="not found";
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
