package overRiding;

public class AnimalTest {

	public static void main(String[] args) {
		Animal anml=new Bird();
		anml.sleep();
		anml.whoAmI();
        Animal.whoAmI();
        Bird.whoAmI();
        
        Animal anml1=new Animal();
        anml1.sleep();
	}

}
