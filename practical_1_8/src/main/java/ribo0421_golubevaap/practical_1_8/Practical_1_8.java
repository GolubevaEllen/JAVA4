/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_golubevaap.practical_1_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vedro
 */
public class Practical_1_8 {

    public static void main(String[] args) {
        System.out.println("Практическая работа 1.8 | Вариант 3 | Голубева А.П.");
        List<Doctor> docs = new ArrayList<>();
        docs.add(new Doctor("Антонов Антон Антонович","терапевт"
                ,345,15,true));
        docs.add(new Doctor("Иванов Иван Иванович","хирург"
                ,5,20,true));
        docs.add(new Doctor("Юрьев Юрий Аристархович","офтальмолог"
                ,65,10,false));
        
        while (true) {
            Collections.sort(docs);
            for (Doctor d : docs) {
                System.out.println(d.getInfo());
            }
            System.out.println("\n1-Добавить врача\n"
                    + "2-Изменить прохождение аттестации\n0-Выход");
            Scanner scan = new Scanner(System.in);
            int cmd = scan.nextInt();
            if (cmd == 0) {
                System.out.println("Конец.");
                break;
            }
            else if (cmd == 1) {
                System.out.println("Введите имя: ");
                String fio = scan.nextLine();
                System.out.println("Введите специальность: ");
                String special = scan.nextLine();
                int number = 0;
                while (true) {
                    System.out.println("Введите индивидуальный номер: ");
                    number = scan.nextInt();
                    boolean f = true;
                    for (Doctor d : docs) {
                        if (d.getNumber() == number) {
                            f = false;
                            break;
                        }
                    }
                    if (f) {
                        break;
                    }
                    else {
                        System.out.println("Введённый номер уже используется! ");
                    }
                }
                System.out.println("Введите кол-во рабочих дней: ");
                int work_days = scan.nextInt();
                System.out.println("Аттестация пройдена? (true/false): ");
                boolean attestation = scan.nextBoolean();
                docs.add(new Doctor(fio, special, number, work_days, attestation));
            }
            else if (cmd == 2) {
                while (true) {
                    int number = 0;
                    System.out.println("Выберите индивидуальный номер: ");
                    number = scan.nextInt();
                    boolean f = true;
                    for (Doctor d : docs) {
                        if (d.getNumber() == number) {
                            d.changeAttestation(d);
                            f = false;
                            break;
                        }
                    }
                    if (f) {
                        System.out.println("Введённый номер не существует! ");
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                System.out.println("Неверная команда!");
            }
        }
    }
}