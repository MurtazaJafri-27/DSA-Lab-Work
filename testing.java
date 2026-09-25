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