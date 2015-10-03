package com.extendeddictionary;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ExtendedDictionaryTest {
    @InjectMocks
    ExtendedDictionary extendedDictionary;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void getNameReturnsItsClassName() {
        assertThat(extendedDictionary.getName(), is("ExtendedDictionary"));
    }
}