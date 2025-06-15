
class Main {
    public static void main(String[] args) {
        
        Friend friend1 = new Friend("Ria");
        Friend friend2 = new Friend("Sia");
        System.out.println(Friend.numFriends); // static reference
        
        Friend.displayFriends(); // static method
        
    }
}

class Friend {
    String name;
    static int numFriends;
    
    Friend(String name) {
        this.name = name;
        numFriends++;
    } 
    
    static void displayFriends() {
        System.out.println("You have " + numFriends + " friends.");
    }
}
