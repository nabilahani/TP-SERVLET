package exoJAVAEE;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BienvenueServlet")
public class BienvenueServlet extends HttpServlet {
    private int compteur = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Incr�mente le compteur � chaque appel
        compteur++;

        // Configuration de la r�ponse
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        // Obtient le flux de sortie de la r�ponse
        PrintWriter out = resp.getWriter();

        // Affiche le titre de la page
        out.println("<html>");
        out.println("<head>");
        out.println("<title>BienvenueServlet</title>");
        out.println("</head>");
        out.println("<body>");

        // Affiche le message de bienvenue
        out.println("<h1>Bienvenue au cours de programmation web avec Java</h1>");

        // Affiche la date et l'heure
        out.println("<p>Date et heure de la servlet : " + getDateAndTime() + "</p>");

        // Affiche le nombre de fois que la servlet a �t� invoqu�e
        out.println("<p>Nombre d'invocations de la servlet : " + compteur + "</p>");

        out.println("</body>");
        out.println("</html>");
    }

    private String getDateAndTime() {
        // Obtient la date actuelle
        Date date = new Date();

        // D�finit le format de la date et de l'heure
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Formate la date et l'heure en cha�ne de caract�res
        return dateFormat.format(date);
    }
}
