package Door;

public class Door {
    private String roomName;
    private boolean isOpen;
    private boolean isLock;

    public Door(String roomName){
        this.isOpen=false;
        this.roomName=roomName;
        this.isLock=false;
    }
    public void toggleDoor(){
        isOpen=!isOpen;
    }
    public void toggleLock(){
        isLock=!isLock;
    }
    public String getRoomName() {
        return roomName;
    }

    @Override
    public String toString() {
        return "Door Roomname = " + this.getRoomName() + " status {"+(isOpen==true? "Open,":"Close,")+(isLock==true? "Lock":"Unlock")+"}";
    }
}
