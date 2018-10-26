package challenge;

public class calculator {

    public int Plus(int x, int Y) {
        return x + Y;
    }

    public int plus_2(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x != y && x > y) {
            return x - y;
        } else if (x != y && x < y) {
            return y - x;
        } else if (x == y || x > y) {
            return 0;
        } else if (x == y && x > y) {
            return 0;
        }

        return Math.abs(x - y);
    }

    public int convertInteger(String a) {
        try {
            return Integer.parseInt(a);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return -1;
    }
    public long convertLong(String a) {
        try {
            return Long.parseLong(a);
        } catch (Throwable e) {
            e.printStackTrace();
        }
//        return 0;
        return -1;
    }
}
