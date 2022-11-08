package com.coffeepoweredcrew.abstractfactory2.src.product2;

import com.coffeepoweredcrew.abstractfactory2.src.product1.Storage;

//Represents an abstract product
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
