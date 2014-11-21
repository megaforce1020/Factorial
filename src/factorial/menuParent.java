/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author bus-5170
 */
public class menuParent {
    Scanner console = new Scanner (System.in);
    private int task = 0;
    int algo =0;
    
    public int getTask(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        task = console.nextInt();
        return task;
    }
    public int getAlgorithm(){
        return algo;
    }
}
