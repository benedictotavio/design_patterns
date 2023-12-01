package patterns.structure.bridge.transmissions;

import patterns.structure.bridge.plataforms.IPlatform;

public abstract class Live implements ITransmission {
    protected IPlatform platform;

    public Live(){

    }

    public Live(IPlatform platform){
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("Iniciando a Transmissão!");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
