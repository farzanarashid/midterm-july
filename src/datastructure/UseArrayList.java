package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> Car = new ArrayList<>();

		// Adding new elements to the ArrayList
		Car.add("Toyota");
		Car.add("Sonata");
		Car.add("Corolla");
		Car.add("Hynadai");

		System.out.println(Car);
		Iterator it=ArrayList.iterator();
		while(it.hasNext())
		{
			System.out.println(Car);}

		Car.add(2, "Honda");
		Car.remove(3);
		System.out.println(Car);


	}

}
