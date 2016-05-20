class Product implements Comparable<Product> {

    private int price;

    @Override
    public int compareTo(Product that) {
        return this.price - that.getPrice();
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String toString() { return "Product{price=" + price + '}'; }
}

class Phone extends Product{

    private int memory;

    public int compareTo(Phone that) {
            return this.memory - that.getMemory();
    }

    public int getMemory() { return memory; }

    public void setMemory(int memory) { this.memory = memory; }

    public String toString() { return "Phone{memory=" + memory + '}'; }
}

class Camera extends Product{

    private int megaPixels;

    public int compareTo(Camera that) {
            return this.megaPixels - that.getMegaPixels();
    }

    public int getMegaPixels() { return megaPixels; }

    public void setMegaPixels(int megaPixels) { this.megaPixels = megaPixels; }

    public String toString() { return "Camera{megaPixels=" + megaPixels + '}'; }
}

