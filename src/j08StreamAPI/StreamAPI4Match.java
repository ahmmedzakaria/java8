/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08StreamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zakaria Ahmmed
 */
public class StreamAPI4Match {
    /**
     * anyMatch()   if any one object satisfy the condition it returns true
     * allMatch()   if any all objects satisfy the condition it returns true
     * noneMatch()  if no object satisfy the condition it returns true
     */
    
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("corejava oracle aws language");
        list.add("html css js language");
        list.add("DDL DML DCL language");
        list.forEach(System.out::println);
        
        boolean anyMatch= list.stream().anyMatch(s->{return s.startsWith("core");});
        System.out.println("\nAny Match:\n anyMatch: "+anyMatch);
        
        boolean allMatch= list.stream().allMatch(s->{return s.endsWith("language");});
        System.out.println("All Match:\n allMatch: "+allMatch);
        
        boolean noneMatch= list.stream().noneMatch(s->{return s.startsWith("no");});
        System.out.println("None Match:\n noneMatch: "+noneMatch);
    }
}
