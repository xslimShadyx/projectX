package com.example.unity.model;

 class User {
    private String firstName ;
    private String lastName;
    private String email;
    private String password;
    private int mobilNumber;
    private String address;



    public User(String firstName,String lastName,String email,String password,int mobilNumber, String address){
        this.address=address;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.mobilNumber=mobilNumber;

    }

     public int getMobilNumber() {
         return mobilNumber;
     }

     public String getAddress() {
         return address;
     }

     public String getEmail() {
         return email;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getPassword() {
         return password;
     }
 }
