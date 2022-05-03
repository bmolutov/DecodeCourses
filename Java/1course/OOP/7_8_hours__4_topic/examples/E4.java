class Motorcycle {
    int speedLimit = 90;
    int year;
}


class Honda extends Motorcycle {
    int speedLimit = 150;
    int year = 2009;

    Honda(int newSpeedLimit, int newYear) {
        this.speedLimit = newSpeedLimit;
        this.year = newYear; 
    }
}


class Yamaha extends Motorcycle {
    int speedLimit = 130;
    int year = 2011;
}


class Suzuki extends Motorcycle {
    int speedLimit = 200;
    int year = 2015;
}


public class E4 {
    public static void main(String[] args) {
        Honda honda = new Honda(200, 2020);
        Yamaha yamaha = new Yamaha();
        Suzuki suzuki = new Suzuki();

        System.out.println(honda.speedLimit);
        System.out.println(yamaha.speedLimit);
        System.out.println(suzuki.speedLimit);
    }    
}
