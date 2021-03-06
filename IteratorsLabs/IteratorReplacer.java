//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
        String[] words = line.split(" ");
        list = new ArrayList<String>(Arrays.asList(words));
        toRemove = rem;
        replaceWith = rep;

	}

	public void setEmAll(String line, String rem, String rep)
	{
	}

	public void replace()
	{
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext())
        {
            String nex = (String)itr.next();
            if(nex.equals(toRemove))
            {itr.set(replaceWith);}
        }
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}
