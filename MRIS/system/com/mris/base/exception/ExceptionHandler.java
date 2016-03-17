package com.mris.base.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.mris.base.result.JsonResult;

public class ExceptionHandler implements HandlerExceptionResolver {
	
	public static Log log = LogFactory.getLog(ExceptionHandler.class);
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		log.error(ex.getMessage(), ex);
		response.setContentType("text/html;charset=UTF-8");
		try {
			PrintWriter writer = response.getWriter();
			writer.write(JsonResult.getResult(0, "ÏµÍ³´íÎó"));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
