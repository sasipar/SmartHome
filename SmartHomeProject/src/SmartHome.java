import AirConditioner.AirConditioner;
import Door.Door;
import Light.Light;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartHome {
    static ArrayList<AirConditioner> allAir=new ArrayList<AirConditioner>();
    static ArrayList<Door> allDoor=new ArrayList<Door>();
    static ArrayList<Light> allLight=new ArrayList<Light>();

     AirConditioner createAirConditioner (String roomname,int minT,int maxT){
        AirConditioner airConditioner = new AirConditioner(roomname,minT,maxT);
        allAir.add(airConditioner);
        return airConditioner;
    }
    public Door createDoor(String roomName){
        Door door = new Door(roomName);
        allDoor.add(door);
        return door;
    }

    public Light createLight(String roomName){
        Light light = new Light(roomName);
        allLight.add(light);
        return light;
    }

    public void getArrayList(){
        for (int i = 0; i < allAir.size(); i++) {
            System.out.println(allAir.get(i));
        }
    }

    public static void menuBar(){
        SmartHome h1 = new SmartHome();
        Scanner sn = new Scanner(System.in);
        System.out.println("*********Menu Bar**********");
        System.out.println("1. AirConditioner");
        System.out.println("2. Door");
        System.out.println("3. Light");
        System.out.print("Choose SmartHome system (1-3) : ");
        switch (sn.nextByte()){
            case 1:
                System.out.println("*****Airconditioner*****");
                System.out.println("1. Add");
                System.out.println("2. Select");
                System.out.println("3. Show all Airconditioner");
                System.out.print("Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        System.out.print("Input room name : ");
                        sn.nextLine();
                        String roomname = sn.nextLine();
                        System.out.print("Input min temperature : ");
                        int min = sn.nextInt();
                        sn.nextLine();
                        System.out.print("Input max temperature : ");
                        int max = sn.nextInt();
                        if(roomname!=null){
                            h1.createAirConditioner(roomname,min,max);
                            System.out.println("AirConditioner " + roomname + " has added");
                        }else System.out.println("ERROR");
                        h1.repeatMenu();
                        break;
                    case 2:
                        h1.repeatMenu();
                        break;
                    case 3:
                        System.out.println(allAir);
                        h1.repeatMenu();
                        break;
                }
                break;
            case 2:
                System.out.println("*****Door*****");
                System.out.println("1. Add");
                System.out.println("2. Select");
                System.out.println("3. Show all Door");
                System.out.print("Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        System.out.print("Input room name : ");
                        String roomname = sn.nextLine();
                        sn.nextLine();
                        if(roomname!=null){
                            h1.createDoor(roomname);
                            System.out.println("Door " + roomname + " has added");
                        }else System.out.println("ERROR");
                        h1.repeatMenu();
                        break;
                    case 2:
                        h1.repeatMenu();
                        break;
                    case 3:
                        h1.repeatMenu();
                        break;
                }
                break;
            case 3:
                System.out.println("*****Light*****");
                System.out.println("1. Add");
                System.out.println("2. Select");
                System.out.println("3. Show all Light");
                System.out.print("Select function (1-3) : ");
                switch (sn.nextByte()){
                    case 1:
                        System.out.print("Input room name : ");
                        String roomname = sn.nextLine();
                        sn.nextLine();
                        if(roomname!=null){
                            h1.createLight(roomname);
                            System.out.println("Light " + roomname + " has added");
                        }else System.out.println("ERROR");
                        h1.repeatMenu();
                        break;
                    case 2:
                        h1.repeatMenu();
                        break;
                    case 3:
                        h1.repeatMenu();
                        break;
                }
                break;

        }

    }

    public static void repeatMenu(){
        Scanner sn = new Scanner(System.in);
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
