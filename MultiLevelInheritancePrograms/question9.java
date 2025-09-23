package MultiLevelInheritancePrograms;

class game{
    void startGame(){
        System.out.println("Game start now...!");
    }
}

class level extends game{
    void playGame(){
        System.out.println("Play game..!");
    }
}

class levelup extends level{
    void playNextLevel(){
        System.out.println("Play next level..!");
    }
}

class quit extends levelup{
    void exitFromGame(){
        System.out.println("Exit from the game..!");
    }
}
public class question9 {
    public static void main(String[] args) {
        quit obj = new quit();
        obj.startGame();
        obj.playGame();
        obj.playNextLevel();
        obj.exitFromGame();
    }
}
