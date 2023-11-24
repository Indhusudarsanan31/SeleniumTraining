package org.sof;

public class SoftwareTesting extends FullStacksJava{
	private void manualTesting() {
		System.out.println("Manual Testing course need One Month duration");
	}
	private void automationTesting() {
		System.out.println("Automation Testing course need One Month duration");
	}
	
	public static void main(String[] args) {
		
		SoftwareTesting s = new SoftwareTesting();
		
		s.adobePhotoshop();
		s.indesign();
		s.contentMarketing();
		s.searchEngine();
		s.manualTesting();
		s.automationTesting();
	}

}
