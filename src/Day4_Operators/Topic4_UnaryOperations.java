package Day4_Operators;

public class Topic4_UnaryOperations {

    public static void main(String[] args) {
        // (+) does not have any effect on the value // 100 , +100, -70, +-70

        int anum = +900;
        //anum=+anum;
        System.out.println("the value of anum: "+anum);

        int anum2 = -9000;
        anum2=+anum2;
        System.out.println("the value of anum2: "+anum2);

        // (-) converts to opposite sign

        int anum3 = -788;
        anum3 = -anum3;
        System.out.println("the anum3: "+anum3);

        int anum4 = 345;
        anum4 = -anum4;
        System.out.println("the value of anum4: "+anum4);

        // (++) increase by one
        int anum5 = 94;
        anum5++; // anum5 = anum5+1;
        System.out.println("the anum5: "+anum5);
        anum5++;
        System.out.println("the new anum5: "+anum5);
        ++anum5;
        System.out.println("the new value: "+anum5);

        // (--) decrease by 1

        int anum6 = 36;
        anum6--; // anum6 = anum6-1;
        System.out.println("the anum6 value: "+anum6);
        --anum6;
        System.out.println("the new vakue of anum6: "+anum6);

        // anum6 =anum6-10; anum6-=10


    }
}
