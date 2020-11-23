import java.util.Scanner;

public class Cases {
    static Scanner sn = new Scanner(System.in);

    public static void airCase1(){
        sn.nextLine();
        System.out.print("Input room name : ");
        String roomname = sn.nextLine();
        System.out.print("Input min temperature : ");
        int min = sn.nextInt();
        sn.nextLine();
        System.out.print("Input max temperature : ");
        int max = sn.nextInt();
        if(roomname!=null){
            SmartHome.createAirConditioner(roomname,min,max);
            System.out.println("AirConditioner " + roomname + " has added");
        }else System.out.println("ERROR");
    }
    public static void doorCase1(){
        sn.nextLine();
        System.out.print("Input room name : ");
        String roomname = sn.nextLine();
        sn.nextLine();
        if(roomname!=null){
            SmartHome.createDoor(roomname);
            System.out.println("Door " + roomname + " has added");
        }else System.out.println("ERROR");
    }
    public static void lightCase1(){
        sn.nextLine();
        System.out.print("Input room name : ");
        String roomname = sn.nextLine();
        sn.nextLine();
        if(roomname!=null){
            SmartHome.createLight(roomname);
            System.out.println("Light " + roomname + " has added");
        }else System.out.println("ERROR");
    }

    public static void airCase2(){
        System.out.println(SmartHome.allAir);
        System.out.print("Choose your Airconditioner(Input number start from 0) :");
        int i = sn.nextByte();
        SmartHome.allAir.get(i);
        System.out.println("What do you want to do?");
        System.out.println(" 1. Turn On/Off\n 2. Increase temperature\n 3. Decrease tempearature\n 4. Change fan speed");
        int j = sn.nextByte();
        switch (j){
            case 1: SmartHome.allAir.get(i).toggleOnOff();
                break;
            case 2: SmartHome.allAir.get(i).increaseTemperature();
                break;
            case 3: SmartHome.allAir.get(i).decreaseTemperature();
                break;
            case 4: SmartHome.allAir.get(i).switchFanSpeed();
                break;

        }
    }
    public static void doorCase2(){
        System.out.println(SmartHome.allDoor);
        System.out.print("Choose your Door(Input number start from 0) :");
        int i = sn.nextByte();
        SmartHome.allDoor.get(i);
        System.out.println("What do you want to do?");
        System.out.println(" 1. Open/Close\n 2. Lock/Unlock");
        int j = sn.nextByte();
        switch (j){
            case 1: SmartHome.allDoor.get(i).toggleDoor();
                break;
            case 2: SmartHome.allDoor.get(i).toggleLock();
                break;

        }
    }
    public static void lightCase2(){
        System.out.println(SmartHome.allLight);
        System.out.print("Choose your Light(Input number start from 0) :");
        int i = sn.nextByte();
        SmartHome.allLight.get(i);
        System.out.println("What do you want to do?");
        System.out.println(" 1. Turn On/Off\n 2. Change light color");
        int j = sn.nextByte();
        switch (j){
            case 1: SmartHome.allLight.get(i).toggleOnOff();
                break;
            case 2: SmartHome.allLight.get(i).switchLight();
                break;

        }
    }
}
