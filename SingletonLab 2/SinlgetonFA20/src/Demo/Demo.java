/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Connection.Connection;

/**
 *
 * @author fa20-bse-062
 */


public class Demo {

	public static void main(String[] args) {
		Connection c = Connection.getInstance();
		c.getData();

	}

}
