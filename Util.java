class Util<T extends Product> {
    public T min(T one, T two) {
        return one.compareTo(two) < 0 ? one : one.compareTo(two) > 0 ? two : one;
    }
}