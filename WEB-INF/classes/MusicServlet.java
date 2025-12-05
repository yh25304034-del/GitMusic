import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MusicServlet extends HttpServlet {
            protected void doPost(HttpServletRequest request,HttpServletResponse response) 
                throws IOException,ServletException {
                    request.setCharacterEncoding("UTF-8");

                    String username = request.getParameter("name");
                    String FavoriteMusic = request.getParameter("music");

                    request.setAttribute("name", username);
                    request.setAttribute("music",FavoriteMusic);

                    RequestDispatcher dispatcher = request.getRequestDispatcher("musicoutput");

                    dispatcher.forward(request,response);
            }
}