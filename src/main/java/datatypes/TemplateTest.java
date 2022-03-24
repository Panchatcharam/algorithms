package datatypes;

public class TemplateTest {
    public static void main(String[] args) {
        TemplateTest templateTest = new TemplateTest();
        templateTest.PrintData("Hello", "Panch");
        templateTest.PrintData(1000, 2000);
    }

    public <T> void PrintData(T one , T two) {
        System.out.println("one = " + one + " two = " + two);
    }

}
