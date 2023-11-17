/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
public class ProxyImage implements Image{
	String fileName;
	Image service;
	

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	
	@Override
	public void display() {
		service = new RealImage(fileName);
		service.display();
                                
		
	}

}