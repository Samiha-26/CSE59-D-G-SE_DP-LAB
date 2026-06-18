interface Clickable {
	void onClick();
}

class Button implements Clickable {
	
	
	public void onClick() {
		System.out.println("Button was Clicked!");
	}
}
public class Main7 {

	public static void main(String[] args) {
		Button button = new Button ();
		button.onClick();

	}

}

