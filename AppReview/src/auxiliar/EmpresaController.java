package auxiliar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Empresa;

public class EmpresaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmpresaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Empresa e1 = new Empresa(request.getParameter("razaoSocial"));
//		e1.bairro = request.getParameter("bairro");
//		e1.cidade = request.getParameter("cidade");
//		e1.cnpj = request.getParameter("cnpj");
//		e1.uf = request.getParameter("uf");
//		e1.exibir();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}