package week3.day1;

public class IndexProgram {
	public void getchar()
	{
		
		String text = "Java Exercise";
		text.toCharArray();
		char charAt = text.charAt(5);
		char charAt2 = text.charAt(11);
		System.out.println("Index of first char "+charAt + "  Index of second char "+charAt2);
	}
	
	
	public static void main(String[] args) {
		
		IndexProgram index=new IndexProgram();
			index.getchar();
		
		
	}

}
