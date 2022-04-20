public class Test {
    public static void main(String[] args) {
        CustomArrayList firstArray = new CustomArrayList();
        CustomArrayList secondArray = new CustomArrayList();

        for (int i = 0; i < 25; i++) {
            firstArray.add(String.valueOf(i + 1));
            System.out.print(firstArray.get(i) + " ");
        }


        for (int i = 0; i < 15; i++) {
            secondArray.add(String.valueOf(i + 1));
            System.out.print(secondArray.get(i) + " ");
        }

        System.out.println("\n"+secondArray);
        secondArray.remove(5);
        System.out.println("\n"+secondArray);

    }
}
