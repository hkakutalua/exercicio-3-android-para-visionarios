package com.buka.exercicio3.utils;

import com.buka.exercicio3.models.Car;

import java.util.ArrayList;

public final class CarArrayListGenerator {
    public static ArrayList<Car> generateCars() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Lexus", "RX", 1999, "Branco"));
        cars.add(new Car("Honda", "Corolla", 1999, "Branco"));
        cars.add(new Car("Lexus", "RX", 2013, "Mauv"));
        cars.add(new Car("Mercury", "Grand Marquis", 1998, "Teal"));
        cars.add(new Car("Nissan", "Altima", 2011, "Teal"));
        cars.add(new Car("Dodge", "Intrepid",2001,"Teal"));
        cars.add(new Car("Honda","Accord",1999,"Violet"));
        cars.add(new Car("Nissan","300ZX",1993,"Maroon"));
        cars.add(new Car("Mercedes-Benz", "W201", 1991, "Aquamarine"));
        cars.add(new Car("Acura", "RL", 1996, "Teal"));
        cars.add(new Car("Pontiac", "Grand Am", 1986, "Purple"));
        cars.add(new Car("Ford", "F-Series Super Duty", 2008, "Turquoise"));
        cars.add(new Car("Jaguar","S-Type",2005, "Teal"));
        cars.add(new Car("Saturn","Astra",2008,"Teal"));
        cars.add(new Car("Ford", "F150", 1996, "Green"));
        cars.add(new Car("Jeep", "Wrangler", 1998, "Teal"));
        cars.add(new Car("Pontiac", "Montana", 2005, "Orange"));
        cars.add(new Car("Infiniti", "EX", 2011, "Mauv"));

        return cars;
//        }, {
//            "manufacturer": "Mercedes-Benz",
//                    "model": "E-Class",
//                    "year": 2012,
//                    "color": "Maroon"
//        }, {
//            "manufacturer": "Mitsubishi",
//                    "model": "Lancer Evolution",
//                    "year": 2005,
//                    "color": "Orange"
//        }, {
//            "manufacturer": "Jeep",
//                    "model": "Wrangler",
//                    "year": 2000,
//                    "color": "Maroon"
//        }, {
//            "manufacturer": "Chrysler",
//                    "model": "300",
//                    "year": 2010,
//                    "color": "Aquamarine"
//        }, {
//            "manufacturer": "Ford",
//                    "model": "Mustang",
//                    "year": 1991,
//                    "color": "Puce"
//        }, {
//            "manufacturer": "Dodge",
//                    "model": "Caliber",
//                    "year": 2011,
//                    "color": "Blue"
//        }, {
//            "manufacturer": "Suzuki",
//                    "model": "Aerio",
//                    "year": 2004,
//                    "color": "Aquamarine"
//        }, {
//            "manufacturer": "Nissan",
//                    "model": "Frontier",
//                    "year": 2001,
//                    "color": "Teal"
//        }, {
//            "manufacturer": "Mercedes-Benz",
//                    "model": "CLS-Class",
//                    "year": 2010,
//                    "color": "Orange"
//        }, {
//            "manufacturer": "Toyota",
//                    "model": "4Runner",
//                    "year": 1992,
//                    "color": "Blue"
//        }, {
//            "manufacturer": "Mitsubishi",
//                    "model": "Eclipse",
//                    "year": 2008,
//                    "color": "Violet"
//        }, {
//            "manufacturer": "Panoz",
//                    "model": "Esperante",
//                    "year": 2007,
//                    "color": "Khaki"
//        }, {
//            "manufacturer": "Nissan",
//                    "model": "Quest",
//                    "year": 1996,
//                    "color": "Green"
//        }, {
//            "manufacturer": "GMC",
//                    "model": "Savana 1500",
//                    "year": 2000,
//                    "color": "Khaki"
//        }]

    }
}
