package SeaBattle;

public class PlayingField {
    private Cell[][] playingField;

    public PlayingField(Cell[][] playingField) {
        this.playingField = playingField;
    }
    public void print() {
        for (Cell[] cells: playingField){
            for (Cell cell: cells){
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
