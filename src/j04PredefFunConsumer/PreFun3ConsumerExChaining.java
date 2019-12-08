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
class Movie{
    String name;

    public Movie(String name) {
        this.name = name;
    }
    
}
public class PreFun3ConsumerExChaining {
    public static void main(String[] args) {
        Consumer<Movie> c1=m->System.out.println(m.name+" ready to release");
        Consumer<Movie> c2=m->System.out.println(m.name+" released but it is bigger flop");
        Consumer<Movie> c3=m->System.out.println(m.name+" Storing information id database");
        
        Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
        Movie m= new Movie("Spider");
        cc.accept(m);
        
    }
}
