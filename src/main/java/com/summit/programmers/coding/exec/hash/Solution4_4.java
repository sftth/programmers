package com.summit.programmers.coding.exec.hash;

import java.util.*;

public class Solution4_4 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {} ;

        //2. genre map and sorting
        Map<String, Integer> gmap = new HashMap<>();

        for(int i = 0 ; i < genres.length ; i++) {
            Integer play = gmap.get(genres[i]);
            if(play == null) {
                gmap.put(genres[i], plays[i]);
            } else {
                gmap.put(genres[i], play + plays[i]);
            }
        }

        Iterator it = sortByValue(gmap).iterator();


        while (it.hasNext()) {
            String key = (String)it.next();

            Map<Integer, Integer> answermap = new HashMap<>();

            for(int i = 0 ; i < genres.length ; i++) {
                if(genres[i].equals(key)){
                    answermap.put(i,plays[i]);
                }
            }

            Iterator ait = sortByValue(answermap).iterator();
            int j = 0;
            while (ait.hasNext() && j < 2) {
                answer = addElement(answer, (Integer) ait.next());
                j++;
            }
        }


        return answer;
    }

    public List sortByValue(Map map) {
        List<String> list = new ArrayList();

        list.addAll(map.keySet());


        Collections.sort(list,new Comparator() {

            public int compare(Object o1,Object o2) {

                Object v1 = map.get(o1);

                Object v2 = map.get(o2);

                return ((Comparable) v2).compareTo(v1);

            }

        });


//        Collections.reverse(list); // 주석시 오름차순

        return list;
    }

    public int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return  a;
    }

}
