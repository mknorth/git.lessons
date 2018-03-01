package lesson16;

import org.testng.annotations.Test;

public class TestSerialization {
    @Test
    public void serializationTest(){
        MyStorage myStorage = new MyStorage();
        myStorage.name = "Jack";
        myStorage.age = 15;
        SerializationWorker.serializeStorage(myStorage, "storage");

    }
    @Test
    public void deserializeTest(){
        MyStorage myStorage = (MyStorage) SerializationWorker.deserialzeStorage("storage");
        System.out.println(myStorage.name);
    }
}
