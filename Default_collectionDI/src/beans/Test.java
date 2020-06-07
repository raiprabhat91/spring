package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set criketers;
	private Map cc;
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCriketers() {
		return criketers;
	}
	public void setCriketers(Set criketers) {
		this.criketers = criketers;
	}
	public Map getCc() {
		return cc;
	}
	public void setCc(Map cc) {
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
