class Solution {
    public boolean search(int[] arr, int target) {

        int i = 0, j = arr.length - 1;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            if(arr[mid] == target)
                return true;

            // Duplicate case
            if(arr[i] == arr[mid] && arr[mid] == arr[j]) {
                i++;
                j--;
            }
            else if(arr[i] <= arr[mid]) {

                if(arr[i] <= target && target < arr[mid])
                    j = mid - 1;
                else
                    i = mid + 1;
            }
            else {

                if(arr[mid] < target && target <= arr[j])
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }

        return false;
    }
}