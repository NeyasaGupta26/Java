class BoxWeight extends Box {
    private float weight;

    BoxWeight() {
        super();
        this.weight = 0;
    }

    BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth); 
        this.weight = weight;
    }

    BoxWeight(BoxWeight bw) {
        super(bw); 
        this.weight = bw.weight;
    }

    float getWeight() { return weight; }
    void setWeight(float weight) { this.weight = weight; }

    void displayWeight() {
        System.out.println("Weight of Box = " + weight);
    }
}