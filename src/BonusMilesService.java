public class BonusMilesService {

    public int calculate(int a) {
        int result;
        if (a > 1000) {
            result = a / 20;
        } else {
            result = 0;
        }
        return result;
    }
}

