/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Zakaria Ahmmed
 */
public class StreamAPI5Find {
    /**
     * findAny() give any object of the stream
     * findFirst()  give first element of the stream
     */
    
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("java");
        list.add("html");
        list.add("aws");
        list.add("java");
        list.add("oracle");
        System.out.println("List:\n"+list);
        
        Stream<String> s= list.stream();
        /**
         * Optional is used to avoiding null pointer exception in string or int or other 
         * It is introduced in jdk 8
         * 
         */
        Optional<String> o = s.findAny(); 
        if(o.isPresent()){
            System.out.println("findAny Element is: "+o.get());
        }
        
        Optional<String> o2 = list.stream().findFirst(); 
        if(o2.isPresent()){
            System.out.println("findFirst Element is: "+o2.get());
        }
        
    }
}
