// //leetcode 875 KOKO Eating bananas.

// input=[3,6,7,11], h=8
// we have to return k value i.e bananas per hour can be eaten whole banas in hour. hour should be equal to given h value. 

// approach:
// --> get middle of array
// --> divide the array
// --> get the ceil.
// --> add ceil
// --> compare to target.

// to find the array for range just find the maximum element then use binary search on that and find exact hours to complete all the bananas for k=per hour.

import java.util.*;

class KoKo {
    // Function to find the minimum eating speed using binary search
    public static int minEatingSpeed(int[] piles, int H) {
        int low = 1;
        int high = piles[0]; // Start with the first element
        for (int i = 1; i < piles.length; i++) {
          if (piles[i] > high) {
            high = piles[i]; // Update high if a larger value is found
    }
} // 1 to max pile size
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Middle value (potential eating speed)
            
            if (canFinish(piles, mid, H)) {
                result = mid; // Store this speed as a potential answer
                high = mid - 1; // Try slower speed
            } else {
                low = mid + 1; // Increase speed
            }
        }
        return result;
    }

    // Function to check if Koko can finish all bananas in H hours with speed K
    private static boolean canFinish(int[] piles, int k, int H) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += Math.ceil((double) pile / k); // Compute hours per pile
        }
        return totalHours <= H; // If within allowed time, return true
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11}; // Example piles
        int H = 8; // Total hours available
        System.out.println("Minimum Eating Speed: " + minEatingSpeed(piles, H)); // Output: 4
    }
}