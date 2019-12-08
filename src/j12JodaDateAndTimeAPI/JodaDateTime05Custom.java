/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12JodaDateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class JodaDateTime05Custom {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.of(1980,3,23,12,45);
        LocalDate date= LocalDate.of(1990,3,23);
        LocalTime time= LocalTime.of(12,30,23);
        
        System.out.println("DateTime: "+dateTime);
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("After 6 Month: "+date.plusMonths(6));
        System.out.println("Before 6 Month: "+date.minusMonths(6));
    }
}
