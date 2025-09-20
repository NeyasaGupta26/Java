class Box {
    private float width, height, depth;

   
     Box() {
     width = height = depth = 0;
    }

     Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    float getWidth() { return width; }
    void setWidth(float width) { this.width = width; }

    float getHeight() { return height; }
    void setHeight(float height) { this.height = height; }

    float getDepth() { return depth; }
    void setDepth(float depth) { this.depth = depth; }

    void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume of Box = " + volume);
    }
}