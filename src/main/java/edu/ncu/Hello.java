package edu.ncu;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        new Person();   //在記憶體中將類別生出來，被生出來的這個東西被稱之為物件。
//        new Person().hello();   //hello()是Person()物件裡的方法
//        Person p = new Person(79.08f,1.74f);    //為了重複使用，去產生一個 p 物件來儲存 Person() 物件。
//        Person p = new Person();
        Person p = new Person("Teddy",79.08f,174.0f);
        p.hello();
//--------------------- tutorial_2_4 --------------------------
//        int a = 19;
        p.weight = 79.08f;
        p.height = 1.74f;
        System.out.println(p.bmi());
    }
}
