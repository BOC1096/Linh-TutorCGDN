package B11_DSA_StackQueue.BT1_DemSoLanXuatHienCuaTuTrongMang;

import java.util.*;

public class CountChar {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sn.nextLine();
        s=s.toLowerCase();
        List<String> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            arr.add(String.valueOf(s.charAt(i)));
        }
        Map<String,Integer> map=new TreeMap<>();
        for(String x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}
