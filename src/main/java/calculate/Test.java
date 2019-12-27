package calculate;

public class Test {
    public static void main(String[] args) {
        double[][] a = new double[][]{
                {88,3},
                {88,3},
                {95,1},
                {86,4},
                {89,2},
                {93,2},
                {93,2},
                {93,3},
                {86,3},
                {99,2},
                {85,2},
                {94,2},
                {92,3},
                {91,2}
        };

        for (double[] d : a) {
            for (double i : d) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        double sum = 0;
        double count = 0;
        for (double[] i : a) {
            double temp = 1;
            for (double j : i) {
               temp *= j;
            }
            count += i[1];
            sum += temp;
        }
        System.out.println("学分*分数相加总和:" + sum  + "\t总学分："+count);

        double result = sum / count;
        System.out.println("加权平均数后为:" + result);

    }
}
