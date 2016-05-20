class Product implements Comparable{

    private int price;

    @Override
    public int compareTo(Object that) {
        if (that instanceof Product) {
            Product thatProduct = (Product) that;
            return this.price - thatProduct.getPrice();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String toString() { return "Product{price=" + price + '}'; }
}

class Phone extends Product implements Comparable {

    private int memory;

    @Override
    public int compareTo(Object that) {
        if (that instanceof Phone) {
            Phone thatProduct = (Phone) that;
            return this.memory - thatProduct.getMemory();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMemory() { return memory; }

    public void setMemory(int memory) { this.memory = memory; }

    public String toString() { return "Phone{memory=" + memory + '}'; }
}

class Camera extends Product implements Comparable {

    private int megaPixels;

    @Override
    public int compareTo(Object that) {
        if (that instanceof Camera) {
            Camera thatProduct = (Camera) that;
            return this.megaPixels - thatProduct.getMegaPixels();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMegaPixels() { return megaPixels; }

    public void setMegaPixels(int megaPixels) { this.megaPixels = megaPixels; }

    public String toString() { return "Camera{megaPixels=" + megaPixels + '}'; }
}

