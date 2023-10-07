public class RainwaterTrapping {
    public static void trapped_rainwater(int height[]){
        int n= height.length;
        // to calculate left max boundary...
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        
        for(int i =1; i<= n-1; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // to calculate right max boundary...
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        
        for(int i =n-2; i>=0; i--){
            rightMax[i] =  Math.max(height[i], rightMax[i+1]);
        }
        // loop to calculate the trapped water 
        int trapped_water =0;

        for(int i=0; i<= n-1; i++){
            int water_level = Math.min(leftMax[i], rightMax[i]);

            trapped_water = trapped_water + (water_level - height[i]);    //formula used 
        }
        System.out.println(trapped_water);
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trapped_rainwater(height);
    }
}
