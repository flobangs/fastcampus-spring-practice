package org.example;

import logic.BubbleSort;
import logic.JavaSort;
import logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.SortService;

import java.io.ObjectInputFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("start");
        System.out.println("result: " + sortService.doSort(Arrays.asList(args)));
    }
}