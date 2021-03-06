package com.thoughtworks.estructures.utilities;

import java.lang.reflect.Array;

public class ArrayUtilities<T> {

    private Class<T> type;

    public ArrayUtilities(Class<T> type) {
        this.type = type;
    }

    public T[] createArrWithCapacity(int capacity) throws ArrayUtilitiesException {
        if(capacity < 0){
            throw new ArrayUtilitiesException("Esta mal");
        }
        return (T[]) Array.newInstance(type, capacity);
    }

    public T[] copyAllElements(T[] source, T[] target) {
        for(int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        return target;
    }
}
