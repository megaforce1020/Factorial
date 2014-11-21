/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

/**
 *
 * @author bus-5170
 */
public class ComputeFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int task, index, algo;
        long startTime, elapsedTime, answer =0;
        menuChild mc = new menuChild();
        implementFactorialAlgo ifa = new implementFactorialAlgo();
        
        do {
            task = mc.getTask();
            if (task == 1){
                algo = mc.getAlgorithm();
                index = mc.getIndex();
                if (algo == 1){
                    startTime = System.nanoTime();
                    for (int i = 1; i <=index; i++){
                }
            }
        }
    }
    
}
