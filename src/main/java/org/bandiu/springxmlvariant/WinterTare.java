package org.bandiu.springxmlvariant;

public class WinterTare extends Tare{
    public WinterTare(int size) {
        super(size);
    }
    @Override
    public String toString(){

        return this.getClass().getSimpleName()+" "+ Integer.toHexString(System.identityHashCode(this)) +" " + super.getSize() +" size";
    }
}
