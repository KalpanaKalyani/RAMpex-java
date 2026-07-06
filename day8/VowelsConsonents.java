package day8;

public class VowelsConsonents {
    public static void main(String[] args){
        String s="hello world";
        String lower=s.toLowerCase();
        int vowels=0;
        int cons=0;
        for(char n:lower.toCharArray()){
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
                vowels++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vowels);
        System.out.println(cons);
    }
}
