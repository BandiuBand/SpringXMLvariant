package org.bandiu.springxmlvariant;

public class SummerTyre extends Tare{
    public SummerTyre(int size) {
        super(size);
    }
    @Override
    public String toString(){

        return this.getClass().getSimpleName()+" "+ Integer.toHexString(System.identityHashCode(this)) +" " + super.getSize() +" size";
    }
}
