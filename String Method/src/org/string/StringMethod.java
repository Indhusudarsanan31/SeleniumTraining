package org.string;

public class StringMethod {
	public static void main(String[] args) {
		String s = "Java Applications";

		// Length
		int length = s.length();
		System.out.println(length);

		// isempty
		boolean empty = s.isEmpty();
		System.out.println(empty);

		// charAt
		char charAt = s.charAt(2);
		System.out.println(charAt);

		// indexOf
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);

		// LastIndexOf
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);

		// toUpperCase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		// toLowerCase
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		// startswith
		boolean startsWith = s.startsWith("Java");
		System.out.println(startsWith);

		// endsWith
		boolean endsWith = s.endsWith("tion");
		System.out.println(endsWith);

		// Contains
		boolean contains = s.contains("Ja");
		System.out.println(contains);

		// equals
		String s1 = "Java";
		String s2 = "java";
		String s3 = "Maven";

		boolean equals = s1.equals(s3);
		System.out.println(equals);

		// equalsIgnoreCase
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);

		// replace
		String replace = s.replace('J', 'L');
		System.out.println(replace);

		// replaceAll
		String replaceAll = s.replaceAll("Java", "Lava");
		System.out.println(replaceAll);

		// substring
		String substring = s.substring(5);
		System.out.println(substring);

		String substring2 = s.substring(5, 8);
		System.out.println(substring2);

	}

}
