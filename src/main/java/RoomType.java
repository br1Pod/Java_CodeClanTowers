public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    FAMILY(4),
    PRESIDENTIAL(8),
    MEETING(12),
    AV(30),
    WEDDING(80);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getValue() {
        return capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
