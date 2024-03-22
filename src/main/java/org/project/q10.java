package org.project;
//write program to print out duplicate values of arrey of string
public class q10 {
    public static void main(String[] args) {
        String [] word={"Hello","How","Are","Hello","You"};

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if(word[i].equals(word[j]) && (i!=j)){
                    System.out.println("The duplicate word is "+word[j]);
                }
            }
        }
    }
}
