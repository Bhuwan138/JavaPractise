package com.Other.Polymorfizm.Greating;
public class UseLanguage {
    public static void main (String[] args) {
        Language l = new Language();
        l.greating();
        l = new English();
        l.greating();
        l = new Nepali();
        l.greating();
        l = new Spanish();
        l.greating();
        l = new German();
        l.greating();

    }
}


















//class Language {
//    public void greating(){
//        System.out.println("Good morning everyone, in Langauage Class");
//    }
//}
//class Spanish extends Language{
//    public void greating(){
//        System.out.println("Buenos dias a todos, in Spanish Language");
//    }
//}
//class Nepali extends Language{
//    public void greating(){
//        System.out.println("सबैलाइ शुभप्रभात, in Nepali Language");
//    }
//}
//class German extends Language{
//    public void greating(){
//        System.out.println("Guten Morgen zusammen, in German Language");
//    }
//}
//class English extends Language{
//    public void greating(){
//        System.out.println("Good morning everyone, in English Language");
//    }
//}
//public class UseLanguage {
//    public static void main (String[] args) {
//        Language l = new English();
//        l.greating();
//        l = new Nepali();
//        l.greating();
//        l = new Spanish();
//        l.greating();
//        l = new German();
//        l.greating();
//    }
//}
