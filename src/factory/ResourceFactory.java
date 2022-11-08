package com.coffeepoweredcrew.abstractfactory2.src.factory;

import com.coffeepoweredcrew.abstractfactory2.src.product1.Storage;
import com.coffeepoweredcrew.abstractfactory2.src.product2.Instance;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capMib);
}
