package com.basicdictionary;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BasicDictionaryTest {
    @InjectMocks
    BasicDictionary basicDictionary;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void getNameReturnsItsClassName() {
        assertThat(basicDictionary.getName(), is("BasicDictionary"));
    }
}