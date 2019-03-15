package com.imooc.servlet;

import com.imooc.domain.User;
import com.imooc.utils.Ulog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ***************注意************************
 * application context :reg_login
 * ***************注意************************
 */
@WebServlet(name = "InitServlet")
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

        List<User> list = new ArrayList<>();
        getServletContext().setAttribute("list",list);
        Ulog.i("开始了");

    }

}
