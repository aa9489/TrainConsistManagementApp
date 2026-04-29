class InvalidCapacityException extends Exception {
InvalidCapacityException(String message) {
super(message);
}
}

class PassengerBogie {
String name;
int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class uc14 {
public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println(b1.name + " : " + b1.capacity);
            System.out.println(b2.name + " : " + b2.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}