package pkg.game;


public class Table {

    public State[][] table = new State[6][8];

    /**
     * Create the starter Table.
     */
    public void createTable() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = new State();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j].empty = true;
            }
        }
        table[2][0].kingWhite = true;

        for (int i = 2; i < 4; i++) {
            for (int j = 1; j < 8; j++) {
                table[i][j].empty = true;
            }
        }
        table[3][0].empty = true;
        table[3][7].empty = false;
        table[3][7].kingBlack = true;

        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j].empty = true;
            }
        }


    }

    public void createtable2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = new State();
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j].empty = true;
            }
        }
        table[1][5].empty=false;
        table[1][5].kingWhite=true;
        table[3][3].empty=false;
        table[3][3].kingBlack=true;
        table[0][3].empty=false;
        table[0][5].empty=false;
        table[1][4].empty=false;
        table[0][3].deleted=true;
        table[0][5].deleted=true;
        table[1][4].deleted=true;

    }
}


