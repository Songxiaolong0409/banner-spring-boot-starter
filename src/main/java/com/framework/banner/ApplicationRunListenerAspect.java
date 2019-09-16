/**
 * Copyright @2018 xiaolong.song All Rights Reserved
 */
package com.framework.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author xiaolong.song
 * @Description: 监听，自定义banner
 * @Package com.framework.banner
 * @email loye.song@foxmail.com
 * @date 2018/3/19 11:13
 */
public class ApplicationRunListenerAspect implements SpringApplicationRunListener {

    private SpringApplication application;

    public ApplicationRunListenerAspect(SpringApplication application, String[] args) {
        this.application = application;
    }

    @Override
    public void starting() {
        application.setBanner(new CustomBanner());
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
    }
}
