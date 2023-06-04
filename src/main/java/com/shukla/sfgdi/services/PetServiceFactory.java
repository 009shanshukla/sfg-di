package com.shukla.sfgdi.services;

/**
 * create by shuklash on 04/06/23
 */
public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
