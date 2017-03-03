package ro.sci.servlet;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.sci.classes.AgeCalculator;

public class AgeCalculatorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgeCalculator aCalculator = new AgeCalculator();

		Date today = java.sql.Date.valueOf(LocalDate.now());
		Date birthDate = java.sql.Date.valueOf(LocalDate.of(1993, 6, 15));

		if (birthDate == null) {
			resp.getWriter().println("<b>Please insert a birth date!</b>");

		} else {
			resp.getWriter().println("<b>Your age in days is " + aCalculator.daysBetween(birthDate, today) + "!</b>");

		}

	}

}
