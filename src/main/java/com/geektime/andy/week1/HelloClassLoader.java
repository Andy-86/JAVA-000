package com.geektime.andy.week1;
import java.lang.reflect.InvocationTargetException;
import	java.lang.reflect.Method;

import java.io.*;
import java.lang.reflect.Field;

/**
 * @author mac
 */
public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        HelloClassLoader loader = new HelloClassLoader();
        Class helloClass = loader.findClass("Hello");
        Object hello = helloClass.newInstance();
        Method method = helloClass.getDeclaredMethod("hello");
        method.invoke(hello);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = loadBytes();
        bytes = convertByte(bytes);
        return super.defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] loadBytes() {
        String name = "/Users/mac/IdeaProjects/GeekTime-Java/JAVA-000/src/main/resources/Hello.xlass";
        try {
            RandomAccessFile raf = new RandomAccessFile(name, "r");
            byte[] bytes = new byte[(int) raf.length()];
            raf.readFully(bytes);
            return bytes;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private byte[] convertByte(byte[] bytes) {
        byte[] bytes1 = new byte[bytes.length];
        for (int i = 0; i < bytes1.length; i++) {
            bytes1[i] = (byte) (255 - bytes[i]);
        }
        return bytes1;
    }
}
