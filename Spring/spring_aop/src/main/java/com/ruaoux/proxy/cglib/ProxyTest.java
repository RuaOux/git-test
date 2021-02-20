package com.ruaoux.proxy.cglib;

import com.ruaoux.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(final String[] args) {
        // 创建目标对象
        final TargetInterfaceImpl target = new TargetInterfaceImpl();

        // 增强对象
        final Advice advice = new Advice();

        // 返回值 就是动态生成的代理对象 基于cglib
        // 1. 创建增强器
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类（目标）
        enhancer.setSuperclass(TargetInterfaceImpl.class);
        // 3. 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // 1. 执行前置
                advice.before();
                // 2. 执行目标
                Object invoke = method.invoke(target, args);
                // 3. 执行后置
                advice.after();
                return invoke;
            }
        });

        // 4. 创建代理对象
        TargetInterfaceImpl proxy = (TargetInterfaceImpl) enhancer.create();
        proxy.save();



    }
}
