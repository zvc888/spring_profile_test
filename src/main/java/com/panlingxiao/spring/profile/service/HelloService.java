package com.panlingxiao.spring.profile.service;

/**
 * 定义接口,在实际中可能是一个数据源
 * 在开发的时候与实际部署的时候分别使用不同的实现
 */
public interface HelloService {

    public String sayHello();
}