package Direction;

public enum Direction { // class; run java program, somehow JVM will new 4 objects of Direction
    // 幾時用enum? 當你覺得係final
    // Finite number of values
    // 好處 : 永遠都係同一個地址
    // 能夠鎖死path
    EAST(1, 'E'), //
    SOUTH(2, 'S'), //
    WEST(-1, 'W'), //
    NORTH(-2, 'N'), //
    ;

    private int value;
    private char c;

    // private Direction() {

    // }

    private Direction(int values, char c) {
        this.value = values;
        this.c = c;
    }

    public void setValue(int value) {
        this.value = value;
    }
    // You can't create new Dirction object by yourself

    public int getValue() {
        return this.value;
    }

    public char getC() {
        return this.c;
    }

    public static Direction opposite(Direction direction) {
        if (direction == null)
            return null;
        for (Direction d : Direction.values()) { // values() -> 隱藏 implicit static method
            if (direction.getValue() * -1 == d.getValue())
                return d;
        }
        return null;
    }

    public Direction opposite() {
        for (Direction d : Direction.values()) {
            if (this.value * -1 == d.getValue())
                return d;
        }
        return null;
    }


    public static void main(String[] args) {
        // check if the deirection is EAST?
        House house = new House(Direction.EAST); // set an address of enum object
        System.out.println(house.getDirection() == Direction.EAST);

        house.setDirection(Direction.NORTH);
        System.out.println(house.getDirection() == Direction.NORTH); // True

        System.out.println(Direction.NORTH.getValue()); //
        // Direction.NORTH.setValue(5);
        System.out.println(Direction.NORTH.getValue()); // 5

        System.out.println(Direction.EAST.getC());
        System.out.println(Direction.SOUTH.getC());
        System.out.println(Direction.NORTH.getC());
        System.out.println(Direction.WEST.getC());

        // static
        System.out.println(Direction.opposite(Direction.SOUTH)); // EAST
        // instance
        System.out.println(Direction.EAST.opposite().getValue()); // -1
        System.out.println(Direction.EAST.opposite().name()); // WEST

        Direction direction = Direction.NORTH;
        int degree = getDirectionDegree(direction);
        System.out.println("degree=" + degree);



    }

    public static int getDirectionDegree(Direction direction) {

        int result = -1;

        switch (direction) {
            case NORTH:
                //return 360;
                result = 360;
                break;
            case EAST:
                //return 90;
                result = 90;
                break;
            case SOUTH:
                //return 180;
                result = 180;
                break;
            case WEST:
                //return 270;
                result = 270;
                break;
            //default:
                //return -1;
        }
        return result;
    }
}
