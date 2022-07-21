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


    
}

/*class Main{
    public static void main(String[] args){
       SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1, 10);
        sda.insert(2,30);
        sda.insert(1,20);
        sda.insert(11, 23);

        sda.searchInArray(30);
    }
} */
 
// Name of file should be SingleDimensionArray.java 

 
