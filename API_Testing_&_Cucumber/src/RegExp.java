
public class RegExp {
	public static void main(String[] args) {
		   //Part2
        System.out.println("-at".matches("\\Wat"));
        System.out.println("___".matches("\\W\\W\\W"));
        System.out.println("---".matches("\\W\\W\\W"));
        //for words it will accept hyphen but not accept underscore
        System.out.println("Z".matches("\\d"));
        System.out.println("1".matches("\\d"));
        System.out.println("123".matches("\\d\\d\\d"));
        System.out.println("1a5".matches("\\d\\d\\d"));
        System.out.println("333-444-2345".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
      //it represents that the we are taking 3 digits of using flower braces we indicate.
        System.out.println("333-444-2345".matches("\\d{3}-\\d{3}-\\d{4}"));
     // this represents that the any of the expressions in the braces matches with the given string , then it returns true.
        System.out.println("333.444,2345".matches("\\d{3}[-.,]\\d{3}[-.,]\\d{4}"));
      //if we want space -[.,- ] or [.,-\\s]
        System.out.println("333.444,2345".matches("\\d{3}[-.,]\\d{3}[-.,]\\d{4}"));
      //Here + represents that the if there are more number of spaces/hyphens/periods/commas, respectively matches
        System.out.println("333   444,2345".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}")); 
      //Here * represents that the spaces/hyphens/commas/periods , can they can 0 or more than one or one, it will match respectively.
        System.out.println("3334442345".matches("\\d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}"));
      //Here ? represents that the 0 or one (spaces/comma/period/hyphen), can they can 0 or more than one or one, it will match respectively.
        System.out.println("3334442345".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}"));
      //Here in the last four digits we are saying there can be 2 to 4 digits, it will allow.
        System.out.println("333 444 45".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{2,4}"));
        System.out.println("333 444 4534543453453".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{2,}"));
        System.out.println("333 444 4534543453453".matches("(\\d{3}[-.,\\s]?){2}\\d{2,}")); //Here we are giving 2 for the first two 3digit set with representing {2}
        System.out.println("333 4534".matches("(\\d{3}[-.,\\s]?){1,2}\\d{4}"));//Here 1 to 2 represents that the 1 or 2 sets will be allowed
        System.out.println("1.333 4534".matches("\\d[-.,\\s](\\d{3}[-.,\\s]?){1,2}\\d{4}"));
        System.out.println("1.333 999 4534".matches("(\\d[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));// here we are adding question mark so that that first digit can be there or cannot be there
        System.out.println("333 999 4534".matches("(\\d[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));// here we are adding question mark so that that first digit can be there or cannot be there
        System.out.println("2.333 999 4534".matches("(1[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));//Here we are allowing only one to enter not other than that.
        System.out.println("333 999 4534".matches("(1[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));// Here we are allowing only one to enter not other than that.



}
}