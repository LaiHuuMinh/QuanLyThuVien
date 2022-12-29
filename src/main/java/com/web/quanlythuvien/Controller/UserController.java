package com.weblhm.quanlythuvien.controller.admin;

import com.weblhm.quanlythuvien.Dao.UserDao;
import com.weblhm.quanlythuvien.util.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserPage",urlPatterns = "Page/UserPage.jsp")
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        List<User> users = userDao.getListUser();
        req.setAttribute("users",users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Page/UserPage.jsp");
        requestDispatcher.forward(req,resp);
    }
}
