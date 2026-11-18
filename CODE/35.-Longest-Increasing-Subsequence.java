int len = 0;

        for(int i = 0; i < n; i++){
            int low = 0;
            int high = len;

            while(low < high){
                int mid = low + (high - low) / 2;

                if(dp[mid] < nums[i]){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }

            dp[low] = nums[i];

            if(low == len){
                len++;
            }
        }

        return len;
    }
}