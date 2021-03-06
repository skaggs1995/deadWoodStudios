package com.company;

import java.util.ArrayList;

/**
 * Created by skaggsc2 on 2/8/16.
 */
class Saloon extends Room{

    int roleNum = 2;
    int adjRoomNum = 4;
    String name = "Saloon";
    Scene movie;
    Role R1 = new Role(1, "Reluctant Farmer", false);
    Role R2 = new Role(2, "Woman in Red Dress", false);

    int shots = 2;
    public Saloon(){
        super();
        SaloonRoleList.add(R1);
        SaloonRoleList.add(R2);

    }

    public String getName(){return name;}
    public ArrayList<Room> getAdjRooms(){return SaloonAdjList;}
    public ArrayList<Role> getRoomRoles(){return SaloonRoleList;}
    public int getRoleNum(){return roleNum;}
    public int getAdjRoomNum(){return adjRoomNum;}
    public void addRoom(Room room){SaloonAdjList.add(room);}
    public Scene getScene(){return movie;}
    public int getShots(){return shots;}
    public void setShots(int shots){this.shots =shots;}
    public void setScene(Scene scene){
        movie = scene;
    }
}