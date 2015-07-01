import java.util.Scanner;

public class FloorButton extends ButtonPanel {
	int floorValue;

	public int  selectFloor(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter floor number : ");
		floorValue = sc.nextInt();
		System.out.println("Floor accepted " + floorValue);
		return  floorValue;
	}

}
