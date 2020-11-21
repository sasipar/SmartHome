package AirConditioner;

public class AirConditioner {
    private boolean onOff;
    private String roomName;
    private int currentTemperature;
    private int minTemperature;
    private int maxTemperature;
    private FanSpeed fanSpeed;

    public AirConditioner(String roomName,int minTemperature,int maxTemperature){
        onOff=false;
        fanSpeed=FanSpeed.Medium;
        this.roomName=roomName;
        this.currentTemperature=maxTemperature;
        this.minTemperature=minTemperature;
        this.maxTemperature=maxTemperature;
    }
    public void toggleOnOff(){
        onOff=!onOff;
    }
    public void increaseTemperature(){
        currentTemperature++;
        if(currentTemperature>=maxTemperature){
            currentTemperature=maxTemperature;
        }
    }
    public void decreaseTemperature(){
        currentTemperature--;
        if(currentTemperature<=minTemperature){
            currentTemperature=minTemperature;
        }
    }
    public void switchFanSpeed(){
        switch (fanSpeed){
            case Low: fanSpeed=FanSpeed.Medium;
                break;
            case Medium: fanSpeed=FanSpeed.High;
                break;
            case High: fanSpeed=FanSpeed.Low;
                break;
        }
    }

    public boolean isOnOff() {
        return onOff;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public FanSpeed getFanSpeed() {
        return fanSpeed;
    }

    @Override
    public String toString() {
        return "AirConditioner { Roomname = "+this.getRoomName()+" Status = " +(onOff==true? "On,":"Off,")
                +"Fanspeed = " + this.getFanSpeed() +",Temperature = "+this.getCurrentTemperature()+" }";
    }
}
