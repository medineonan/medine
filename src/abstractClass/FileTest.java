package abstractClass;

public class FileTest {

	public static void main(String[] args) {
	File j=new JavaFile();
	j.close();
	j.edit();
	j.open();
	System.out.println("******");
	File w=new WordFile();
	w.close();
	w.edit();
	w.open();
	System.out.println("@@@@@@@");
	File p=new PDFFile();
	p.close();
	p.open();
	p.edit();

	}

}
