package rev.pe.math.linear.matrix;

import java.util.Random;

public class MatMN
{
    private final int width;
    private final int height;
    private final double[][] mat;

    public MatMN(int height, int width) {
        this.width = width;
        this.height = height;
        this.mat = new double[height][width];
    }
    public MatMN(double[][] mat) {
        this.width = mat[0].length;
        this.height = mat.length;
        this.mat = mat;

    }

    public static MatMN random(int width, int height, double min, double max) {
        Random r = new Random(System.currentTimeMillis());
        double[][] randArr = new double[width][height];
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                randArr[i][j] = min + (max-min)*r.nextDouble();
            }
        }
        return new MatMN(randArr);
    }

    public MatMN mult(MatMN other) {
        if (width != other.height) {
            throw new IllegalArgumentException(String.format("Cannot multiply a %sx%s matrix by a %sx%s matrix", height, width, other.height, other.width));
        }
        double[][] result = new double[other.width][height];
        for (int i=0; i<height; i++) {
            for (int j=0; j<other.width; j++) {
                double prod = 0;
                for (int k=0; k<width; k++) {
                    prod += mat[i][k] * other.mat[k][j];
                }
                result[i][j] = prod;
            }
        }
        return new MatMN(result);
    }


}
