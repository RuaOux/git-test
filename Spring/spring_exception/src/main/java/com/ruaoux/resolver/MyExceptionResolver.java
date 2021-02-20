package com.ruaoux.resolver;

import com.ruaoux.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    /*
        参数:Exception 异常对象
        返回值:ModelAndView 跳转的视图信息
     */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mav = new ModelAndView();
        if (e instanceof MyException){
            mav.addObject("info","自定义异常");
        } else if(e instanceof ClassCastException) {
            mav.addObject("info","类转换异常");
        }
        mav.setViewName("error");
        return mav;
    }
}
