package Light;

public class Light {
    private String roomName;
    private boolean onOff;
    private LightColor lightColor;

    public Light(String roomName){
        this.roomName = roomName;
        onOff = true;
        lightColor=LightColor.DaylightWhite;
    }
    public void toggleOnOff(){
        onOff = !onOff;
    }

    public void switchLight(){
        switch (lightColor){
            case DaylightWhite: lightColor=LightColor.CoolWhite;
                break;
            case CoolWhite: lightColor=LightColor.WarmWhite;
                break;
            case WarmWhite: lightColor=LightColor.DaylightWhite;
                break;
        }
    }

    public boolean getOnOff(){
        return onOff;
    }
    public LightColor getLightColor(){
        return lightColor;
    }
    public String getRoomName() { return roomName; }

    @Override
    public String toString() {
        return "Light{" +
                "roomName='" + this.getRoomName() + '\'' +
                ", Status=" + (onOff==true? "On":"Off") +
                ", lightColor=" + this.getLightColor() +
                '}';
    }
}
