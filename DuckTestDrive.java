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
public class DuckTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("thr turkey says");
        turkey.gobble();
        turkey.fly();
        
                System.out.println("\nthr duck says");
                
                testDuck(duck);
                                System.out.println("\nthr TurkeyAdapter says");
                                   testDuck(turkeyAdapter);

        
    }

     static void testDuck(Duck duck) {
        duck.quack();
     duck.fly();
     
     }
    
}
