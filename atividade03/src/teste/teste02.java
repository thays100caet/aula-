package teste;


	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Enumeration;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/ServletListaNomeParametros")
	public class teste02 extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          PrintWriter resposta = response.getWriter();
	          resposta.write("<html><body>");
	          resposta.write("Ol�,turma  <BR>");
	          Enumeration<String> nomesParametros = request.getParameterNames();
	          while (nomesParametros.hasMoreElements()) {
	               resposta.write(nomesParametros.nextElement().toString());
	               resposta.write(", ");
	          }
	          resposta.write("</html></body>");
	       }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}
	}

