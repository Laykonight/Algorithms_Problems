package Design_Patterns;

/*
Question
Write down 5 different implementations of the Singleton pattern in Java:

• Lazy initialized but not thread-safe.
• Thread-safe but not lazy initialized.
• Thread-safe and lazy initialized using double-checked locking.
• Thread-safe and lazy initialized using the holder idiom.
• Enum Singleton (with a use case example).
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//-------------------------------------------------------------
// Lazy initialized but not thread-safe.
class A{
    private static A obj = null; // static variable of type A (not initialized)
    private A(){} // private constructor
    public static A getInstance(){ // function to get the singleton instance
        if (null == obj){
            obj = new A(); // initialization of static variable
        }
        return obj;
    }
}
//-------------------------------------------------------------
// Thread-safe but not lazy initialized.
class B{
    private static final B obj = new B(); // static variable of type A (initialized)
    private B(){} // private constructor
    public static B getInstance(){ // function to get the singleton instance
        return obj;
    }
}
//-------------------------------------------------------------
// Thread-safe and lazy initialized using double-checked locking.
class C{
    private static volatile C obj = null; //static volatile variable of type C
    private final Lock lock = new ReentrantLock(); // private lock for synchronization
    private C(){} // private constructor
    public C getInstance(){ // function to get the singleton instance
        if (null == obj){
            synchronized (lock){ // synchronization block
                if (null == obj){ // double-checked
                    obj = new C();
                }
            }
        }
        return obj;
    }
}
//-------------------------------------------------------------
// Thread-safe and lazy initialized using the holder idiom.
class D{
    private D(){} // private constructor
    private static class D1{ // private inner class witch contain the Singleton variable
        private static final D obj = new D(); //static variable of type D
    }
    public static D getInstance(){ // function to get the singleton instance
        return D1.obj;
    }
}
//-------------------------------------------------------------
// Enum Singleton (with a use case example).
enum En {
    E;
}
public class Singleton {
}
