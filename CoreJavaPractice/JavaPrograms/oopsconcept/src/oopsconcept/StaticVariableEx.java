package oopsconcept;

public class StaticVariableEx {
	
static int i=1;
public StaticVariableEx () {
	i++;
} 
public void display() {
	System.out.println("i val="+i);
}
	public static void main(String[] args) {
		StaticVariableEx s1=new StaticVariableEx();
		s1.display();
		StaticVariableEx s2=new StaticVariableEx();
		
		s2.display();
		
		
		

	}

}
