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
public class implementFactorialAlgo implements algorithmnInterface {
    @Override
    public long recursion (int n) {
        if (n<= 1){
            return 1;
        }else {
            return n * recursion (n-1);
        }
    }
    @Override
    public long iteration(int n){
        long factorial=1;
        for (int j=1; j<=n; j++) {
            factorial = factorial *j;
        }
        return factorial;
    }
}
