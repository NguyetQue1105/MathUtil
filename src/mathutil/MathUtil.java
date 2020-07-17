/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static que.util.MathUtil.computeFactorial;

/**
 *
 * @author ACER
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hy vọng hàm trả về 120 nếu tính 5!
        System.out.println("5! = " + computeFactorial(5));

        //hy vọng hàm trả về 1 nếu tính 1!
        //expected 1 if cF(1)
        System.out.println("1! = " + computeFactorial(1));
        
        //expected 1 if cF(0)
        System.out.println("0! = " + computeFactorial(0));
        
        //expect exception if cF(-5)
        System.out.println("-5! = " + computeFactorial(-5));
    }
    
}
