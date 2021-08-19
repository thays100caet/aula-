package auladetercaequinta1708;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/qualseunome")
public class qualomeunome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //contrudores da clesse 
    public qualomeunome() {
        super();
        // TODO Auto-generated constructor stub
    }

//metado get 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY> OLÁ QUAL O SEU NOME ? <BPDY></HTML>");
	saida.close();
		}

}
