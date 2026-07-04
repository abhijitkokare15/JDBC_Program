import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. Defining the Custom Annotation
@Target(ElementType.TYPE) // Specifies that this annotation can be applied to Classes/Interfaces
@Retention(RetentionPolicy.RUNTIME) // Ensures the annotation is available at runtime for Reflection
@interface SmartPhone {
    String os() default "Symbian";
    int version() default 1;
}

// 2. Applying the Custom Annotation to a Class
@SmartPhone(os = "Android", version = 6)
class NokiaASeries {
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

// 3. Main class to read the Annotation using Reflection
public class AnnotationDemo {
    public static void main(String[] args) {
        
        NokiaASeries obj = new NokiaASeries("Fire", 5);
        
        // Fetching the class object of the instance
        Class<?> c = obj.getClass();
        
        // Getting the specific annotation from the class
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        
        // Printing the values inside the annotation
        System.out.println("OS: " + s.os());
        System.out.println("Version: " + s.version());
    }
}