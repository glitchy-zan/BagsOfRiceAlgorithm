public class Main {
    public static void main(String[] args) {

        int[] grains = {3, 9, 4, 2, 16};

        int result = setPerfect(grains);

        System.out.println("result: " + result);
    }

    public static int setPerfect(int[] grains) {

        int size = 1;

        for (int grain : grains) {
            int bagSize = checkRound(grains, grain);
            if (bagSize > size) size = bagSize;
        }

        return size;
    }

    public static int checkRound(int[] grains, int value) {
        for (int grain : grains) {
            if (grain == (value * value) && value != 1) {
                return (checkRound(grains, grain) + 1);
            }
        }
        return 1;
    }
}
