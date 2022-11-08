package com.coffeepoweredcrew.abstractfactory2.src.factory;

import com.coffeepoweredcrew.abstractfactory2.src.product1.S3Storage;
import com.coffeepoweredcrew.abstractfactory2.src.product1.Storage;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Ec2Instance;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance.Capacity;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
