import java.util.HashMap;

public class Trie {
    class Node{
        char ch;
        HashMap<Character,Node>child= new HashMap<>();
        boolean isterminal;


    }
    private Node root;
    public Trie(){
        root= new Node();
        root.ch='*';
    }

    public void insert(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);


            }
            else{
                Node nn= new Node();
                curr.child.put(ch,nn);
                curr=nn;
            }
        }
        curr.isterminal=true;
    }
    public boolean search(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);


            }
            else{
                return  false;
            }
        }
        return curr.isterminal;
    }
    public boolean startsWith(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);


            }
            else{
                return  false;
            }
        }
        return true;
    }

}
