public class Test {
    public static void main(String[] args) {
        CustomArrayList firstArray = new CustomArrayList();
        CustomArrayList secondArray = new CustomArrayList();

        for (int i = 0; i < 25; i++) {
            firstArray.add(String.valueOf(i + 1));
        }
        System.out.println("\n1-массив: " + firstArray);
        System.out.println("\n---------------------");

        for (int i = 0; i < 12; i++) {
            secondArray.add(String.valueOf(i + 1));
        }
        System.out.println("\n2-массив: " + secondArray);
        firstArray.addAll(secondArray);
        System.out.println("\nмассив после метода addAll(): " + firstArray);
        System.out.println("удаляем индекс: "+firstArray.get(3));
        firstArray.remove(3);
        System.out.println("вызываем удаленный индекс: "+firstArray.get(3));
        System.out.println("\nмассив после метода remove: " + firstArray);

    }
}
