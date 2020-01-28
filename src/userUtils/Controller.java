package userUtils;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
    
	@Resource(name="jdbc/scholar-tracker")
	private DataSource ds;
	
	private DatabaseUtility dbUtil;

    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public void init() throws ServletException
	{
		super.init();

		// create our db util ... and pass in the conn pool / datasource
		try 
		{
			dbUtil = new DatabaseUtility(ds);
		}
		catch (Exception exc) 
		{
			throw new ServletException(exc);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String command = request.getParameter("command");
		try 
		{
			if(command.equals("LOGIN"))
				logIn(request,response);
			else if(command.contentEquals("SIGNUP")) 
				signIn(request, response);
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		
	}
	
	private void signIn(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
		String first = request.getParameter("first-name"),
	            last= request.getParameter("last-name"),
	            email= request.getParameter("email"),
	            password= request.getParameter("password");
		dbUtil.insertUser(first, last, email, password);
		rd.forward(request, response);
	}
	
	//abstraction that retrieves user data from the database and makes sure it correlates with the information given by user
	private void logIn(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(!dbUtil.retrieveUser(email, password))
			request.setAttribute("loginFail", "Invalid email/password");
		else
			request.setAttribute("loginFail", "Login successful!");
		rd.forward(request, response);
	}

}
