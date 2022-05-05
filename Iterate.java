// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Iterate {
    public static void main(String[] args) {
        Map<String,Integer> rajan=new TreeMap<>();
        rajan.put("first",1);
        rajan.put("third",3);
        rajan.put("second",2);
      
        //Map.Entry
        for(Map.Entry<String,Integer> temp:rajan.entrySet()){
            System.out.println(temp.getKey()+temp.getValue());
        }
        
        //keySet(),values()
        for(String keys:rajan.keySet()){
            System.out.println(keys);
        }
         for(Integer values:rajan.values()){
            System.out.println(values);
        }
        
        
        
        
    }
}
