import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Aviad on 01/12/2015.
 */
public class Generics
{
Integer [] a1 = {1,2,3,4,5};
ArrayList <Integer> integerList = new ArrayList<Integer> (1);


public Generics ()
{
	Iterator <Integer> it = integerList.iterator();
	for (it.hasNext();;)
	{
		System.out.println(it);
	}
}
}
