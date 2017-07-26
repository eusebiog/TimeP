/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package col;

import java.math.BigInteger;
import java.util.ArrayList;

public class Collatz {

    private BigInteger i;
    private ArrayList<BigInteger> v;

    public Collatz(BigInteger i) {
        this.i = i;
        this.v = new ArrayList();
    }

    public Collatz(int i) {
        this(new BigInteger(i + ""));
    }

    public void run() {
        BigInteger r = this.i;

        while (!this.bucle(r)) {

            System.out.println(r);
            if(!this.isPar(r)){
                v.add(new BigInteger(r + ""));
            }
            r = this.collatz(r);
        }

        System.out.println("Fin!");

        //    run(this.i);
    }

    private BigInteger collatz(BigInteger n) {
        BigInteger r;
        if (isPar(n)) {
            r = n.divide(this.getBig(2));
        } else {
            r = n.multiply(this.getBig(3)).add(this.getBig(1));
        }
        return r;
    }

    private void run(BigInteger i) {
        System.out.println(i);
        System.out.println();
        if (isPar(i)) {
            run(i.divide(this.getBig(2)));
        } else {
            if (this.bucle(i)) {
                System.out.println("Fin!");
            } else {
                this.v.add(i);
                run(i.multiply(this.getBig(3)).add(this.getBig(1)));
            }
        }
    }

    private BigInteger getBig(int i) {
        return getBig(i + "");
    }

    private BigInteger getBig(String i) {
        return new BigInteger(i);
    }

    private boolean bucle(BigInteger i) {
        return this.v.contains(i);
    }

    private boolean isPar(BigInteger i) {
        return i.mod(new BigInteger("2")).intValue() == 0;
    }

}
