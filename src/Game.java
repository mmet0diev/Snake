public class Game extends Directions{
    static char[][] field = new char[11][30];
    static char[] snake = {'-','-', '>'};
    static Boolean isRunning;
    static Boolean notRunning;
    // Game class constructor
    public Game() {
        for (int i = 0; i < 5; i++) {
        printField(setFieldState());
            System.out.println();
            setSleep(750);
        }
    }
    // Set the current field instance
    static char[][] setFieldState() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0 || i == field.length - 1) {
                    if (j == 0 || j == field[i].length - 1) {
                        field[i][j] = '|';
                    } else if (j < field[i].length - 1) {
                        field[i][j] = '-';
                    }
                } else {
                    if (j == 0 || j == field[i].length - 1) {
                        field[i][j] = '|';
                    } else {
                        field[i][j] = ' ';
                    }
                }
            }
        }
        moveSnake();
        setNextXY();
        return field;
    }
    // Place the snake inside the field
    static void placeSnake() {
        for (char part : snake) {
            if(field[y][x] == ' '){
                field[y][x] = part;
                if(isLeft)
                    x--;

                if(isRight)
                    x++;

                if(isUp)
                    y++;

                if(isDown)
                    y--;
            }
        }
    }
    // Move the snake in the current true direction
    static void moveSnake(){
        if (isLeft){
            x--;
            placeSnake();
        }else if(isRight){
            x++;
            placeSnake();
        }else if(isUp){
            y++;
            placeSnake();
        }else if(isDown){
            y--;
            placeSnake();
        }
    }
    // 
    static void setNextXY(){
        if(isLeft)
            x+=snake.length;
        if(isRight)
            x-=snake.length;
        if(isUp)
            y-=snake.length;
        if(isDown)
            y+=snake.length;
    }
    static void setSleep(int milSecs){
        try{
            Thread.sleep(milSecs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // Print the current field instance
    static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
