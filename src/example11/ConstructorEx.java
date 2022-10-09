package example11;

class A {
    int value;
}

class B {
    int value;

//    public B(){
//    }
    public B(int value){
        this.value = value;
    }
}

public class ConstructorEx {
    public static void main(String[] args) {

        A a = new A();
        B b = new B(100);
    }
}
