package com.vishal.CollectionsFramework.ComparableAndComparator;

import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        Animal a1=new Animal(23,"bob",100);
        Animal a2=new Animal(23,"adam",200);
        Animal a3=new Animal(23,"bruto",10);

        List<Animal> list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

//        System.out.println(list);    //   by default calling (to string) method
//        list.sort();
//        Collections.sort(list);
//        System.out.println(list);

        //   sort based on  custom comparator
//       Collections.sort(list,new MyCustomComparator());
//        System.out.println(list);

        //  sorting based on  using anonymous class
//       Collections.sort(list,new Comparator<Animal>(){
//           @Override
//           public int compare(Animal o1, Animal o2) {
//               return o1.name.compareTo(o2.name);
//           }
//       });

       //   using lambda expression
//        Collections.sort(list,( o1, o2)-> o1.name.compareTo(o2.name));
//        Collections.sort(list, Comparator.comparing(o -> o.name));
//        System.out.println(list);


        //   sort 2d array
        int[][] arr={
                {1,3,2},
                {1,3,1},
                {1,3,8}
        };
        Arrays.sort(arr,(a,b)->{
            if (a[0]==b[0]){
                if(a[1]==b[1]){
                    return a[2]-b[2];
                }
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
//        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]).thenComparing(a->a[1]).thenComparing(a->a[2]));
        for (int[] num: arr
             ) {
            for (int el: num
                 ) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
