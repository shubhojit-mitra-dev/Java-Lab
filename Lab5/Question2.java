public class Question2 {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Sachin", 47, "Batsman");
        Football_Player footballPlayer = new Football_Player("Messi", 34, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 32, "Forward");

        cricketPlayer.play();
        cricketPlayer.train();

        footballPlayer.play();
        footballPlayer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}

class Player {
    String name;
    int age;
    String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println(name + " is playing in the position of " + position);
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}