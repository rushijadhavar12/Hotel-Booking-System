import java.util.*;

public class Hotel_Booking_System_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, f = 0, r = 0;
        double total_rent = 0;
        String roomType = "";
        double rent = 0;
        double day = 0;
        // room
        int room[][] = new int[5][5];
        // user name
        String user[][] = new String[5][5];

        // while (ct == 0) {
        do {
            System.out.println("--------HOTEL BOOKING SYSTEM---------");
            System.out.println("\n1.Book room\n2.View status\n3.Cancel booking\n4.Generate Bill\n5.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    // Book room
                    // 1.Ac 2.NonAc ac price=1000k/day nonac=2000k/day
                    System.out.println("\nWhich type of room do you prefer?\nAC ROOMS or NON AC ROOMS\n\nPRICES:");
                    System.out.println("1.AC ROOMS: 2000k/day\n2.NON-AC ROOMS: 1000k/day");
                    int ch1 = sc.nextInt();

                    switch (ch1) {
                        case 1 -> {// Ac rooms

                            roomType = "AC";
                            rent = 2000;
                            day = 0;

                            System.out.println("Enter the floor num:");
                            f = sc.nextInt();
                            System.out.println("Enter the room number");
                            r = sc.nextInt();
                            sc.nextLine();

                            if (room[f][r] == 0) {
                                room[f][r] = 1;
                                System.out.println("Enter your name:");
                                user[f][r] = sc.nextLine();

                                System.out.println("For How many days You want to stay?");
                                day = sc.nextDouble();

                                System.out.println("AC Room Booked for " + user[f][r] + " !\nThank you!");
                            } else {
                                System.out.println("Already Booked ! Choose Another one!");
                            }

                        }
                        case 2 -> {
                            // NON AC ROOMS

                            roomType = "NON-AC";
                            rent = 1000;
                            day = 0;

                            System.out.println("Enter the floor num:");
                            f = sc.nextInt();
                            System.out.println("Enter the room number");
                            r = sc.nextInt();
                            sc.nextLine();

                            if (room[f][r] == 0) {
                                room[f][r] = 1;
                                System.out.println("Enter your name:");
                                user[f][r] = sc.nextLine();
                                System.out.println("For How many days You want to stay?");
                                day = sc.nextDouble();

                                System.out.println("NON-AC Room Booked for " + user[f][r] + " !\nThank you!");
                            } else {
                                System.out.println("Already Booked ! Choose Another one!");
                            }

                        }

                    }

                }
                case 2 -> {
                    // View status
                    for (int i = 0; i < room.length; i++) {
                        for (int j = 0; j < room.length; j++) {
                            if (room[i][j] == 0) {
                                System.out.print("A ");
                            } else {
                                System.out.print("B ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    // cancel booking
                    System.out.println("Enter the floor num:");
                    f = sc.nextInt();
                    System.out.println("Enter the room number");
                    r = sc.nextInt();

                    if (room[f][r] == 1) {
                        room[f][r] = 0;
                        System.out.println("Booking cancelled successfully!");
                    } else {
                        System.out.println("unable to cancel");
                    }
                }
                case 4 -> {
                    // generate bill
                    System.out.println("\n========== HOTEL BILL ==========");
                    System.out.println("Customer Name : " + user[f][r]);
                    System.out.println("Room Type     : " + roomType);
                    System.out.println("Days Stayed   : " + day);
                    System.out.println("Rent per Day  : Rs. " + rent);
                    System.out.println("-------------------------------");

                    total_rent = day * rent;

                    System.out.println("Total Bill    : Rs. " + total_rent);
                    System.out.println("===============================");

                }
                case 5 -> {
                    // exit?, b
                    System.out.println("Thank you for Booking 1 ! Have a good day!");
                    // ct = 1;

                }
                default -> {
                    System.out.println("invalid choice: Enter valid choice please!");
                }
            }
            // }
        } while (ch != 5);

        sc.close();
    }
}
