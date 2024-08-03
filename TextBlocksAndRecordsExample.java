public class TextBlocksAndRecordsExample {
    public static void main(String[] args) {
        // Using text blocks
        String htmlContent = """
            <html>
                <head>
                    <title>Text Blocks Example</title>
                </head>
                <body>
                    <h1>Hello, Text Blocks!</h1>
                    <p>This is an example of using text blocks in Java.</p>
                </body>
            </html>
            """;
        System.out.println(htmlContent);
        // Using records
        record Person(String name, int age) {}

        // Creating a record instance
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        // Accessing record components
        System.out.println("Person 1: Name - " + person1.name() + ", Age - " + person1.age());
        System.out.println("Person 2: Name - " + person2.name() + ", Age - " + person2.age());
    }}
