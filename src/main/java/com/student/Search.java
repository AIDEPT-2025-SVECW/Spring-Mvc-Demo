package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Search {

    @RequestMapping("/search")
    public ModelAndView doSearch(HttpServletRequest request, HttpServletResponse response) {

        String studentRegId = request.getParameter("regId");
        System.out.println("Student id received is " + studentRegId);
        Student studentDtls = new Student("JP", studentRegId, "EEE");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("myfirstpage.jsp");
        mv.addObject("name", studentDtls.name);
        mv.addObject("dept", studentDtls.dept);
        return mv;
        // response.setContentType("text/html");
        // PrintWriter out = response.getWriter();
        // out.println("<html><body>");
        // out.println("<h2>Welcome " + studentDtls.name + " from " + studentDtls.dept +
        // "</h2>");
        // out.println("</body></html>");
    }

}
