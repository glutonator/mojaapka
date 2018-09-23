package core;

import java.util.List;

public class KlasaD {
    private KlasaC obektC;

    private List<String> stringList;

    public void func() {
        System.out.println("Jestem w funckji KlasaD");
        obektC.func();
        System.out.println("Zawartośc listy: "+stringList);
    }

    public KlasaD(KlasaC obektC) {
        this.obektC = obektC;
    }

    public KlasaD(KlasaC obektC, List<String> stringList) {
        this.obektC = obektC;
        this.stringList = stringList;
    }
}
