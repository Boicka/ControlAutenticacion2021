<%-- 
    Document   : paginaa
    Created on : 29/09/2020, 09:06:09 AM
    Author     : joseluissuarez
--%>

<%@page import="app.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Empresa S.A.</title>
    </head>
    <body>
        <%
            // Valida si el usuario inició una sessión

            //HttpSession sesion = request.getSession();
            Usuario u = (Usuario) session.getAttribute("usuario");
            if (u == null) {
                RequestDispatcher dispatcher
                        = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            }
        %>
        <h1>Bienvenido!!!</h1>

        <br><br>

        <h2>${usuario.nombre}</h2>
        <br>
        <a href="paginab.jsp">Pagina B</a>
        <br>
        <a href="paginac.jsp">Pagina C</a>        
        <br>

        <footer>
            <form action="TerminaSesion" method="POST">
                <input type="submit" value="Terminar sesión" />
            </form>
        </footer>



    </body>
</html>
