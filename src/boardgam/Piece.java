package boardgam;

public class Piece {

    protected Position position;
    private Board board;

    // n
    public Piece(Board board) {
        this.board = board;
        // posição vai null quando vc cria a peça
        position = null;
    }

    //remove o setBoard pois não permite alterar o tabuleiro
    protected Board getBoard() {
        return board;
    }


}
