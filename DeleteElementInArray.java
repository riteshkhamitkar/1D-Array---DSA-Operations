public class SingleDimensionArray {
    int arr[] = null ; 

    public SingleDimensionArray(int sizeOfArray){
        arr = new  int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location]== Integer.MIN_VALUE){
            arr[location] = valueToBeInserted;
            System.out.println("Sucessfully inserted");    
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal 

    public void traverseArray(){
        try{
            for(int i =0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }catch(Exception e){
            System.out.println("Array No longer exists");
        }
         
    }

    // Search element in array
    public void searchInArray(int valueToSearch){
        for(int i = 0;i < arr.length; i++){
            if(arr[i]== valueToSearch){
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Delete element from array 

    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted Sucessfully");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");

        }
    }


    
}

/* class Main{
    public static void main(String[] args){
       SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1, 10);
        sda.insert(2,30);
        sda.insert(1,20);
        sda.insert(11, 23);

        sda.deleteValue(1);
        sda.deleteValue(11);

        sda.traverseArray();
    }
} */



// Name of the file should be SingleDimensionArray.java
