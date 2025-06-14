import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        DiceRoller myDice = new DiceRoller();
        
    }
}

class DiceRoller {
    
    Random random = new Random();
    int num;
    
    DiceRoller() {
        roll();
    }
    
    void roll () {
        
        this.num = random.nextInt(6)+1;
        System.out.println(num);
    }
    
}

