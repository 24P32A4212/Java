class Overload {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(5.5, 4.5));
    }
}
