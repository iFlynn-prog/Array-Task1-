public class Task1 {
    public static void main (String[] args) {

            int[] numbers = new int[] {-4, -3, -2, -1, 0, 1, 2, 3, 4};

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("{" + numbers[i] + "}" + " ");
        }

        System.out.println();

            int j = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 0)
                j = j + 1;
            System.out.print("|" + numbers[i] + "|" + "");
        }

        System.out.println();
        System.out.print("Kolichestvo polozhitelnih elementov" + " >> " + j + " <<");
        System.out.println();

        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;

        }

            int[] reverse = new int[10];
        for (j = 0; j < reverse.length -1; j++)
        {
           reverse[j] = numbers[j];
           System.out.print(reverse[j]);
        }



   }
}