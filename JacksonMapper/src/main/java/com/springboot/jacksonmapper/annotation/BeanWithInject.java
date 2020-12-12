package com.springboot.jacksonmapper.annotation;

import com.fasterxml.jackson.annotation.JacksonInject;

public class BeanWithInject {
    @JacksonInject
    public int id;
    public String name;

    public BeanWithInject() {

    }

    public BeanWithInject(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
}
