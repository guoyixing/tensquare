package com.tensquare.web.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @date 2019-01-14 16:00
 * @since 1.0.0
 */
public class WebFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取request的上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //获取request域
        HttpServletRequest request = currentContext.getRequest();
        //得到头信息
        String authorization = request.getHeader("Authorization");
        //判断是否有头信息
        if (authorization !=null && !"".equals(authorization)){
            currentContext.addZuulRequestHeader("Authorization",authorization);
        }
        return null;
    }
}
