package com.extendeddictionary;

import com.example.spi.Dictionary;

public class ExtendedDictionary implements Dictionary {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
