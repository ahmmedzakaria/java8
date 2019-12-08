/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12JodaDateAndTimeAPI;

import java.time.LocalTime;

/**
 *
 * @author User
 */
public class JodaDateTime03Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hh=time.getHour();
        int mm=time.getMinute();
        int ss=time.getSecond();
        int nn=time.getNano();
        
        System.out.printf("%d:%d:%d:%d\n",hh,mm,ss,nn);
    }
}
