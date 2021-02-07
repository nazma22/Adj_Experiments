package collections;

import java.util.Hashtable;

public class HashTable {
	public static void main(String args[]) {
		Hashtable<Integer , String>Ht = new Hashtable<>();
		Hashtable<Integer , String>Ht2 = new Hashtable<Integer , String>();
		

		
		Ht.put(1,"apple");
		Ht.put(2,"java");
		Ht.put(3,"python");
		
		System.out.println("Maping : " +Ht);
	}

}
