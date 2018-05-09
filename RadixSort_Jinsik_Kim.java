// Jinsik Kim
// CS 5040
// Assignment 5
// RadixSort

import java.util.Scanner;
public class RadixSort_Jinsik_Kim
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] inputs = new int[6]; //create Array of size 6
      System.out.println("Enter six integers: ");
      for(int i = 0; i < inputs.length; i++) //input user input into inputs Array
      {
         int x = scan.nextInt(); //input read to x; x inserted to Array inputs
         inputs[i] = x;
      }
      System.out.print("Inputs array before sorting:\t"); //output initial array
      System.out.println(printArray(inputs) );
      Queue_Jinsik_Kim Q0 = new Queue_Jinsik_Kim(); //declare Queues for sorting extracted digits 0-9
      Queue_Jinsik_Kim Q1 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q2 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q3 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q4 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q5 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q6 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q7 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q8 = new Queue_Jinsik_Kim();
      Queue_Jinsik_Kim Q9 = new Queue_Jinsik_Kim();
      int max_digits = DigitCount(inputs); //find max digit count of array
      System.out.println("Inputs array has max digit count of " + max_digits); //trace an verify max digit count of array inputs
      int div = 1; //initial value used to extract digits; div *= 10 each loop
      for(int counter = 0; counter < max_digits; counter++) //repeat the enqueue + dequeue process, max_digits-times; 
      {
         System.out.println("RS enq/deq loop: " + counter + " starting..."); //trace outer loop #counter to max_digits
         for(int i = 0; i < inputs.length; i++) //loop through array
         {
            System.out.println("...RS enq loop: " + i + " starting..."); //trace enq loop #i to inputs.length
            int type = ExtractDigit(div, inputs[i]); //assign the extracted number to type, for switch()
            System.out.println("......from " + inputs[i] + " extracted digit: " + type + " using divisor: " + div); //trace ExtractDigit()
            switch(type) //enqueue array integers to Queues 0-9 based on extracted digit
            {
               case 0:
               {
                  Q0.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q0"); //trace enqueue process
                  break;
               }
               case 1:
               {
                  Q1.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q1");
                  break;
               }
               case 2:
               {
                  Q2.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q2");
                  break;
               }
               case 3:
               {
                  Q3.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q3");
                  break;
               }
               case 4:
               {
                  Q4.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q4");
                  break;
               }
               case 5:
               {
                  Q5.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q5");
                  break;
               }
               case 6:
               {
                  Q6.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q6");
                  break;
               }
               case 7:
               {
                  Q7.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q7");
                  break;
               }
               case 8:
               {
                  Q8.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q8");
                  break;
               }
               case 9:
               {
                  Q9.enqueue(inputs[i]);
                  System.out.println("......int: " + inputs[i] + " enqueued to Q9");
                  break;
               }
               default:
               {
                  System.out.println("Error");
                  break;
               }
            }
            System.out.println("...RS enq loop: " + i + " ending..."); //trace enq loop #i ending
         }
         for(int i = 0; i < inputs.length; i++) //dequeue process; dequeue from Q0-Q9; insert dequeue'd int back into array
         {
            System.out.println("...RS deq loop: " + i + " starting..."); //trace deq loop #i to inputs.length
            if(Q0.isEmpty() != true)
            {
               int temp = Q0.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q0 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q1.isEmpty() != true)
            {
               int temp = Q1.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q1 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q2.isEmpty() != true)
            {
               int temp = Q2.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q2 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q3.isEmpty() != true)
            {
               int temp = Q3.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q3 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q4.isEmpty() != true)
            {
               int temp = Q4.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q4 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q5.isEmpty() != true)
            {
               int temp = Q5.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q5 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q6.isEmpty() != true)
            {
               int temp = Q6.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q6 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q7.isEmpty() != true)
            {
               int temp = Q7.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q7 and inserted into inputs[" + i + "]"); //trace deq
            }
            else if(Q8.isEmpty() != true)
            {
               int temp = Q8.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q8 and inserted into inputs[" + i + "]"); //trace deq
            }
            else
            {
               int temp = Q9.dequeue(); //dequeued element stored in temp var
               inputs[i] = temp; //temp var stored in array[i]
               System.out.println("......int: " + temp + " was dequeued from Q9 and inserted into inputs[" + i + "]"); //trace deq
            }
            System.out.println("...RS deq loop: " + i + " ending...");
         }
         div *= 10; //extract digits of the next place for enqueueing on next loop
      }
      System.out.println("Inputs array after sorting:\t" + printArray(inputs) ); //output final sorted array
   }
   public static int DigitCount(int[] inputs) //method to find largest digit count in an array
   {
      int kmax = 0; //max digit count of all integers in the array
      for(int i = 0; i < inputs.length; i++)
      {
         int k = 0; //max digit count of current integer
         int digit = inputs[i]; //the result of integer division
         while(digit != 0) //find the digit count of current integer of array
         {
            digit = digit / 10;
            k++;
         }
         if(k > kmax) //use the highest digit count of all integers in array
            kmax = k; 
      }
      return kmax;
   }
   public static int ExtractDigit(int div, int number) //method to extract single digit from integers
   {
      int extract = number / div % 10; //first loop extracts one's digit; x / 1 % 10; second loop extracts ten's digit; x / 10 % 10;
      return extract;
   }
   public static String printArray(int[] yourArray) //print array method
   {
      String result = "";
      for(int i = 0; i < yourArray.length; i++)
      {
         result += yourArray[i] + " ";  
      }
      return result;
   }
}