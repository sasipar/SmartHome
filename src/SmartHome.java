import AirConditioner.AirConditioner;
import Door.Door;
import Light.Light;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartHome {
    static Scanner sn = new Scanner(System.in);
    static ArrayList<AirConditioner> allAir=new ArrayList<AirConditioner>();
    static ArrayList<Door> allDoor=new ArrayList<Door>();
    static ArrayList<Light> allLight=new ArrayList<Light>();

    public static AirConditioner createAirConditioner (String roomname,int minT,int maxT){
        AirConditioner airConditioner = new AirConditioner(roomname,minT,maxT);
        allAir.add(airConditioner);
        return airConditioner;
    }
    public static Door createDoor(String roomName){
        Door door = new Door(roomName);
        allDoor.add(door);
        return door;
    }

    public static Light createLight(String roomName){
        Light light = new Light(roomName);
        allLight.add(light);
        return light;
    }

    public void getAirList(){
        for (int i = 0; i < allAir.size(); i++) {
            System.out.println(allAir.get(i));
        }
    }
    public void getLightList(){
        for (int i = 0; i < allLight.size(); i++) {
            System.out.println(allLight.get(i));
        }
    }
    public void getDoorList(){
        for (int i = 0; i < allDoor.size(); i++) {
            System.out.println(allDoor.get(i));
        }
    }


    public static void menuBar(){
        SmartHome h1 = new SmartHome();
        System.out.println("*********Menu Bar**********\n"+
                "1. AirConditioner\n" +
                "2. Door\n" +
                "3. Light\n" +
                "Choose SmartHome system (1-3) : ");
        switch (sn.nextByte()){
            case 1:
                System.out.println("*********Airconditioner**********\n"+
                        "1. Add\n" +
                        "2. Select\n" +
                        "3. Show all Airconditioner\n" +
                        "Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        Cases.airCase1();
                        h1.repeatMenu();
                        break;
                    case 2:
                        Cases.airCase2();
                        h1.repeatMenu();
                        break;
                    case 3:
                        System.out.println(allAir);
                        h1.repeatMenu();
                        break;
                }
                break;
            case 2:
                System.out.println("*********Door**********\n"+
                        "1. Add\n" +
                        "2. Select\n" +
                        "3. Show all Door\n" +
                        "Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        Cases.doorCase1();
                        h1.repeatMenu();
                        break;
                    case 2:
                        Cases.doorCase2();
                        h1.repeatMenu();
                        break;
                    case 3:
                        System.out.println(allDoor);
                        h1.repeatMenu();
                        break;
                }
                break;
            case 3:
                System.out.println("*********Light**********\n"+
                        "1. Add\n" +
                        "2. Select\n" +
                        "3. Show all Light\n" +
                        "Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        Cases.lightCase1();
                        h1.repeatMenu();
                        break;
                    case 2:
                        Cases.lightCase2();
                        h1.repeatMenu();
                        break;
                    case 3:
                        System.out.println(allLight);
                        h1.repeatMenu();
                        break;
                }
                break;

        }

    }

    public static void repeatMenu(){
        System.out.println("Do you want to continue? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("choose : ");
        byte a = sn.nextByte();
        switch (a){
            case 1: SmartHome.menuBar();
                break;
            case 2:
                System.out.println("End");
                break;
        }
    }
}
