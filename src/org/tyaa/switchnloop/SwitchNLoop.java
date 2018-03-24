/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.switchnloop;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class SwitchNLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int x = 0;
        if (x == 1) {
           //... 
        } else if (true){
            //2
        } else {
            //...
        }*/
        
        /*String s = "";
        
        switch(s){
            case "asd":{
                //...
                break;
            }
            case "":{
                //...
                break;
            }
        }*/
        
        Scanner sc = new Scanner(System.in);
        do {
        //1. Получаем число
        System.out.println("Введите целое положительное число и нажмите ВВОД:");
        
        int number = 0;
        
        String numberString = sc.nextLine();
        
        try{
            number = Integer.valueOf(numberString);
        }catch(Exception ex) {
            if (numberString.equals("exit")){
                break;
            }
            
            System.out.println("Введено не число!");
            continue;
        }
        
        if (number < 0) {
            System.out.println("Неверное число!");
    } else {
        
        //2. Проверяем введенное число
        int number10 = number % 10;
        int number100 = number % 100;
        
        if (number100 >= 11 && number100 <= 14) {
        //if (number100 == 11 || number100 == 12 || number100 == 13 || number100 == 14) {
            System.out.println("ворон");
        } else {
            //test
            //System.out.println("number10 = " + number10);

            //3. Выбираем слово с правильным окончанием
            switch(number10){
                case 0:{
                    System.out.println("ворон");
                    break;
                }
                case 1:{
                    System.out.println("ворона");
                    break;
                }
                case 2:{
                }
                case 3:{

                }
                case 4:{
                    System.out.println("вороны");
                    break;
                }
                case 5:{

                }
                case 6:{

                }
                case 7:{

                }
                case 8:{

                }
                case 9:{
                    System.out.println("ворон");
                    break;
                }
                default:{
                
                    System.out.println("Неверное число!");
                }
            }
        }    
        }
    } while (true);
} 
}
    
        
    
    
    


