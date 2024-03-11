public class RotatedSearch {

    public static int Search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
            
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        // On L1:
        if (arr[si] <= arr[mid]) {
            // Left side
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            }    
            // Right side   hgg hgv h ggihyybv history tv ist of the first  the data is called ggjguhgbugj ghohjyv8vhv fhb gjiu77bvjbf0vghy8bb
            else { 
                return Search(arr, target, mid + 1, ei); 
                  
            }
        }
        // On L2: hh 
        else {
            // Right side
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            }
            // Left side    
            else {
                return Search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 10;
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(Search(arr, target, si, ei));
    }
}