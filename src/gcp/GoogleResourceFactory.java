package com.coffeepoweredcrew.abstractfactory2.src.gcp;

import com.coffeepoweredcrew.abstractfactory2.src.Instance;
import com.coffeepoweredcrew.abstractfactory2.src.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory2.src.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.src.Storage;

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
