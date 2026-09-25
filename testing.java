import java.util.ArrayList;
import java.util.List;

public class testing {
    public static void main(String args[]){
        // int[] arr = { 10, 20, 30 };

        // System.out.println(arr.length);
        // System.out.println(arr);

        // System.out.println(arr[2]);

        // int[] arr = new int[3];

        // try {
        // System.out.println(arr[5]);
        // } catch (Exception e){
        //     System.out.println("cannot access memory module allocated block.");
        // }

        // int[] a = {1 , 2, 3};   // addresses are being copied.
        // int[] b = a;
        // b[0] = 99;
        // System.out.println(a[0]);

        // int[] arr = new int[2];
        // int size = 0;
        // arr[size++] = 1;
        // arr[size++] = 2;
        // System.out.println(arr.length);

        // int[] bigger = new int[arr.length * 2];
        // System.arraycopy(arr, 0, bigger, 0, arr.length);
        // arr = bigger;
        // arr[size++] = 3;
        // System.out.println(arr.length);

        // int[] arr = new int[10];
        // int size = 3;
        // System.out.println("Capacity: " + arr.length + ", used " + size);


    }
    // static int[] append(int[] arr, int size, int value){
    //         if(size == arr.length){
    //             int[] bigger = new int[arr.length * 2];
    //             System.arraycopy(arr, 0, bigger, 0, size);
    //             arr = bigger;
    //         }
    //         arr[size] = value;
    //         return arr;
    //     }

    static int[] shrinkIfNeeded(int[] arr, int size){
        if(size < arr.length / 4){
            int[] smaller = new int[arr.length / 2];
            System.arraycopy(arr, 0, smaller, 0, size);
            return smaller;
        }
        return arr;
    }

}

class Shopping {
    static int[] shrinkIfNeeded(int[] cart, int size){
        if(size < cart.length / 4){
            int[] smaller = new int[cart.length / 2];
            System.arraycopy(cart, 0, smaller, 0, size);
            smaller = cart;
            return smaller;
            
        }
        return cart;
    }
}

class expand {
    static int[] scaleIfNeeded(int[] arr, int size){
        if(size < arr.length / 2){
            int[] bigger = new int[arr.length * 2];
            System.arraycopy(bigger, 0, arr, 0, size);
            bigger = arr;

            return bigger;
        }
        return arr;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.remove("Apple");

        System.out.println(fruits);

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());

        for(int i = 0; i < 15; i++){
            nums.add(i);
        }

        for(int j= 0; j < 4; j++){
            nums.remove(j);
        }

        System.out.println(nums.size());

        ArrayList<String> names = new ArrayList<>(List.of("Ali","Sara","Murtaza"));

        System.out.println(names.get(1));

        names.set(1, "Zara");
        System.out.println(names);

        ArrayList<Integer> newNums = new ArrayList<>(5);

        System.out.println(newNums.size());

        for(int i = 0; i < 10; i++){
            newNums.add(i);
        }

        System.out.println(newNums.size());
    }
    }

