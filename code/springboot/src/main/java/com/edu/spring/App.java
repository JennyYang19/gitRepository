package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!  2017 4 7      差点点
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MyConfig.class);
    }
}
