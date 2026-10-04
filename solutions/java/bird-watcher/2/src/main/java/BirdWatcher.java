import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        ++birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        numberOfDays = Math.min(numberOfDays, birdsPerDay.length);
        
        int totalCount = 0;
        for (int i = 0; i < numberOfDays; ++i) {
            totalCount += birdsPerDay[i];
        }

        return totalCount;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                ++busyDaysCount;
            }
        }

        return busyDaysCount;
    }
}
