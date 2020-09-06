package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redeController = new RedesController();
		String os = redeController.os();
		System.out.println(os);

//		String process = "C:\\Windows\\regedit.exe";
//		redeController.callProcess(process);

//    	String process = "PING -t10 www.google.com.br";
//		redeController.readProcess2(process);

//		String process = "ipconfig";
//		redeController.readProcess1(process);

		
	
	
	
	}

}
