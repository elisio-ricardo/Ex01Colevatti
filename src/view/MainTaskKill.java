package view;

import controller.TaskKill;

public class MainTaskKill {

	public static void main(String[] args) {
		
		TaskKill kill = new TaskKill();
		

//		String process = "ps aux";
//		kill.readProcess(process);
		

		String param = "mate-calc";
		kill.killProcess(param);
	}

}
