import java.util.Scanner;

public class RunClass {
    public static void main(String[] args) {
        Scanner sigma = new Scanner(System.in);
        int totalkerja;
        int pilihanWaktu;
        System.out.println("Pilih 1. Student atau 2.Teacher");
        int pilihan = sigma.nextInt();
        if (pilihan == 1) {
            System.out.println("Name: ");
            String name = sigma.next();
            sigma.nextLine();
            System.out.println("Age: ");
            int age = sigma.nextInt();
            System.out.println("Student Number: ");
            int studentNumber = sigma.nextInt();
            System.out.println("Score: ");
            int Score = sigma.nextInt();
            System.out.println("Major: ");
            String major = sigma.next();
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Student Number: "+studentNumber);
            System.out.println("Score: "+Score);
            System.out.println("Major: "+major);
        } else if (pilihan == 2) {
            System.out.println("Name: ");
            String name = sigma.next();
            System.out.println("Age: ");
            int age = sigma.nextInt();
            System.out.println("Subject: ");
            String Subject = sigma.next();            
            System.out.println("1.Full Time atau 2.Part Time");
             pilihanWaktu = sigma.nextInt();
            if (pilihanWaktu == 1) {
                System.out.println("Annual Salary: ");
                    int anualSalary = sigma.nextInt();
                    System.out.println("Unit: ");
                    String unit = sigma.next();

                    System.out.println("Nama: "+name);
                    System.out.println("Age: "+age);
                    System.out.println("Subject: "+Subject);
                    System.out.println("Annual Salary: "+anualSalary);
                    System.out.println("Unit: "+unit);
            } else if (pilihanWaktu == 2) {
                    System.out.println("Hoursworked: ");
                    int  hoursworked = sigma.nextInt();


                   totalkerja = (hoursworked * 100000);
                    System.out.println("Nama: "+name);
                    System.out.println("Age: "+age);
                    System.out.println("Subject: "+Subject);
                    System.out.println("Hoursworked: "+hoursworked);
                    System.out.println("Salary: "+totalkerja);
            }
            
            
            // switch (pilihanWaktu) {
            //     case 1: 
            //         System.out.println("Annual Salary: ");
            //         int anualSalary = sigma.nextInt();
            //         System.out.println("Unit: ");
            //         String unit = sigma.nextLine();

            //         System.out.println("Nama: "name);
            //         System.out.println("Age: "age);
            //         System.out.println("Subject: "Subject);
            //         System.out.println("Annual Salary: "anualSalary);
            //         System.out.println("Unit: "unit);
            //         break;

            //         case 2: 
            //         System.out.println("Hours: ");
            //         int hoursworked = sigma.nextInt();

            //         System.out.println("Nama: "name);
            //         System.out.println("Age: "age);
            //         System.out.println("Subject: "Subject);
            //         System.out.println("Hours: "hoursworked);
            //         break;
            
            //     default:
            //         break;
            }
                
            }
        }

