package view;

import controller.TaskKill;

public class MainTaskKill {

	public static void main(String[] args) {
		
		TaskKill kill = new TaskKill();
		

		String process = "TASKLIST /FO TABLE";
		kill.readProcess(process);

		String param = "5232";
		kill.killProcess(param);
	}

}
