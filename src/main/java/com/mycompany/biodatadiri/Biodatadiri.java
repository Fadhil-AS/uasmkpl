/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biodatadiri;

/**
 *
 * @author Lenovo
 */
public class Biodatadiri {
    private String name;
    private int age;
    private String address;
    
    public Biodatadiri(String name, int age, String address){
        this.name = name;
        this.age = age; 
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Code smell: Primitive Obsession
    public boolean isEligibleToVote(int votingAge) {
        return age >= votingAge; 
    }
    
    public static void main(String[] args) {
        Biodatadiri user = new Biodatadiri("Fadhil", 21, "Cianjur");
    
        // instantiate voting age
        int votingAge = 17; 

        boolean eligible = user.isEligibleToVote(votingAge);

        System.out.println(eligible);
    }
}


