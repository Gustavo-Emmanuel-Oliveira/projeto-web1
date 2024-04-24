/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = "/logar")
@MultipartConfig
public class LoginController extends HttpServlet {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDao = new UsuarioDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/pages/login.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/logar")) {
            logar(request, response);
        } else {
            processRequest(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
        protected void logar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        usuario.setEmail(request.getParameter("email"));
        usuario.setSenha(request.getParameter("senha"));
        if (usuario.getEmail().trim().equals("") || usuario.getSenha().trim().equals("")) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Por favor, preencha todos os campos.');");
            out.println("window.location.href = './cadastro-usu';");
            out.println("</script>");
        } else {
            usuarioDao.logar(usuario);
            if (Usuario.getIdUsuario() > 0) {
                if (Usuario.getIdUsuario() == 1) {
                    response.sendRedirect("./home");
                } else {
                    response.sendRedirect("./home");
                }
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Por favor, faça o cadastro.');");
                out.println("window.location.href = './cadastro-usu';");
                out.println("</script>");
            }
        }

    }

}
