package week3.day1;

public class Desktop extends Computer {

	public void DesktopSize() {
		System.out.println("Size of the Desktop is : 15'");
	}

	public static void main(String[] args) {

		Desktop system = new Desktop();
		system.computermodel();
		system.DesktopSize();
	}
}
