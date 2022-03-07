import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SpellChecker {
    public static void main(String[] args) {

    HashSet<String> set = new HashSet<String>();
    
    try{
        Scanner filein = new Scanner(new File("/Users/user/Desktop/Javafile/spellCheck/words.txt"));
        while (filein.hasNext()) {
        String tk = filein.next();
        tk=tk.toLowerCase();
        set.add(tk); // do something with the token
    }
    System.out.println(set.size());
    System.out.println(set.contains("apple"));
    }catch(FileNotFoundException e){
    };

    HashSet<String> newSet = new HashSet<String>();

    try{
        Scanner scanner = new Scanner(System.in);
        String userfile = scanner.next();
    
        Scanner in = new Scanner(new File(userfile));
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {
            String ntk = in.next();
            ntk=ntk.toLowerCase();
            newSet.add(ntk); 
        }    
        HashSet<String> removeSet = new HashSet<String>();

        for(String e : newSet){
            if (!(set.contains(e))){
                removeSet.add(e);
                
            }
           
        
    }
    
        

    System.out.println(newSet.size());
    System.out.println(removeSet);   
    newSet.removeAll(removeSet);
    System.out.println(newSet);   
    scanner.close();
    }catch(FileNotFoundException e){
    };
   

    

    
}
}
