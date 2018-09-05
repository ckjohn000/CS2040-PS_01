public class abc123 {

    static void test() {
        MoveToFrontArrayList testList = new MoveToFrontArrayList(5);


            testList.add(0);
            testList.add(100);
            testList.add(1000);
            testList.add(13);
            testList.add(4);

            boolean result = testList.search(2500);
            System.out.println(result);
            //String expected1 = "1500 3 15 25 1000";
            System.out.println(testList);


    }

    public static void main(String args[]) {
        test();
    }
}