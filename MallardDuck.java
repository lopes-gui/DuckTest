/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducktestdrive;

/**
 *
 * @author Aluno
 */
public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("i'm flying");
    }
    
}
