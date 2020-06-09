package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet criketers;
	private Hashtable cc;
		
	public Vector getFruits() {
		return fruits;
	}

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public TreeSet getCriketers() {
		return criketers;
	}

	public void setCriketers(TreeSet criketers) {
		this.criketers = criketers;
	}

	public Hashtable getCc() {
		return cc;
	}

	public void setCc(Hashtable cc) {
		this.cc = cc;
	}

	public void printData(){
		System.out.println("Fruits...............");
		for(Object f:fruits){
			System.out.println(f);
		}
		System.out.println("Criketers...............");
		for(Object c:criketers){
			System.out.println(c);
		}
		System.out.println("Country and capital...............");
		Set keys=cc.keySet();
		for(Object key:keys){
			System.out.println("Country = "+key+" :Capital ="+cc.get(key));
		}
	}
}
