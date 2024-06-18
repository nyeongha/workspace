package inherit07;

public class MethodOverriding_2 {
	public static void main(String[] args) {
		Animal aa= new Animal();
		Bird bb=new Bird();
		Cat cc=new Cat();
		Dog dd=new Dog();
		
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		
		Animal ab=new Bird();
		Animal ac=new Cat();
		Animal ad=new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		
		Animal[] animals= {ab,ac,ad};
		for(Animal animal:animals) {
			animal.cry();
		}
		
	}

}
