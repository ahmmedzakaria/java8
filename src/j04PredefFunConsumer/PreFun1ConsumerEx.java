/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04PredefFunConsumer;

import java.util.function.Consumer;

/**
 *
 * @author ODDUU
 */
public class PreFun1ConsumerEx {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println("Hello "+s);
        c.accept("Jabed");
    }
}
