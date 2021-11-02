/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import compute.*;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.math.*;

public class Pi implements Task {

    private int digits;

    public Pi(int digits) {
        this.digits = digits;
    }

    public Object execute() {
        // Pi calculation code goes here!
        double eps = pow(10,-digits);
        double res = 0;
        double ch1 = 1;
        double ch2 = 1;
        int sign = -1;
        double frac = 3;
        do {
            res += ch2;
            ch1 = ch2;
            ch2 = sign/frac;
            sign *= -1;
            frac += 2;
        } while(abs(ch1-ch2)>eps);
        return res*4;
    }

}
