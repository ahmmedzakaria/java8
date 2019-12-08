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
public class StreamAPI7ConcatReduce {

    
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("java"); stringList.add("html"); stringList.add("aws");
        stringList.add("java"); stringList.add("oracle");
        List<Integer> intList= new ArrayList<>();
        intList.add(40); intList.add(20); intList.add(10); intList.add(13); intList.add(60);
        intList.add(90); intList.add(33); intList.add(44);
        System.out.println("Int List:\n"+intList);
        System.out.println("String List:\n"+stringList);
        
        Stream<Object> s=Stream.concat(stringList.stream(), intList.stream());
        System.out.println("Concat String and Int List:");
        s.forEach(x->System.out.print(x+" "));
        
       Optional<String> o= stringList.stream().reduce((x,y)->{return x+y;});
       if(o.isPresent())
            System.out.println("\nReduce String List:\n "+o.get());
        
        Optional<Integer> o2= intList.stream().reduce((x,y)->{return x+y;});
       if(o2.isPresent())
            System.out.println("Reduce Int List:\n "+o2.get());
        
    }
}
