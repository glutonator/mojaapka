package core;

public class KlasaB {

    private KlasaC obektC;
    private KlasaC obektCC;

    public void func() {
        System.out.println("Jestem w funckji klasyB");
    }

    public void funcObiektC() {
        obektC.setPole("pppp");
        obektC.func();
        obektCC.func();
//        System.out.println("Jestem w funckji klasyB");
    }

    public void setObektC(KlasaC obektC) {
        this.obektC=obektC;
    }

    public void setObektCC(KlasaC obektCC) {
        this.obektCC = obektCC;
    }
}
