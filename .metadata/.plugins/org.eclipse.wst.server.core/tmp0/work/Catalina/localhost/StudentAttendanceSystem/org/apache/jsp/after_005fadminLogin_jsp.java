/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.90
 * Generated at: 2023-07-09 12:12:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.attendance.*;
import java.sql.*;

public final class after_005fadminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.attendance");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Student Attendance System</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans'\r\n");
      out.write("	rel='stylesheet' type='text/css' />\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"author\" href=\"https://plus.google.com/113101541449927918834\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	jQuery(document).ready(function($) {\r\n");
      out.write("		$('.counter').counterUp({\r\n");
      out.write("			delay : 10,\r\n");
      out.write("			time : 2000\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #F0F0F0\";>\r\n");
      out.write("	");

		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_side_header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"panel panel-default\">\r\n");
      out.write("			<div class=\"panel-body\">\r\n");
      out.write("				<div style=\"text-transform: uppercase\">\r\n");
      out.write("					<strong>Admin Management</strong><br>\r\n");
      out.write("				</div>\r\n");
      out.write("				<br>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-users fa-5x\"></i>\r\n");
      out.write("						");

							Connection con = DatabaseConnection.getConnection();
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery("select count(*) from students");
								rs.next();
								int students = rs.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(students);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"students_data.jsp\" class=\"text-dark\" target=\"_blank\">Registered\r\n");
      out.write("								Students</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-user fa-5x\"></i>\r\n");
      out.write("						");

							Statement statement = con.createStatement();
								ResultSet resultSet = statement.executeQuery(
										"select count(attendance) from student_attendance where attendance='present' and system_date=CURDATE()");
								resultSet.next();
								int presentStudents = resultSet.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(presentStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"check_todays_attendance.jsp\" class=\"text-dark\"\r\n");
      out.write("							target=\"_blank\">Today's Present Students</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-recycle fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmt = con.createStatement();
								ResultSet result = stmt.executeQuery(
										"select count(attendance) from student_attendance where attendance='absent' and system_date=CURDATE()");
								result.next();
								int absentStudents = result.getInt(1);
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(absentStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"check_todays_attendance.jsp\" class=\"text-dark\"\r\n");
      out.write("							target=\"_blank\">Today's Absent Students</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-bars fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmtfeedback = con.createStatement();
								ResultSet resultFeedback = stmtfeedback.executeQuery("select count(*) from student_feedback");
								resultFeedback.next();
								int feedbackStudents = resultFeedback.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(feedbackStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"student_feedback_informations.jsp\" class=\"text-dark\"\r\n");
      out.write("							target=\"_blank\">Students Feedback</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-bars fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmtactive = con.createStatement();
								ResultSet resultActive = stmtactive.executeQuery("select count(*) from students where status=1");
								resultActive.next();
								int activeStudents = resultActive.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(activeStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"manage_students.jsp\" class=\"text-dark\" target=\"_blank\">Active\r\n");
      out.write("								Students</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-bars fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmtInactive = con.createStatement();
								ResultSet resultInactive = stmtInactive.executeQuery("select count(*) from students where status=0");
								resultInactive.next();
								int inactiveStudents = resultInactive.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(inactiveStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"manage_students.jsp\" class=\"text-dark\" target=\"_blank\">Inactive\r\n");
      out.write("								Students</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-bars fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmtApprovedLeaves = con.createStatement();
								ResultSet resultApprovedLeaves = stmtApprovedLeaves
										.executeQuery("select count(*) from student_leave where leave_status='Approved' ");
								resultApprovedLeaves.next();
								int approvedLeaveStudents = resultApprovedLeaves.getInt(1);
						
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(approvedLeaveStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"approved_student_leave_request.jsp\" class=\"text-dark\"\r\n");
      out.write("							target=\"_blank\">Approved Leave Request</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("					<div class=\"shadow p-3 mb-5 bg-white rounded text-center\">\r\n");
      out.write("						<i class=\"fa fa-recycle fa-5x\"></i>\r\n");
      out.write("						");

							Statement stmtPendingLeaves = con.createStatement();
								ResultSet resultPendingLeaves = stmtPendingLeaves
										.executeQuery("select count(*) from student_leave where leave_status='Pending'");
								resultPendingLeaves.next();
								int pedingLeaveStudents = resultPendingLeaves.getInt(1);
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<h3>\r\n");
      out.write("							<font color=\"#FF9933\"><span class=\"counter\">");
      out.print(pedingLeaveStudents);
      out.write("</span></font>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<strong style=\"text-transform: uppercase; font-size: 12px;\"><a\r\n");
      out.write("							href=\"manage_student_leaves.jsp\" class=\"text-dark\"\r\n");
      out.write("							target=\"_blank\">Leave Request Pending</a></strong>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div style=\"text-transform: uppercase\">\r\n");
      out.write("					<strong>Attendance System All Reports &nbsp;[&nbsp;");
      out.print((new java.util.Date()).toLocaleString());
      out.write("&nbsp;]\r\n");
      out.write("					</strong>\r\n");
      out.write("				</div>\r\n");
      out.write("				<br>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("						<table id=\"table\" class=\"table table-bordered shadow p-3 mb-5\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<form action=\"StudentAttendanceReport\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>Attendance Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-primary\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("								<form action=\"AllStudentsRegisterReport\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>All Students Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-info\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("								<form action=\"StudentsActiveOrInactive\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>Student Active & Deactive Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-secondary\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("						<table id=\"table\" class=\"table table-bordered shadow p-3 mb-5\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<form action=\"StudentsFeedbackReport\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>Student Feedback Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-warning\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("								<form action=\"StudentsLeavePending\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>Pending Leave Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-danger\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("								<form action=\"StudentsLeaveApproved\">\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>Approved Leave Report</th>\r\n");
      out.write("										<td><input type=\"submit\" value=\"Generate Reports\"\r\n");
      out.write("											class=\"btn btn-success\"></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</form>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

		} else {
			response.sendRedirect("index.jsp");
		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("	<script src=\"http://cdnjs.cloudflare.com/ajax/libs/waypoints/2.0.3/waypoints.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}