package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }
}