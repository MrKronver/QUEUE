package com.company;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class QueueStructure {
    int counter = 0;

    public QueueStructure() {
    }

    public void addToQueue(int counter) {
        Queue<Integer> adding = new LinkedList<>();
        if (counter >= 0) {
            adding.add(counter);
            System.out.println("Person " + counter + " added");
            System.out.println("List " + adding);

            queueStructureLaws();
        } else {
            System.out.println("Error");
        }
    }

    public void removeFromQueue(int counter) {
        Queue<Integer> removing = new LinkedList<>();

        removing.remove(counter);

        System.out.println("Person " + counter + " removed");
        System.out.println("People left " + counter);

        queueStructureLaws();
    }

    public void allQueue(int counter){
        System.out.println("People in queue: "+ counter);
        System.out.println("List:\n");
        for(int i = 1; i<=counter; i++){
            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            // Display contents of the queue.
            System.out.println("Person "+ q);
        }

        queueStructureLaws();
    }

    public void queueStructureLaws() {
        String options = "Choose option:\n" + "1.Come into queue;\n" + "2.Get out from queue;\n" + "3.Show all queue.\n";
        System.out.print(options);
        Scanner choiceScanner = new Scanner(System.in);
        int choice = choiceScanner.nextInt();

        try {
            if (choice == 1) {
                if (counter < 0) {
                    System.out.println("Error");
                }
                System.out.println("Your choice is 1");
                counter = counter + 1;
                addToQueue(counter);
            }

            if (choice == 2) {
                System.out.println("Your choice is 2");
                if (counter <= 0) {
                    System.out.println("Nobody is in the queue");
                    queueStructureLaws();
                } else {
                    counter = counter - 1;
                    removeFromQueue(counter);
                }
            }

            if(choice == 3){
                System.out.println("Your choice is 3");
                allQueue(counter);
            }
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }

}

