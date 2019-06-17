package cwl.come.controller;


import cwl.come.domain.Account;
import cwl.come.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findById")
    public ModelAndView findById(ModelAndView modelAndView) {
        Account byId = accountService.findById(1);
        modelAndView.setViewName("itemDetail");
        modelAndView.addObject("item", byId);


        return modelAndView;
    }

}
