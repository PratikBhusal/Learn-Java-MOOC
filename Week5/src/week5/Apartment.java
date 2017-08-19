package week5;
import java.lang.Math;

public class Apartment
{
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int squareMeters, int pricePerSquareMeter){
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean isLarger(final Apartment other) {
        return (this.squareMeters > other.squareMeters);
    }

    public boolean isPricier(final Apartment other) {
        return (this.squareMeters * this.pricePerSquareMeter)
            > (other.squareMeters * other.pricePerSquareMeter);
    }

    public int priceDifference(final Apartment other) {
        return Math.abs( (this.squareMeters * this.pricePerSquareMeter)
            - (other.squareMeters * other.pricePerSquareMeter) );
    }
}
