public class NumberInfo {
    public void viewNum(Integer i) { // 1
        System.out.printf("Integer=%d%n", i);
    }
    public void viewNum(int i) { // 2
        System.out.printf("int=%d%n", i);
    }
    public void viewNum(Float f) { // 3
        System.out.printf("Float=%.4f%n", f);
    }
    public void viewNum(Number n) { // 4
        System.out.println("Number=" + n);
    }

    public static void main(String[] args) {
        NumberInfo info = new NumberInfo();
        Number[ ] num = {new Integer(7), 71, 3.14f, 7.2 };
        for (Number n : num) {
            info.viewNum(n);
        }
        info.viewNum(new Integer(8));
        info.viewNum(81);
        info.viewNum(4.14f);
        info.viewNum(8.2);
    }
}
