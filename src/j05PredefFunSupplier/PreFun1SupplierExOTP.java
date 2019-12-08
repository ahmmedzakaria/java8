/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05PredefFunSupplier;

import java.util.function.Supplier;

/**
 *
 * @author ODDUU
 */
public class PreFun1SupplierExOTP {
    //OTP = One Time Password 
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String otp="";
            for (int i = 0; i < 6; i++) {
                otp+=(int)(Math.random()*10);
            }
            return otp;
        };
        
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
