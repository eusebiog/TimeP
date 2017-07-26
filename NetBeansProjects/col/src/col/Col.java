/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package col;

import java.math.BigInteger;

/**
 *
 * @author ordenador
 */
public class Col {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length==0){
            Collatz c=new Collatz(new BigInteger("5"));
            c.run();
        
        }else{
            BigInteger r=new BigInteger(args[0]);
            Collatz c=new Collatz(r);
            c.run();
            
        }
//        
        
    }
    
}
