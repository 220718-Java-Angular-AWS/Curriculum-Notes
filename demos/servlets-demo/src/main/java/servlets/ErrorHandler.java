package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Exception exception = (Exception) req.getAttribute("javax.servlet.error.exception");
        Class exceptionClass = (Class) req.getAttribute("javax.servlet.error.exception_type");
        Integer status_code = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String errorMessage = (String) req.getAttribute("javax.servlet.error.message");
        String requestUri = (String) req.getAttribute("javax.servlet.error.request_uri");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");

        System.out.println("Exception: " + exception);
        System.out.println("Exception Type: " + exceptionClass);
        System.out.println("HttpError Status code: " + status_code);
        System.out.println("ErrorMessage: " + errorMessage);
        System.out.println("Request URI: " + requestUri);
        System.out.println("Servlet Name: " + servletName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Exception exception = (Exception) req.getAttribute("javax.servlet.error.exception");
        Class exceptionClass = (Class) req.getAttribute("javax.servlet.error.exception_type");
        Integer status_code = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String errorMessage = (String) req.getAttribute("javax.servlet.error.message");
        String requestUri = (String) req.getAttribute("javax.servlet.error.request_uri");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");

        System.out.println("Exception: " + exception);
        System.out.println("Exception Type: " + exceptionClass);
        System.out.println("HttpError Status code: " + status_code);
        System.out.println("ErrorMessage: " + errorMessage);
        System.out.println("Request URI: " + requestUri);
        System.out.println("Servlet Name: " + servletName);
    }
}
