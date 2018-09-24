/*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

/**
 *
 * @author lkhan
 */
public class Class6 {
    
    public static void main(String[] args) {
        //3 ways you can declare a variable as an array
        //1) This method lets you declare both arrays and single variables in online
        int temp[], a, b;
        
        //2) This method lets you declare multiple variables that are all arrays.
        int[] temp2, temp3, temp4;
        
        //3) This ia direct declaration of an array and its values. 
        int anotherWay[] = {1, 2, 3, 4, 5};

        //To insert values in to an array, first we must establish the boundaries of the array.
        
        temp = new int[5];//lets let jdk know that we are creating an array of length 5.
        //However the lower boundary is 0 and Upper boundary is 4. 0 - 4 is actually has a length of 5.
        temp[2] = 5;
        temp[3] = 6;
        temp[4] = 2;
        temp[1] = 0;
        temp[0] = -1;
        
        //The following exercise lets us see before and after of array manipulation. 
        printArray(temp);
        temp[1] = temp[3] * temp[4];
        printArray(temp);
        
        temp[3] = temp[1] - temp[2] - 1;
        printArray(temp);

        temp[4] = temp[2] - temp[3];
        printArray(temp);

        temp[3] = (temp[3] - temp[2]) * temp[0];
        printArray(temp);
                
        //Lets understand the mechanism behind copying arrays.
        System.out.println("We are setting temp2 equal to temp");
        temp2 = temp;
        System.out.print("Temp2 looks to be the same as temp: ");
        printArray(temp2);
        System.out.println("Test: Lets manipulate temp[1] and see if it transverse in to temp2");
        temp[1] = 100;
        System.out.print("This is temp: ");
        printArray(temp);
        System.out.print("This is temp2: ");
        printArray(temp2);
        //Looks like simply setting two array variable equal to eachother doesn't copy the values in another
        //Instead it just copies the memory address of the values of the first array.
        //So if you change the values of the first variables you will see that chanage in the second variable because the underlying values are the same.
        
        
        System.out.println("The same exercise as above but this time with copyArray method");
        //the line below ensures that temp2 is of the same length as temp
        temp2 = new int[temp.length];        
        System.out.print("temp2: ");
        printArray(temp2);
        System.out.println("Copying temp in to temp2 using the copyArray method");
        copyArray(temp, temp2);
        System.out.print("temp2: ");
        printArray(temp2);
        System.out.println("Test: Modifying temp[1]. Check if caries over to temp2");
        temp[1] = 50;
        System.out.print("temp: ");
        printArray(temp);
        System.out.print("temp2: ");
        printArray(temp2);
        //Looks like we now have a way to copy arry values from one variable to antother. 
        //But is there built in functions to do something like this?
    }
    
    //This is helper method to print an array horizontally
    public static void printArray(int temp[]){
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+",");
        }
        System.out.println("");
    }
    
    //Copying from a to b
    public static void copyArray(int a[],int[] b){
        for(int i = 0;i < a.length;i++){
            b[i]=a[i];
        }
    }
}
