package com.krush.jvm_arch;

public class ClassLoadederName {
	
	
	public static void main(String[] args) 
	{
		//Last example we know the  every .class file return the java.lang.Class class Object.
		
		
		//in the java.lang.Class class having a non-static getClassLoader(); 
		//getClassLoader();-->its return type is java.lang.ClassLoader Class object

		Class cls= Manager.class;
		System.out.println("The Manager.class file loaded by : "+cls.getClassLoader());//jdk.internal.loader.ClassLoaders$AppClassLoader@659e0bfd
		System.out.println("The Student.class file loaded by : "+Student.class.getClassLoader());//jdk.internal.loader.ClassLoaders$AppClassLoader@659e0bfd
		System.out.println("=====================predefine Classes ============================");
		System.out.println("The Class.class file loaded by : "+Class.class.getClassLoader());//The Class.class file loaded by : null
		//Bootstrap ClassLoader its show null. because its a internal part(its use only internal purpose) of jvm they not show to any one.
		//its meant for internal purpose only that reason java dose not show to any one restriction bootstrap class loader.
		System.out.println("======================PARENT CLASS LOADER==================");
		
		
		// we want to find the parent of classLoader  then java.lang.ClassLoader are having  non-static method that is getParent();
		//getParent(); its return type again java.lang.ClassLoader object (its a factory method). 
		// the you can write again  getParent().getParent(); also.
		ClassLoader classLoader= cls.getClassLoader();
		System.out.println("The ClassLoader parent Class Of Manager.class "+classLoader.getParent());
		//The ClassLoader parent Class Of Manager.class jdk.internal.loader.ClassLoaders$PlatformClassLoader@30f39991
		System.out.println("The ClassLoader parent Class Of Manager.class: "+classLoader.getParent().getParent());
		//The ClassLoader parent Class Of Manager.class : null

	}

}

class Student{}