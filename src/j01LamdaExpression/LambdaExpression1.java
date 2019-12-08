/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01LamdaExpression;

/**
 *
 * @author User
 */
@FunctionalInterface
interface Intra{
    void hello();
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        Intra i=()->System.out.println("Hello Lamda Expression");
        i.hello();
        
    }
}
