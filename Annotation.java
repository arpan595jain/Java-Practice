import java.lang.annotation.*;
// Define a marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {}
// Define a single-valued annotation
@Retention(RetentionPolicy.RUNTIME)
@interface SingleValueAnnotation {
    String value();}
// Define a multi-valued annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MultiValueAnnotation {
    String author();
    String date();}
// Applying annotations
@MarkerAnnotation
@SingleValueAnnotation("Example")
@MultiValueAnnotation(author = "John Doe", date = "2024-03-30")
public class AnnotationExample {
    @MarkerAnnotation
    public void method1() {
   } @SingleValueAnnotation("Method 2")
    public void method2() { }
    @MultiValueAnnotation(author = "Jane Doe", date = "2024-03-30")
    public void method3() { }
    public static void main(String[] args) {
        // Retrieving annotations
        AnnotationExample example = new AnnotationExample();
        Class<?> clazz = example.getClass();
        // Retrieve class-level annotations
        Annotation[] classAnnotations = clazz.getAnnotations();
        System.out.println("Class-Level Annotations:");
        for (Annotation annotation : classAnnotations) {
            System.out.println(annotation);   }
        // Retrieve method-level annotations
        try {
            System.out.println("\nMethod-Level Annotations:");
            example.getClass().getMethod("method1").getAnnotations();
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                Annotation[] methodAnnotations = method.getAnnotations();
                for (Annotation annotation : methodAnnotations) {
                    System.out.println(annotation);
                }}
        } catch (NoSuchMethodException e) {
            e.printStackTrace();  }  }
}
