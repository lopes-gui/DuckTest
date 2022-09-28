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
public class WildTurkey  implements Turkey{

    @Override
    public void gobble() {
        System.out.println("gibble,gobble");
    }

    @Override
    public void fly() {
        System.out.println("i´m flying a short distance");
    }
    
}
