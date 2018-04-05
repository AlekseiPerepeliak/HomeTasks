public class ClassA {

    public void getEvenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 & i != 0) {
                System.out.println(i);
            }
        }

    }

    public void tryCatchFunctionality() {
        int[] array = {3, 1, 0, 2};
        int devidedNumber = 100;
        for (int i = 0; i <= array.length; i++) {
            try {
                float n = devidedNumber / array[i];
                System.out.println(n);
            } catch (ArithmeticException zeroDivision) {
                System.out.println("100 is divided by " + array[i] + "Division by zero is not allowed!");
            } catch (ArrayIndexOutOfBoundsException indexOutOfB){
                System.out.println("ArrayIndexOutOfBoundsException");
            }

        }

    }
}