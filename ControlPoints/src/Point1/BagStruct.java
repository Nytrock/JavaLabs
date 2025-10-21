package Point1;

public class BagStruct {
    private final int _capacity;
    private int _money;

    public BagStruct(int capacity) {
        _capacity = capacity;
        _money = 0;
    }

    public void Mint(int number) {
        _money = Math.min(_capacity, _money + number);
    }

    public int Balance() {
        return _money;
    }

    public void Transfer(BagStruct destination) {
        int delta = Math.min(destination._capacity, destination._money + _money) - destination._money;
        destination._money += delta;
        _money -= delta;
    }
}
