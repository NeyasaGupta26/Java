abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double m1, m2, m3;
    A(double m1, double m2, double m3) {
        this.m1 = m1; this.m2 = m2; this.m3 = m3;
    }
    double getPercentage() {
        return (m1 + m2 + m3) / 3;
    }
}

class B extends Marks {
    double m1, m2, m3, m4;
    B(double m1, double m2, double m3, double m4) {
        this.m1 = m1; this.m2 = m2; this.m3 = m3; this.m4 = m4;
    }
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4;
    }
}

class MainMarks {
    public static void main(String[] args) {
        A a = new A(80, 90, 70);
        B b = new B(85, 75, 95, 80);
        System.out.println("Student A Percentage: " + a.getPercentage());
        System.out.println("Student B Percentage: " + b.getPercentage());
        System.out.println("Neyasa Gupta 24csu280");
    }
}