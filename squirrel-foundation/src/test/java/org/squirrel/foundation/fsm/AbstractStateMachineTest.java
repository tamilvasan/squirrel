package org.squirrel.foundation.fsm;

import org.junit.BeforeClass;

public class AbstractStateMachineTest {
    
    @BeforeClass
    public static void beforeTest() {
        ConverterProvider.INSTANCE.register(TestEvent.class, new Converter.EnumConverter<TestEvent>(TestEvent.class));
        ConverterProvider.INSTANCE.register(TestState.class, new Converter.EnumConverter<TestState>(TestState.class));
    }
}
