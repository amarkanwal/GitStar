
public class Compare3 {


	
	public static Comparable largest(Comparable one, Comparable two, Comparable three)
    {
		   {
				Comparable largest;
				if (one.compareTo(two) > 0)
				    if (one.compareTo(three) > 0)
					largest = one;
				    else
					largest = three;
				else
				    if (two.compareTo(three) > 0)
					largest = two;
				    else
					largest = three;
				return largest;
			    }
    }
    }
