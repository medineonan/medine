package arrayList;

public abstract  class Flower {

			//define flower class that will have String type
		// constructor that initializes a variable and undefine method bloom
		
	public String type;
	 public Flower(String type) {
		 this.type=type;
	 }
		
public abstract void bloom();

	}
class Tulip extends Flower{
	public Tulip(String type) {
		super(type);//diger siniftan cagirdim icin super dedim
}

	@Override
	public void bloom() {
		System.out.println(type+ "blooms in May");
		
	}
}
class Rose extends Flower{

	public Rose(String type) {
		super(type);
		
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in June");
		
	}
	
}



