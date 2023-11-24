package org.man;

import org.aut.AutomationTesting;

public class ManualTesting extends AutomationTesting{
	private void regessionTesting() {
		System.out.println("Regression");
	}
	private void reTesting() {
		System.out.println("Find the bug");
	}
	
	public static void main(String[] args) {
		ManualTesting m = new ManualTesting();
		
		m.softwareName();
		m.testngFramework();
		m.cucumberFramework();
		m.regessionTesting();
		m.reTesting();
		
		
	}
	
}	