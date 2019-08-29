package com.github.sparsaa.blink.sample;

import com.github.sparsaa.blink.di.BlinkService;

/**
 * TODO: add comment here
 * <p>
 * User: vipultiwari
 * Date: 24-08-2019
 * Time: 16:19
 */
@BlinkService
public class ConstructorDependency {

    public void printDetail() {
        System.out.println("In ConstructorDependency#printDetail");
    }
}
