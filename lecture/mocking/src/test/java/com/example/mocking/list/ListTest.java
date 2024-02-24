package com.example.mocking.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ListTest {
    @Mock
    List listMock;

    @Test
    void simpleTest() {
//        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturns() {
//        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        // 마지막 반환 값이 유지됨
        assertEquals(2, listMock.size());
    }

    @Test
    void specificParameters() {
//        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void genericParameters() {
//        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
        assertEquals("SomeOtherString", listMock.get(0));
        assertEquals("SomeOtherString", listMock.get(1));
    }
}
