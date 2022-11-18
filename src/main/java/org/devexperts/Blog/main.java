package org.devexperts.Blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Blog blog = (Blog) applicationContext.getBean("Blog");
        System.out.println(blog.getComment().getDate());
        System.out.println(blog.getTitle());

    }
}
