package homework21;

public class LogicalOperationTable {
    public LogicalOperationTable() {
    }

    public static void main(String[] args) {
        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
        boolean P = false;
        boolean Q = false;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        P = false;
        Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        P = true;
        Q = false;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        P = true;
        Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
    }
}