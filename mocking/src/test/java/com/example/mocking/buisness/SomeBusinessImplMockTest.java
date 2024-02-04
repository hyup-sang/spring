package com.example.mocking.buisness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 인터페이스에 메서드가 추가 될 때마다 구현 클래스를 업데이트 해야 함
 * 많은 케이스를 테스트하기 어려움
 * */
class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(5, businessImpl.findTheGreatestFromAllData());
    }
}

