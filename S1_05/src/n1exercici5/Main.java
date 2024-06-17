package n1exercici5;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String fileName = "dog.ser";
		Dog dog = new Dog("Pipo", 3);
		serialize(dog,fileName);
		Dog deserializedDog = deserialize(fileName);
	}
	
	private static <T> void serialize(T item, String fileName) {
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));)
        {   
            out.writeObject(item);
            System.out.println("Object has been serialized");
        }
		catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T deserialize(String fileName) {
		T obj = null;
		try (ObjectInputStream  in = new ObjectInputStream (new FileInputStream(fileName));)
        {   
            obj = (T)in.readObject();
            System.out.println("Object has been deserialized:");
            System.out.println(obj);
        }
		catch(ClassNotFoundException ex) {
			System.out.println("Class not found");
		}
		catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
		return obj;
	}
}
