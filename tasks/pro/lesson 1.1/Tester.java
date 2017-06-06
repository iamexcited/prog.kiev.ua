package tasks.pro.lesson_1_1

public class Tester {
    public static void test(Class<?> ... classes) throws Exception
    {
        for (Class<?> cls : classes) {
            
            System.out.println("Class name = " + cls.getName());

            Method[] methods = cls.getMethods();
            
            for (Method method : methods)
            {
                if (method.isAnnotationPresent(Test.class))
                {
                    System.out.println("Annotation present in method " + method.getName());;
                    Test test = method.getAnnotation(Test.class);

                    int mod = method.getModifiers();

                    if (Modifier.isStatic(mod)) {
                        
                        System.out.println("Method is static");
                        method.invoke(null, test.a(), test.b());
                    }
                    else {
                        System.out.println("Method is non-static");
                        Constructor<?> ctr = cls.getConstructor();
                        
                        Object obj = ctr.newInstance();
                        System.out.println("Class instance created");
                        method.invoke(obj, test.a(), test.b());
                    }
                }
            }
        }
    }
}
