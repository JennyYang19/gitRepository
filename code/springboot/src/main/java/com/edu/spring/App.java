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
       AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MyConfig.class,User.class,UserDao.class,UserService.class,UserController.class);
       //根据类
       System.out.println(context.getBean(MyBean.class));
       //根据bean的名字 或者方法名(指定了名字就不能用方法名)
       System.out.println(context.getBean("myyBean"));
       //获取的factorybean创建的对象
       System.out.println(context.getBean("createFactoryBean"));
       System.out.println(context.getBean(Jeep.class));
       //获取factorybean本身
       System.out.println(context.getBean(RunnableFactoryBean.class));
       System.out.println(context.getBean("&createFactoryBean"));
       //获取car
       System.out.println(context.getBean("createCar"));
       System.out.println(context.getBean(Car.class));
       System.out.println(context.getBean(Cat.class));
       System.out.println(context.getBean(Dog.class));
       System.out.println(context.getBean(Animal.class));
       System.out.println(context.getBean("myUser"));
       System.out.println(context.getBeansOfType(User.class)); 
       System.out.println(context.getBeansOfType(UserDao.class)); 
       System.out.println(context.getBeansOfType(UserService.class)); 
       System.out.println(context.getBeansOfType(UserController.class));
       User user=context.getBean("myUser",User.class);
        user.show();
       context.close();
    }
}
