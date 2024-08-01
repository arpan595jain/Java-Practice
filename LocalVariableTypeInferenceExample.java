public class LocalVariableTypeInferenceExample {
    public static void main(String[] args) {
        // Before Java 10
        String messageBeforeJava10 = "Hello, Java!";
        System.out.println(messageBeforeJava10);
        // Java 10 and later with var
        var messageJava10AndLater = "Hello, Java 10 and later!";
        System.out.println(messageJava10AndLater);
        // var with arrays
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var number : numbers) {
            System.out.print(number + " ");}
        System.out.println();
        // var with generics
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        for (var item : list) {
         System.out.print(item + " "); }
        System.out.println();
        // var with lambda expressions
        var runnable = (Runnable) () -> System.out.println("Running...");
        runnable.run();}}
