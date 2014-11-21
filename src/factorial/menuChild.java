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
public class menuChild extends menuParent{

    /**
     *
     * @return
     */
    @Override
    public int getAlgorithm(){
        System.out.println("Please select from the following three " + "algorithms to compute Factorial");
        System.out.println("1. Recursion");
        System.out.println("2. Iteration");
        //System.out.println("3. Recursion Memoization");
        algo = console.nextInt();
        return algo;
    }
    public int getIndex(){
        System.out.println("Please enter the position in the " + "Factorial sequence that you want the value for");
        int position = console.nextInt();
        return position;
    }
}
