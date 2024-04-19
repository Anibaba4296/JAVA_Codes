import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        arr.add(4);
        System.out.println(arr);
        arr.add(1,50);
        System.out.println(arr);

        arr2.add(-1);
        arr2.add(10);
        System.out.println(arr2);

        arr.addAll(arr2);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);
        arr.remove(Integer.valueOf(4));
        System.out.println(arr);

        arr.clear();
        System.out.println(arr);

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);

        arr.set(2,300);
        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
//            System.out.print(arr[i]); --> error
        }
        System.out.println();
//        for each loop
        for(Integer ele:arr){
            System.out.print(ele+" -- ");
        }

    }
}
