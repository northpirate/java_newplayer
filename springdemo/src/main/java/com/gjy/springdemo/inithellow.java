package com.gjy.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class inithellow implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postprocessBeforeInitialization:" + beanName);
        return bean;
        //return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postprocessAfterInitialization:" + beanName);
        return bean;
        //return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }


}
