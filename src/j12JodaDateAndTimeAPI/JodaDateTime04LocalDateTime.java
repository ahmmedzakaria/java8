/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12JodaDateAndTimeAPI;

import java.time.LocalDateTime;



/**
 *
 * @author User
 */
public class JodaDateTime04LocalDateTime {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("DateTime: "+date);

        int dd = date.getDayOfMonth();
        int mo = date.getMonthValue();
        int yy = date.getYear();
        System.out.printf("Date: %d.%d.%d\n",dd,mo,yy);
        
        int hh = date.getHour();
        int mi = date.getMinute();
        int ss = date.getSecond();
        int nn = date.getNano();
        System.out.printf("Time: %d:%d:%d:%d\n",hh,mi,ss,nn);
    }
}
