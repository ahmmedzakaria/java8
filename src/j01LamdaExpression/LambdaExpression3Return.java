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
interface Squireable{
    int squireIt(int a);
}
public class LambdaExpression3Return {
    public static void main(String[] args) {
        Squireable s=x->x*x;
    }
}
