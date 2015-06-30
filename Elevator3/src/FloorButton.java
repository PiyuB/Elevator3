
public class FloorButton extends ButtonPanel {

	
	public void openButtonSelected(Door door){
		door.openDoor();
	}
	
	public void closeButtonSelected(Door door){
			door.closeDoor();
		}
	
}
