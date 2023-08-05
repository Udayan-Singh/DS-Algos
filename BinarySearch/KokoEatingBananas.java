package BinarySearch;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i],max);
        }

        int s = 1;
        int e = max;

        while(s<=e){
            int mid = s + (e - s)/2;

            int totalHours = 0;
            for (int i = 0; i < piles.length; i++) {
                totalHours += Math.ceil((double)(piles[i])/(double)(mid));
            }

            if(totalHours <= h){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

        }

        return s;
    }
}
