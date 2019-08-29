package com.github.sparsaa.blink.sample;

import com.github.sparsaa.blink.di.BlinkBean;
import com.github.sparsaa.blink.di.BlinkFactory;

/**
 * TODO: add comment here
 * <p>
 * User: vipultiwari
 * Date: 24-08-2019
 * Time: 16:04
 */
@BlinkFactory
public class BeanFactory {

    @BlinkBean
    public SampleFactoryBean provideSampleFactoryBean(ApplicationConfig config){
        return new SampleFactoryBean(config.getName());
    }
}
