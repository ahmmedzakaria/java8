/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12JodaDateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class JodaDateTime01Basic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date: "+ date);
        
        LocalTime time = LocalTime.now();
        System.out.println("Local Time: "+time);
    }
}
