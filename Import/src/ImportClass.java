import java.lang.System.*;

import java.lang.Exception;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.management.LockInfo;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.lang.Byte;
import java.lang.Boolean;
import java.lang.Character;

import static java.lang.Double.*;


public class ImportClass {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        System.arraycopy(a, 0, b, 2, 2);
        Character c = new java.lang.Character('c');
        System.out.println("c = " + c);
    }
}
