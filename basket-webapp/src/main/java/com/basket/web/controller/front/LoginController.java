package com.basket.web.controller.front;


import com.basket.business.UserManager;
import com.basket.web.controller.AbstractBaseController;
import com.basket.web.session.Session;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yf on 2017/3/29.
 */
@RestController
public class LoginController extends AbstractBaseController {

    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        Session session = sessionManager.getSession(request, response);
        String userId = (String) session.getAttribute("userId");
        String role = (String) session.getAttribute("role");
        if (StringUtils.isNotBlank(userId) && StringUtils.isNotBlank(role)) {
            return new ModelAndView("forward:/public/");
        }
        ModelAndView mav = new ModelAndView();
        return mav;
    }
}

