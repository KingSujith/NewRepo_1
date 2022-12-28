/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author 5031263
 */
class a {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("cat","dog","lion","tiger","camel");
//        
//        list.stream().filter( f -> f.length() <= 3).forEach(System.out::println);
        String s1 = "a,b,c,d,e";

        List<String> convertedCountriesList = Stream.of(s1.split(","))
                .collect(Collectors.toList());

        System.out.println("=======" + convertedCountriesList);

        Function<Integer, Integer> getvalue = t -> t * 10;
        System.out.println(getvalue.apply(2));

        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println(getRandomNumber.get());

    }

}
