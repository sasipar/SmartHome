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

    @Override
    public String toString() {
        return "Door status {"+(isOpen==true? "Open,":"Close,")+(isLock==true? "Lock":"Unlock")+"}";
    }
}
