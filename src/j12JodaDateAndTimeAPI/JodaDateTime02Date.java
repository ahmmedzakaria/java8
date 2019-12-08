/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12JodaDateAndTimeAPI;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class JodaDateTime02Date {
    public static void main(String[] args) {
         LocalDate date = LocalDate.now();
         int dd= date.getDayOfMonth();
         int mm= date.getMonthValue();
         int yy= date.getYear();
         
         System.out.printf("%d-%d-%d\n",dd,mm,yy);
         System.out.printf("%d.%d.%d\n",dd,mm,yy);
    }
}
