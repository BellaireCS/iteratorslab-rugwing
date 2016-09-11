//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
        IteratorReplacer test = new IteratorReplacer("a b c a b c","a","+");
        System.out.println(test);
        test.replace();
        System.out.println(test);

        test = new IteratorReplacer("a b c d e f g h i j x x x x","x","7");
        System.out.println(test);
        test.replace();
        System.out.println(test);
		//add test cases		
	}
}
