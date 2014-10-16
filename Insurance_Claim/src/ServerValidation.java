

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServerValidation
 */
@WebServlet("/ServerValidation")
public class ServerValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String alertmsg="submited successfully";
	
		String ClaimSubmit=request.getParameter("ClaimSubmit");
	    String Fname=request.getParameter("Fname");
	    String Lname=request.getParameter("Lname");
	    String Aptnumber=request.getParameter("Aptnumber");
	    String City=request.getParameter("City");
	    String State=request.getParameter("State");
	    String Zipcode=request.getParameter("Zipcode");
	    String emailp=request.getParameter("emailp");
	    String datepicker=request.getParameter("datepicker");
	    String Ltime=request.getParameter("Ltime");
	    String Ldesc=request.getParameter("Ldesc");
	    String LState=request.getParameter("LState");
	    String LCountry=request.getParameter("LCountry");
	    
	    String error="";
	    boolean result=true;
	    
	    if(ClaimSubmit.equals(""))
		{
			error+="Please Select the ClaimSubmit\n";
			result=false;
			
		}
		if(Fname.equals(""))
		{
			error+="Please enter Firstname\n";
			result=false;
		}
		if(Lname.equals(""))
		{
			error+="Please enter Lastname\n";
			result=false;
		}
		if(Aptnumber.equals(""))
		{
			error+="Please enter the Aptnumber";
			result=false;
			
		}
		if(City.equals(""))
		{
			error+="Please enter the City";
			result=false;
		}
		if(State.equals(""))
		{
			error+="Please select the State";
			result=false;	
		}
		if(Zipcode.equals(""))
		{
			error+="Please enter the zipcode";
			result=false;
		}
		if(Aptnumber.equals(""))
		{
			error+="Please enter the Aptnumber";
			result=false;
			
		}
	   // String emailp=request.getParameter("emailp");
	   // String phc=request.getParameter("phc");
	 //   HttpSession session=request.getSession();  
     //   session.setAttribute("ClaimSubmit",ClaimSubmit);  
	  //  System.out.println(ClaimSubmit);
	   // request.setAttribute("ClaimSubmit",ClaimSubmit);
	 /*   request.setAttribute("Fname",Fname);
	    request.setAttribute("Lname",Lname);
	    request.setAttribute("Aptnumber",Aptnumber);
	    request.setAttribute("City",City);
	    request.setAttribute("State",State);
	    request.setAttribute("Zipcode",Zipcode);
	    request.setAttribute("emailp",emailp);
	    request.setAttribute("datepicker",datepicker);
	    request.setAttribute("Ltime",Ltime);
	    request.setAttribute("Ldesc",Ldesc);
	    request.setAttribute("LState",LState);
	    request.setAttribute("LCountry",LCountry);
	    request.setAttribute("emailp",emailp);*/
	    
	    
	    
	    request.getRequestDispatcher("/Insurance_Claim.jsp").forward(request, response);
	  //  request.setAttribute("",);
	    
	   // request.setAttribute("alertmsg",alertmsg);
	  /*  if(Fname.equals(""))
		{
	    	String error="";
	    	error+="Please enter Firstname\n";
	    	request.setAttribute("errorMessage",error);
	         request.getRequestDispatcher("/Insurance_Claim.jsp").forward(request, response);
		}
	    else
	    {
	    	   response.setContentType("text/html;charset=UTF-8");
	    	   PrintWriter out = response.getWriter();
	    	   out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('Submited Successfully');");
	    	  // response.sendRedirect("Insurance_Claim.jsp");
	    	    out.println("location='Insurance_Claim.jsp';");
	    	   out.println("</script>");
	    }
	    
	   
	//	String nameParameter = request.getParameter("");
		
	/*	System.out.println(ClaimSubmit);
				System.out.println(Fname);
				System.out.println(Lname);
				System.out.println (Aptnumber);
				System.out.println(City);
				System.out.println(State);
				System.out.println(Zipcode);
				System.out.println(emailp);
				System.out.println(datepicker);
				System.out.println(Ltime);
				System.out.println(Ldesc);
				System.out.println(LState);
				System.out.println(LCountry);
				System.out.println(phc);
				boolean result=true;
				String error="";
				if(ClaimSubmit.equals(""))
				{
					error+="Please Select the ClaimSubmit";
					result=false;
					
				}
				if(Fname.equals(""))
				{
					error+="Please enter Firstname\n";
					result=false;
				}
				if(Lname.equals(""))
				{
					error+="Please enter Lastname";
					result=false;
				}
				if(ClaimSubmit.equals(""))
				{
					error+="Please Select the ClaimSubmit";
					result=false;
					
				}
				if(result)
				{
					System.out.println("SubmitedSucess");
				}
				else
				{
				  
					request.setAttribute("errorMessage",error);
					request.setAttribute("Fname",Fname);
					//request.getRequestDispatcher("/Insurance_Claim.jsp").forward(request, response);
					response.sendRedirect("Insurance_Claim.jsp");

				//	request.getParameter("Fname");
					//request.getParameter("Lname");
				//	request.setAttribute("Fname",Fname);
				//	request.setAttribute("Lname",Lname);
					//request.getRequestDispatcher("/Insurance_Claim.jsp").forward(request, response);
				}*/
		//if(nameParameter.equals(""))
	  //  request.setAttribute("errorMessage", "Please Entet the name");
		//request.getRequestDispatcher("/Insurance_Claim.jsp").forward(request, response);


	}

}
