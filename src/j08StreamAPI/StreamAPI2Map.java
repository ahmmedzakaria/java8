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
 * @author User
 */
public class StreamAPI2Map {
     public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(57);
        list.add(44);
        list.add(13);
        list.add(16);
        list.add(0);
        
        System.out.println("List:\n"+list);
        
        
        List<Integer> multiply=list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Multiplied List:\n"+multiply);
        
        List<Integer> multiplyEven=list.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList());
        System.out.println("Multiplied Even List:\n"+multiplyEven);
        
        
    }
}
