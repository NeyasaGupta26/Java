interface X {
    void methodX();
}

interface Y {
    void methodY();
}
interface Z extends X, Y {
    void methodZ();
}

class Example implements Z {
    public void methodX() {
        System.out.println("Method from interface X");
    }

    public void methodY() {
        System.out.println("Method from interface Y");
    }

    public void methodZ() {
        System.out.println("Method from interface Z extending X and Y");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
        System.out.println("Neyasa Gupta 24csu280");
    }
}
