class Parent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}
interface Interface1 {
    void show1();
}
interface Interface2 {
    void show2();
}
class Child extends Parent implements Interface1, Interface2 {
    public void show1() {
        System.out.println("Interface1 method implemented.");
    }

    public void show2() {
        System.out.println("Interface2 method implemented.");
    }

    void displayChild() {
        System.out.println("This is the child class extending a class and implementing interfaces.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayParent();
        obj.displayChild();
        obj.show1();
        obj.show2();
        System.out.println("Neyasa Gupta 24csu280");
    }
}
