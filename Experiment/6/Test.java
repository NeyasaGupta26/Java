interface A {
    void methodA();
}

interface B extends A {  
    void methodB();
}

class Test implements B {
    public void methodA() {
        System.out.println("Method from interface A");
    }

    public void methodB() {
        System.out.println("Method from interface B");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.methodA();
        obj.methodB();
        System.out.println("Neyasa Gupta 24csu280");
    }
}
