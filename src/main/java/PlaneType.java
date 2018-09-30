public enum PlaneType {

    BOEING747(416),
    BOEING777(2),
    AIRBUSA380(853);


    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }


}
