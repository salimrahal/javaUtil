/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author salim
 */
public class PairImPair {

    public static void main(String[] args) {
        Integer[] intImp = {-1, 3, 5, 7, 9, 11, 13};
        Integer[] intPaire = {0, 2, 4, 6, 8, 10, 12};
      for(Integer nb: intImp){
        System.out.println(nb+"-"+NbPaire(nb));  
      }
      
      for(Integer nb: intPaire){
        System.out.println(nb+"-"+NbPaire(nb));  
      }
    }

    //nombre paire ou impaire
    public static boolean NbPaire(int nb) {

        float nbf = (int) nb;
        //il faut utiliser le modulo %
        if (nbf / 2 == Math.round(nbf / 2)) {
            //System.out.println("+++divertlist++nbpaire:true");
            return true;

        } else {
            //System.out.println("+++divertlist++nbpaire:false");
            return false;
        }
        // si x%2==0 ==>pair else si x%2!=0 ==> impair

    }
}
