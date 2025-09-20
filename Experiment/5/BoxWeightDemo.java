class BoxWeightDemo {
    public static void main(String[] args) {
        
        BoxWeight bw1 = new BoxWeight(10, 5, 2, 20);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight();
        bw3.setWidth(4);
        bw3.setHeight(5);
        bw3.setDepth(6);
        bw3.setWeight(15);
        bw3.displayVolume();
        bw3.displayWeight();
        System.out.println("Neyasa Gupta 24csu280");
    }
}