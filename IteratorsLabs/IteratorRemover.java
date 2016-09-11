//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
        String[] words = line.split(" ");
        list = new ArrayList<String>(Arrays.asList(words));
        toRemove=rem;
	}

	public void setTest(String line, String rem)
	{
	}
    
	public void remove() 
	{
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            String nex = (String)itr.next();
            if(nex.equals(toRemove))
            {itr.remove();}

        }


	}

	public String toString()
	{

        if(list == null){return "null list!";}
        return Arrays.toString(list.toArray());
	}
}
