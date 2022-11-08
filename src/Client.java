package com.coffeepoweredcrew.abstractfactory2.src;

import com.coffeepoweredcrew.abstractfactory2.src.factory.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.src.factory.GoogleResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.src.factory.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.src.product1.Storage;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance.Capacity;

public class Client {

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Client gcp = new Client(new GoogleResourceFactory());
    	i1 = gcp.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    }

    
}
