package data_structure;

import java.util.BitSet;

public class Bitset {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for (int i = 0; i<=16; i++){
            if ((i%2) == 0) bits1.set(i);
            if ((i%5) != 0) bits2.set(i);
        }

        System.out.println("bits1中的初始化模式");
        System.out.println(bits1);
        System.out.println("\nbits2中的初始化模式");
        System.out.println(bits2);

        //并
        bits2.and(bits1);
        System.out.println("\nbits2 或 bits1");
        System.out.println(bits2);

        //且
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1");
        System.out.println(bits2);
    }
}
