import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.*;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Class<Phone> phoneClass = Phone.class;
        Field[] fields = phoneClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent((Class<? extends Annotation>) Annotation.class)) ;
        }
    }

    Phone phone = new Phone();
    try {
        Class<Phone> phoneClass = null;
        Method method = null;
        try {
            assert false;
            method = phoneClass.getDeclaredMethod("methodForInvoke", int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        method.setAccessible(true);
    }
    try {
        ListIterator[] fields = new ListIterator[0];
        fields[0].set(phone, "Apple");
        fields[1].set(phone, "iPhone");
        fields[2].set(phone, "2022");
        fields[3].set(phone, (String) "color purple");
    }

}

