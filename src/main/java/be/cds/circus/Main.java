package be.cds.circus;

import be.cds.circus.exception.NoMonkeyException;
import be.cds.circus.show.Show;

public class Main {

    public static void main(String[] args){
        try {
            Show show = new Show();
            show.prepareTheShow();
            show.letTheShowBegin();
        }catch (NoMonkeyException e){
            e.printStackTrace();
        }
    }

}
