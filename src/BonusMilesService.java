public class BonusMilesService {

    public int calculate(int miles) {
        int result;
        if (miles > 1000) {
            result = miles / 20;
        } else {
            result = 0;
        }
        return result;
    }
}

