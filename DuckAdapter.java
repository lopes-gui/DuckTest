/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducktestdrive;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class DuckAdapter implements Turkey {
 Duck duck;
 Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.rand = rand;
    }
 
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(rand.nextInt(5)==0){
            duck.fly();
        }
    }

    
}
