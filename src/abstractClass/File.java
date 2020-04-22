package abstractClass;


//that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

	public abstract class File{
		
		//implemented methods
		public void edit() {
			System.out.println("You can edit your text.");
		}
		public void close() {
			System.out.println("This helps you to close the file.");
		}
		//unimplemented methods=undefined=abstract methods
		
		public abstract void open();
		}
	class JavaFile extends File{
		// public modifier
		public void open() {
			System.out.println("Open with Java Gulbahar");
		}	
	}
	class WordFile extends File{
		
		public void open() {
			System.out.println("Open with WordFile.");
		}
		
	}
class PDFFile  extends File{
		
		public void open() {
			System.out.println("Open with PDFFile.");
		}
	  }
