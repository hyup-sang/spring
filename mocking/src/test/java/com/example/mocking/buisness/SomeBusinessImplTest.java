package com.example.mocking.buisness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 인터페이스에 메서드가 추가 될 때마다 구현 클래스를 업데이트 해야 함
 * 많은 케이스를 테스트하기 어려움
 * */
class SomeBusinessImplTest {
    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(35, result);
    }
}

class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}


class DataServiceStub2 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}