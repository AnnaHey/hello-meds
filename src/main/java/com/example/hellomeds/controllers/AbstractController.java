package com.example.hellomeds.controllers;

import com.example.hellomeds.models.data.PatientDao;
import com.example.hellomeds.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Anna Hexter on 11/28/2017.
 */
public class AbstractController {

    @Autowired
    protected UserDao userDao;

    @Autowired
    protected PatientDao patientDao;

    public static final String userSessionKey = "user_id";

    protected User getUserFromSession(HttpSession session) {
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        return userId == null ? null : userDao.findOne(userId);
        }

    protected void setUserInSession(HttpSession session, User user) {
        session.setAttribute(userSessionKey, user.getUid());
        }

    @ModelAttribute("user")
    public User getUserForModel(HttpServletRequest request) {
        return getUserFromSession(request.getSession());
        }

    }
}
