package com.basket.web.controller.front;


import com.basket.business.UserManager;
import com.basket.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yf on 2017/3/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/user")
    public ModelAndView user(){
        UserExample e = new UserExample();
        e.createCriteria();
        Long count = userManager.countByExample(e);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/user");
        mav.addObject("count", count);
        return mav;
    }
}
