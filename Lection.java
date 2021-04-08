package crashCourseSoftServe;

import java.util.*;
import java.util.stream.Collectors;

public class Lection {
    public static void main(String[] args) {

//        List<Student> list = new ArrayList<>();
//        list.add(new Student (44445,"Oks");
//
//        list.sort(new S);

//        int [] x = new int[10];
//        for (int i = 0; i < x.length; i++) {
//            Random rand = new Random();
//            x[i]= rand.nextInt(10);
//        }
//
//        Arrays.sort(x);
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i]+"  ");
//        }


//        int[] arr= new int[10];
//        for (int i = 0; i <10; i++) {
//            arr[i]=1;
//        }
//        System.out.println(arr);


//        List<Integer> l = new LinkedList<>();
//        l.add(10);
//        l.add(11);
//        l.add(12);
//        for (Integer i: l) {
//            System.out.println(i);
//        }

        List<String> l = Arrays.asList("a","b","c","d");
        //Iterator iterator = l.iterator();
        List<String> res = l.stream()
                .filter(el ->!(el.equals("a")||el.equals("c")))
                .map(el ->el.concat("hello"))
                .collect(Collectors.toList());

//        while(iterator.hasNext()){
//            String el = (String) iterator.next();
//            if(!(el.equals("a")||el.equals("c"))){
//                res.add(el);
//            }
//        }
        System.out.println(res);

//        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(8,1,4,12,14,10,1,5,3));
//        System.out.println(treeSet);
    }
}
