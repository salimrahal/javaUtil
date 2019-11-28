/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiThreading.join;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Addiction implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main (String[] args) throws InterruptedException{

		Thread t = new Thread ();
        System.out.println("---->");
		t.start();

		t.join();

		}
}
