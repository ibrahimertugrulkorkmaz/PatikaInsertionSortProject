public class PatInsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {22,27,16,2,18,6};    
        System.out.println("Insertion Sort Siralamasi Yapilmadan Once");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);// Array'i sortladigimiz kisim    
           
        System.out.println("Insertion Sort Siralamasi Yapildiktan Sonra");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    