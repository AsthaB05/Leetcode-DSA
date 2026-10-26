class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];

        for (int i = 0; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] res = new int[people.length];

        for (int i = 0; i < people.length; i++) {
            int started = findUpperBound(start, people[i]);
            int ended = findLowerBound(end, people[i]);

            res[i] = started - ended;
        }

        return res;
    }

    public int findUpperBound(int[] start, int target) {
        int left = 0;
        int right = start.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (start[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int findLowerBound(int[] end, int target) {
        int left = 0;
        int right = end.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (end[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
