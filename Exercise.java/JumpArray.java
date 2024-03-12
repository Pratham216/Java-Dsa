public class JumpArray {
    public static int Minimum_cost(int arr[]){
               
        int ans=0;

        for(int i = 2; i < arr.length; i++){
            int temp1 = Math.abs(arr[i] - arr[i - 2]);
            int temp2 = Math.abs(arr[i - 1] - arr[i - 2]);

            if(temp1<=temp2){
                i++;
                ans=ans+temp1;
            }else{
                ans=ans+temp2;
            }
        }
        return ans;
    }
    //     int n = arr.length;

    //     if(i==n-1){
    //         return 0;
    //     }

    //     int opt1 = Minimum_cost(arr, i+1) + Math.abs(arr[i]-arr[i+1]);
    //     if(i==n-2){
    //         return opt1;
    //     }

    //     int opt2 = Minimum_cost(arr, i+2)+Math.abs(arr[i]-arr[i+2]);
    //     return Math.min(opt1, opt2);

    // }
    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(Minimum_cost(arr));
    }
}
