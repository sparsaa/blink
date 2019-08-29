package com.github.sparsaa.blink.sample;

import com.github.sparsaa.blink.di.BlinkConfiguration;
import com.github.sparsaa.blink.di.BlinkValue;

/**
 * TODO: add comment here
 * <p>
 * User: vipultiwari
 * Date: 24-08-2019
 * Time: 16:23
 */
@BlinkConfiguration(filename = "application.properties")
public class ApplicationConfig {

    @BlinkValue(property = "name")
    private String name;

    public String getName() {
        return name;
    }
}
