public class StringBuilderAssignment {
		public static void main(String[] args)
		 {
		 StringBuilder s = new StringBuilder("");
		 System.out.println(s);
		 s.append("StringBuilder");
		 s.append(" is a peer class of String");
		 s.append(" that provides much of");
		 s.append(" the functionality of strings");
		 System.out.println(s);
		 StringBuilder str = new StringBuilder("It is used to at the specified index position");
	        System.out.println("string = " + str);
	        str.insert(14, "insert text ");
	        System.out.print("After insertion = ");
	        System.out.println(str.toString());
	        StringBuilder sbr = new StringBuilder("This method returns the reversed object on which it was called");
	        System.out.println("String builder = " + sbr);
	        sbr.reverse();
	        System.out.println("String builder after reversing = " + sbr);
	    }
}
