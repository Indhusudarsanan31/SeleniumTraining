package org.sof;

public class DigitalMarketing extends Multimedia {
	public void contentMarketing() {
		System.out.println("ContentMarketing course need Two Months duration");
	}
	public void searchEngine() {
		System.out.println("SearchEngine course need Three Month duration");
	}

	public static void main(String[] args) {
		
		DigitalMarketing d = new DigitalMarketing();
		
		d.adobePhotoshop();
		d.indesign();
		d.contentMarketing();
		d.searchEngine();
		
		
	}
}
