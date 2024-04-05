import controller.AvionController;
import controller.PasajeroController;
import controller.ReservacionController;
import controller.VueloController;
import database.ConfigDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ConfigDB.openConnection();

        PasajeroController objPasajeroController = new PasajeroController();
        AvionController objAvionController = new AvionController();
        VueloController objVueloController = new VueloController();
        ReservacionController objReservacionController = new ReservacionController();

        String option;

        do {
            option = JOptionPane.showInputDialog("""
                        ------ 👨🏻‍✈️ RIWI AIRLINES 👩🏻‍✈️ ------ \n
                        1. 😎 Admin Passengers
                        2. ✈ Admin Planes
                        3. 🛫 Admin Flights
                        4. 📆 Admin Bookings
                        5. 🔎 Search
                        6. 🚪 Exit
                        \n
                    """);

            switch (option) {

                // Passengers Menu
                case "1":
                    String optionA;
                    do {
                        optionA = JOptionPane.showInputDialog("""
                                    ----- PASSENGERS MENU ----- \n
                                    1. 😎 List Passengers
                                    2. ➕ Add Passenger
                                    3. ✏ Update Passenger
                                    4. ❌ Delete Passenger
                                    5. 👈 Go Back
                                    \n
                                """);

                        // Switch Passengers Admin
                        switch (optionA) {
                            case "1":
                                objPasajeroController.getAll();
                                break;
                            case "2":
                                objPasajeroController.create();
                                break;
                            case "3":
                                objPasajeroController.update();
                                break;
                            case "4":
                                objPasajeroController.delete();
                                break;
                        }
                    } while (!optionA.equals("5"));
                    break;

                case "2":
                    String optionB;
                    do {
                        optionB = JOptionPane.showInputDialog("""
                                    ----- PLANES MENU ----- \n
                                    1. ✈ List Planes
                                    2. ➕ Add Plane
                                    3. ✏ Update Plane
                                    4. ❌ Delete Plane
                                    5. 👈 Go Back
                                    \n
                                """);

                        // Switch Planes Admin
                        switch (optionB) {
                            case "1":
                                objAvionController.getAll();
                                break;
                            case "2":
                                objAvionController.create();
                                break;
                            case "3":
                                objAvionController.update();
                                break;
                            case "4":
                                objAvionController.delete();
                                break;
                        }
                    } while (!optionB.equals("5"));
                    break;

                case "3":
                    String optionC;
                    do {
                        optionC = JOptionPane.showInputDialog("""
                                    ----- FLIGHTS MENU ----- \n
                                    1. ✈ List flights
                                    2. ➕ Add flight
                                    3. ✏ Update flight
                                    4. ❌ Delete flight
                                    5. 👈 Go Back
                                    \n
                                """);

                        // Switch Flights Admin
                        switch (optionC) {
                            case "1":
                                objVueloController.getAll();
                                break;
                            case "2":
                                objVueloController.create();
                                break;
                            case "3":
                                objVueloController.update();
                                break;
                            case "4":
                                objVueloController.delete();
                                break;
                        }
                    } while (!optionC.equals("5"));
                    break;

                case "4":
                    String optionD;
                    do {
                        optionD = JOptionPane.showInputDialog("""
                                    ----- BOOKINGS MENU ----- \n
                                    1. ✈ List bookings
                                    2. ➕ Add booking
                                    3. ✏ Update booking
                                    4. ❌ Delete booking
                                    5. 👈 Go Back
                                    \n
                                """);

                        // Switch Bookings Admin
                        switch (optionD) {
                            case "1":
                                objReservacionController.getAll();
                                break;
                            case "2":
                                objReservacionController.create();
                                break;
                            case "3":
                                objReservacionController.update();
                                break;
                            case "4":
                                objReservacionController.delete();
                                break;
                        }
                    } while (!optionD.equals("5"));
                    break;
            }

        } while (!option.equals("6"));

    }
}