package com.coffeepoweredcrew.abstractfactory2.src.factory;

import com.coffeepoweredcrew.abstractfactory2.src.product1.GoogleCloudStorage;
import com.coffeepoweredcrew.abstractfactory2.src.product1.Storage;
import com.coffeepoweredcrew.abstractfactory2.src.product2.GoogleComputeEngineInstance;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
