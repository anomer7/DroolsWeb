package com.neevtech.droolsweb.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neevtech.droolsweb.util.SessionServlet;

public class LogoutServlet extends SessionServlet {
	private static final Logger logger = LoggerFactory.getLogger(LogoutServlet.class);
	
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {	
		try {
			HttpSession session = req.getSession();
			session.invalidate();
			logger.info("User logout successfully.");
			res.sendRedirect("/DroolsWeb/index");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
