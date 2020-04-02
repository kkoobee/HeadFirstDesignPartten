package capter07.c1;

public class DuckTestDriver {
	public static void main(String[] args) {
		
		Duck mDuck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		
		Duck adapter = new TurkeyAdapter(turkey);
		
		testDuck(mDuck);
		
		testDuck(adapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
