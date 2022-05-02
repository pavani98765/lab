package javaprog;

public class String1 {
	public static void main(String args[]) {
	String a= "hello";
	String b="world";
	System.out.println(a.charAt(2));
	System.out.println(a.concat("str"));
	System.out.println(a.codePointAt(1));
	System.out.println(a.codePointBefore(3));
	System.out.println(a.codePointCount(4, 5));
	System.out.println(a.compareTo("hello1"));
	System.out.println(a.compareToIgnoreCase("world"));
	System.out.println(a.contains("sri"));
	System.out.println(a.contentEquals("pav"));
	System.out.println(a.contentEquals("ani"));
	System.out.println(a.endsWith("o"));
	System.out.println(a.equals("i"));
	System.out.println(a.equalsIgnoreCase("h"));
	System.out.println(a.formatted("str"));
	System.out.println(a.hashCode());
	System.out.println(a.getBytes());
	System.out.println(a.indent(5));
	System.out.println(a.indexOf(2));
	System.out.println(a.indexOf("he"));
	System.out.println(a.indexOf(3, 4));
	System.out.println(a.intern());
	System.out.println(a.isBlank());
	System.out.println(a.isEmpty());
	System.out.println(a.lastIndexOf(0));
	System.out.println(a.lastIndexOf(5));
	System.out.println(a.lastIndexOf("o", 5));
	System.out.println(a.length());
	System.out.println(a.matches("e"));
	System.out.println(a.offsetByCodePoints(1, 2));
	System.out.println(a.regionMatches(1, "e", 2, 2));
	System.out.println(a.regionMatches(true, 2, "l", 2, 2));
	System.out.println(a.repeat(5));
	System.out.println(a.replace("h", "e"));
	System.out.println(a.replaceAll(a, b));
	System.out.println(a.replaceFirst(a, b));
	System.out.println(a.resolveConstantDesc(null));
	System.out.println(a.startsWith("e"));
	System.out.println(a.startsWith("h", 0));
	System.out.println(a.strip());
	
	
		
	}

}
