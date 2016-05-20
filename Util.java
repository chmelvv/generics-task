class Util {
    public static Product min(Product one, Product two) {
        return one.compareTo(two) < 0 ? one : one.compareTo(two) > 0 ? two : one;
    }

    public static Camera min(Camera one, Camera two) {
        return one.compareTo(two) < 0 ? one : one.compareTo(two) > 0 ? two : one;
    }

    public static Phone min(Phone one, Phone two) {
        return one.compareTo(two) < 0 ? one : one.compareTo(two) > 0 ? two : one;
    }
}