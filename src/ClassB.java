public class ClassB {
    ClassA bFromA = new ClassA();

    public void getEvenNumbersClassB() {
        bFromA.getEvenNumbers();
    }

    ClassC bFromC = new ClassC();

    public void getterSetterMethod() {
        bFromC.setGlobalVariable("Text");
        String t = bFromC.getGlobalVariable();
        System.out.println("variable is : " + t);
    }
}
