/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08StreamAPI;

import java.util.stream.Stream;


/**
 *
 * @author Zakaria Ahmmed
 */
public class StreamAPI8ArrayVarArgs {

    
    public static void main(String[] args) {
        System.out.println("\nString Array using Stream:");
        String[] stringArray={"java","c","python","javascript"};
        Stream<String> s=Stream.of(stringArray).sorted();
        s.forEach(x->System.out.print(x+" "));
        
        System.out.println("\nInt Array using Stream:");
        Stream<Integer> si= Stream.of(new Integer[]{2,3,78,1,0,23})
                .sorted();
        si.forEach(x->System.out.print(x+" "));
        
        System.out.println("\nVar Args using Stream:");
        Stream<String> s3=Stream.of("java","c","python","javascript")
                .sorted((s1,s2)->{return s2.compareTo(s1);});
        s3.forEach(x->System.out.print(x+" "));
        
    }
}
