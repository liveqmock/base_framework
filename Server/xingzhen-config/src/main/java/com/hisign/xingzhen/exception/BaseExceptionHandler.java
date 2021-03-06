package com.hisign.xingzhen.exception;

import com.hisign.bfun.bexception.BusinessException;
import com.hisign.xingzhen.common.model.JsonResult;
import com.hisign.xingzhen.common.util.JsonResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

@ControllerAdvice
public class BaseExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	public JsonResult exceptionHandler(BusinessException e,HttpServletResponse response) {
		logger.error("异常信息：",e);
		return JsonResultUtil.error(e.getMsg());
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public JsonResult defaultExceptionHandler(Exception e,HttpServletResponse response) {
		logger.error("异常信息：",e);
		return JsonResultUtil.error(e.getMessage());
	}

}
