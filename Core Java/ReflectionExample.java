import java.lang.reflect.Method;

class ReflectMe {
    public void greet() {
        System.out.println("Hello from ReflectMe!");
    }

    public void sayBye() {
        System.out.println("Goodbye from ReflectMe!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectMe");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Invoking: " + method.getName());
            method.invoke(obj);
        }
    }
}
