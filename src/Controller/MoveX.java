package Controller;

public class MoveX {
    private int index;



    public MoveX() {



    }
    public int getIndex() {
        for (int index = 0; index <1000 ; index++) {
            if (index % 1000 == 0){
                index=0;
            }

        }
        return index;
    }
}
