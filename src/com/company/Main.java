/*
 *
 * Classname: Main
 *
 * @version 21.06.2020
 * @author Vladyslav Zaichenko

 * Module 3 task 1
 *
 * JavaCollectionsFramework. List.
 *
 * 1. Create ArrayList and LinkedList containing
 * 100 000 Integer elements. Compare time intervals.
 *
 * 2. Insert  new 1000 elements on the beginning, on
 * the middle, and on the end. Compare time intervals.
 *
 * 3. Update 1000 elements from the beginning, from the middle
 * and from the end. Compare time intervals.
 *
 * 4. Delete 1000 elements from the beginning, from the middle
 * and from the end. Compare time intervals.
 *
 */

package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println
                ("-------------- Lists Initializations --------------");

        /*
        * @param startCreationArrayList return time start
        * initialization ArrayList with 100 000 elements
        */
        LocalDateTime startCreationArrayList = LocalDateTime.now();

        /*
         * Creation ArrayList with 100 000 integers elements
         * Compare time interval for completing ArrayList
         */
        List<Integer> integersArray = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            integersArray.add(i);
        }

        /*
         * @param finishCreationArrayList return time finish
         * initialization ArrayList with 100 000 elements
         */
        LocalDateTime finishCreationArrayList = LocalDateTime.now();

        // return time for creation ArrayList with 100 000 elements
        System.out.println("Initialization ArrayList needs: "
                + ChronoUnit.MILLIS.between(startCreationArrayList,
                finishCreationArrayList) + " Milliseconds");

        /*
         * @param startCreationLinkedList return time start
         * initialization LinkedList with 100 000 elements
         */
        LocalDateTime startCreationLinkedList = LocalDateTime.now();

        /*
         * Creation LinkedList with 100 000 integers elements
         * Compare time interval for completing LinkedList
         */
        List<Integer> integersLinked = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            integersLinked.add(i);
        }

        /*
         * @param finishCreationLinkedList return time finish
         * initialization LinkedList with 100 000 elements
         */
        LocalDateTime finishCreationLinkedList = LocalDateTime.now();

        // return time for creation LinkedList with 100 000 elements
        System.out.println("Initialization LinkedList needs: "
                + ChronoUnit.MILLIS.between(startCreationLinkedList,
                finishCreationLinkedList) + " Milliseconds");

        System.out.println
                ("\n----- Inserting new 1000 elements on the beginning -----");

        /*
         * @param startInsertInBeginningOfArrayList return time start
         * inserting 1000 elements on the beginning of ArrayList
         */
        LocalDateTime startInsertInBeginningOfArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(i, i);
        }

        /*
         * @param finishInsertInBeginningOfArrayList return time start
         * inserting 1000 elements on the beginning of ArrayList
         */
        LocalDateTime finishInsertInBeginningOfArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning of ArrayList
        System.out.println("Insert 1000 new elements on the beginning of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startInsertInBeginningOfArrayList,
                        finishInsertInBeginningOfArrayList) + " Milliseconds");

        /*
         * @param startInsertInBeginningOfLinkedList return time start
         * inserting 1000 elements on the beginning of LinkedList
         */
        LocalDateTime startInsertInBeginningOfLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i, i);
        }

        /*
         * @param finishInsertInBeginningOfLinkedList return time finish
         * inserting 1000 elements on the beginning of LinkedList
         */
        LocalDateTime finishInsertInBeginningOfLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning of LinkedList
        System.out.println("Insert 1000 new elements on the beginning of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startInsertInBeginningOfLinkedList,
                        finishInsertInBeginningOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n----- Inserting new 1000 elements on the middle -----");

        /*
         * @param startInsertInMiddleOfArrayList return time start
         * inserting 1000 elements on the middle of ArrayList
         */
        LocalDateTime startInsertInMiddleOfArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the middle of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(51000 + i, i);
        }

        /*
         * @param finishInsertInMiddleOfArrayList return time start
         * inserting 1000 elements on the middle of ArrayList
         */
        LocalDateTime finishInsertInMiddleOfArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning of ArrayList
        System.out.println
                ("Insert 1000 new elements on the middle of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startInsertInMiddleOfArrayList,
                        finishInsertInMiddleOfArrayList) + " Milliseconds");

        /*
         * @param startInsertInMiddleLinkedList return time start
         * inserting 1000 elements on the middle of LinkedList
         */
        LocalDateTime startInsertInMiddleOfLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the middle of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(51000 + i, i);
        }

        /*
         * @param finishInsertInMiddleOfLinkedList return time finish
         * inserting 1000 elements on the middle of LinkedList
         */
        LocalDateTime finishInsertInMiddleOfLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the middle of LinkedList
        System.out.println("Insert 1000 new elements on the middle of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startInsertInMiddleOfLinkedList,
                        finishInsertInMiddleOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Inserting new 1000 elements on the end -------");

        /*
         * @param startInsertInEndOfArrayList return time start
         * inserting 1000 elements on the end of ArrayList
         */
        LocalDateTime startInsertInEndOfArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the end of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(i);
        }

        /*
         * @param finishInsertInEndOfArrayList return time start
         * inserting 1000 elements on the end of ArrayList
         */
        LocalDateTime finishInsertInEndOfArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the end of ArrayList
        System.out.println
                ("Insert 1000 new elements on the end of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startInsertInEndOfArrayList,
                        finishInsertInEndOfArrayList) + " Milliseconds");

        /*
         * @param startInsertInEndOfLinkedList return time start
         * inserting 1000 elements on the end of LinkedList
         */
        LocalDateTime startInsertInEndOfLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the end of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i);
        }

        /*
         * @param finishInsertInEndOfLinkedList return time finish
         * inserting 1000 elements on the end of LinkedList
         */
        LocalDateTime finishInsertInEndOfLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the end of LinkedList
        System.out.println("Insert 1000 new elements on the end of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startInsertInEndOfLinkedList,
                        finishInsertInEndOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Updating new 1000 elements on the beginning -------");

        /*
         * @param startUpdateInBeginningOfArrayList return time start
         * updating 1000 elements on the beginning of ArrayList
         */
        LocalDateTime startUpdateInBeginningOfArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the end of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(i, i + 1000);
        }

        /*
         * @param finishUpdateInBeginningOfArrayList return time start
         * updating 1000 elements on the begin of ArrayList
         */
        LocalDateTime finishUpdateBeginningOfArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the beginning of ArrayList
        System.out.println("Update 1000 new elements on the beginning of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInBeginningOfArrayList,
                        finishUpdateBeginningOfArrayList) + " Milliseconds");

        /*
         * @param startUpdateInBeginningOfLinkedList return time start
         * updating 1000 elements on the beginning of ArrayList
         */
        LocalDateTime startUpdateInBeginningOfLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the beginning of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i + 1000);
        }

        /*
         * @param finishUpdateInBeginningOfLinkedList return time start
         * updating 1000 elements on the beginning of LinkedList
         */
        LocalDateTime finishUpdateInBeginningOfLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the middle of LinkedList
        System.out.println("Update 1000 new elements on the beginning of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInBeginningOfLinkedList,
                        finishUpdateInBeginningOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Updating new 1000 elements on the middle -------");

        /*
         * @param startUpdateInMiddleOfArrayList return time start
         * updating 1000 elements on the middle of ArrayList
         */
        LocalDateTime startUpdateInMiddleOfArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the middle of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(51000 + i, i + 1000);
        }

        /*
         * @param finishUpdateInMiddleOfArrayList return time start
         * updating 1000 elements on the middle of ArrayList
         */
        LocalDateTime finishUpdateInMiddleOfArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the middle of ArrayList
        System.out.println("Update 1000 new elements on the middle of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInMiddleOfArrayList,
                        finishUpdateInMiddleOfArrayList) + " Milliseconds");

        /*
         * @param startUpdateInMiddleOfLinkedList return time start
         * updating 1000 elements on the middle of LinkedList
         */
        LocalDateTime startUpdateInMiddleOfLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the middle of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(51000 + i, i + 1000);
        }

        /*
         * @param finishUpdateInMiddleOfLinkedList return time finish
         * updating 1000 elements on the middle of LinkedList
         */
        LocalDateTime finishUpdateInMiddleOfLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the middle of LinkedList
        System.out.println("Update 1000 new elements on the middle of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInMiddleOfLinkedList,
                        finishUpdateInMiddleOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Updating new 1000 elements on the end -------");

        /*
         * @param startUpdateInEndOfArrayList return time start
         * updating 1000 elements on the end of ArrayList
         */
        LocalDateTime startUpdateInEndOfArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the end of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(integersArray.size() - 1000 + i, i + 1000);
        }

        /*
         * @param finishUpdateInEndOfArrayList return time finish
         * updating 1000 elements on the end of ArrayList
         */
        LocalDateTime finishUpdateInEndOfArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the end of LinkedList
        System.out.println("Update 1000 new elements on the end of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInEndOfArrayList,
                        finishUpdateInEndOfArrayList) + " Milliseconds");

        /*
         * @param startUpdateInEndOfLinkedList return time start
         * updating 1000 elements on the end of LinkedList
         */
        LocalDateTime startUpdateInEndOfLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the end of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size() - 1000 + i, i + 1000);
        }

        /*
         * @param finishUpdateInEndOfLinkedList return time finish
         * updating 1000 elements on the end of LinkedList
         */
        LocalDateTime finishUpdateInEndOfLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the end of LinkedList
        System.out.println("Update 1000 new elements on the end of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startUpdateInEndOfLinkedList,
                finishUpdateInEndOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Deleting new 1000 elements on the beginning -------");

        /*
         * @param startDeleteInBeginningOfArrayList return time start
         * deleting 1000 elements on the beginning of ArrayList
         */
        LocalDateTime startDeleteInBeginningOfArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the beginning of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(i);
        }

        /*
         * @param finishDeleteInBeginningOfArrayList return time finish
         * deleting 1000 elements on the beginning of ArrayList
         */
        LocalDateTime finishDeleteInBeginningOfArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the beginning of ArrayList
        System.out.println("Delete 1000 new elements on the beginning of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startDeleteInBeginningOfArrayList,
                        finishDeleteInBeginningOfArrayList) + " Milliseconds");

        /*
         * @param startDeleteInBeginningOfLinkedList return time start
         * deleting 1000 elements on the beginning of LinkedList
         */
        LocalDateTime startDeleteInBeginningOfLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the beginning of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(i);
        }

        /*
         * @param finishDeleteInBeginningOfLinkedList return time finish
         * deleting 1000 elements on the beginning of LinkedList
         */
        LocalDateTime finishDeleteInBeginningOfLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the beginning of LinkedList
        System.out.println
                ("Delete 1000 new elements on the beginning of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startDeleteInBeginningOfLinkedList,
                finishDeleteInBeginningOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Deleting new 1000 elements on the middle -------");

        /*
         * @param startDeleteInMiddleOfArrayList return time start
         * deleting 1000 elements on the middle of ArrayList
         */
        LocalDateTime startDeleteInMiddleOfArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the middle of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(50000 + i);
        }

        /*
         * @param finishDeleteInMiddleOfArrayList return time finish
         * deleting 1000 elements on the middle of ArrayList
         */
        LocalDateTime finishDeleteInMiddleOfArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle of ArrayList
        System.out.println("Delete 1000 new elements on the middle of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startDeleteInMiddleOfArrayList,
                        finishDeleteInMiddleOfArrayList) + " Milliseconds");

        /*
         * @param startDeleteInMiddleOfLinkedList return time start
         * deleting 1000 elements on the middle of LinkedList
         */
        LocalDateTime startDeleteMiddleOfLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the middle of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(50000 + i);
        }

        /*
         * @param finishDeleteInMiddleOfLinkedList return time finish
         * deleting 1000 elements on the middle of LinkedList
         */
        LocalDateTime finishDeleteInMiddleOfLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle of LinkedList
        System.out.println
                ("Delete 1000 new elements on the middle of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startDeleteMiddleOfLinkedList,
                        finishDeleteInMiddleOfLinkedList) + " Milliseconds");

        System.out.println
                ("\n------- Deleting new 1000 elements on the end -------");

        /*
         * @param startDeleteInEndOfArrayList return time start
         * deleting 1000 elements on the end of ArrayList
         */
        LocalDateTime startDeleteInEndOfArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the end of ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(integersArray.size() - 1000 + i);
        }

        /*
         * @param finishDeleteInEndOfArrayList return time finish
         * deleting 1000 elements on the end of ArrayList
         */
        LocalDateTime finishDeleteEndOfArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the end of ArrayList
        System.out.println
                ("Delete 1000 new elements on the end of ArrayList needs: "
                + ChronoUnit.MILLIS.between(startDeleteInEndOfArrayList,
                        finishDeleteEndOfArrayList) + " Milliseconds");

        /*
         * @param startDeleteInEndOfLinkedList return time start
         * deleting 1000 elements on the end of LinkedList
         */
        LocalDateTime startDeleteInEndOfLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the end of LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 1000 + i);
        }

        /*
         * @param finishDeleteInEndOfLinkedList return time finish
         * deleting 1000 elements on the end of LinkedList
         */
        LocalDateTime finishDeleteInEndOfLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle of LinkedList
        System.out.println
                ("Delete 1000 new elements on the end of LinkedList needs: "
                + ChronoUnit.MILLIS.between(startDeleteInEndOfLinkedList,
                finishDeleteInEndOfLinkedList) + " Milliseconds");

        //-------------------------MyOutput---------------------------

        /*

                -------------- Lists Initializations --------------
        Initialization ArrayList needs: 52 Milliseconds
        Initialization LinkedList needs: 78 Milliseconds

        ----- Inserting new 1000 elements on the beginning -----
        Insert 1000 new elements on the beginning of ArrayList needs: 131 Milliseconds
        Insert 1000 new elements on the beginning of LinkedList needs: 15 Milliseconds

        ----- Inserting new 1000 elements on the middle -----
        Insert 1000 new elements on the middle of ArrayList needs: 89 Milliseconds
        Insert 1000 new elements on the middle of LinkedList needs: 649 Milliseconds

        ------- Inserting new 1000 elements on the end -------
        Insert 1000 new elements on the end of ArrayList needs: 1 Milliseconds
        Insert 1000 new elements on the end of LinkedList needs: 0 Milliseconds

        ------- Updating new 1000 elements on the beginning -------
        Update 1000 new elements on the beginning of ArrayList needs: 0 Milliseconds
        Update 1000 new elements on the beginning of LinkedList needs: 2 Milliseconds

        ------- Updating new 1000 elements on the middle -------
        Update 1000 new elements on the middle of ArrayList needs: 1 Milliseconds
        Update 1000 new elements on the middle of LinkedList needs: 335 Milliseconds

        ------- Updating new 1000 elements on the end -------
        Update 1000 new elements on the end of ArrayList needs: 1 Milliseconds
        Update 1000 new elements on the end of LinkedList needs: 2 Milliseconds

        ------- Deleting new 1000 elements on the beginning -------
        Delete 1000 new elements on the beginning of ArrayList needs: 49 Milliseconds
        Delete 1000 new elements on the beginning of LinkedList needs: 4 Milliseconds

        ------- Deleting new 1000 elements on the middle -------
        Delete 1000 new elements on the middle of ArrayList needs: 32 Milliseconds
        Delete 1000 new elements on the middle of LinkedList needs: 221 Milliseconds

        ------- Deleting new 1000 elements on the end -------
        Delete 1000 new elements on the end of ArrayList needs: 1 Milliseconds
        Delete 1000 new elements on the end of LinkedList needs: 2 Milliseconds

        */

    }
}
