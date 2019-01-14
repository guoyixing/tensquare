package com.tensquare.manager.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @date 2019-01-14 15:49
 * @since 1.0.0
 */
@Component
public class ManagerFilter extends ZuulFilter{
    /**
     * 在请求前（pre）或者请求后（post）执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 数字越小越先执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 当前过滤器是否开启
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器执行的操作
     * 任意ojbect的值都标志继续执行
     * 设置setsendzullResponse(false)表示不再继续执行
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("经过过滤器了");
        return null;
    }
}
