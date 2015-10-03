package com.basicdictionary;

import com.example.spi.Dictionary;

public class BasicDictionary implements Dictionary {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
