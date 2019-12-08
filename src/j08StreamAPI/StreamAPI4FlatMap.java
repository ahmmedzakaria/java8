/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Zakaria Ahmmed
 */
public class StreamAPI4FlatMap {
    
    /**
     * Flat Map is used to work with complex object
     * @param args 
     */
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Zakaria Ahmmed Is A Programmer");
        list.add("He Loves Java");
        list.add("He also know C Python Javascript VisualBasic etc.");
        System.out.println("List:\n"+list);
        List<String> splitList= list.stream()
                .flatMap((String l)->{
                    String[] items= l.split(" ");
                    return Arrays.asList(items).stream();
                })
                .collect(Collectors.toList());
        
        //System.out.println("Split List:\n"+splitList);
        
        splitList.forEach(System.out::println);
    }
}
