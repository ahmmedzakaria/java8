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
public class StreamAPI3DistinctLimitPeek {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList();
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(44);
        list.add(13);
        list.add(16);
        list.add(16);
        
        System.out.println("List:\n"+list);
        
        List distinct=list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct List:\n"+distinct);
        
        
        List limit=list.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println("Distinct limited List:\n"+limit);
        
         int peek=(int)list.stream()
                 .distinct()
                 .limit(3)
                 .peek(i->System.out.println(i+"..."+i*i))
                 .count();
        System.out.println("Distinct limited List:\n"+peek);
    }
}
