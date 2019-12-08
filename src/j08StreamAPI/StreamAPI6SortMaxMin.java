/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Zakaria Ahmmed
 */
public class StreamAPI6SortMaxMin {
   
    
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("java"); stringList.add("html"); stringList.add("aws");
        stringList.add("java"); stringList.add("oracle");
        List<Integer> intList= new ArrayList<>();
        intList.add(40); intList.add(20); intList.add(10); intList.add(13); intList.add(60);
        intList.add(90); intList.add(33); intList.add(44);
        System.out.println("Int List:\n"+intList);
        
        List<Integer> sortIntList = intList.stream().sorted().collect(Collectors.toList());
        System.out.println("sortIntList:\n"+sortIntList);
        
        List<Integer> sortIntListReverse = intList.stream()
                .sorted((i1,i2)->{return (i1<i2)?1:-1;})
                .collect(Collectors.toList());
        System.out.println("sortIntListReverse:\n"+sortIntListReverse);
         
        int max = intList.stream().max((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Max Int:"+ max);
        int min = intList.stream().min((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Min Int:"+ min);
        
        System.out.println("\nString List:\n"+stringList);
        List<String> sortStringList = stringList.stream()
                .sorted((s1,s2)->{return s1.compareTo(s2);})
                .collect(Collectors.toList());
        System.out.println("String Sorted:\n"+sortStringList);
        
        List<String> sortStringListReverse = stringList.stream()
                .sorted((s1,s2)->{return s2.compareTo(s1);})
                .collect(Collectors.toList());
        System.out.println("String Sorted Reverse:\n"+sortStringListReverse);
        
        String maxString = stringList.stream().max((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Max String:"+ maxString);
        String minString = stringList.stream().min((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Min String:"+ minString);
        
        
        
        
    }
}
