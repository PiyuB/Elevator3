
public class Elevator {
	ButtonPanel bp=new ButtonPanel(); 
	int current_floor;
	Elevator(){
		current_floor=0;
		display();
	}
	Elevator(int floor){
		current_floor=floor;

	}
	public void display(){
		System.out.println("current_floor =>"+ current_floor);
		System.out.println("select floor where you want to go");
		System.out.println("0	1	2	3	4	5	6");
	}

	public void goUp(int destination){
		current_floor++;
	}

	public void goDown(int destination){
		current_floor--;
	}
}
