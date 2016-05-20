class Util {
    public static Product min(Product one, Product two) {
        return one.compareTo(two) < 0 ? one : one.compareTo(two) > 0 ? two : one;
    }
}