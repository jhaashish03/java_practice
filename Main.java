import java.util.*;

public class Main {
//    static String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//    static int count = 0;
//    public int arraysort(int[] arr,int[] arr1) {
//        int count = 0;
//
//        int r = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr[i] == arr1[j]) {
//                    count = 1;
//                }
//            }
//            if (count != 1) {
//                r = arr[i];
//            }
//            count=0;
//        }
//        return r;
//    }

//    public boolean sumCheck(int[] arr,int sum){
//        for(int i=0;i< arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                for(int z=j+1;z<arr.length;z++){
//                    if(arr[i]+arr[j]+arr[z] == sum){
//                        return true;
//
//                    }
//                }
//            }
//        }
//        return false;
//    }


//    public int[] majority(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if(arr[j-1] < arr[j]){
//                  int temp=arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
//
//                }
//
//            }
//
//        }
//        return arr;
//
//        for (int a:arr ) {
//            System.out.println(a);
//        }
//int count=0;
//        int[] c=new int[arr.length];
//
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//
//                }
//                c[i]=count;
//
//            }
//                count=0;
//
//
//        }
//
//int max=c[0];
//        for (int i = 0; i <c.length; i++) {
//            if(c[i] > max){
//                max=c[i];
//
//            }
//        }
//
//
//        return max;
//
//    }

//    public StringBuilder removeDuplicates(String str) {
//        List<String> l = new ArrayList<String>();
//    l.addAll(List.of(str.split("")));
//    int count=0;
//        for(int i=0;i<l.size();i++){
//            for(int j=0;j<l.size();j++){
//                if(l.get(i) == l.get(j)){
//                    count++;
//
//                }
//            }
//            if(count > 1){
//                l.
//            }
//        }
//            StringBuilder r= new StringBuilder();
//        for (String s : l) r.append(s);
//
//        return r;
//    }

//    public int oneZeroPattern(int i,int c){
//
//        for (int j = 1; j <=i ; j++) {
//
//            System.out.print(c);
//            if(c==1){
//                c=0;
//            } else{
//                c=1;
//            }
//
//
//        }
//        return c;
//   }
//    public void halfPyramid(int i){
//        for (int j = 1; j <=i ; j++) {
//            if(j==i || i==5) {
//                System.out.print("*");
//            }
//        }
//    }
//    public void invertedHalfPyramid(int i){
//        for (int j = 1; j <=4-i+1 ; j++) {
//            if(j==i || i==1) {
//                System.out.print("*");
//            }
//
//        }
//    }
//    public void invertedHalfPyramidWithEnter(int i){
//        for (int j = 1; j <=4-i+1 ; j++) {
//            if(i==1){
//                System.out.print("");
//            } else{
//                System.out.print("*");
//            }
//
//
//        }
//    }
//    public void invertedHalfPyramidWithEnterInverted(int i){
//        for (int j = 1; j <=4-i+1 ; j++) {
//            if(i==4){
//                System.out.print("");
//            } else{
//                System.out.print("*");
//            }
//
//
//        }
//    }
//    public void spaceHalfPyramid(int i){
//        for (int j = 1; j <i ; j++) {
//            System.out.print(" ");
//
//        }
//    }
//    public void spaceInvertedHalfPyramid(int i){
//        for (int j = 1; j <4-i+1 ; j++) {
//            System.out.print(" ");
//
//        }
//    }
//    public void HalfPyramidWithEnter(int i){
//        for (int j = 1; j <=i ; j++) {
//            if(i==1){
//                System.out.print("");
//            } else{
//                System.out.print("*");
//            }
//
//
//        }
//    }
//
//    public void numberPatter(int i){
//        int num=1;
//        for (int j = 1; j <=i ; j++) {
//            System.out.print(num);
//            num++;
//
//
//        }
//    }
//    public void numberPatterInverted(int i){
//        int num=i;
//        for (int j = 1; j <=i ; j++) {
//            System.out.print(num);
//            num--;
//
//
//        }
//    }


//    public static int factorial(int n){
//        int f=1;
//        for (int i = 1; i <=n ; i++) {
//
//            f*=i;
//
//        }
//        return f;
//    }
//
//    public static int binCofe(int n,int r){
//    int facN=factorial(n);
//    int factNR=factorial(n-r);
//    int facR=factorial(r);
//    return  facN/(factNR*facR);
//
//
//    }

    // public static boolean isPrime(int n) {
    //     if(n==2){
    //         return true;
    //     }
    //     for (int i = 2; i <=Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;

    //         }


    //     }

    //     return true;
    // }
    // public static int bTD(int n) {
    //     int dec=0;
    //     int i=0;
    //     while(n>0){
    //         int rem=n%10;
    //         dec+=rem*(int)Math.pow(2, i);
    //         i++;
    //         n=n/10;
    //     }
    //     return dec;
    // }

//        public static int dTB(int n) {
//            int bi=0;
//            int i=0;
//            int rem=0;
//            while(n>0){
//
//                rem=n%2;
//                bi=bi+(rem*(int)Math.pow(10, i));
//                i++;
//                n=n/2;
//
//        }
//        return bi;
//    }

//    public static int dTB(int n){
//        int bin=0;
//        int i=0;
//        while(n > 0){
//            int rem=n%2;
//            bin=bin+(rem*(int)Math.pow(10,i));
//            i++;
//            n=n/2;
//        }
//        return bin;
//
//    }
//    public static void hollowRect(int rows, int col){
//
//        for (int i = 1; i <=rows ; i++) {
//            for (int z = 1; z <=rows-i; z++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=col; j++) {
//            if(j==1 || j==col || i==1 || i==rows){
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//            }
//            System.out.println();
//        }
//
//    }

//        public static void diamond(int n){
//            for (int i = 1; i <=n; i++) {
//                for (int j = 1; j <=n-i+1 ; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <=i ; j++) {
//
//                        System.out.print(i+" ");
//
//
//                }
//
//                System.out.println();
//            }
//        }

//    public  static void numberpattern(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n-i; j++) {
//                System.out.print(" ");
//            }
//            int temp=i;
//            for (int j = 1; j <=(2*i-1) ; j++) {
//
//
//                System.out.print(temp);
//                temp--;
//                if(temp <1){
//                    break;
//                }
//            }
//            int tem=2;
//            for (int j = 2; j <=(2*i-2) ; j++) {
//
//
//                System.out.print(tem);
//                tem++;
//                if(tem >i){
//                    break;
//                }
//            }
//
//            System.out.println();
//        }
//    }


//    public static void callbyref(int arr[]){
//        arr[0]=5;
//
//    }

//    public  static  int linearSearch(int arr[], int n){
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i] == n){
//                return i;
//            }
//
//        }
//        return 0;
//    }
//    public  static  void largestAndSmallest(int arr[]){
//        int largest=Integer.MIN_VALUE;
//    int smallest=Integer.MAX_VALUE;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//            if(arr[i]<smallest){
//                smallest=arr[i];
//            }
//        }
//        System.out.println("Largest Number is "+largest);
//        System.out.println("Smallest number is :"+smallest);
//
//    }

//    public static void numberpattern(int n){
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//
//    }


//            public static int binarySearch(int arr[],int key){
//                    int start=0,end=arr.length-1;
//                    while(start<=end){
//                        int mid=(start+end)/2;
//                        if(arr[mid]==key){
//                            return mid;
//                        }
//                        if(arr[mid]<key){
//                            start=mid+1;
//                        } else {
//                            end=mid-1;
//                        }
//                    }
//                    return -1;
//
//            }

//        public  static void reverseArray(int[] arr){
//            int start=0,end=arr.length-1;
//            while (start<end){
//                int temp=arr[end];
//                arr[end]=arr[start];
//                arr[start]=temp;
//                start++;
//                end--;
//
//            }
//        }


//    public static  void pairArray(int arr[]){
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                System.out.print("("+arr[i]+","+arr[j]+")");
//            }
//            System.out.println();
//        }
//    }

//    public static void subarray(int arr[]){
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        int[] prefixarray=new int[arr.length];
//        prefixarray[0]=arr[0];
//        for (int i = 1; i <arr.length; i++) {
//            prefixarray[i]=prefixarray[i-1]+arr[i];
//        }
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            for (int j = i; j<arr.length ; j++) {
//                int sum=(i==0) ? prefixarray[j] : (prefixarray[j]-prefixarray[i-1]);
//
//
//                if(sum>max){
//                    max=sum;
//                }
//                if(sum<min){
//                    min=sum;
//                }
//
//
//
//
//
//            }
//
//        }
//        System.out.println("Max Sum is "+max);
//        System.out.println("Min Sum is "+min);
//    }

//public static void kadanes(int arr[]){
//    int cursum=0,max=Integer.MIN_VALUE;
//    int min=Integer.MIN_VALUE;
//    int neg=0;
//    for (int i = 0; i <arr.length ; i++) {
//        if(arr[i]<0){
//            neg++;
//        }
//        cursum+=arr[i];
//        if(cursum<0){
//            cursum=0;
//        }
//        max=Math.max(cursum,max);
//        min=Math.max(min,arr[i]);
//
//    }
//    if(neg==arr.length){
//
//        System.out.println("Max Subarray sum is "+min);
//    } else{
//        System.out.println("Max Subarray sum is "+max);
//    }
//}
//            public  static int trappingRainwater(int height[]){
//
//                //largest left bar to be stored in an auxilkay array which stores  the largest
//                // element in left side of an element
//                int[] leftmax=new int[height.length];
//
//                leftmax[0]=height[0];
//                for (int i = 1; i < height.length ; i++) {
//                    leftmax[i]=Math.max(leftmax[i-1],height[i]);
//
//
//                }
//
//                //largest right side elements for the bar
//                int[] rightMax=new int[height.length];
//                rightMax[height.length-1]=height[height.length-1];
//                for (int i = height.length-2; i >=0 ; i--) {
//                    rightMax[i]=Math.max(height[i],rightMax[i+1]);
//                }
//                    int trapped=0;
//                for (int i = 0; i < height.length ; i++) {
//                    int waterlevel=Math.min(leftmax[i],rightMax[i]);
//                      trapped+=(waterlevel-height[i]);
//
//                }
//
//            return trapped;
//            }

//    public static int buyOrSellStock(int arr[]){
//        int maxProfit=Integer.MIN_VALUE;
//        int buyPrice=Integer.MAX_VALUE;
//        int profit=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>buyPrice){
//               profit=arr[i]-buyPrice;
//               maxProfit=Math.max(profit,maxProfit);
//            } else {
//                buyPrice=arr[i];
//            }
//        }
//        return maxProfit;
//    }
//public List<List<Integer>> threeSum(int nums[]) {
//    List<List<Integer>> result = new ArrayList<List<Integer>>();
//    for (int i = 0; i < nums.length; i++) {
//        for (int j = i + 1; j < nums.length; j++) {
//            for (int k = j + 1; k < nums.length; k++) {
//                if (nums[i] + nums[j] + nums[k] == 0) {
//
//                    List<Integer> triplet = new ArrayList<Integer>();
//                    triplet.add(nums[i]);
//                    triplet.add(nums[j]);
//                    triplet.add(nums[k]);
//                    Collections.sort(triplet);
//                    result.add(triplet);
//                }
//            }
//        }
//    }
//    result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
//    return result;
//}

//    public  static  Set<List<Integer>> threeSum(int arr[]){
//        Set<List<Integer>> result=new LinkedHashSet<List<Integer>>();
//         for (int i = 0; i < arr.length ; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                for (int k = j+1; k < arr.length ; k++) {
//                    List<Integer> triplet=new ArrayList<Integer>();
//
//                    if(arr[i]+arr[j]+arr[k] == 0) {
//                        triplet.add(arr[i] );
//                        triplet.add(arr[j] );
//                        triplet.add(arr[k] );
//                        Collections.sort(triplet);
//                        result.add(triplet);
//                    }
//                }
//
//            }
//
//        }
//         return result;
//    }

//    public int search(int[] nums, int target) {
////min will have index of minimum element of nums
//        int min = minSearch(nums);
////find in sorted left
//        if(nums[min] <= target && target <= nums[nums.length-1]){
//            return search(nums,min,nums.length-1,target);
//        }
////find in sorted right
//        else{
//            return search(nums,0,min,target);
//        }
//    }
//    //binary search to find target in left to right boundary
//    public int search(int[] nums,int left,int right,int target){
//        int l = left;
//        int r = right;
//// System.out.println(left+" "+right);
//        while(l <= r){
//            int mid = l + (r - l)/2;
//            if(nums[mid] == target){
//                return mid;
//            }
//            else if(nums[mid] > target){
//                r = mid-1;
//            }
//            else{
//                l = mid+1;
//            }
//        }
//        return -1;
//    }
//    //smallest element index
//    public int minSearch(int[] nums){
//        int left = 0;
//        int right = nums.length-1;
//        while(left < right){
//            int mid = left + (right - left)/2;
//            if(mid > 0 && nums[mid-1] > nums[mid]){
//                return mid;
//            }
//            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
//                left = mid+1;
//            }
//            else{
//                right = mid-1;
//            }
//        }
//        return left;
//    }


 /*   public static int binarySearchPivot(int arr[],int target){

        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            //checking left half in sorted or not
            if(arr[start]<arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;

                } else {
                    start=mid+1;

                }
            } else{
                if(target>=arr[mid+1] && target<arr[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }


        }




            return -1;


    }*/

//    public static int maxSubArraySum(int arr[]){
//        int maxSum=Integer.MIN_VALUE;
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            for (int j = 0; j <arr.length ; j++) {
//                int sum=0;
//                for (int k = i; k <=j ; k++) {
//                    sum+=arr[k];
//                }
//                maxSum=Math.max(sum,maxSum);
//            }
//        }
//        return maxSum;
//    }
   /* public static void bubblesort(int arr[]){
        for(int turn=0;turn< arr.length-1;turn++ ){
            int swap=0;
            for (int i = 0; i < arr.length-1-turn ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swap++;
                }

            }
            if(swap==0){
                break;
            }
        }
        for (int i:
             arr) {
            System.out.print(i+" ");

        }
    }*/
/*public static void selectionSort(int arr[]){
    for (int i = 0; i < arr.length-1 ; i++) {
        int minposition=i;
        for (int j = i+1; j <arr.length ; j++) {
            if(arr[j]<arr[minposition]){
                minposition=j;
            }

        }
        //swap
        int temp=arr[minposition];
        arr[minposition]=arr[i];
        arr[i]=temp;
    }

    for (int i:
         arr) {
        System.out.print(i+" ");

    }
}*/
  /*  public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {

            int cur=arr[i];
            int prev=i-1;
            while (prev>=0  && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=cur;
        }

        for (int i:
             arr) {
            System.out.print(i+" ");

        }

    }*/


        /*public  static void coutingSort(int arr[]){
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length ; i++) {
                max=Math.max(max,arr[i]);
            }
            // for positive numbers array's length should be arr.lenght+1
            int[] countarray=new int[max+1];
            //adding the count of the element in arr in count array
            for (int i = 0; i <arr.length ; i++) {
                countarray[arr[i]]++;
            }
            int j=0;
            for (int i = 0; i <countarray.length ; i++) {


                while (countarray[i]>0){
                    arr[j]=i;
                    j++;
                    countarray[i]--;
                }
            }
            for (int i:
                 arr) {
                System.out.print(i+" ");
            }

        }*/


/*public static void spiralarray(int arr[][]){
        int rowstart=0;
        int colstart=0;
        int rowend=arr.length-1;
        int colend=arr[0].length-1;


        while(rowstart<=rowend && colstart<=colend){
            //top
            for (int j = colstart; j <=colend ; j++) {
                System.out.print(arr[rowstart][j]+" ");
            }

            //right
            for (int i = rowstart+1; i <=rowend ; i++) {
                System.out.print(arr[i][colend]+" ");
            }
            //bottom

            for (int j = colend-1; j >=colstart ; j--) {
                if (rowstart == rowend) {
                    break;
                }
                System.out.print(arr[rowend][j] + " ");
            }


            //left
            for (int i = rowend-1; i >=rowstart+1; i--) {
                if(colstart==colend){
                    break;
                }
                System.out.print(arr[i][colstart]+" ");
            }
            rowstart++;
            colstart++;
            rowend--;
            colend--;
            System.out.println();

        }



}*/

       /* public static int diagonalSum(int arr[][]){
            //n should be equal to m

            int sum=0;
            for (int i = 0; i <arr.length ; i++) {
                sum+=arr[i][i];
                //for if n and m is odd- to exclude the oveerlapping element from getting added into sum vaiabke
                if(i != arr.length-i-1){
                    sum+=arr[i][arr.length-i-1];
                }
            }
            return sum;
        }
*/


    /*     public static boolean searchInSortedMatrix(int arr[][],int target){

             int row= arr.length-1,col=0;

             while(col<arr[0].length && row>=0){
                 if(arr[row][col]==target) {
                     return true;

                 } else if (target>arr[row][col]) {
                     col++;
                 } else {
                     row--;
                 }
             }


 return false;
         }*/
  /*  public static void transpose(int arr[][]) {
        int row = 0, col = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp= arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

*/

//    public static boolean palindrome(String str){
//       int start=0,end=str.length()-1;
//       while (start<=end){
//           if(str.charAt(start)!=str.charAt(end)){
//               return false;
//           }
//           start++;
//           end--;
//
//       }
//       return true;
//    }

//    public static int shortestPath(String str){
//        int x=0,y=0;
//        for (int i = 0; i <str.length() ; i++) {
//            if(str.charAt(i)=='W'){
//                x--;
//            } else if (str.charAt(i)=='E') {
//                x++;
//            } else if (str.charAt(i)=='N') {
//                y++;
//
//            } else {
//                y--;
//            }
//        }
//        int length=(int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
//        return length;
//    }

//    public static String toUppercase(String str){
//        StringBuilder sb=new StringBuilder();
//        sb.append(Character.toUpperCase(str.charAt(0)));
//        for (int i = 1; i <str.length() ; i++) {
//            if(str.charAt(i)==' ' && i<str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            } else{
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//    public static String stringCompression(String str){
//        StringBuilder sb=new StringBuilder("");
//        for (int i = 0; i <str.length() ; i++) {
//            Integer count=1;
//            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
//                count++;
//                i++;
//            }
//            sb.append(str.charAt(i));
//            if(count>1){
//                sb.append(count.toString());
//            }
//        }
//       return sb.toString();
//    }
//

//    public static void anagrams(String s1,String s2){
//        s1=s1.toLowerCase();
//        s2=s2.toLowerCase();
//
//        char[] s1Array=s1.toCharArray();
//        char[] s2Array=s2.toCharArray();
//
//        Arrays.sort(s1Array);
//        Arrays.sort(s2Array);
//        if(s1.length()==s2.length()){
//            if(Arrays.equals(s1Array,s2Array)){
//                System.out.println("Given Strins are anagrams.");
//            } else{
//                System.out.println("Given Strins are not anagrams");
//            }
//        } else {
//            System.out.println("Given strings are not of same length");
//        }
//
//
//    }
//        public static String compression(String str){
//            StringBuilder sb=new StringBuilder("");
//
//            for (int i = 0; i < str.length(); i++) {
//                int count=1;
//                while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                    count++;
//
//                    i++;
//                }
//                sb.append(str.charAt(i));
//                if(count>1){
//                    sb.append(count);
//                }
//
//            }
//            return sb.toString();
//        }

//    public static void binaryOddOrEvenCheck(int n){
//        if((n&1)==0){
//            System.out.println("Given Number is even");
//        } else {
//            System.out.println("Given Number is odd");
//        }
//    }

//    public static int getIthBit(int n,int i){
//        int bitmask=1<<i;
//        if((n&bitmask)==0){
//            return 0;
//        } else {
//            return 1;
//        }
//    }

//    public static int setIthBit(int n, int i){
//        int bitmask=1<<i;
//        return n|bitmask;
//    }
//
//    public static int clearItBit(int n,int i){
//        int bitmask=~(1<<i);
//        return n & bitmask;
//    }

//    public static int updateIthBit(int n,int i,int bit){
////        if(bit==0){
////            return clearItBit(n,i);
////        } else{
////            return setIthBit(n,i);
////        }
//        n=clearItBit(n,i);
//        int bitmask=bit<<i;
//        return n|bitmask;
//    }

//    public static int clearLastIBits(int n,int i){
//        int bitmask=(~0)<<i;
//        return n & bitmask;
//    }
//        public static int clearRangeOfBits(int n,int i, int j){
//                int a=(~0)<<j+1;
//                int b=(1<<i)-1;
//                int bitmask=a|b;
//                return n & bitmask;
//
//        }

//    public  static boolean powerOfTwo(int n){
//        if((n & (n-1))==0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//        public static int countOfSetBits(int n){
//            int count=0;
//            while (n>0){
//                if(((1<<0) & n) !=0){
//                    count++;
//                }
//                n=n>>1;
//            }
//            return count;
//        }
//    public static int fastExponentitaion(int a,int n ){
//
//        int ans=1;
//        while(n>0){
//            if((n & 1) !=0){
//                ans=ans*a;
//            }
//
//            a=a*a;
//            n= n>>1;
//        }
//        return ans;
//    }
   /* public static int modularExponentiation(int a, int b, int p){
        int res=1;
        a=a%p;
        if(a==0){
            return 0;
        }
        while(b>0){
            if((b&1)!=0){
                res=(res*a)%p;
            }
            a=(a*a)%p;
            b=b>>1;
        }
        return res;
    }*/

//    public static void printNumberNto1(int n){
//
//        if(n==1){
//            System.out.print(n+" ");
//            return;
//
//
//
//        }
//        printNumberNto1(n-1);
//        System.out.println(n+" ");
//
//    }

//    public static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//    public static int sum(int n){
//        if(n==1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }

//    public static int fibonacci(int n){
//        if(n==0 || n==1) {
//            return n;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
//    }
//    public static boolean isSorted(int arr[],int i){
//        if(i== arr.length-1){
//            return true;
//        }
//        if(arr[i]>arr[i+1]){
//            return false;
//        }
//        return isSorted(arr,i+1);
//    }
//    public static int firstOccurence(int arr[],int key,int i){
//        if(i== arr.length){
//            return -1;
//        }
//        if(key==arr[i]){
//            return i;
//        }
//        return firstOccurence(arr, key, i+1);
//    }

//    public static int lastOccurence(int arr[],int key,int i){
//        if(i== arr.length){
//            return -1;
//        }
//        int index=lastOccurence(arr, key, i+1);
//        if(index==-1 && key==arr[i]){
//            return i;
//        }
//        return index;
//
//    }

//    public static int xtoN(int x, int n){
//        if(n==1){
//            return x;
//        }
//        return x*xtoN(x,n-1);
//    }
//    public static int xtoNOptimezed(int x, int n){
//        if(n==0){
//            return 1;
//        }
//     int halfpwoer=xtoNOptimezed(x,n/2);
//     int half=halfpwoer*halfpwoer;
//     if(n%2!=0){
//         return half*x;
//     }
//     return half;
//    }

//        public static int tillingProblem(int n){
//            if(n==0 || n==1){
//                return 1;
//            }
//            //vertical choice
//            int vertical=tillingProblem(n-1);
//
//            //horizontal choice
//            int horizontal=tillingProblem(n-2);
//            return vertical+horizontal;
//        }

//    public static void removeduplicates(String str,int idx,StringBuilder newString,boolean[] arr){
//        if(idx==str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char curChar=str.charAt(idx);
//        if(arr[curChar-'a']){
//            removeduplicates(str, idx+1, newString, arr);
//        } else {
//            arr[curChar-'a']=true;
//
//            removeduplicates(str, idx+1, newString.append(curChar), arr);
//
//
//        }
//
//    }
//    public static int friendsPairing(int n){
//        if(n==1 || n==2){
//            return n;
//        }
//        //choices
//        //single
//        int single=friendsPairing(n-1);
//        //pair
//        int pair=(n-1)*friendsPairing(n-2);
//        return single+pair;
//    }

//    public static void binaryString(int n, int last,String str){
//        if(n == 0){
//            System.out.println(str);
//            return;
//        }
//        binaryString(n-1, 0, str+"0");
//        if(last == 0){
//            binaryString(n-1, 1 , str+"1");
//        }
//    }

//    public static void allOccurences(int[] arr, int key, int i){
//        if(i== arr.length){
//            return;
//        }
//        if(key==arr[i]){
//            System.out.print(i+" ");
//        }
//        allOccurences(arr,key,i+1);
//    }

//    public static void numberToString(int n){
//        if(n==0){
//            return;
//        }
//        int lastdigit=n%10;
//        numberToString(n/10);
//        System.out.print(str[lastdigit]+" ");
//
//
//    }

//    public static int lengthOfString(String str){
//      if(str.equals("")){
//          return 0;
//      }
//      return lengthOfString(str.substring(1))+1;
//    }

//    public static int countOfString(String str, int i, int j, int n){
//        if(n==1){
//            return 1;
//        }
//        if(n<=0){
//            return 0;
//        }
//
//        int res=countOfString(str,i+1,j,n-1)+countOfString(str, i, j-1, n-1)-countOfString(str, i+1, j-1, n-2);
//        if(str.charAt(i) == str.charAt(j)){
//            res++;
//        }
//        return res;
//    }
//    public static void towerOfHanoi(int n, String source,String helper,String destination){
//        if(n==1){
//            System.out.println(n+" numbered disk shifted from "+source+" to "+destination);
//            return;
//        }
//        towerOfHanoi(n-1, source, destination,helper );
//        System.out.println(n+" numbered disk shifted from "+source+" to "+destination);
//        towerOfHanoi(n-1, helper, source, destination);
//    }


//        public static void merge(int arr[], int i,int mid, int j){
//            int[] temp=new int[j-i+1];
//            int li=i;//index to iterate over left array
//            int ri=mid+1;//index to interate over right array
//            int k=0;//index to iterate over temp array
//
//            //comparing the new sorted right and left array
//            while(li<=mid && ri<=j){
//                if(arr[li]<arr[ri]){
//                    temp[k]=arr[li];
//                    li++;
//
//                } else{
//                    temp[k]=arr[ri];
//                    ri++;
//
//                }
//                k++;
//            }
//
//            //left over elements in left array
//            while(li<=mid){
//                temp[k++]=arr[li++];
//
//            }
//        //left over elements in right array
//            while(ri<=j){
//                temp[k++]=arr[ri++];
//
//            }
//
//            //copying the temp array in original array
//            for (li=i,k= 0; k <temp.length ; li++,k++) {
//                arr[li]=temp[k];
//            }
//
//        }
//        public static void mergeSort(int arr[],int i,int j){
//            if(i>=j){
//                return;
//            }
//            int mid=i+(j-i)/2;
//            mergeSort(arr,i,mid);
//            mergeSort(arr, mid+1, j);
//            merge(arr,i,mid,j);
//        }
//    public static int partition(int arr[],int si,int ei){
//        int pivot=arr[ei];
//
//        int i=si-1;//this i is used to make place for elements smaller than the pivot
//
//        for (int j = si; j <ei ; j++) {
//            if(arr[j]<=pivot){
//                i++;
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//            }
//        }
//        i++;
//        int tem=pivot;
//        arr[ei]=arr[i];
//        arr[i]=tem;
//        return i;
//
//    }
//    public static void quickSort(int arr[], int si,int ei){
//        if(si>=ei){
//            return;
//        }
//        int pivotIndex=partition(arr,si,ei);
//        quickSort(arr, si, pivotIndex-1);
//        quickSort(arr, pivotIndex+1, ei);
//    }


//    public static int sortedAndRotatedArraySearch(int arr[], int i, int j,int target){
//        if(i>j){
//            return -1;
//        }
//        int mid=i+j;
//        if(arr[mid]==target){
//            return mid;
//        }
//        if(arr[i]<=arr[mid]){
//            if(target>=arr[i] && target<arr[mid]){
//               return sortedAndRotatedArraySearch(arr, i, mid-1, target);
//            } else{
//               return sortedAndRotatedArraySearch(arr, mid+1, j, target);
//            }
//        } else{
//            if(target>arr[mid] && target<=arr[j]){
//                return sortedAndRotatedArraySearch(arr, mid+1, j, target);
//            } else{
//              return   sortedAndRotatedArraySearch(arr, i, mid-1, target);
//            }
//        }
//    }

//        public static int majorityElement(int arr[]){
//            for (int k = 0; k < arr.length; k++) {
//                int count=0;
//                for (int i = 0; i <arr.length ; i++) {
//                    if(arr[k]==arr[i]){
//                        count++;
//                    }
//                }
//                if(count>arr.length/2){
//                    return count;
//                }
//            }
//            return -1;
//        }

//    public static String[] merge(String arr1[],String arr2[]){
////        String temp[]=new String[ei-si+1];
////        int i=si;
////        int j=mid+1;
////        int k=0;
//
//        String temp[]=new String[arr1.length+ arr2.length];
//        int i=0;
//        int j=0;
//        int k=0;
//
//        while(i< arr1.length && j< arr2.length){
//            if(arr1[i].compareToIgnoreCase(arr2[j])<0){
//                temp[k]=arr1[i];
//                i++;
//            } else{
//                temp[k]=arr2[j];
//                j++;
//            }
//            k++;
//        }
//
//
//        while(i< arr1.length){
//            temp[k++]=arr1[i++];
//        }
//        while (j< arr2.length){
//            temp[k++]=arr2[j++];
//        }
//
////        for (i=si,k=0;k<temp.length;i++,k++){
////            arr[i]=temp[k];
////        }
//        return temp;
//    }
//    public static String[] mergeSort(String arr[],int si,int ei){
//        if(si==ei){
//            String[] a={arr[si]};
//            return a;
//        }
//        int mid=si+(ei-si)/2;
//        String[] arr1=mergeSort(arr, si, mid);
//        String[] arr2=mergeSort(arr,mid+1,ei);
//        return merge(arr1,arr2);
//    }


//    public static int majorityElement(int arr[],int si,int ei){
//        if(si==ei){
//            return arr[si];
//        }
//        int mid=si+(ei-si)/2;
//        int leftmajority=majorityElement(arr, si, mid);
//        int rightmajority=majorityElement(arr,mid+1,ei);
//
//        if(leftmajority==rightmajority){
//            return leftmajority;
//        }
//
//        int leftcount=count(arr,si,ei,leftmajority);
//        int rightcount=count(arr,si,ei,rightmajority);
//
//        return leftcount>rightcount ? leftmajority:rightmajority;
//
//
//    }
//
//    private static int count(int[] arr, int si, int ei, int majority) {
//        int count=0;
//        for (int i = si; i <=ei ; i++) {
//            if(arr[i]==majority){
//                count++;
//            }
//        }
//        return count;
//    }

//    public static int merge(int arr[], int i,int mid, int j){
//            int[] temp=new int[j-i+1];
//            int li=i;//index to iterate over left array
//            int ri=mid+1;//index to interate over right array
//            int k=0;//index to iterate over temp array
//
//        int inversion=0;
//            //comparing the new sorted right and left array
//            while(li<=mid && ri<=j){
//                if(arr[li]<arr[ri]){
//                    temp[k]=arr[li];
//                    li++;
//
//                } else{
//                    temp[k]=arr[ri];
//                    inversion+=mid;
//                    ri++;
//
//                }
//                k++;
//            }
//
//            //left over elements in left array
//            while(li<=mid){
//                temp[k++]=arr[li++];
//
//            }
//        //left over elements in right array
//            while(ri<=j){
//                temp[k++]=arr[ri++];
//
//            }
//
//            //copying the temp array in original array
//            for (li=i,k= 0; k <temp.length ; li++,k++) {
//                arr[li]=temp[k];
//            }
//    return inversion;
//        }
//    public static int invesionCount(int arr[], int i,int j){
//        int inversioncount=0;
//        if(j>i){
//            int mid=i+(j-i)/2;
//            inversioncount=invesionCount(arr,i,mid);
//            inversioncount+=invesionCount(arr,mid+1,j);
//            inversioncount+=merge(arr,i,mid,j);
//        }
//        return inversioncount;
//    }

//    public static int power(int a, int n){
//        if(n==0){
//            return 1;
//        }
//        int halfpower=power(a,n/2);
//        if(n%2==0){
//            return halfpower*halfpower;
//        } else {
//            return halfpower*halfpower*a;
//        }
//
//    }

//    public static void backtrackingInArray(int arr[],int i,int value){
//        if(i==arr.length){
//            for (int j:
//                 arr) {
//                System.out.print(j+" ");
//            }
//        return;
//        }
//
//        arr[i]=value;
//        backtrackingInArray(arr,i+1,value+1);
//        arr[i]=arr[i]-2;
//
//
//
//    }

//    public static void subsetsofString(String str,StringBuilder sub,int i){
//        if(i==str.length()){
//            if(sub.toString().equals(" ")){
//                System.out.println("null");
//            }else {
//                System.out.println(sub);
//
//            }
//            return;
//        }
//
//        //yes choice for each char
//        subsetsofString(str,sub.append(str.charAt(i)),i+1);
//        //no choice for each char
//
//
//
//        subsetsofString(str,sub.deleteCharAt(sub.length()-1),i+1);
//
//    }

//    public static void permutaionOfString(String str,String ans){
//        //base case
//        if(str.length()==0){
//            System.out.println(ans);
//            return;
//        }
//        for (int i = 0; i <str.length() ; i++) {
//            char currrent=str.charAt(i);
//            String remchoice=str.substring(0,i)+str.substring(i+1);
//            permutaionOfString(remchoice,ans+currrent);
//
//        }
//
//    }
//       public static void printBoard(char board[][]){
//           System.out.println("-----Chess Board------");
//           for (int i = 0; i < board.length; i++) {
//               for (int j = 0; j < board.length ; j++) {
//                   System.out.print(board[i][j]);
//               }
//               System.out.println();
//           }
//       }
//
//       //time complexity=O(n!);
//    public static boolean nQueens(char board[][],int row){
//        if(row==board.length){
//            printBoard(board);
////            count++;
//            return true;
//        }
//
//        for (int i = 0; i < board.length ; i++) {
//            if(isSafe(board,row,i)) {
//                board[row][i] = 'Q';
//                if(nQueens(board, row + 1)){
//                    return true;
//                }
//                board[row][i] = 'x';
//            }
//
//        }
//            return false;
//    }
//
//    private static boolean isSafe(char[][] board, int row, int col) {
//           //vertical up
//        for (int i = row-1; i >=0; i--) {
//            if(board[i][col]=='Q'){
//                return false;
//            }
//        }
//        //diagonal left up
//        for (int i =row-1,j=col-1; i >=0 && j>=0 ; i--,j--) {
//            if(board[i][j]=='Q'){
//                return false;
//            }
//        }
//
//        //diagonal right up
//        for (int i =row-1,j=col+1; i >=0 && j< board.length ; i--,j++) {
//            if(board[i][j]=='Q'){
//                return false;
//            }
//        }
//
//        //safe
//        return true;
//
//    }

    //Time Complexity=2^n+m
//public static int gridWays(int n,int m,int i,int j){
//    //base case
//    if(i==n-1 && j==m-1){
//        return 1;
//    } else if (i==n || j==m) {
//        return 0;
//    }
//
//    int right=gridWays(n,m,i,j+1);
//    int down=gridWays(n,m,i+1,j);
//    return right+down;
//
//
//}


//    public static int gridWays(int n,int m){
//        return factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
//    }


//    private static boolean sudokosolver(int[][] sudoko, int row, int col) {
//        //base case
//        if (row == 9) {
//            return true;
//        }
//
//        //recursion
//
//        int nextRow = row, nextcol = col + 1;
//        if (col + 1 == 9) {
//            nextcol = 0;
//            nextRow= row +1;
//
//
//        }
//
//        if (sudoko[row][col] != 0) {
//            return sudokosolver(sudoko, nextRow, nextcol);
//        }
//
//        for (int d = 1; d < 10; d++) {
//            if (isSafe(sudoko, row, col, d)) {
//                sudoko[row][col] = d;
//
//                if(sudokosolver(sudoko, nextRow, nextcol)){
//                    return true;
//                }
//
//            }
//            sudoko[row][col] = 0;
//        }
//        return false;
//    }
//
//    private static boolean isSafe(int sudoko[][], int i, int j, int d) {
//        //column me
//        for (int k = 0; k <=8; k++) {
//            if (sudoko[k][j] == d) {
//                return false;
//            }
//        }
//
//        //row me
//        for (int l = 0; l <=8; l++) {
//            if (sudoko[i][l] == d) {
//                return false;
//            }
//        }
//
//        //grid me
//        int sr = (i / 3) * 3;
//        int sc = (j / 3) * 3;
//        for (int k = sr; k < sr + 3; k++) {
//            for (int l = sc; l < sc + 3; l++) {
//                if (sudoko[k][l] == d) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }


//    private static boolean solveMaze(int[][] maze, int[][] solution, int i, int j) {
//            //base case
//        if(i==maze.length-1 && j== maze.length-1 && maze[i][j]==1){
//            solution[i][j]=1;
//            return true;
//        }
//
//        //recursion
//        if(isSafe(maze,i,j)){
//            if (solution[i][j]==1){
//                return false;
//            }
//            solution[i][j]=1;
//            if(solveMaze(maze,solution,i+1,j)){
//                return true;
//            }
//            if(solveMaze(maze,solution,i,j+1)){
//                return true;
//            }
//            solution[i][j]=0;
//            return false;
//        }
//        return false;
//    }
//
//    private static boolean isSafe(int[][] maze, int i, int j) {
//        return (i>=0 && i < maze.length && j>=0 && j< maze.length && maze[i][j]==1);
//    }
//        static int N=8;
//    static int xMove[] = {2,1, -1, -2, -2, -1,1,2};
//   static int yMove[] = {1,2,2,1, -1, -2, -2, -1};
//        public static boolean knighttour(int[][] sol,int x,int y,int move){
//        if(move==N*N){
//            return true;
//        }
//        int nextrow,nextcol;
//
//            for (int i = 0; i <N ; i++) {
//                nextrow=x+xMove[i];
//                nextcol=y+yMove[i];
//                if(isSafe(sol,nextrow,nextcol,move)){
//                    sol[nextrow][nextcol]=move;
//                    if(knighttour(sol,nextrow,nextcol,move+1)){
//                        return true;
//                    } else {
//                        sol[nextrow][nextcol] = -1;
//
//                    }
//                }
//
//            }
//            return false;
//
//        }
//
//    private static boolean isSafe(int[][] sol, int r, int c, int move) {
//            return (r>=0 && r<N && c>=0 && c<N && sol[r][c]==-1);
//    }
//final static char[][]L ={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
//
//    public static void keypadCombinaions(int position,StringBuilder sb,String d){
//
//        if(position==d.length()){
//            if(d.equals("")){
//                System.out.println("\"\"");
//                return;
//            } else {
//                System.out.println(sb.toString());
//                return;
//            }
//        }
//,
//
//        char[] letters=L[Character.getNumericValue(d.charAt(position))];
//        for (int i = 0; i <letters.length ; i++) {
//            keypadCombinaions(position+1,sb.append(letters[i]),d);
//            sb.deleteCharAt(sb.length()-1);
//        }
//
//}


//    public static int containerWithMostWater(ArrayList<Integer> height){
//        int lp=0;
//        int rp=height.size()-1;
//        int maxwater=0;
//        while (lp<rp){
//            int h=Math.min(height.get(lp),height.get(rp));
//            int width=rp-lp;
//            maxwater=Math.max(maxwater,h*width);
//            //updating pointers
//            if(height.get(lp)<height.get(rp)){
//                lp++;
//            } else {
//                rp--;
//            }
//
//        }
//        return maxwater;
//
//
//    }

    /*public static boolean pairSum1(ArrayList<Integer> nums,int target){
        int lp=0;
        int rp=nums.size()-1;

        while (lp<rp){
            if(nums.get(lp)+nums.get(rp) == target){
                return true;
            }
            if(nums.get(lp)+nums.get(rp) < target){
                lp++;
            } else {
                rp--;

            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> nums,int target){

        //sorted and rotated array

        //finding out the pivot point
        int pivot=-1;
        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i+1)<nums.get(i)){
                pivot=i;
                break;
            }
        }



        int lp=pivot+1;
        int rp=pivot;

        while (lp!=rp){
            if(nums.get(lp)+nums.get(rp) == target){
                return true;
            }
            if(nums.get(lp)+nums.get(rp) < target){
                lp=(lp+1)%nums.size();
            } else {
                rp=(rp+nums.size()-1)%nums.size();

            }
        }
        return false;
    }

*/

//        public static boolean monotonicArrayList(ArrayList<Integer> arr){
//            boolean inc=true;
//            boolean dec=true;
//            for (int i = 0; i <arr.size()-1 ; i++) {
//                if(arr.get(i)>arr.get(i+1)){
//                    inc=false;
//                }
//                if(arr.get(i)<arr.get(i+1)){
//                    dec=false;
//                }
//
//            }
//            return inc||dec;
//        }


//        public static ArrayList<Integer> findLonely(ArrayList<Integer> arr){
//
//            ArrayList<Integer> lonely=new ArrayList<>();
//
//
//            HashMap<Integer,Integer> map=new HashMap<>();
//            for (Integer i:
//                 arr) {
//                map.put(i,map.getOrDefault(i,0)+1);
//            }
//
//            for (Integer i:
//               arr  ) {
//                if(map.get(i)>1 || map.containsKey(i-1)|| map.containsKey(i+1)) continue;
//
//                lonely.add(i);
//            }
//            return lonely;
//
//        }
//
//        public static int mostFrequentNumberFollowingKey(ArrayList<Integer> arr,int key){
//            int[] count=new int[1000];
//
//            for (int i = 0; i <arr.size() ; i++) {
//                if(arr.get(i)==key){
//                    int target=count[arr.get(i+1)]++;
//                }
//            }
//
//            int max=Integer.MIN_VALUE,ans=0;
//            for (int i=0;i<count.length;i++) {
//                if(max<count[i]){
//                    max=count[i];
//                    ans=i;
//                }
//
//
//
//            }
//            return ans;
//        }




   /* public static class LinkedList {

        private static class Node {
            public int data;
            public Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }

        }

        public static Node head;
        public static Node tail;
        public static int size;


        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }


        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void printLL() {
            Node newNode = head;
            while (newNode != null) {
                System.out.print(newNode.data + "->");
                newNode = newNode.next;
            }
            System.out.println("null");
        }


        public void addAtMiddle(int i, int data) {
            if (i == 0) {
                addFirst(data);
                return;
            }
            int index = 0;

            Node node = head;
            while (index < i - 1) {
                node = node.next;
                index++;
            }
            Node newNode = new Node(data);
            newNode.next = node.next;
            node.next = newNode;
            size++;

        }


        public static void removeFirst() {
            if (size == 0) {
                System.out.println("No data present to delete");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;

            }
        }

        public static void removeLast() {
            if (size == 0) {
                System.out.println("No data present to delete");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node prev = head;
                for (int i = 0; i < size - 2; i++) {
                    prev = prev.next;
                }
                prev.next = null;
                tail = prev;
                size--;

            }
        }

        public static int iterativeSearch(int key) {
            int i = 0;
            Node temp = head;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                i++;
                temp = temp.next;
            }
            return -1;
        }


        public static int recursiveSearch(Node head, int key) {
            if (head == null) {
                return -1;

            }
            if (head.data == key) {
                return 0;
            }
            int index = recursiveSearch(head.next, key);
            if (index == -1) {
                return -1;
            }
            return index + 1;
        }

        public void reverseLL() {
            Node prev = null;
            Node cur = head;
            Node next;

            while (cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            head = prev;
        }

        public void deleteNthNodeFromEnd(int n) {
            if (n == size) {
                head = head.next;
                size--;
                return;
            }

            int i = 1;
            int prevIndex = size - n;
            Node temp = head;
            while (i != prevIndex) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;


        }

        public static Node midNode(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

            }

            return slow;

        }

        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }

            //finding out the middle node
            Node mid = midNode(head);


            //reversing the right half of ll
            Node prev = null;
            Node cur = mid;
            Node next;

            while (cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }


            // comparing the right and left part are equal or not
            Node left = head;
            Node right = prev;
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        public boolean isCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow.equals(fast)) {
                    return true;
                }
            }
            return false;
        }

        public void removeCycle() {
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow.equals(fast)) {
                    cycle = true;
                    break;
                }
            }

            if (cycle) {
                slow = head;
                Node prev = null;
                while (slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }

                prev.next = null;
            }

        }

        public static Node getMidNode(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow;
        }

        public static Node merge(Node lefhead, Node righhead) {
            Node lh = lefhead;
            Node rh = righhead;
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;

            while (lh != null && rh != null) {
                if (lh.data <= rh.data) {
                    temp.next = lh;
                    lh = lh.next;
                    temp = temp.next;
                } else {
                    temp.next = rh;
                    rh = rh.next;
                    temp = temp.next;
                }
            }


            while (lh != null) {
                temp.next = lh;
                lh = lh.next;
                temp = temp.next;
            }

            while (rh != null) {
                temp.next = rh;
                rh = rh.next;
                temp = temp.next;
            }


            return mergeLL.next;

        }

        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            //findOut out the middle node--mid will be the last node of last node
            Node mid = getMidNode(head);

            //diving the linked linked into two parts
            Node rightHead = mid.next;
            mid.next = null;
            Node lh = mergeSort(head);
            Node rh = mergeSort(rightHead);
            return merge(lh, rh);

        }


        public static void zigZag() {
            //find out the mid node

            Node mid = getMidNode(head);

            //reversing the second part of ll

            Node prev = null;
            Node cur = mid.next;
            mid.next = null;
            Node next;

            while (cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }

            //alternative merge
            Node leftHead = head;
            Node rightHead = prev;
            Node nextLeft, nextRight;

            while (leftHead != null && rightHead != null) {
                nextLeft = leftHead.next;
                leftHead.next = rightHead;
                nextRight = rightHead.next;
                rightHead.next = nextLeft;

                leftHead = nextLeft;
                rightHead = nextRight;

            }


        }


        public Node getIntersectionPoint(Node head1, Node head2) {

            while (head2 != null) {
                Node temp = head1;

                while (temp != null) {
                    if (temp == head2) {
                        return head2;
                    }
                    temp = temp.next;
                }
                head2 = head2.next;

            }
            return null;
        }


        public static void deleteNAfterM(Node head, int m, int n) {

            Node cur = head;
            Node temp;
            while (cur != null) {
                for (int i = 1; i < m && cur != null; i++) {
                    cur = cur.next;
                }
                if (cur == null) {
                    return;
                }
                temp = cur.next;
                for (int i = 1; i <= n && temp != null; i++) {
                    temp = temp.next;
                }
                cur.next = temp;
                cur = temp;
            }

        }


        public void swappingNodeLL(int x, int y) {


            Node curX, prevX, curY, prevY;
            curX = head;
            curY = head;
            prevX = null;
            prevY = null;


            //chaging the pointer of node before curnode to curY
            //find out the prevX
            while (curX != null && curX.data != x) {
                prevX = curX;
                curX = curX.next;
            }

            //finoing out prevY
            while (curY != null && curY.data != y) {
                prevY = curY;
                curY = curY.next;
            }

            //change the ponter of prevX and prevY
            if (curX == null || curY == null) {
                return;
            }
            if (prevX != null) {
                prevX.next = curY;
            } else {
                head = curY;
            }

            if (prevY != null) {
                prevY.next = curX;
            } else {
                head = curX;
            }


            Node temp = curX.next;
            curX.next = curY.next;
            curY.next = temp;


        }


        public static void oddAndEvenLL() {
            Node oddStart = null;
            Node oddEnd = null;
            Node evenStart = null;
            Node evenEnd = null;


            Node cur = head;

            while (cur != null) {

                int data = cur.data;

                if (data % 2 == 0) {
                    if (evenStart == null) {
                        evenStart = cur;
                        evenEnd = evenStart;
                    } else {
                        evenEnd.next = cur;
                        evenEnd = evenEnd.next;
                    }
                } else {

                    if (oddStart == null) {
                        oddStart = cur;
                        oddEnd = oddStart;
                    } else {
                        oddStart.next = cur;
                        oddEnd = oddEnd.next;
                    }
                }

                cur = cur.next;
            }

            evenEnd.next = oddStart;
            oddEnd.next = null;
            head = evenStart;

        }


        public static Node mergeLL(Node pointerA, Node pointerB) {

            //base case
            if (pointerA == null) {
                return pointerB;
            } else if (pointerB == null) {
                return pointerA;
            }
            Node result = null;
            if (pointerA.data <= pointerB.data) {
                result = pointerA;
                result.next = mergeLL(pointerA.next, pointerB);
            } else {
                result = pointerB;
                result.next = mergeLL(pointerA, pointerB.next);
            }

            return result;
        }


        public static Node mergeKList(Node[] list) {
            if (list == null || list.length == 0) {
                return null;
            }


            int last = list.length - 1;


            while (last != 0) {
                int i = 0, j = last;
                while (i < j) {
                    list[i] = mergeLL(list[i], list[j]);
                    i++;
                    j--;
                    if (i >= j) {
                        last = j;
                    }
                }
            }
            return list[0];
        }
    }*/
    /*public static class DoublyLL{
        public static class Node{
            int data;
            Node next;
            Node prev;

            Node(int data){
                this.data=data;
                this.prev=null;
                this.next=null;

            }
        }

        public static Node head;
        public static Node tail;
        public static int size;



        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }

            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            size++;


        }

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }

            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            size++;



        }

        public static void printDLLInc(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public static void removeFirst(){
            if(head==null){
                System.out.println("Empty List");
                return;
            }
            if(size==1){
                head=tail=null;
                size--;
                return;
            }
            head=head.next;
            head.prev=null;
            size--;

        }


        public static void removeLast(){
            if(head==null){
                System.out.println("Empty List");
                return;
            }
            if(size==1){
                head=tail=null;
                size--;
                return;
            }
            tail=tail.prev;
            tail.next=null;
            size--;
        }


        public static void reverseDL(){
            Node prev=null;
            Node cur=head;
            Node next;

            while (cur!=null){
                next=cur.next;
                cur.next=prev;
                cur.prev=next;
                prev=cur;
                cur=next;
            }
            head=prev;

        }

    }*/

/*public static class Node implements Comparable<Node>{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }


    @Override
    public int compareTo(Node o) {
        return this.data-o.data;
    }
}*/
   /* public static class Queue{

        public static Node head;
        public static Node tail;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

            public static void add(int data){
            Node newNode=new Node(data);

            if(isEmpty()){
                head=tail=newNode;
                return;
           }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int value= head.data;
            if(head==tail){
               head=tail=null;
            } else {

                head = head.next;
            }
            return value;
        }


        public static  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }


      *//*
         QUEUES IMPLEMENTATION USING ARRAYS
       public static int[] arr;
        public static int size;
        public static int rear;
        public static int front;


        Queue(int n){
            size=n;
            arr=new int[size];
            rear=-1;
            front=-1;

        }

        public  boolean isEmpty(){
            return rear==-1 && front==-1;

        }

        public  boolean isFull(){
            return (rear+1)%size==front;
        }

        public  void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }



        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int value=arr[front];

            if(rear==front){
                rear=front=-1;

            } else {
                front=(front+1)%size;
            }


            return value;

        }


        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }*//*


    }

*/
   /* public static class  Stack{
       static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("No element exists");
                return -1;
            }
            int value=list.get(list.size()-1);
            list.remove(list.size()-1);
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("No element exists");
                return -1;
            }
            return list.get(list.size()-1);
        }*/


      /*  public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;



        // is empty
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                size++;
                return;
            }

            newNode.next=head;
            head=newNode;
            size++;
        }


        public static void pop(){
            int value=head.data;
            head=head.next;
            size--;
//            return value;
        }

        public static int peek(){
            return head.data;
        }



    }

    public static void pushAtBottom(java.util.Stack<Integer> st,int data){

        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top=st.pop();
        pushAtBottom(st,data);
        st.push(top);

    }

    public static String reverseAStringUsingStack(String str){
        java.util.Stack<Character> st=new java.util.Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            st.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }


    public static void reverseStack(java.util.Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top=st.pop();
        reverseStack(st);
        pushAtBottom(st,top);

    }


    public static void stockSpanProblem(int[] stock,int[] span){
        java.util.Stack<Integer> stack=new java.util.Stack<>();

        for (int i = 0; i <stock.length ; i++) {
            int current=stock[i];
            while (!stack.isEmpty() && current>stock[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            } else {
                span[i]=i-stack.peek();

            }

            stack.push(i);
        }
    }



    public static void nextGreaterElement(int[] arr,int[] nextGreater) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
    }


        public static boolean validParenthesis(String str){
            java.util.Stack<Character> stack=new java.util.Stack<>();


            for (int i = 0; i < str.length(); i++) {
            char cur=str.charAt(i);
            //opening parathesis
            if(cur=='(' || cur=='{'||cur=='['){
                stack.push(cur);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                if( ( stack.peek()=='(' && cur==')' ) || ( stack.peek()=='{' && cur=='}' ) || ( stack.peek()=='[' && cur==']' )){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

            if(stack.isEmpty()){
                return true;
            } else {
                return false;
            }


    }



    public static boolean duplicateParenthesis(String str){

        java.util.Stack<Character> stack=new java.util.Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur=str.charAt(i);
            //closing
            if(cur==')') {
                int count = 0;
                while (stack.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else {
                stack.push(cur);
            }
        }
        return false;
    }

        public static int[] nextSmallerRight(int[] height){
            java.util.Stack<Integer> stack=new java.util.Stack<>();
            int[] nextSmallerRight=new int[height.length];
            for (int i = height.length -1; i >=0 ; i--) {
                int cur=height[i];

                while (!stack.isEmpty() && cur<height[stack.peek()]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    nextSmallerRight[i]=height.length;
                } else {
                    nextSmallerRight[i]=stack.peek();
                }

                stack.push(i);
            }

            return nextSmallerRight;

        }

    public static int[] nextSmallerLeft(int[] height){
        java.util.Stack<Integer> stack=new java.util.Stack<>();
        int[] nextSmallerLeft=new int[height.length];
        for (int i =0; i <height.length ; i++) {
            int cur=height[i];

            while (!stack.isEmpty() && cur<height[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nextSmallerLeft[i]=-1;
            } else {
                nextSmallerLeft[i]=stack.peek();
            }

            stack.push(i);
        }

        return nextSmallerLeft;

    }
    public static int maxAreaInHistogram(int[] height){

        int[] nextSmallerRight=nextSmallerRight(height);
        int[] nextSmallerLeft=nextSmallerLeft(height);

        int maxArea=Integer.MIN_VALUE;

        for (int i = 0; i <height.length ; i++) {
            int area=height[i]*(nextSmallerRight[i] - nextSmallerLeft[i]-1);
            maxArea=Math.max(area,maxArea);

        }
        return maxArea;

    }

        public static String simplifyPath(String path){

        String res="/";
            java.util.Stack<String> stack1=new java.util.Stack<>();


            for (int i = 0; i < path.length(); i++) {
                String dir="";

                while (i<path.length()&& path.charAt(i)=='/') {
                   i++;
                }
                while (i<path.length()&& path.charAt(i)!='/'){
                    dir+=path.charAt(i);
                    i++;
                }
                if(dir.equals("..")){
                    stack1.pop();
                } else if (dir.equals(".")){
                    continue;
                } else if(dir.length()!=0){
                    stack1.push(dir);
                }

            }


            java.util.Stack<String> stack2=new java.util.Stack<>();
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            while (!stack2.isEmpty()){
                if(stack2.size()!=1){
                    res+=stack2.pop()+"/";
                } else {
                    res+=stack2.pop();
                }
            }

    return res;
        }

        public static int trappingRainwaterUsingStacks(int[] height){

            java.util.Stack<Integer> stack=new java.util.Stack<>();
            int area=0;
            for (int i = 0; i <height.length ; i++) {
                while (!stack.isEmpty()&& height[i]>height[stack.peek()]){
                    int popHeight=stack.pop();//this is barlevel
                    if(stack.isEmpty()){
                        break;
                    }
                    int width=i-stack.peek()-1;
                    int waterLevel=Math.min(height[stack.peek()],height[i])-height[popHeight];//peek element is left max and cur element is right max
                    area+=waterLevel*width;


                }

                stack.push(i);
            }
            return area;

        }



        public static String decodeString(String str){
            java.util.Stack<Integer> integerStack=new java.util.Stack<>();
            java.util.Stack<String> stringStack=new java.util.Stack<>();
            String curString="";
            int count=0;

            for (char ch:
                 str.toCharArray()) {
                if(Character.isDigit(ch)){
                    count=count*10+(ch-'0');
                } else if (ch=='[') {
                    integerStack.push(count);
                    stringStack.push(curString);
                    count=0;
                    curString="";

                } else if (ch==']') {

                    StringBuilder decodedString=new StringBuilder(stringStack.pop());
                    int repeatTimes=integerStack.pop();
                    for (int i = 0; i < repeatTimes; i++) {
                        decodedString.append(curString);
                    }
                    curString=decodedString.toString();
                } else {
                    curString+=ch;

                }
            }
        return curString;
        }
*/


    //IMPLEMENTING QUEUES USING TWO STACKS


   /* public static class Queue{
      static   Stack<Integer> s1=new Stack<>();
        static  Stack<Integer> s2=new Stack<>();


        public static boolean isEmpty(){
            return s1.isEmpty();
        }


        //  TIME COMPLEXITY FOR THIS IS O(n)
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }


        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }


        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

    }*/


//    public static class Stack{
//        static Queue<Integer> q1=new LinkedList<>();
//        static Queue<Integer> q2=new LinkedList<>();
//
//
//        public static boolean isEmpty(){
//            return q1.isEmpty()&&q2.isEmpty();
//        }
//
//        public static void push(int data){
//            if(!q1.isEmpty()){
//                q1.add(data);
//            }else {
//                q2.add(data);
//            }
//
//        }
//
//
//
//        public static int pop(){
//            int top=0;
//            if(!q1.isEmpty()){
//                while (!q1.isEmpty()){
//                    top=q1.remove();
//                    if(q1.isEmpty()){
//                        break;
//                    }
//
//                    q2.add(top);
//                }
//            } else{
//                while (!q2.isEmpty()){
//                    top=q2.remove();
//                    if(q2.isEmpty()){
//                        break;
//                    }
//                    q1.add(top);
//                }
//            }
//            return top;
//        }
//
//
//        public static int peek(){
//            int top=0;
//            if(!q1.isEmpty()){
//                while (!q1.isEmpty()){
//                    top=q1.remove();
//
//
//                    q2.add(top);
//                }
//            } else{
//                while (!q2.isEmpty()){
//                    top=q2.remove();
//
//                    q1.add(top);
//                }
//            }
//            return top;
//
//        }
//
//    }



   /* public static void firstNonRepeatingLetter(String str){

        int freq[]=new int[26];
        Queue<Character> queue=new LinkedList<>();

        for (int i = 0; i <str.length() ; i++) {
            char cur=str.charAt(i);
            queue.add(cur);
            freq[cur-'a']++;

            while (!queue.isEmpty()&&freq[queue.peek()-'a']>1){
                queue.remove();
            }

            if(queue.isEmpty()){
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek()+" ");
            }
        }



    }
*/

   /* public static void interleaveTwoHalvesOfQueue(Queue<Integer> q){
        Queue<Integer> first=new ArrayDeque<>();

        int size=q.size();

        for (int i = 0; i <size/2 ; i++) {
            first.add(q.remove());
        }

        while (!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }

    }*/


   /* public static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int top=q.remove();
        reverseQueue(q);
        System.out.print(top+ " ");
    }*/

   /* public static class Stack{
        Deque<Integer> deque=new ArrayDeque<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }


    }

    public static class Queue{
        Deque<Integer> deque=new ArrayDeque<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }


    }*/


  /*  public static void generateBinaryNumber(int n){
        Queue<String> queue=new ArrayDeque<>();

        queue.add("1");

        while (n-- >0){
            String s1=queue.remove();
            System.out.println(s1);
            queue.add(s1+"0");
            queue.add(s1+"1");

        }

    }*/
 /* public static void reverseQueue(Queue<Integer> q,int k){
      if(k==0){
          return;
      }
      int top=q.remove();
      reverseQueue(q,k-1);
    q.add(top);
  }

    public static void reverseFirstElementsOfQueue(Queue<Integer> queue,int k){
      if(k==0){
          return;
      }
        reverseQueue(queue,k);
      int nextHalf=queue.size()-k;
      while (nextHalf-->0){
          queue.add(queue.remove());
      }


    }

    public static void maxSubArrayElementOfSizeK(int[] arr,int k){
      Deque<Integer> deque=new ArrayDeque<>();
        for (int i = 0; i <k ; i++) {
            while (!deque.isEmpty() && arr[i]>arr[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i < arr.length ; i++) {
            System.out.println(arr[deque.peek()]);

            while (!deque.isEmpty() && deque.peek()<=i-k){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);

        }
        System.out.println(arr[deque.peek()]);

    }*/
/*public static int buyAndSellStocks(int[] stocks){
    int buyPrice=Integer.MAX_VALUE;
    int profit=0;
    int sellingprice=0;
    int maxprofit=Integer.MIN_VALUE;


    for (int i = 0; i <stocks.length ; i++) {
        sellingprice=stocks[i];
        if(sellingprice>buyPrice){
            profit=(sellingprice-buyPrice);
        }else {
            buyPrice=stocks[i];
        }

        maxprofit=Math.max(profit,maxprofit);
    }
    return maxprofit;
}*/



    /*public static void activitySelection(){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};

        //if activites are not given in sorted manner according to the end time

        int[][] activities=new int[start.length][3];
        for (int i = 0; i < start.length ; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));


        int maxAct=0;
        ArrayList<Integer> activity=new ArrayList<>();
        maxAct=1;
        activity.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for (int i = 1; i < activities.length ; i++) {
            if(activities[i][1]>=lastEnd){
                maxAct++;
                activity.add(i);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Count of the activites that cab ve performed "+maxAct+ "  ");
        for (int i:
             activity) {
            System.out.print("A"+i+" ");
        }
        System.out.println();
    }
*/

    /*public static void fractionalKnapsack(int[] value,int[] weight,int knapsackSize){

        double ratio[][]=new double[value.length][2];
        for (int i = 0; i < value.length ; i++) {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity=knapsackSize;
        int finalValue=0;

        for (int i = ratio.length-1; i >=0 ; i--) {
            int index=(int) ratio[i][0];
            if(capacity>=weight[index]){
                finalValue+=value[index];
                capacity-=weight[index];
            } else {
                finalValue+=capacity*ratio[i][1];
                capacity=0;
                break;
            }
        }

        System.out.println(finalValue);
    }

    public static void minSumAbsoluteDiff(){
        int[] A={1,2,3};
        int[] B={2,1,4};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for (int i = 0; i <A.length ; i++) {
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println(minDiff);
    }


    public static void maxLengthOfChainOfPairs(){
        int[][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int maxLenght=1;
        int lastPairEnd=pairs[0][1];
        for (int i = 1; i <pairs.length ; i++) {
            if(pairs[i][0]>lastPairEnd){
                maxLenght++;
                lastPairEnd=pairs[i][1];
            }
        }
        System.out.println(maxLenght);

    }

    public static void indianCoins(){
        Integer[] denominations={1,2,5,10,20,50,100,500,2000};
        int value=590;
        Arrays.sort(denominations,Collections.reverseOrder());
        int minCount=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < denominations.length ; i++) {
            int currentValue=denominations[i];

            while (value>=currentValue ){
                minCount++;
                ans.add(denominations[i]);
                value-=currentValue;
            }
        }
        System.out.println("Total currencies used min "+minCount);
        System.out.println(ans);
    }
*/

    /*    public static class Job{
            int id;
            int profit;
            int deadline;

            Job(int id,int profit,int deadline){
                this.id=id;
                this.profit=profit;
                this.deadline=deadline;
            }
        }
    public static void jobSequencing(){
        int[][] jobsInfo={{4,20}, {1,10}, {1,40}, {1,30}};
        ArrayList<Job> jobs=new ArrayList<Job>();

        for (int i = 0; i < jobsInfo.length ; i++) {
            jobs.add(new Job(i,jobsInfo[i][1],jobsInfo[i][0]));
        }
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit -obj1.profit );
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curJob=jobs.get(i);
            if(curJob.deadline>time){
                time++;
                seq.add(curJob.id);
            }
        }

        System.out.println("Maximum number of jobs that can be done are"+seq.size());
        for (int i:
             seq) {
            System.out.print(i+" ");
        }

    }*/

  /*  public static void chocolaProblem(){
        int n=4,m=6;
        Integer[] costVer={2,1,3,1,4};//m-1
        Integer[] costHoz={4,1,2};//n-1

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHoz,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while (h<costHoz.length && v<costVer.length){
            if(costVer[v]<=costHoz[h]){
                cost+=(costHoz[h]*vp);
                hp++;
                h++;
            } else {
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }

        while (h<costHoz.length){

                cost+=(costHoz[h]*vp);
                hp++;
                h++;

        }
        while (v<costVer.length){

            cost+=(costVer[v]*hp);
            vp++;
            v++;

        }

        System.out.println("Minimum price of the cutting the choclate bars is "+cost);


    }*/


  /*  public static void  maxBalanceStringPartitions(){

        String str="LRRRRLLRLLRL";

        int l=0;
        int r=0;
        int ans=0;

        for (int i = 0; i <str.length() ; i++) {
            char cur=str.charAt(i);
            if(cur == 'L'){
                l++;
            } else if (cur == 'R') {
                r++;
            }

            if(l==r){
                ans++;
            }
        }
        System.out.println("Maximaum balanced String partion "+ ans);

    }*/


 /*   public static void kthLargestOddNumber(){
        int[] p = { -3, 3 };
        int l=p[0];
        int r=p[1];
        int k=1;


        int count=0;

        if((r & 1) >0){
            count=(int)Math.ceil((r-l+1)/2);
            if(k>count){
                System.out.println("odd numbers of this size is not present");
                return;
            } else {
                System.out.println(r-2*k+2);
                return;
            }


        } else {
            count=(r-l+1)/2;
            if(k>count){
                System.out.println("odd numbers of this size is not present");
                return;
            } else {
                System.out.println(r-2*k+1);
                return;
            }
        }
    }*/

  /*  public static void kthLargestOddNumber() {
        int[] p = {-3, 3};
        int l = p[0];
        int r = p[1];
        int k = 1;
        int temp = l;
        ArrayList<Integer> oddList = new ArrayList<>();
        while (temp <= r) {
            if (temp % 2 != 0) {
                oddList.add(temp);
            }
            temp++;
        }
        Collections.sort(oddList, Collections.reverseOrder());
        System.out.println(oddList.get(k - 1));

    }*/

  /*  public static String getSmallestString(int n, int k) {
        char[] smallerString = new char[n];
        Arrays.fill(smallerString, 'a');
        k -= n;

        while (k > 0){
            smallerString[n - 1] += Math.min(25, k);
           n--;
        k -= Math.min(25, k);
    }
    return String.valueOf(smallerString);
}*/
//  static int i=-1;
    public static class Node{
        int data;
        Node leftChild;
        Node rightChild;
    int depth;
        Node(int data){
            this.data=data;
            this.leftChild=null;
            this.rightChild=null;
            this.depth=0;
        }
    }
   /*public static class BinaryTree {

      public static Node buildTreePreorder(int[] preorder) {
        i++;
        if(preorder[i]==-1){
            return null;
        }

        Node newnode=new Node(preorder[i]);
        newnode.leftChild=buildTreePreorder(preorder);
        newnode.rightChild=buildTreePreorder(preorder);
        return newnode;
      }



      public static void preOrderTraversal(Node root){
          if(root==null){
              System.out.print(-1+" ");
              return;
          }
          System.out.print(root.data+" ");
          preOrderTraversal(root.leftChild);
          preOrderTraversal(root.rightChild);

      }

        public static void inOrderTraversal(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            inOrderTraversal(root.leftChild);
            System.out.print(root.data+" ");

            inOrderTraversal(root.rightChild);

        }
        public static void postOrderTraversal(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            postOrderTraversal(root.leftChild);


            postOrderTraversal(root.rightChild);
            System.out.print(root.data+" ");
        }


        public static void levelTraversal(Node root){
          if(root==null){
              return;
          }
          Queue<Node> queue=new LinkedList<>();
          queue.add(root);
          queue.add(null);


          while (!queue.isEmpty()){
              Node curNode=queue.remove();
              if(curNode==null){
                  System.out.println();
                  if(queue.isEmpty()){
                      break;
                  } else {
                      queue.add(null);
                  }
              } else {
                  System.out.print(curNode.data+" ");
                  if(curNode.leftChild!=null){
                      queue.add(curNode.leftChild);
                  }
                  if(curNode.rightChild!=null){
                      queue.add(curNode.rightChild);
                  }
              }
          }
        }


        public static int heightOfTree(Node root){
          if(root==null){
              return 0;
          }
          int leftHeight=heightOfTree(root.leftChild);
            int rightHeight=heightOfTree(root.rightChild);
            return Math.max(leftHeight,rightHeight)+1;
        }

        public static int countOfNodes(Node root){
          if(root==null){
              return 0;
          }
          int leftCount=countOfNodes(root.leftChild);
          int rightCount=countOfNodes(root.rightChild);
          return leftCount+rightCount+1;
        }

        public static int sumOfNodes(Node root){
          if(root ==null){
              return 0;
          }

          int leftSum=sumOfNodes(root.leftChild);
          int rightSum=sumOfNodes(root.rightChild);
          return leftSum+rightSum+root.data;
        }


        public static int diameter2(Node root){
          if(root==null){
              return 0;
          }

          int ld=diameter2(root.leftChild);
          int lh=heightOfTree(root.leftChild);
          int rd=diameter2(root.rightChild);
          int rh=heightOfTree(root.rightChild);
          int selfDia=lh+rh+1;
          return Math.max(Math.max(ld,rd),selfDia);
        }

        public static class Info{
          int dia;
          int h;

          Info(int dia,int h){
              this.dia=dia;
              this.h=h;
          }

        }
        public static Info diameter(Node root){
          if(root==null){
              return new Info(0,0);
          }
          Info leftInfo=diameter(root.leftChild);
          Info rightInfo=diameter(root.rightChild);

          int finalDia=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.h+rightInfo.h+1);
          int finalH=Math.max(leftInfo.h,rightInfo.h)+1;
          return new Info(finalDia,finalH);

        }
        *//*      1
            2        3
         4    5     6    7
        *//*

        public static boolean isIdentical(Node node,Node subroot){
            if(node==null && subroot==null){
                return true;
            } else if (node==null ||subroot==null || node.data!=subroot.data) {
                return false;
            }
            if(!isIdentical(node.leftChild,subroot.leftChild)){
                return false;
            }
            if(!isIdentical(node.rightChild,subroot.rightChild)){
                return false;
            }
            return true;

        }

        public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }

            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }

            return isSubtree(root.leftChild,subroot)|| isSubtree(root.rightChild,subroot);
        }

        public static class NodeInfo{
            int hd;
            Node node;
            NodeInfo(int hd,Node node){
                this.hd=hd;
                this.node=node;
            }
        }
        public static void topViewOfTree(Node root){
            Queue<NodeInfo> queue=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            queue.add(new NodeInfo(0,root));
            queue.add(null);
            int max=0,min=0;
            while (!queue.isEmpty()){
                NodeInfo nodeInfo=queue.remove();
                if(nodeInfo==null){
                    if(queue.isEmpty()){
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    if(!map.containsKey(nodeInfo.hd)){
                        map.put(nodeInfo.hd,nodeInfo.node);
                    }
                    if(nodeInfo.node.leftChild != null){
                        queue.add(new NodeInfo(nodeInfo.hd-1,nodeInfo.node.leftChild));
                        min=Math.min(min,nodeInfo.hd-1);
                    }
                    if(nodeInfo.node.rightChild != null){
                        queue.add(new NodeInfo(nodeInfo.hd+1,nodeInfo.node.rightChild));
                        max=Math.max(max,nodeInfo.hd+1);
                    }
                }
            }
            System.out.println(min+" "+max);

            for (int j = min; j <=max ; j++) {
                System.out.print(map.get(j).data+" ");
            }
            System.out.println();
        }


        public static void kthLevel(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.println(root.data);
                return;
            }
            kthLevel(root.leftChild,level+1,k);
            kthLevel(root.rightChild,level+1,k);
        }

        public static void kthLevelBFS(Node root,int k){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            int level=1;
            while (!q.isEmpty()){
                Node cur=q.remove();

                if(cur==null){
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                    level++;

                } else {
                    if(level==k){
                        System.out.println(cur.data);

                    }
                    if(level>k){
                        break;
                    }
                    if(cur.leftChild!=null){
                        q.add(cur.leftChild);
                    }
                    if(cur.rightChild!=null){
                        q.add(cur.rightChild);
                    }

                }
            }
        }

        public static boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }
            boolean foundLeft=getPath(root.leftChild,n,path);
            boolean foundRight=getPath(root.rightChild,n,path);
            if(foundLeft || foundRight){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }

        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i=0;
            for (; i<path1.size() && i<path2.size() ; i++) {
                if(path1.get(i)!=path2.get(i)){
                    break;
                }

            }
            Node lca=path1.get(i-1);
            return lca;



        }



        public static Node lca2(Node root,int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }

            Node leftLca=lca2(root.leftChild,n1,n2);
            Node rightLca=lca2(root.rightChild,n1,n2);
            if(leftLca==null){
                return rightLca;
            }
            if(rightLca==null){
                return leftLca;
            }
            return root;

        }


        public static int lcaDist(Node root,int n) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = lcaDist(root.leftChild, n);
            int rightDist = lcaDist(root.rightChild, n);
            if (leftDist == -1) {
                return rightDist + 1;
            } else {

                return leftDist + 1;

            }
        }

        public static int minDist(Node root, int n1, int n2){

            Node lca=lca2(root,n1,n2);

            int lcaToN1=lcaDist(lca,n1);
            int lcaToN2=lcaDist(lca,n2);

            return lcaToN1+lcaToN2;

        }

        public static int kthAncesstor(Node root,int n,int k){
        if(root==null){
            return -1;
        }

            if(root.data==n){
                return 0;
            }
            int leftdist=kthAncesstor(root.leftChild,n,k);
            int rightdist=kthAncesstor(root.rightChild,n,k);

            if(leftdist==-1 && rightdist==-1){
                return -1;
            }
            int max=Math.max(leftdist,rightdist);
            if(max+1 == k){
                System.out.println(root.data);

            }
            return max+1;

        }


        public static int transformSumTree(Node root){
            if(root==null){
                return 0;
            }

            int left=transformSumTree(root.leftChild);
            int right=transformSumTree(root.rightChild);
//            int sum=root.leftChild.data+root.rightChild.data;
            int d=root.data;
            int totalsubtree=0;
            if(root.leftChild == null && root.rightChild==null){
                totalsubtree=left+right;
            } else {
                totalsubtree=root.leftChild.data+left+right+root.rightChild.data;
            }
            root.data=totalsubtree;
            return d;
        }


        public static boolean univalued(Node root){
        if(root==null){
            return true;
        }
            if(root.leftChild!=null && root.leftChild.data!=root.data){
                return false;
            }


            if(root.rightChild!=null && root.rightChild.data!=root.data){
                return false;
            }

            return univalued(root.leftChild) && univalued(root.rightChild);


        }

        public static void mirrorBT(Node root){
            if(root==null){
                return;
            }

            Node temp=root.leftChild;
            root.leftChild=root.rightChild;
            root.rightChild=temp;

            mirrorBT(root.leftChild);
            mirrorBT(root.rightChild);



        }


        public static Node deleteLeaf(Node root,int n){
            if(root==null){
                return null;
            }

           root.leftChild= deleteLeaf(root.leftChild,n);
           root.rightChild= deleteLeaf(root.rightChild,n);
            if(root.leftChild==null && root.rightChild==null && root.data==n){
                return null;
            }

            return root;

        }

        static HashMap<String,Integer> map=new HashMap<>();
     public   static ArrayList<String> arrayList=new ArrayList<>();
        public static String dupSubtrees(Node root)
        {
            if(root==null){
                return "N";
            }

            String str="";
            str+=Integer.toString(root.data)+","+dupSubtrees(root.leftChild)+","+dupSubtrees(root.rightChild);
            map.put(str,map.getOrDefault(str,0)+1);
            if( map.get(str)==2){
                arrayList.add(str);
            }

                return str;

        }


        static int maxSum=0;
        public static int maximumSum(Node root){
            if(root==null){
                return 0;
            }
            int left=maximumSum(root.leftChild);
            int right=maximumSum(root.rightChild);
            int niche_wala_hi_answer=left+right+root.data;

            int koi_aik_acha=Math.max(left,right)+root.data;
            int kud_hi_acha=root.data;

            maxSum=Math.max(maxSum,Math.max(niche_wala_hi_answer,Math.max(koi_aik_acha,kud_hi_acha)));
            return Math.max(koi_aik_acha,kud_hi_acha);

        }
  }*/

   /* public static Node buildBST(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }

        if(root.data>value){
           root.leftChild=buildBST(root.leftChild,value);
        } else {
            root.rightChild=buildBST(root.rightChild,value);
        }

        return root;
    }


    public static void inorderBST(Node root) {
        if (root == null) {
            return;
        }
        inorderBST(root.leftChild);
        System.out.print(root.data +" ");
        inorderBST(root.rightChild);
    }

    public static boolean searchInBST(Node root,int k){
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        if (root.data>k){
            return searchInBST(root.leftChild,k);
        } else {
            return searchInBST(root.rightChild,k);
        }
    }

    public static Node findInorderSuccessor(Node root){
        while (root.leftChild!=null){
            root=root.leftChild;
        }
        return root;
    }
    public static Node deleteNode(Node root,int value){
        if(root.data>value){
            root.leftChild=deleteNode(root.leftChild,value);
        } else if (root.data<value) {
            root.rightChild=deleteNode(root.rightChild,value);
        } else {
            //case 1 -- no child node
            if(root.leftChild==null && root.rightChild==null){
                return null;
            }
            //case 2 one child node
            if(root.leftChild==null){
                return root.rightChild;
            } else if(root.rightChild==null) {
                return root.leftChild;
            }


            //case 3 two child node

            Node inorderSucc=findInorderSuccessor(root.rightChild);
            root.data=inorderSucc.data;
            root.rightChild=deleteNode(root.rightChild,inorderSucc.data);

        }
        return root;
    }


    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        if(root.data>=k1 && root.data<=k2){
            printInRange(root.leftChild,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.rightChild,k1,k2);
        } else if (root.data <k1) {
            printInRange(root.rightChild,k1,k2);
        } else {
            printInRange(root.leftChild,k1,k2);
        }
    }
        static ArrayList<Integer> arrayList=new ArrayList<>();
    public static void rootToLeafPaths(Node root){
        if(root==null){

            return;
        }
        arrayList.add(root.data);
        if(root.leftChild==null&& root.rightChild==null){
            System.out.println(arrayList);
        }

        rootToLeafPaths(root.leftChild);
        rootToLeafPaths(root.rightChild);
        arrayList.remove(arrayList.size()-1);

    }
    public static void levelTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);


        while (!queue.isEmpty()){
            Node curNode=queue.remove();
            if(curNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(curNode.data+" ");
                if(curNode.leftChild!=null){
                    queue.add(curNode.leftChild);
                }
                if(curNode.rightChild!=null){
                    queue.add(curNode.rightChild);
                }
            }
        }
    }


    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.leftChild,min,root) && isValidBST(root.rightChild,root,max);
    }

    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }

        Node left=mirrorBST(root.leftChild);
        Node right=mirrorBST(root.rightChild);
        root.leftChild=right;
        root.rightChild=left;
        return root;
    }


    public static Node createBBSTFromARR(int arr[],int si,int end){
        if(si>end){
            return null;
        }
        int mid=(si+end)/2;
        Node root=new Node(arr[mid]);
        root.leftChild=createBBSTFromARR(arr,si,mid-1);
        root.rightChild=createBBSTFromARR(arr,mid+1,end);
        return root;

    }

    public static Node createBBSTFromARR(ArrayList<Integer> nodes,int si,int end){
        if(si>end){
            return null;
        }
        int mid=(si+end)/2;
        Node root=new Node(nodes.get(mid));
        root.leftChild=createBBSTFromARR(nodes,si,mid-1);
        root.rightChild=createBBSTFromARR(nodes,mid+1,end);
        return root;

    }
    public static void inorderSequence(Node root,ArrayList<Integer> nodes){
        if(root==null){
            return;
        }
        inorderBST(root.leftChild);
        nodes.add(root.data);

        inorderBST(root.rightChild);
    }
    public static void inorderSequence(Node root,HashMap<Integer,Integer> nodes){
        if(root==null){
            return;
        }
        inorderBST(root.leftChild);
        nodes.put(root.data,1);
        inorderBST(root.rightChild);
    }
    public static Node balancingBST(Node root){
    ArrayList<Integer> nodes=new ArrayList<>();
        inorderSequence(root,nodes);
    return createBBSTFromARR(nodes,0,nodes.size()-1);

    }

    static class Info{
        boolean isValid;
        int sum;
        int min;
        int max;

        Info(boolean isValid,int sum,int min,int max){
            this.isValid=isValid;
            this.sum=sum;
            this.max=max;
            this.min=min;

        }
    }
    static int maxSizeBST=0;*/
   /* public static Info largestBst(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo=largestBst(root.leftChild);
        Info rightInfo=largestBst(root.rightChild);

        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }

        if(leftInfo.isValid && rightInfo.isValid ){
            maxSizeBST=Math.max(size,maxSizeBST);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
*/
/*
  public   static  ArrayList<Integer> mergeBst=new ArrayList<>();
    public static Node merge2BST(Node root1,Node root2){
        ArrayList<Integer> bst1=new ArrayList<>();
        inorderSequence(root1,bst1);

        ArrayList<Integer> bst2=new ArrayList<>();
        inorderSequence(root2,bst2);

        int i=0,j=0;

        while (i<bst1.size() && j<bst2.size()){
            if(bst1.get(i)<=bst2.get(j)){
                mergeBst.add(bst1.get(i));
                i++;
            } else {
                mergeBst.add(bst2.get(j));
                j++;
            }
        }
        while (i<bst1.size()){
            mergeBst.add(bst1.get(i));
            i++;
        }

        while (j<bst2.size()){
            mergeBst.add(bst2.get(j));
            j++;
        }


        Node root=createBBSTFromARR(mergeBst,0,mergeBst.size()-1);
        return root;
    }

       public static int maxSum=0;
    public static Info maxSumBSTInBT(Node root){
        if (root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }


        Info leftInfo=maxSumBSTInBT(root.leftChild);
        Info rightInfo=maxSumBSTInBT(root.rightChild);

        int sum=root.data+leftInfo.sum+rightInfo.sum;

        int min=Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,sum,min,max);
        }

        if(leftInfo.isValid && rightInfo.isValid ){
            maxSum=Math.max(sum,maxSum);
            return new Info(true,sum,min,max);
        }
        return new Info(false,sum,min,max);
    }
    static int count=0;
    public static Node kthSmallest(Node root,int k){
        if(root==null){
            return null;
        }

        Node left=kthSmallest(root.leftChild,k);
        if(left!=null){
            return left;
        }

        count++;
        if(count==k){
            return root;
        }

        return kthSmallest(root.rightChild,k);
    }
    static int countofpairs=0;
    public static void  countOfPairsEqualToSum(Node root1,Node root2,int k){
        if(root1==null || root2==null){
            return;
        }
        countOfPairsEqualToSum(root1.leftChild,root2,k);
        countOfPairsEqualToSum(root1.rightChild,root2,k);
        int dif=k-root1.data;
        if(searchInBST(root2,dif)){
            System.out.println("("+root1.data+" "+dif+" )");
        }

    }

    public static class Student implements Comparable<Student>{
            String name;
            int rank;
            Student(String name,int rank){
                this.rank=rank;
                this.name=name;
            }
        @Override
        public int compareTo(Student student2) {
            return this.rank-student2.rank;
        }
    }
*/



    /*    public static class AVLTrees{
        public static Node root;
        public static class Node{
            int data;
            int height;
            Node rightChild;
            Node leftChild;

            Node(int data){
                this.data=data;
                this.height=1;
            }

            public static int height(Node root){
                if(root==null){
                    return 0;
                }
                return root.height;
            }

        }

        public static Node leftRotate(Node x){
            Node y=x.rightChild;
            Node t2=y.leftChild;


            y.leftChild=x;
            x.rightChild=t2;

            x.height=Math.max(Node.height(x.rightChild),Node.height(x.leftChild))+1;
            y.height=Math.max(Node.height(y.rightChild),Node.height(y.leftChild))+1;
            return y;
        }


        public static Node rightRotate(Node y){
            Node x=y.leftChild;
            Node t2=x.rightChild;

            x.rightChild=y;
            y.leftChild=t2;
            x.height=Math.max(Node.height(x.rightChild),Node.height(x.leftChild))+1;
            y.height=Math.max(Node.height(y.rightChild),Node.height(y.leftChild))+1;
            return x;
        }

        public static int balancingFactor(Node root){
            if(root==null){
                return 0;
            }
            return Node.height(root.leftChild)-Node.height(root.rightChild);
        }

        public static Node add(Node root,int data){
            if(root==null){
                return new Node(data);
            }

            root.leftChild=add(root.leftChild,data);
            root.rightChild=add(root.rightChild,data);

            root.height=Math.max(Node.height(root.rightChild),Node.height(root.leftChild))+1;
            int bf=balancingFactor(root);


            //balacning the root
            //left-left case----right rotate
            if(bf>1 && data<root.leftChild.data){
                return rightRotate(root);
            }

            //right-right case-  left rotate
            if(bf<-1 && data>root.rightChild.data){
                return leftRotate(root);
            }


            //left-right case-  left-right rotate
            if(bf>1 && data>root.leftChild.data){
                root.leftChild=leftRotate(root);
                return rightRotate(root);
            }

            //right left case--  right left rotate
            if(bf<-1 && data<root.rightChild.data){
                root.rightChild=rightRotate(root);
                return leftRotate(root);
            }

            return root;

        }


        public static void preorderTraversal(Node root){
            if(root==null){
                return;
            }

            System.out.print(root.data+" ");
            preorderTraversal(root.leftChild);
            preorderTraversal(root.rightChild);
        }


        }*/

   /* static class Heap{
        static ArrayList<Integer> arrayList=new ArrayList<>();


        public static void add(int data){
            arrayList.add(data);
            int x=arrayList.size()-1;
            int parent=(x-1)/2;

            while (arrayList.get(x)<arrayList.get(parent)){
                int temp=arrayList.get(x);
                arrayList.set(x,arrayList.get(parent));
                arrayList.set(parent,temp);
                x=parent;
                parent=(x-1)/2;

            }

        }



        public static int peek(){
            return arrayList.get(0);
        }

        private static void heapify(int idx){
            int leftIdx=2*idx+1;
            int rightIdx=2*idx+2;
            int min=idx;

            if(leftIdx<arrayList.size() && arrayList.get(min)>arrayList.get(leftIdx)){
                min=leftIdx;
            }

            if (rightIdx<arrayList.size() && arrayList.get(min) >arrayList.get(rightIdx)){
                min=rightIdx;
            }

            if(min !=idx){
                int temp=arrayList.get(idx);
                arrayList.set(idx,arrayList.get(min));
                arrayList.set(min,temp);
                heapify(min);
            }
        }

        public static int remove(){
            int data=arrayList.get(0);


            //step1-- swap first and last node
            int temp=arrayList.get(0);
            arrayList.set(0,arrayList.get(arrayList.size()-1));
            arrayList.set(arrayList.size()-1,temp);

            //remove the last node
            arrayList.remove((arrayList.size()-1));


            // heapify
            heapify(0);
            return data;

        }

        public static boolean isEmpty(){
            return arrayList.isEmpty();
        }

        public static void heapifyMax(int[] arr,int i,int size){
            int leftIdx=2*i+1;
            int rightIdx=2*i+2;
            int max=i;

            if(leftIdx<size && arr[leftIdx] >arr[max]){
                max=leftIdx;
            }

            if (rightIdx<size && arr[rightIdx]>arr[max]){
                max=rightIdx;
            }

            if(max!=i){
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
                heapifyMax(arr,max,size);
            }
        }
        public static void heapSort(int[] arr){
            //step 1 to create a maxheap
            int n=arr.length;
            for (int i =n/2 ; i >=0 ; i--) {
                heapifyMax(arr,i,n);
            }

            //step 2 pushing the largest at end
            for (int i = n-1; i >=0; i--) {
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                heapifyMax(arr,0,i);
            }
        }

        public static class Point implements Comparable<Point> {
            int x;
            int y;
            int dist;
            int idx;

            Point(int x,int y,int dist,int idx){
                this.x=x;
                this.y=y;
                this.dist=dist;
                this.idx=idx;
            }


            @Override
            public int compareTo(Point o) {
                return this.dist-o.dist;
            }
        }

        public static void nearestKCars(){
            int k=2;
            int[][] p={{3,3},{5,-1},{-2,4}};
            PriorityQueue<Point> pq=new PriorityQueue<>();

            for (int i = 0; i <p.length ; i++) {
                pq.add(new Point(p[i][0],p[i][1], (int) (Math.pow(p[i][0],2)+Math.pow(p[i][1],2)), i) );
            }

            for (int i = 0; i <k ; i++) {
                System.out.println("C"+pq.remove().idx);
            }

        }

        public static void connnectNRopes(){
            int[] arr={2,3,3,4,6};

            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i = 0; i <arr.length ; i++) {
                pq.add(arr[i]);
            }

            int cost=0;
            while (pq.size()>1){
                int data1=pq.remove();
                int data2=pq.remove();
                cost+=data1+data2;
                pq.add(data1+data2);
            }
            System.out.println(cost);
        }

    public static class Rows{
            int soldiers;
            int idx;
            Rows(int soldiers,int idx){
                this.soldiers=soldiers;
                this.idx=idx;
            }

    }
        public static void weakestSoldier(){
            int[][] army={
                    {1,0,0,0},
                    {1,1,1,1},
                    {1,0,0,0},
                    {1,0,0,0}};

            int k=2;
            PriorityQueue<Rows> pq=new PriorityQueue<>((r1,r2)->{if(r1.soldiers==r2.soldiers){
            return r1.idx-r2.idx; }
                else {
                    return r1.soldiers-r2.soldiers;
            }
            });

            for (int i = 0; i < army.length; i++) {
                int count=0;
                for (int j = 0; j <army[0].length ; j++) {
                    count+=army[i][j]==1? 1 :0;

                }
                pq.add(new Rows(count,i));
            }
            for (int i = 0; i <k ; i++) {
                System.out.println("R" + pq.remove().idx);
            }
        }

        public static void slidingWindowMaximum(){
            int[] arr={1,3,-1,-3,5,3,6,7};
            int k=3;
            Deque<Integer> deque=new ArrayDeque<>();
            for (int i = 0; i <k ; i++) {
                while (!deque.isEmpty() && arr[i]>arr[deque.getLast()]){
                    deque.removeLast();
                }
                deque.add(i);
            }

            for (int i = k; i <arr.length ; i++) {
                System.out.println(arr[deque.peek()]);

                while (!deque.isEmpty() && deque.peek()<=(i-k)){
                    deque.removeFirst();
                }

                while (!deque.isEmpty() && arr[i]>arr[deque.getLast()]){
                    deque.removeLast();
                }
                deque.add(i);

            }
            System.out.println(arr[deque.peek()]);

         }

         public static class Pair implements Comparable<Pair>{
            int val;
            int idx;

            Pair(int val,int idx){
                this.val=val;
                this.idx=idx;
            }

             @Override
             public int compareTo(Pair o) {
                 return o.val -this.val;
             }
         }

         public static void slidingWindowMaxUsingPriority(){
             int[] arr={1,3,-1,-3,5,3,6,7};
             int k=3;

             PriorityQueue<Pair> pq=new PriorityQueue<>();
             int[] res=new int[arr.length-k+1];
             for (int i = 0; i <k; i++) {
                 pq.add(new Pair(arr[i],i));
             }
             res[0]=pq.peek().val;

             for (int i = k; i <arr.length ; i++) {
                 while (!pq.isEmpty() && pq.peek().idx<=(i-k)){
                     pq.remove();
                 }
                 pq.add(new Pair(arr[i],i));
                 res[i-k+1]=pq.peek().val;

             }

             for (int i:
                  res) {
                 System.out.print(i+" ");
             }
         }

       static PriorityQueue<Integer> pq=new PriorityQueue<>();
         public static int kthLargestElementInStream(int value,int k){


            if(pq.size()<k){
                pq.add(value);
                return pq.size()==k ? pq.peek():-1;
            }else {
                if (value > pq.peek()) {
                    pq.remove();
                    pq.add(value);
                }
            }
            return pq.peek();
         }

        public static Node mergeKSortedLL(Node[] arr,int k){

             PriorityQueue<Node> pq=new PriorityQueue<>();
             Node head=new Node(0);
             Node last=head;

            for (int i = 0; i <k ; i++) {
                pq.add(arr[i]);
            }

            if(pq.isEmpty()){
                return null;
            } else{
                while (!pq.isEmpty()){
                    Node cur=pq.poll();
                    last.next=cur;
                    last=last.next;
                    if(cur.next!=null){
                        pq.add(cur.next);
                    }
                }
            }
                return head.next;
        }


        public static int minOpToHalfArrSum(int[] arr){
             PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
             int sum=0;
            for (int i:
                 arr) {
                pq.add(i);
                sum+=i;
            }

            int count=0;
            int temp=sum;

            while (temp>sum/2){
                int cur = pq.peek();
                pq.remove();
                temp -= Math.ceil(cur * 0.5);
                pq.add(cur / 2);
                count++;
            }
            return count;

         }

         public static void minTimeToFillNSlots(int[] arr,int k,int n){
             Queue<Integer> queue=new LinkedList<>();
             boolean[] vis=new boolean[n];
             for (int i=0;i<k;i++) {
                 queue.add(arr[i]);
                 vis[arr[i]]=true;
             }

             int time=0;
             while(!queue.isEmpty()){
                 for (int i = 0; i <queue.size() ; i++) {
                     int cur=queue.poll();
                     if(cur-1>=1 && !vis[cur-1]){
                         queue.add(cur-1);
                         vis[cur-1]=true;
                     }
                     if(cur+1<=n && !vis[i+1]){
                         queue.add(cur+1);
                         vis[cur+1]=true;
                     }
                 }
                 time++;
             }
             System.out.println(time);

         }
    }*/


/*public static class HashMap<K,V>{
    private class Node{
        K key;
        V value;


        Node(K key,V value){
            this.key=key;
            this.value=value;

        }
    }


    private int n;
    private int N;
    LinkedList<Node>[] buckets;

    public HashMap(){
        this.n=0;
        this.N=4;
        buckets=new LinkedList[4];
        for (int i = 0; i <4; i++) {
            buckets[i]=new LinkedList<>();
        }
    }


    public  int hashingFunc(K key){
        int hash=key.hashCode();
        return Math.abs(hash)%N;
    }

    public int searchInLl(int bi,K key){
        LinkedList<Node> ll=buckets[bi];
        int di=0;
        for (int i = 0; i <ll.size() ; i++) {
            if(ll.get(i).key==key){
                return di;
            }
            di++;
        }
        return -1;
    }
    public  void rehashing(){
        LinkedList<Node>[] oldBucket=buckets;
        buckets=new LinkedList[2*N];
        N=2*N;
        for (int i = 0; i <N; i++) {
            buckets[i]=new LinkedList<>();
        }
        for (int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll=oldBucket[i];
            for (int j = 0; j < oldBucket.length; j++) {
                Node temp=ll.remove();
                put(temp.key,temp.value);
            }

        }
    }
    public void put(K key,V value){
        int bi=hashingFunc(key);
        int di=searchInLl(bi,key);

        if(di!=-1){
            Node node=buckets[bi].get(di);
            node.value=value;
        } else {
            buckets[bi].add(new Node(key,value));
            n++;

        }
        double lambda=n/N;
        if(lambda>2.0){
            rehashing();
        }
    }



    public V remove(K key){
        int bi=hashingFunc(key);
        int di=searchInLl(bi,key);

        if(di!=-1){
            Node node=buckets[bi].remove(di);

            n--;
            return node.value;
        } else {
            return null;
        }
    }

    public  boolean containsKey(K key){
        int bi=hashingFunc(key);
        int di=searchInLl(bi,key);
        if(di!=-1){
           return true;
        } else {
            return false;

        }

    }


    public V get(K key){
        int bi=hashingFunc(key);
        int di=searchInLl(bi,key);
        if(di!=-1){
           return buckets[bi].get(di).value;


        } else {
            return null;

        }

    }


public ArrayList<K> keySet(){
        ArrayList<K> keys=new ArrayList<>();

    for (int i = 0; i <buckets.length; i++) {
        LinkedList<Node> ll=buckets[i];
        for (int j = 0; j < ll.size(); j++) {
            keys.add(ll.get(j).key);
        }
    }
    return keys;
}

public boolean isEmpty(){
        return n==0;
}



}*/

public static void majorityElement(){
    int[] arr={1,2};

    HashMap<Integer,Integer> map=new HashMap<>();

    for (int i = 0; i < arr.length ; i++) {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }


    for (int i:
            map.keySet()) {
        if(map.get(i)> arr.length/3){
            System.out.println(i);
        }
    }
}

public static boolean isAnagram(String s,String t){
    if(s.length()!=t.length()){
        return false;
    }

    HashMap<Character,Integer> map=new HashMap<>();
    for (int i = 0; i <s.length() ; i++) {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for (int i = 0; i <t.length(); i++) {
        char ch=t.charAt(i);
        if(map.get(ch)!=null){
            if(map.get(ch)==1){
                map.remove(ch);
            } else {
                map.put(ch,map.get(ch)-1);
            }
        } else {
            return false;
        }
    }

    return map.isEmpty();
}

public static void unionAndIntersection(){
    int[] arr1={3,6,9};
    int[] arr2={2,3,4,5,9,6,5,0};
    //union
    HashSet<Integer> set=new HashSet<>();
    for (int i:
         arr1) {
        set.add(i);
    }

    for (int i:
            arr2) {
        set.add(i);
    }

    System.out.println("Union  "+ set );

    //intersection
    set.clear();
    for (int i:
            arr1) {
        set.add(i);
    }

    for (int i:
            arr2) {
        if(set.contains(i)){
            System.out.println(i);
            set.remove(i);
        }

    }


}

public static String getStart(HashMap<String,String> fromTo){
    HashMap<String,String> toFrom=new HashMap<>();
    for (String key:
         fromTo.keySet()) {
        toFrom.put(fromTo.get(key),key);
    }
    for (String key:
         fromTo.keySet()) {
        if(!toFrom.containsKey(key)){
            return key;
        }
    }
    return null;
}

public static void iteranaryForTickets(){
    HashMap<String,String> fromTo=new HashMap<>();
    fromTo.put("Chennai","Bengaluru");
    fromTo.put("Mumbai","Delhi");
    fromTo.put("Goa","Chennai");
    fromTo.put("Delhi","Goa");


    String start=getStart(fromTo);
    System.out.print(start);
    for (int i=0;i<fromTo.size();i++) {
        System.out.print("->"+fromTo.get(start));
        start=fromTo.get(start);
    }

}


public static void largestSubarraySumEq0(){
    int[] arr={15,-2,2,-8,1,7,10,23};
    HashMap<Integer,Integer> map=new HashMap<>();


    int lenght=0;
    int sum=0;
    for (int i = 0; i < arr.length ; i++) {
        sum+=arr[i];
        if(map.containsKey(sum)){
            lenght=Math.max(lenght,i-map.get(sum));
        } else {
            map.put(sum,i);
        }
    }
    System.out.println("Length of the largest subaaray with sum equals zerro is "+ lenght);

}


public static void subArraySumEqK(){
    int[] arr={10,2,-2,-20,10};
    int k=-10;

    int sum=0;
    int ans=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    for (int i = 0; i < arr.length ; i++) {
    sum+=arr[i];
    if(map.containsKey(sum-k)){
        ans+=map.get(sum-k);
    }
    map.put(sum,map.getOrDefault(sum,0)+1);

    }
    System.out.println(ans);

}



public static void bottomViewOfTree(Node root,int curHeight,int hd, TreeMap<Integer,int[]> map) {
    if(root==null){
        return;
    }

    if(!map.containsKey(hd)){
        map.put(hd,new int[]{root.data,curHeight});
    } else {
        int[] pair = map.get(hd);
        if (pair[1] <= curHeight) {
            pair[1] = curHeight;
            pair[0] = root.data;
            map.put(hd, pair);
        }
    }

    bottomViewOfTree(root.leftChild,curHeight+1,hd-1,map);
    bottomViewOfTree(root.rightChild,curHeight+1,hd+1,map);


}


public static int[] twoSum(int target,int[] arr){
    HashMap<Integer,Integer> map=new HashMap<>();//arr is key and index is value

    for (int i = 0; i <arr.length; i++) {
        int dif=target-arr[i];
        if(map.containsKey(dif)){
            return new int[]{map.get(dif),i};
        }
        map.put(arr[i],i);
    }

return new int[]{0,0};

}


public static void sortByFreq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
    for (int i = 0; i <str.length() ; i++) {
        map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
    }

    PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)-> { if(a.getValue()==b.getValue()){
    return a.getKey()-b.getKey(); } else{
        return b.getValue()-a.getValue();
    }
    });
    StringBuilder sb=new StringBuilder();
    for(Map.Entry<Character,Integer> entry:map.entrySet()){
        pq.add(entry);
    }

    while (!pq.isEmpty()){
        char ch=pq.poll().getKey();
        int count=map.get(ch);
        while (count!=0){
            sb.append(ch);
            count--;
        }
    }
    System.out.println(sb.toString());



}

    public static  class LRUCache extends LinkedHashMap<Integer, Integer> {

        private int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;

        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }


    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */


    public static class LRUCacheNew{
        int size;
        Deque<Integer> deque;
        HashSet<Integer> keys;


       public LRUCacheNew(int capacity){
            this.size=capacity;
            deque=new ArrayDeque<>();
            keys=new HashSet<>();
        }

        public void refer(int key){
           if(!keys.contains(key)){
               if(deque.size()==size){
                   int last=deque.removeLast();
                   keys.remove(last);
               }
           } else{
               deque.remove(key);
           }
           deque.push(key);
           keys.add(key);
        }

        public void display(){
           Iterator<Integer> iterator=deque.iterator();

           while (iterator.hasNext()){
               System.out.println(iterator.next());
           }
        }

    }

/*public static class Trie{
    private static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        Node(){
            for (int i = 0; i <children.length ; i++) {
                children[i]=null;
            }

        }
    }

    public static Node root=new Node();
    public static void insert(String word){
        Node cur=root;
        for (int i = 0; i <word.length() ; i++) {
            int idx=word.charAt(i)-'a';
            if(cur.children[idx]==null){
                cur.children[idx]=new Node();
            }
            cur=cur.children[idx];

        }
        cur.eow=true;
    }

    public static boolean search(String word){
        Node cur=root;
        for (int i = 0; i <word.length() ; i++) {
            int idx=word.charAt(i)-'a';
            if(cur.children[idx]==null){
              return false;
            }
            cur=cur.children[idx];

        }

        return cur.eow==true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for (int i = 1; i <=key.length(); i++) {
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }

        return false;
    }


    public static boolean startsWith(String prefix){

        Node cur=root;
        for (int i = 0; i <prefix.length() ; i++) {
            int idx=prefix.charAt(i)-'a';
            if(cur.children[idx]==null){
                return false;
            }
            cur=cur.children[idx];
        }
        return true;
    }


    public static int countNodes(Node cur){
        if(root==null){
            return 0;
        }
        int count=0;
        for (int i = 0; i <26 ; i++) {
            if(cur.children[i] !=null){
                count+=countNodes(cur.children[i]);
            }
        }
        return count+1;

    }
    static String finalString="";
    public static void longestWordWithAllPrefixes(Node root,StringBuilder temp){
        if(root==null){
            return;
        }

        for (int i = 0; i <26 ; i++) {
            char ch=(char)(i+'a');
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append(ch);
                if(temp.length()>finalString.length()){
                    finalString = temp.toString();
                }
                longestWordWithAllPrefixes(root.children[i],temp );
                temp.deleteCharAt(temp.length()-1);
            }
        }

    }



}
public static class PrefixProblem{
    private static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        int freq;

        Node(){
            for (int i = 0; i <children.length ; i++) {
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node cur=root;
        for (int i = 0; i <word.length() ; i++) {
            int idx=word.charAt(i)-'a';
            if(cur.children[idx]==null){
                cur.children[idx]=new Node();
            } else{
                cur.children[idx].freq++;
            }
            cur=cur.children[idx];

        }
        cur.eow=true;
    }

    public static void findPrefix(Node root,String ans){

        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <root.children.length ; i++) {
           if(root.children[i] != null){
               findPrefix(root.children[i],ans+(char)(i+'a'));
           }
        }

    }
}

public static class GroupAnagramProblem {
    private static class TrieNode {
        TrieNode[] children;
        boolean eow;
        List<String> data;

        TrieNode() {
            children = new TrieNode[26];
            eow = false;
            data = new ArrayList<>();
        }
       static TrieNode root=new TrieNode();

    }

    public static void insert(String str){
        TrieNode temp=TrieNode.root;
        char[] list=str.toCharArray();
        Arrays.sort(list);

        for (char c:
            list ) {
            int idx=c-'a';
            if(temp.children[idx]==null){
                temp.children[idx]=new TrieNode();
            }
            temp=temp.children[idx];
        }
        temp.eow=true;
        temp.data.add(str);

    }

    static List<List<String>> ans=new ArrayList<>();
    public static void grouping(TrieNode rt){

        if(rt.eow==true){
            ans.add(rt.data);
        }

        for (int i = 0; i <26 ; i++) {
            if(rt.children[i]!=null){
                grouping(rt.children[i]);
            }


        }
    }

}*/
/*
static ArrayList<Edge>[] graph=new ArrayList[7];

    static class Edge{
       public int src;
        public int des;
        public int wt;

        public Edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;

        }

    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<>();
        }
//ADJANCEY LIST--GRAPH
        //0th node
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));


        //1th vertex

        graph[1].add(new Edge(1,2,-4));

        //2nd vertex
        graph[2].add(new Edge(2,3,3));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));




    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];
        queue.add(0);

        while (!queue.isEmpty()){//O(V+N)
            int cur=queue.remove();
            if(!visited[cur]){
                System.out.println(cur+" ");
                visited[cur]=true;
                for (int i = 0; i <graph[cur].size() ; i++) {
                    queue.add(graph[cur].get(i).des);
                }
            }

        }
    }

    static boolean[] visited=new boolean[graph.lenght];
    public static void dfs(ArrayList<Edge>[] graph,int cur){
        visited[cur]=true;
        System.out.println(cur);

        for (int i = 0; i < graph[cur].size() ; i++) {
            if(!visited[graph[cur].get(i).des]){
                dfs(graph,graph[cur].get(i).des);
            }
        }

    }

    public static boolean hasPath(int src,int des){
        if(src==des){
            return true;
        }
        visited[src]=true;
        for (int i = 0; i <graph[src].size() ; i++) {
            if( !visited[graph[src].get(i).des] && hasPath(graph[src].get(i).des,des) ) {
             return true;
            }
        }
        return false;
    }


    public static boolean detectCycleInUndirected(ArrayList<Edge>[] graph){
        for (int i = 0; i <graph.length ; i++) {
            if(!visited[i]){
                if(detectCycleUtil(graph,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,int cur,int par){

        visited[cur]=true;
        for (int i = 0; i < graph[cur].size() ; i++) {
            if(!visited[graph[cur].get(i).des]){
                if(detectCycleUtil(graph,graph[cur].get(i).des,cur)){
                    return true;
                }
            } else if (visited[graph[cur].get(i).des] && graph[cur].get(i).des!=par ) {
                return true;
            }
        }
        return false;

    }

        public static boolean bipartiteGraph(ArrayList<Edge>[] graph){
        int[] color=new int[graph.length];
            Arrays.fill(color, -1);
            Queue<Integer> queue=new LinkedList<>();


            for (int i = 0; i <graph.length ; i++) {
                if(color[i]==-1){
                    queue.add(i);
                    color[i]=0;//yellow
                    while (!queue.isEmpty()){
                        int cur=queue.remove();
                        for (int j = 0; j <graph[cur].size(); j++) {
                            Edge e=graph[cur].get(i);
                            if(color[e.des]==-1){
                                color[e.des]=color[cur]==0?1:0;
                                queue.add(e.des);
                            } else if (color[e.des]==color[cur]) {
                                return false;
                            }
                        }
                    }
                }
            }
        return true;
        }

        public static boolean isCyclicDirected(ArrayList<Edge>[] graph){
        boolean[] stack=new boolean[graph.length];
            for (int i = 0; i <graph.length ; i++) {
                if(!visited[i]){
                    if(isCyclicDirectedUtil(graph,i,stack)){
                        return true;
                    }
                }
            }
            return false;
        }
    public static boolean  isCyclicDirectedUtil(ArrayList<Edge>[] graph,int cur,boolean[] stack){
        visited[cur]=true;
        stack[cur]=true;

        for (int i = 0; i <graph[cur].size() ; i++) {
            if(stack[graph[cur].get(i).des]){
                return true;
            }
            if(!visited[graph[cur].get(i).des]){
                if(isCyclicDirectedUtil(graph,graph[cur].get(i).des,stack)){
                    return true;
                }
            }

        }
        stack[cur]=false;
        return false;
    }

    public static void topologicalSorting(ArrayList<Edge>[] graph){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                topologicalSortingUtil(graph,stack,i);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void topologicalSortingUtil(ArrayList<Edge>[] graph,Stack<Integer> stack,int cur){
        visited[cur]=true;
        for (int i = 0; i <graph[cur].size() ; i++) {
            Edge e=graph[cur].get(i);
            if(!visited[e.des]){
                topologicalSortingUtil(graph,stack,e.des);
            }
        }
        stack.push(cur);
    }

    public static void calculateInDegree(ArrayList<Edge>[] graph,int[] inDeg){
        for (ArrayList<Edge> edges : graph) {
            for (Edge edge : edges) {
                inDeg[edge.des]++;
            }
        }
    }
    public static void topoLogicalSortBFS(ArrayList<Edge>[] graph){
        int[] inDeg=new int[graph.length];
        calculateInDegree(graph,inDeg);
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i <inDeg.length ; i++) {
            if(inDeg[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int cur=queue.remove();
            for (int i = 0; i <graph[cur].size() ; i++) {
                Edge e=graph[cur].get(i);
                inDeg[e.des]--;
                if(inDeg[e.des]==0){
                    queue.add(e.des);
                }
            }
        }
    }
   static class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
            for (int i = 0; i <numCourses; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < prerequisites.length ; i++) {
                graph.get(prerequisites[i][0]).add(prerequisites[i][1]);

            }
            int[] indegree=new int[numCourses];
            for (int i = 0; i <numCourses  ; i++) {
                for(int it: graph.get(i)){
                    indegree[it]++;
                }
            }

            Queue<Integer> queue=new LinkedList<>();
            for (int i = 0; i < indegree.length ; i++) {
                if(indegree[i]==0){
                    queue.add(i);
                }
            }
            ArrayList<Integer> sol=new ArrayList<>();
            while (!queue.isEmpty()){
                int cur=queue.remove();
                sol.add(cur);
                for (int i = 0; i <graph.get(cur).size() ; i++) {
                    indegree[graph.get(cur).get(i)]--;
                    if( indegree[graph.get(cur).get(i)]==0){
                        queue.add(graph.get(cur).get(i));
                    }
                }

            }
            int[] ans=sol.stream().mapToInt(i -> i).toArray();
            Arrays.sort(ans);
            return ans;
        }
    }
  */
/*  public static void allPathFromDestination(ArrayList<Edge>[] graph,int src,int dest){
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                allPathFromDestinationUtil(graph,src,dest,new StringBuilder(src));
            }
        }
    }*//*

    public static void allPathFromDestinationUtil(ArrayList<Edge>[] graph,int src,int dest,String sb){
       if(src==dest){
           System.out.println(sb+dest);
           return;
       }
        visited[src]=true;
        for (int i = 0; i <graph[src].size() ; i++) {
            if(!visited[graph[src].get(i).des]){
                allPathFromDestinationUtil(graph,graph[src].get(i).des,dest,sb+src);

            }
        }
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.distance-p2.distance;
        }
    }
    public static void dijkstraAlgorithm(ArrayList<Edge>[] graph,int src){
        int[] dist=new int[graph.length];
        for (int i = 0; i < dist.length ; i++) {
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>();
        pq.add(new Pair(src,0));
        while (!pq.isEmpty()){
            Pair cur=pq.remove();
            if(!visited[cur.node]){
                visited[cur.node]=true;

            for (int i = 0; i <graph[cur.node].size() ; i++) {
                Edge e=graph[cur.node].get(i);
                if(dist[e.src]+e.wt<dist[e.des]){
                    dist[e.des]=dist[e.src]+e.wt;
                    pq.add(new Pair(e.des,dist[e.des]));
                }
            }
            }
        }
        for (int j : dist) {
            System.out.println(j);
        }
    }

    public static void bellmanFordAlgorithm(ArrayList<Edge>[] graph,int src){
        int[] dist=new int[graph.length];
        for (int i = 0; i < graph.length ; i++) {
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int V= graph.length;;
        //TC=O(VE)
        for (int i = 0; i <V-1 ; i++) {
//TC= O(E)
            for (int j = 0; j < graph.length ; j++) {
                for (int k = 0; k <graph[j].size() ; k++) {
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.des;
                    int wt=e.wt;
                    //relaxation
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for (int i:
             dist) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void primsAlgorithm(ArrayList<Edge>[] graph){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
//        int finalWeight=0;
        ArrayList<Integer> mst=new ArrayList<>();
        while (!pq.isEmpty()){
            Pair cur=pq.remove();
            if(!visited[cur.node]){
                visited[cur.node]=true;
//                finalWeight+= cur.distance;
                mst.add(cur.node);
                for (int i = 0; i <graph[cur.node].size() ; i++) {
                    Edge e=graph[cur.node].get(i);
                    pq.add(new Pair(e.des,e.wt));
                }
            }
        }
        for (int i:
            mst ) {
            System.out.println(i);
        }
    }


    public static boolean cycleDetectUndirectedBFS(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
if(cycleDetectUndirectedBFSUtil(graph,i)){
    return true;
}
            }
        }
        return false;
    }
    public static boolean cycleDetectUndirectedBFSUtil(ArrayList<Edge>[] graph,int cur){
    int[] par=new int[graph.length];
    Arrays.fill(par,-1);
    Queue<Integer> queue=new LinkedList<>();
        queue.add(cur);
        visited[cur]=true;
        while (!queue.isEmpty()){
            int node=queue.remove();
            for (int i = 0; i <graph[cur].size() ; i++) {
                Edge e=graph[cur].get(i);
            if(!visited[e.des]){
                visited[e.des]=true;
                queue.add(e.des);
                par[e.des]=node;
            } else if(e.des!=par[node]){
                return true;
            }
            }
        }
return false;
    }

    public static int minDepthBT(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node cur=queue.remove();
            if(cur.leftChild==null && cur.rightChild==null){
                return cur.depth;
            }
            if (cur.leftChild!=null) {
                cur.leftChild.depth= cur.depth+1;
                queue.add(cur.leftChild);
            }
            if (cur.rightChild!=null) {
                cur.rightChild.depth=cur.depth+1;
                queue.add(cur.leftChild);
            }
        }
        return 0;
    }
public static class Element{
        int x;
        int y;
        Element(int x,int y){
            this.x=x;
            this.y=y;
        }
}

public static boolean isValid(int x,int y){
        return (x>=0 && y>=0) && (x<arr.length && y<arr[0].length);
}

public static boolean isDelimeter(Element e){
        return e.x==-1 && e.y==-1;
}
public static boolean isAllRotten(int[][] arr){
    for (int i = 0; i < arr.length ; i++) {
        for (int j = 0; j <arr[0].length ; j++) {
            if(arr[i][j]==1){
                return false;
            }
        }
    }
    return true;
}

    public static int minRotTime(int[][] arr){
        Queue<Element> queue=new LinkedList<>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==2){
                    queue.add(new Element(i,j));
                }
            }
        }

        int time=0;
        queue.add(new Element(-1,-1));
        while (!queue.isEmpty()){
            boolean changed=false;
            while (!isDelimeter(queue.peek())){
                Element cur=queue.remove();

                if(isValid(cur.x+1,cur.y) && arr[cur.x+1][cur.y]==1){
                    if(!changed){
                        time++;
                      changed=true;
                    }
                    arr[cur.x+1][cur.y]++;
                    queue.add(new Element(cur.x+1, cur.y));
                }
                if(isValid(cur.x-1,cur.y) && arr[cur.x-1][cur.y]==1){
                    if(!changed){
                        time++;
                        changed=true;
                    }
                    arr[cur.x-1][cur.y]++;
                    queue.add(new Element(cur.x-1, cur.y));
                }

                if(isValid(cur.x,cur.y+1) && arr[cur.x][cur.y+1]==1){
                    if(!changed){
                        time++;
                        changed=true;
                    }
                    arr[cur.x][cur.y+1]++;
                    queue.add(new Element(cur.x, cur.y+1));
                }
                if(isValid(cur.x,cur.y-1) && arr[cur.x][cur.y-1]==1){
                    if(!changed){
                        time++;
                        changed=true;
                    }
                    arr[cur.x][cur.y-1]++;
                    queue.add(new Element(cur.x, cur.y-1));
                }
            }
         queue.remove();

            if(!queue.isEmpty()){
                queue.add(new Element(-1,-1));
            }

        }
        return (isAllRotten(arr)) ? time:-1;


    }
    static  int arr[][] = { { 2, 1, 0, 2, 1 },
            { 1, 0, 1, 2, 1 },
            { 1, 0, 0, 2, 1 } };
    public static int wordLadder(Set<String> dictionary,String start,String target){
        Queue<String> queue=new LinkedList<>();
        queue.add(start);
        int level=0;s
        int wordLength=start.length();

        while (!queue.isEmpty()){
            level++;
            String cur=queue.remove();
            char[] wordArray=cur.toCharArray();
            for (int i = 0; i <wordLength ; i++) {
                char currentChar=wordArray[i];
                for (char ch = 'a'; ch <='z' ; ch++) {
                        wordArray[i]=ch;
                        if(String.valueOf(wordArray).equals(target)){
                            return level+1;
                        }
                        if(!dictionary.contains(String.valueOf(wordArray))){
                            continue;
                        } else {

                          dictionary.remove(String.valueOf(wordArray));
                        }
                    queue.add(String.valueOf(wordArray));

                }
                wordArray[i]=currentChar;
            }
        }
        return 0;
    }
    static int matrix[][] = { { 0, 0, 1, 1, 0 },
            { 1, 0, 1, 1, 0 },
            { 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 1 } };
    static int count=0;
    static int result=0;
   static boolean[][] cellVisited=new boolean[matrix.length][matrix[0].length];

        public static void regionCountDFS(int[][] matrix,int i,int j){
            int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
            int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };
            cellVisited[i][j]=true;
            for (int k = 0; k <8 ; k++) {
                if(isSafe(matrix,i+rowNbr[k],j+colNbr[k]) && matrix[i+rowNbr[k]][j+colNbr[k]]==1){
                    count++;
                    regionCountDFS(matrix,i+rowNbr[k],j+colNbr[k]);
                }
            }
        }
        public static boolean isSafe(int[][] m,int x, int y){
            return (x>=0 && y>=0) && (x<m.length && y<m[0].length) && cellVisited[x][y]==false;
        }

    public static int largestRegionSize(int[][] matrix){



        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {

                if(matrix[i][j]==1 && !cellVisited[i][j]){
                    count=1;
                    regionCountDFS(matrix,i,j);
                  result=Math.max(count,result);
                }
            }
        }

        return count;
    }
*/

/*static class Edge{
    public int src;
    public int des;
    public int wt;

    public Edge(int src,int des,int wt){
        this.src=src;
        this.des=des;
        this.wt=wt;

    }

}*/
/*
public static void createFlightGraph(int[][] flights,ArrayList<Edge>[] graph,int n){
    for (int i = 0; i <n ; i++) {
        graph[i]=new ArrayList<>();
    }
    for (int i = 0; i < flights.length ; i++) {
        int src=flights[i][0];
        int dest=flights[i][1];
        int wt=flights[i][2];
        graph[src].add(new Edge(src,dest,wt));
    }
}
static class Info{
            int src;
            int wt;
            int stops;
            Info(int src,int wt,int stops){
                this.src=src;
                this.wt=wt;
                this.stops=stops;
            }
}
    public  static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            int[] dist=new int[n];
        for (int i = 0; i < dist.length ; i++) {
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        ArrayList<Edge>[] graph=new ArrayList[n];
        createFlightGraph(flights,graph,n);
    Queue<Info> queue=new LinkedList<>();
    queue.add(new Info(src,0,0));
    while (!queue.isEmpty()){
        Info info=queue.remove();
        if(info.stops>k){
            break;
        }

        for (int i = 0; i <graph[info.src].size() ; i++) {
            Edge e=graph[info.src].get(i);

            if(dist[info.src]+e.wt<dist[e.des] && info.stops<=k){
                dist[e.des]=dist[info.src]+e.wt;
                queue.add(new Info(e.des,dist[e.des],info.stops+1));
            }
        }
    }
return dist[dst]> Math.pow(10,4) ? -1 :dist[dst];

    }
*/

static class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int wt;

    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;

    }
    public int compareTo(Edge e1){
        return this.wt -e1.wt;
    }
}
/*    public static void createGraph(ArrayList<Edge>[] graph,int[][] cities){
        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<>();
        }
//ADJANCEY LIST--GRAPH
        //0th node

        for (int i = 0; i <cities.length ; i++) {
            for (int j = 0; j <cities[i].length ; j++) {
                graph[i].add(new Edge(i,j,cities[i][j]));
            }
        }
       *//* graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));


        //1th vertex

        graph[1].add(new Edge(1,2,-4));

        //2nd vertex
        graph[2].add(new Edge(2,3,3));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));

*//*


    }*/
/*public static void connectingCitiesWithMinimumCost(int[][] cities){

    boolean[] visited=new boolean[cities.length];
    PriorityQueue<Edge> pq=new PriorityQueue<>();
    pq.add(new Edge(0,0));
    int cost=0;
    while (!pq.isEmpty())
    {
        Edge e=pq.remove();
        if(!visited[e.dest]){
            visited[e.dest]=true;
            cost+=e.wt;
            for (int i = 0; i <cities[e.dest].length ; i++) {

                if(cities[e.dest][i]!=0){
                    pq.add(new Edge(i,cities[e.dest][i]));
                }
            }
        }
    }
    System.out.println(cost);
    }*/

/*
        static class DisjointSet{
          static   int n=4;
         static    int[] par=new int[n];
         static int[] rank=new int[n];
            public static void init(){
                for (int i = 0; i <n ; i++) {
                    par[i]=i;
                }
            }
            public static int find(int x){
                if(x==par[x]){
                    return x;
                }
              return par[x]=  find(par[x]);
            }
            public static void union(int a,int b){
                int parentA=find(a);
                int parentB=find(b);
                if(rank[parentA]==rank[parentB]){
                    par[parentB]=parentA;
                    rank[parentA]++;
                } else if (rank[parentA] < rank[parentB]) {
                    par[parentA]=parentB;
                } else {
                    par[parentB]=parentA;
                }
            }
        }

        public static void createEdgeList(ArrayList<Edge> graph){
            graph.add(new Edge(0,1,10));
            graph.add(new Edge(0,2,15));
            graph.add(new Edge(0,3,30));
            graph.add(new Edge(1,3,40));
            graph.add(new Edge(2,3,50));
        }

        public static void kruskalsMST(int v){
            DisjointSet.init();
            ArrayList<Edge> graph=new ArrayList<>();
            createEdgeList(graph);
            Collections.sort(graph);

            int minWt=0;
            int count=0;
            for (int i = 0; count <v-1 ; i++) {
                Edge e=graph.get(i);

                int parA=DisjointSet.find(e.src);
                int parB=DisjointSet.find(e.dest);
                if(parA!=parB){
                    DisjointSet.union(e.src,e.dest);
            minWt+=e.wt;
            count++;
                }

            }
            System.out.println(minWt);

        }


   static class Solution {
       public static void floodFillUtil(int[][] image, int sr, int sc, int color, int orgColor,boolean[][] visited) {
            if(sr < 0 || sc < 0 || sr>= image.length || sc>=image[0].length || visited[sr][sc] || image[sr][sc] !=orgColor){
                return;
            }
            image[sr][sc]=color;
            visited[sc][sc]=true;
            floodFillUtil(image,sr+1,sc,color,orgColor,visited);
            floodFillUtil(image,sr-1,sc,color,orgColor,visited);
            floodFillUtil(image,sr,sc+1,color,orgColor,visited);
            floodFillUtil(image,sr,sc-1,color,orgColor,visited);


       }
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            boolean[][] visited=new boolean[image.length][image[0].length];
            floodFillUtil(image,sr,sc,color,image[sr][sc],visited);
            return image;
        }


   }

public static void topSort(ArrayList<Edge>[] graph,boolean[] visited,Stack<Integer> stack,int cur){
       visited[cur]=true;
    for (int i = 0; i <graph[cur].size() ; i++) {
        Edge e=graph[cur].get(i);
        if(!visited[e.dest]){
            topSort(graph,visited,stack,e.dest);
        }
    }
    stack.push(cur);
}
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<>();
        }



        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

//        graph[1].add(new Edge(1,0,1));
//
//
//        //2nd vertex
//
//        graph[2].add(new Edge(2,1,0));
//
//
//        graph[3].add(new Edge(3,4,1));
//        graph[3].add(new Edge(3,5,1));




//        graph[4].add(new Edge(4,5,1));
//        graph[4].add(new Edge(4,5,1));

//        graph[5].add(new Edge(5,3,1));
//        graph[5].add(new Edge(5,4,1));







    }
    public static void dfs(ArrayList<Edge>[] graph,int cur,boolean[] visited){
        visited[cur]=true;
//        System.out.print(cur+" ");

        for (int i = 0; i < graph[cur].size() ; i++) {
            if(!visited[graph[cur].get(i).dest]){
                dfs(graph,graph[cur].get(i).dest,visited);
            }
        }


    }
   public static void kosarajuAlgorithm(ArrayList<Edge>[] graph){
            //top sort
            Stack<Integer> stack=new Stack<>();
            boolean[] visited=new boolean[graph.length];
       for (int i = 0; i <graph.length ; i++) {
           if(!visited[i]){
               topSort(graph,visited,stack,i);
           }

       }


       //transpose graph
       ArrayList<Edge> transposeGraph[]=new ArrayList[graph.length];
       for (int i = 0; i <transposeGraph.length ; i++) {
           visited[i]=false;
           transposeGraph[i]=new ArrayList<>();
       }
       for (int i = 0; i < graph.length ; i++) {
           for (int j = 0; j <graph[i].size() ; j++) {
            Edge e=graph[i].get(j);
            transposeGraph[e.dest].add(new Edge(e.dest,e.src,e.wt));
           }
       }
       while (!stack.isEmpty()){
           int cur=stack.pop();
           if(!visited[cur]){
               System.out.print("SCC->>");
              dfs(transposeGraph,cur,visited);
               System.out.println();
           }
       }

       }
       public static void dfsTarjans(ArrayList<Edge> graph[],int cur,boolean[] visited,int[] disc,int[] lowDes,int time,int parent){
            visited[cur]=true;
            disc[cur]=lowDes[cur]=++time;
           for (int i = 0; i <graph[cur].size() ; i++) {
               Edge e=graph[cur].get(i);
               int neigh=e.dest;
               if(neigh==parent){
                   continue;
               } else if (!visited[neigh]) {
                   dfsTarjans(graph, neigh, visited, disc, lowDes, time, cur);
                   lowDes[cur]=Math.min(lowDes[cur],lowDes[e.dest]);
                   if(disc[cur] < lowDes[neigh]){
                       System.out.println("Bridge exits between "+ cur+ "-> "+neigh);
                   }
               } else {
                   lowDes[cur]=Math.min(lowDes[cur],disc[neigh]);

               }


           }
    }
       public static void tarjansAlgorithm(ArrayList<Edge>[] graph,int v){
            boolean[] visited=new boolean[v];
            int[] disc=new int[v];
            int[] lowDes=new int[v];
            int time=0;
           for (int i = 0; i <graph.length ; i++) {
               if(!visited[i]){
                   dfsTarjans(graph, i, visited, disc, lowDes, time, -1);
               }
           }
    }
    public static void  dfsArticulation(ArrayList<Edge> graph[],int cur,boolean[] visited,int[] disc,int[] lowDes,int time,int parent,int children,boolean[] arti){

            visited[cur]=true;
            disc[cur]=lowDes[cur]=++time;
        for (int i = 0; i <graph[cur].size() ; i++) {
            Edge e=graph[cur].get(i);
            int neigh=e.dest;
            if(neigh==parent){
                continue;
            } else if (!visited[neigh]){
                dfsArticulation(graph, neigh, visited, disc, lowDes, time, cur, children, arti);
                lowDes[cur]=Math.min(lowDes[cur],lowDes[neigh]);
                if(parent!=-1 && disc[cur]<=lowDes[neigh]){
                    arti[cur]=true;
                }
                children++;
            } else {
                lowDes[cur]=Math.min(lowDes[cur],disc[neigh]);
            }
        }
        if(parent==-1 && children>1){
            arti[cur]=true;
        }
    }
    public static void articulationPoint(ArrayList<Edge> graph[],int V){
        boolean[] visited=new boolean[V];
        boolean[] arti=new boolean[V];
        int[] disc=new int[V];
        int[] lowDes=new int[V];
        int time=0;
        int children=0;

        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                dfsArticulation(graph, i, visited, disc, lowDes, time, -1,children,arti);
            }
        }
        for (int i = 0; i < arti.length ; i++) {
            if(arti[i]){
                System.out.println("Articulation Point "+ i);
            }
        }
    }


    public static void floydWarshallAlgorithm(int[][] graph){
            int[][] dist=new int[graph.length][graph[0].length];
        for (int i = 0; i < graph.length ; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                dist[i][j]=graph[i][j];
            }
        }

        for (int k = 0; k< graph.length ; k++) {
            for (int i = 0; i < graph.length ; i++) {
                for (int j = 0; j < graph.length ; j++) {
                    if(dist[i][k]+dist[k][i]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][i];
                    }
                }
            }
        }

    }
public static int count=0;
        public static int maxCount=0;

        public static boolean isSafe(int[][] matrix,int x, int y,boolean[][] visited){
            return (x>=0 && y>=0) && (x<matrix.length && y<matrix[0].length) &&  !visited[x][y] && matrix[x][y]==1;
        }
        public static void regionCountDFS(int[][] matrix,boolean[][] visited,int row, int col){
            int[] rowArr={-1,-1,-1,0,0,1,1,1};
            int[] colArr={-1,0,1,-1,1,-1,0,1};
            visited[row][col]=true;
            for (int i = 0; i <8 ; i++) {
                if(isSafe(matrix,row+rowArr[i],col+colArr[i],visited)){
                    count++;
                    regionCountDFS(matrix,visited,row+rowArr[i],col+colArr[i]);
                }
            }
        }
    public static void largestRegion(int[][] matrix){
            boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]==1 && !visited[i][j]){
                    count=1;
                        regionCountDFS(matrix,visited,i,j);
                        maxCount=Math.max(count,maxCount);
                }
            }
        }
        System.out.println(maxCount);
    }



    public static int motherVertex(ArrayList<Edge> graph[],int V){
            boolean[] visited=new boolean[V];
            int mother=-1;
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                dfs(graph,i,visited);
                mother=i;
            }
        }
        boolean[] isMotherVertexVisited=new boolean[V];
        dfs(graph,mother,isMotherVertexVisited);
        for (boolean val:
             isMotherVertexVisited) {
            if(!val){
                return -1;
            }
        }
        return mother;
    }

    public static boolean cycleDetectionThroughUnionFindUtil(ArrayList<Edge> graph[],int cur,boolean[] visited){
            visited[cur]=true;
        for (int i = 0; i <graph[cur].size() ; i++) {
                Edge e=graph[cur].get(i);
                int parA=DisjointSet.find(e.src);
                int parB=DisjointSet.find(e.dest);
                if(parB==parA){
                    return true;
                }
                DisjointSet.union(e.src,e.dest);
        }
        return false;
    }
    public static boolean cycleDetectionThroughUnionFind(ArrayList<Edge> [] graph,int V){
            DisjointSet.init();
        boolean[] visited=new boolean[V];
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                if(cycleDetectionThroughUnionFindUtil(graph,i,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void createGraphPrerequisite(ArrayList<ArrayList<Integer>> graph,int V,int[][] prerequisite){
        for (int i = 0; i <V ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisite.length ; i++) {

                graph.get(prerequisite[i][1]).add(prerequisite[i][0]);

        }
    }
    public static boolean taskPossibleToFinishCycleDetection(ArrayList<ArrayList<Integer>> graph, boolean[] visited,int V,  boolean[]  stack,int cur){
        visited[cur]=true;
        stack[cur]=true;
        for (int i = 0; i <graph.get(cur).size() ; i++) {
            Integer e = graph.get(cur).get(i);
            if(stack[e]){
                return true;
            } else if(!visited[e]){
                if(taskPossibleToFinishCycleDetection(graph,visited,V,stack,e)){
                    return true;
                };
            }
        }
        stack[cur]=false;
        return false;
    }
    public static boolean taskPossibleToFinish(ArrayList<ArrayList<Integer>> graph,int[][] prerequisite,int V){
    createGraphPrerequisite(graph,V,prerequisite);
    boolean[] visited=new boolean[V];
    boolean[] stack=new boolean[V];
    for (int i = 0; i <graph.size() ; i++) {
        if(!visited[i]){
            if(taskPossibleToFinishCycleDetection(graph,visited,V,stack,i)){
                return true;
            }
        }
    }
    return false;
}
public static void dfsIsland(int[][] grid,int i, int j){
    if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]==1 ){
        return;
    }
    if(grid[i][j]==0){
      grid[i][j]=1;
    }

    dfsIsland(grid,i+1,j);
    dfsIsland(grid,i,j+1);
   dfsIsland(grid,i-1,j);
   dfsIsland(grid,i,j-1);

    }
    public static int closedIsland(int[][] grid) {
            int count=0;

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if( i*j== 0  || i== grid.length-1 || j== grid[0].length-1 || grid[i][j]==0 ){
                    dfsIsland(grid,i,j);
                    }
                }
            }

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]==0) {
                    count++;
                    dfsIsland(grid,i,j);
                }
            }
            }

    return count;

    }

    public static void addEdge(ArrayList<Edge> graph[],char src,char dest){
            graph[(src - 'a')].add(new Edge((src-'a'),(dest-'a'),1));
    }
    public static void topSortAlianDict(ArrayList<Edge> graph[],Stack<Integer> stack){
            boolean[] visited=new boolean[graph.length];
        for (int i = 0; i < graph.length ; i++) {
            if(!visited[i]){
                topSort(graph,visited,stack,i);
            }
        }

    }

    public static  void alianDictionary(String[] words,int N,int K){
        ArrayList<Edge> graph[]=new ArrayList[K];
        for (int i = 0; i <K ; i++) {
           graph[i]=new ArrayList<>();
        }
        for (int i = 0; i <N-1 ; i++) {
            String word1=words[i];
            String word2=words[i+1];
            int j=0;
            while(j<word1.length() && j<word2.length()){
                char wordA=word1.charAt(j);
                char wordB=word2.charAt(j);
                if(wordA!=wordB){
                    addEdge(graph,wordA,wordB);
                    break;
                }
                j++;
            }
        }
        Stack<Integer> stack=new Stack<>();
       topSortAlianDict(graph,stack);
       StringBuilder sb=new StringBuilder("");
       while (!stack.isEmpty()){
           sb.append((char)(stack.pop()+'a'));
       }

    }*/

        /* ***************   DYNAMIC PROGRAMING  *************************
    * *
    * *
    * *
    * *
    * *
    * *
    * *
    * *
    * *
    */

    /*public static int fibonacciDP(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fibonacciDP(n-1,dp)+fibonacciDP(n-2,dp);
        return dp[n];
    }
    public static int fibonacciTabulation(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];  }
        return dp[n];
    }

    public static int climbingStairs(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= climbingStairs(n-1,dp)+climbingStairs(n-2,dp);
        return dp[n];
    }
    public static int climbingStairsTabulation(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            if(i==1){
                dp[i]=dp[i-1];
            } else {
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    //RECURSION METHOD TC--> O(2^n)
    public static int zeroOneKnapSack(int[] val,int[] wt,int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){
           int ans1=val[n-1]+ zeroOneKnapSack(val, wt, W-wt[n-1], n-1);
           int ans2=zeroOneKnapSack(val, wt, W, n-1);
           return Math.max(ans1,ans2);
        } else {
            return zeroOneKnapSack(val, wt, W, n-1);
        }
    }
    public static int zeroOneKnapSackMemo(int[] val,int[] wt,int W,int n,int[][] dp){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            int ans1=val[n-1]+ zeroOneKnapSackMemo(val, wt, W-wt[n-1], n-1,dp);
            int ans2=zeroOneKnapSackMemo(val, wt, W, n-1,dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        } else {
            dp[n][W]= zeroOneKnapSackMemo(val, wt, W, n-1,dp);
            return dp[n][W];
        }
    }

    public static void printDpArray(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int zeroOneKnapSackTabulation(int[] val,int[] wt,int W,int n){
        int[][] dp=new int[val.length+1][W+1];
        for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i <dp[0].length ; i++) {
            dp[0][i]=0;
        }

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                int w=wt[i-1];
                int v=val[i-1];

                if (w <= j) {
                    int includedProfit=v+dp[i-1][j-w];
                    int excludedProfit=dp[i-1][j];
                    dp[i][j]=Math.max(includedProfit,excludedProfit);
                } else {
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        printDpArray(dp);
        return dp[n][W];
    }

    public static boolean targetSumSubSet(int[] arr,int sum){
        boolean[][] dp=new boolean[arr.length+1][sum+1];
        for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=true;
        }

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                int v=arr[i-1];
                if(v<=j && dp[i-1][j-v]){
                    dp[i][j]=true;
                } else if(dp[i-1][j]){
                    dp[i][j]=true;
                }
            }
        }
       return dp[arr.length][sum];
    }
    public static int unboundedKnapsackTabulation(int[] val,int[] wt,int W){
        int[][] dp=new int[val.length+1][W+1];
      *//*  for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i <dp[0].length ; i++) {
            dp[0][i]=0;
        }*//*
        // You can ignore this initialiazation as default value at each index is 0 onlu
        for (int i = 1; i <dp.length; i++) {
            for (int j = 1; j <dp[0] .length; j++) {
                int v=val[i-1];
                int w=wt[i-1];

                if(w<=j){
                    dp[i][j]=Math.max(v+dp[i][j-w],dp[i-1][j]);
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        printDpArray(dp);
    return dp[val.length][W];
    }
public static int coinChange(int[] coins,int sum){
         int[][] dp=new int[coins.length+1][sum+1];
    for (int i = 0; i <dp.length; i++) {
        dp[i][0]=1;
    }
//    for (int i = 1; i<dp[0].length ; i++) {
//        dp[0][i]=0;
//    }
    for (int i = 1; i <dp.length ; i++) {
        for (int j = 1; j <dp[0].length ; j++) {
            int v=coins[i-1];
            if(v<=j){
                dp[i][j]=dp[i][j-v]+dp[i-1][j];
            } else {

                dp[i][j]=dp[i-1][j];
            }
        }
    }
    return dp[coins.length][sum];
}

    public static int cutRod(int price[], int n) {
        int[][] dp=new int[price.length+1][n+1];

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                int value=price[i-1];
                if(i<=j){
                    dp[i][j]=Math.max(value+dp[i][j-i],dp[i-1][j]);
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
return dp[price.length][n];
    }
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return 1+lcs(str1,str2,n-1,m-1);
        } else {
            return Math.max(lcs(str1,str2,n-1,m),lcs(str1,str2,n,m-1));
        }
    }
    public static int lcsMemoization(String str1,String str2,int n,int m,int[][] dp){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
           dp[n][m]= 1+lcs(str1,str2,n-1,m-1);
            return dp[n][m];
        } else {
            dp[n][m]= Math.max(lcs(str1,str2,n-1,m),lcs(str1,str2,n,m-1));
            return dp[n][m];
        }
    }
    public static int lcsTabulation(String str1,String str2,int n,int m){
        int[][] dp=new int[n+1][m+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static int longestCommonSubstring(String str1,String str2,int n, int m){
        int[][] dp=new int[n+1][m+1];
        int max=0;
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                } else {
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }

    public static int lis(int[] arr1,int size){
        TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < size ; i++) {
            set.add(arr1[i]);
        }
        int[] arr2=new int[set.size()];
        int index=0;
        for (int i:
                set) {
            arr2[index]=i;
            index++;
        }
        int[][] dp=new int[arr1.length+1][arr2.length+1];

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];

                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[arr1.length][arr2.length];

    }
    public static int editDistance(String str1,String str2){
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }

            }
        }

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                } else {
                    int add=dp[i][j-1];
                    int delete=dp[i-1][j];
                    int replace=dp[i-1][j-1];
                    dp[i][j]=Math.min(add,Math.min(delete,replace))+1;
                }
            }
            }
        return dp[str1.length()][str2.length()];

    }
    public static int stringConversion(String str1,String str2){
       int lcs= lcs(str1,str2,str1.length(),str2.length());
        int add=str2.length()-lcs;
        int delete=str1.length() -lcs;
        return add+delete;
   }

    public static boolean isMatch(String s, String p) {
    int n=s.length();
    int m=p.length();
    boolean[][] dp=new boolean[n+1][m+1];
    //initialization
     dp[0][0]=true;
     //pattern empty
        for (int i = 1; i <dp.length ; i++) {
            dp[i][0]=false;
        }
        //string empty
        for (int j = 1; j <dp[0].length ; j++) {
            if(p.charAt(j-1)=='*'){
                 dp[0][j]=dp[0][j-1];
            }
        }

        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                } else if (p.charAt(j-1)=='*') {
                    //ignore condition
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
*/
    public static int catlanNumber(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            ans+=catlanNumber(i)*catlanNumber(n-i-1);
        }
        return ans;
    }
    public static int catlanNumberMemoization(int n,int[] dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            ans+=catlanNumber(i)*catlanNumber(n-i-1);
        }

        return dp[n]=ans;
    }
    public static int catlanNumberTabulation(int n){
       int[] dp=new int[n+1];
        dp[0]=dp[1]=1;

        for (int i = 2; i <dp.length ; i++) {
            for (int j = 0; j <i ; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }

        }

        return dp[n];
    }
    static int countBST(int n) {
        long dp[] = new long[n+1];

        //base cases
        dp[0]=1;
        dp[1]=1;
        long mod = 1000000007;

        //filling the dp[] table in top-down approach.
        for(int i=2;i<=n;i++)
        {
            dp[i]=0;
            for(int j=1;j<=i;j++)
            {
                //if we take j as root, then [1â€¦.j-1] numbers will fall in the
                //left subtree and [j+1â€¦.i] numbers will fall in the right
                //subtree. So, we add dp[j-1]*dp[i-j] to dp[i].
                dp[i] = (dp[i] + (dp[j-1]*dp[i-j])%mod)%mod;
            }
        }

        //returning the answer.
        return (int)dp[n];

    }

    public static int mountainRanges(int n){
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;

        for (int i = 2; i <dp.length ; i++) {
            for (int j = 0; j <i ; j++) {
                dp[i]+=dp[j]*dp[n-i-1];
            }
        }
        return dp[n];
    }


    public static int mcm(int[] arr,int i,int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            int cost1=mcm(arr,i,k);//arr[i]=arr[i-1]*arr[i] ->> arr[k]=arr[k-1]*arr[k];-->> arr[i-1]*arr[k]
             int cost2=mcm(arr,k+1,j);// arr[k+1]=arr[k]*arr[k+1] ->> arr[j]=arr[j-1]*arr[j]-->> arr[k]*arr[j]
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans= Math.min(ans,finalCost);

        }
        return ans;
    }

    public static int mcmMemoization(int[] arr,int i,int j,int[][] dp){
        if(i==j){
            return 0;
        }
        if(dp[i][j] !=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            int cost1=mcmMemoization(arr,i,k,dp);//arr[i]=arr[i-1]*arr[i] ->> arr[k]=arr[k-1]*arr[k];-->> arr[i-1]*arr[k]
            int cost2=mcmMemoization(arr,k+1,j,dp);// arr[k+1]=arr[k]*arr[k+1] ->> arr[j]=arr[j-1]*arr[j]-->> arr[k]*arr[j]
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans= Math.min(ans,finalCost);

        }
        dp[i][j]=ans;
        return ans;
    }
public static void printdp(int[][] dp){
    for (int i = 0; i <dp.length ; i++) {
        for (int j = 0; j <dp[0].length ; j++) {
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}
    public static int mcmTabulation(int[] arr){
        int n= arr.length;
        int[][] dp=new int[n][n];
        for (int i = 0; i < dp.length ; i++) {
            dp[i][i]=0;
        }
        for (int length = 2; length <n ; length++) {
            for (int row = 1; row <=n-length ; row++) {
                    int j=row+length-1;
                dp[row][j]=Integer.MAX_VALUE;
                for (int k = row; k <j ; k++) {
                    int cost1=dp[row][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[row-1]*arr[k]*arr[j];
                    dp[row][j]=Math.min(cost1+cost2+cost3,dp[row][j]);
                }
            }

        }
        printdp(dp);
        return dp[1][n-1];
    }
    public static int minimumDifference(int[] nums) {
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        int w=sum/2;
        int[][] dp=new int[nums.length+1][w+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(nums[i-1]<=j){
                    dp[i][j]=Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        int sum2=sum-dp[nums.length][w];
        return Math.abs(dp[nums.length][w]-sum2);
    }
    static int minJumps(int[] arr,int n){
        // your code here
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        dp[n-1]=0;

        for (int i = n-2; i >=0 ; i--) {
            int jumps=arr[i];
            int ans=Integer.MAX_VALUE;
            for (int j = i+1; j <=i+jumps && j<n ; j++) {
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
        }
        return dp[0];
    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for (int i:
             nums) {
            sum+=i;
        }
        int w=sum/2;
        int[][] dp=new int[nums.length+1][w+1];

        for (int i = 1; i < dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(nums[i-1]<=j){
                    dp[i][j]=Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);

                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[nums.length][w];
        int sum2=sum-sum1;
        return sum2-sum1==0;

    }
    public static int tribonacci(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for (int i = 3; i <dp.length ; i++) {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static boolean isValid(int[][] matrix,int x,int y){
        return (x>=0 && x<matrix.length) && (y>=0 && y<matrix[0].length);
    }
    public int  Count(int[][] matrix)
    {
        int[] row={-1,-1,-1,0,0,1,1,1};
        int[] col={-1,0,1,-1,1,-1,0,1};
        int evenZeroOne=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]==1){


                int zeroCount=0;
                /*for (int k = 0; k <8 ; k++) {
                    if(isValid(matrix,i+row[k],j+col[k]) && matrix[i+row[k]][j+col[k]]==0){
                        zeroCount++;
                    }
                }*/
                    if(isValid(matrix,i+row[0],j+col[0]) && matrix[i+row[0]][j+col[0]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[1],j+col[1]) && matrix[i+row[1]][j+col[1]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[2],j+col[2]) && matrix[i+row[2]][j+col[2]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[3],j+col[3]) && matrix[i+row[3]][j+col[3]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[4],j+col[4]) && matrix[i+row[4]][j+col[4]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[5],j+col[5]) && matrix[i+row[5]][j+col[5]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[6],j+col[6]) && matrix[i+row[6]][j+col[6]]==0){
                        zeroCount++;
                    }
                    if(isValid(matrix,i+row[7],j+col[7]) && matrix[i+row[7]][j+col[7]]==0){
                        zeroCount++;
                    }
                if(zeroCount%2==0 && zeroCount!=0){
                    evenZeroOne++;
                }
            }
            }

        }
        return evenZeroOne;
    }

    public List<String> AllParenthesis(int n)
    {
        // Write your code here
       List<String> list=new ArrayList<>();
       generateParanthesis(list,"(",1,0,n);
        return list;
    }

    private void generateParanthesis(List<String> list, String content, int open, int close, int n) {
        if(content.length()==2*n){
            list.add(content);
            return;
        }
        if(open<=n){
            generateParanthesis(list,content+"(",open++,close,n);
        }
        if(close<open){
            generateParanthesis(list,content+")",open,close++,n);
        }
    }

    public static int findMinOperation(int N, int[][] matrix) {
       // code here
       int[] rowSum=new int[N];
       int[] colSum=new int[N];
       for (int i = 0; i <matrix.length ; i++) {
           for (int j = 0; j <matrix[i].length; j++) {
               rowSum[i]+=matrix[i][j];
               colSum[j]+=matrix[i][j];
           }
       }
    int maxSum=Integer.MIN_VALUE;
       for (int i = 0; i <N ; i++) {
           maxSum=Math.max(rowSum[i],maxSum);
           maxSum=Math.max(colSum[i],maxSum);
       }

       int operationCount=0;
       for (int i = 0,j=0; i <matrix.length && j<matrix[0].length ;) {
           int dif=Math.min((maxSum-rowSum[i]),(maxSum-colSum[j]));
           matrix[i][j]+=dif;
           rowSum[i]+=dif;
           colSum[j]+=dif;
           operationCount+=dif;

           if(rowSum[i]==maxSum){
               i++;
           }
           if(colSum[j]==maxSum){
               j++;
           }
       }
       return operationCount;
   }
    public static boolean search2D(char[][] grid, char[] word,int i,int j,int[] row,int[] col){

        for (int dir = 0; dir <8 ; dir++) {
            if(grid[i][j]!=word[0]){
                return false;
            }
            int wordLength=word.length;
            int k,rd=i+row[dir],cd=j+col[dir];
            for ( k = 1; k <wordLength ; k++) {
                if(rd<0 ||rd>=grid.length ||cd<0|| cd>=grid[0].length || grid[rd][cd]!=word[k] ){
                    break;
                }
                rd+=row[dir];
                cd+=col[dir];
            }
            if(k==wordLength){
                return true;
            }
        }
        return false;
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        int[] row={-1,-1,-1,0,0,1,1,1};
        int[] col={-1,0,1,-1,1,-1,0,1};
        // Code here
        ArrayList<int[]> ans=new ArrayList<>();

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {

                if(search2D(grid,word.toCharArray(),i,j,row,col)){
                    ans.add(new int[]{i,j});
                }
            }

        }

        int[][] list=new int[ans.size()][];
        int in=0;
        for (int[] i:
                ans) {
            list[in++]=i;
        }
        return list;
    }
    public static String multiplyStrings(String s1,String s2)
    {
       /* int num1=0;
        int num2=0;
        for (int i = 0; i <s1.length() ; i++) {
            num1=num1*10+(s1.charAt(i)-'0');
        }
        for (int i = 0; i <s2.length() ; i++) {
            num2=num2*10+(s2.charAt(i)-'0');
        }
        int output=num1*num2;
        String s3=""+output;

        return s3;*/
        /*BigInteger num1=new BigInteger(s1);
        BigInteger num2=new BigInteger(s2);
        BigInteger num3=num1.multiply(num2);
        return num3.toString();*/

        int num1=1;
        int num2=1;
        if(s1.length()==0||s2.length()==0){
            return "0";
        }
        if(s1.charAt(0)=='-'){
            num1=-1;
        }
        if(s2.charAt(0)=='-'){
            num2=-1;
        }
        int carry=0;
        int[] arr=new int[s1.length()+s2.length()];
        int powerFactor=0;
        for (int i = s1.length()-1; i >=0 ; i--) {
            if(s1.charAt(0)=='-'){
               continue;
            }
            int s1_digit=s1.charAt(i)-'0';
                int k=arr.length-1-powerFactor;
            for (int j = s2.length()-1; j >=0 && carry==0 ; j--) {
                if(s2.charAt(0)=='-'){
                    continue;
                }
                int s2_digit=s2.charAt(j)-'0';
                arr[k]+=(s1_digit*s2_digit)%10+carry;
                carry=(s1_digit*s2_digit)/10;
                k--;
            }
            powerFactor++;
        }

        StringBuilder sb=new StringBuilder();

        if(num1*num2==1){
            sb.append("");
        } else {
            sb.append("-");
        }
        boolean flag=false;
        for (int i:
             arr) {
            if(i==0 && !flag){
               continue;
            } else {
                flag=true;
                sb.append(i);
            }

        }


return sb.toString();
    }
   public static int isPalindrome(String S) {
        // code here
        int start=0;
        int end=S.length()-1;
        while(start<end){
            if(S.charAt(start)!=S.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
    public static int robbing(int[] nums,int i,int[] dp){
        if(i<=0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }


        return dp[i]=Math.max(nums[i-1]+robbing(nums,i-2,dp),robbing(nums,i-1,dp));
    }
    public static int rob(int[] nums) {

        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robbing(nums,nums.length,dp);

    }
    public static  int longestPalindromeSubseqUtil(String s,int st,int ed,int[][] dp) {
        if(st>=s.length() || ed<0){
            return 0;
        }
        if(dp[st][ed]!=-1){
            return dp[st][ed];
        }
        if(s.charAt(st)==s.charAt(ed)){
            return dp[st][ed]=1+longestPalindromeSubseqUtil(s,st+1,ed-1,dp);
        } else {
            return dp[st][ed]=Math.max(longestPalindromeSubseqUtil(s,st+1,ed,dp),longestPalindromeSubseqUtil(s,st,ed-1,dp));
        }
    }
    public static  int longestPalindromeSubseq(String s) {
        int max=Integer.MIN_VALUE;
        int[][] dp=new int[s.length()+1][s.length()+1];
        for (int st = 1; st <s.length() ; st++) {
            for (int ed = s.length(); ed >=1 ; ed-- ) {
                if(s.charAt(ed - 1) == s.charAt(st - 1)){

                    dp[st][ed]=1+dp[st+1][ed-1];
                    max=Math.max(dp[st][ed],max);
                } else {
                    dp[st][ed]=Math.max(dp[st+1][ed],dp[st][ed-1]);
                    max=Math.max(dp[st][ed],max);
                }
            }
        }
      return max;
    }
    public  static int longestkSubstr(String s, int k) {
        int ans=0;
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map=new HashMap<>();

        while (true){
            boolean flag1=false;
            boolean flag2=false;
            while (i<s.length()-1){
                flag1=true;
                i++;
                char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()<k){
                    continue;
                } else if (map.size()>k) {
                    break;
                } else {
                    int len=i-j;
                    if(len>ans){
                        ans=len;
                    }
                }
            }
            while (j<i){
                flag2=true;
                j++;
                char ch=s.charAt(j);

                if(map.get(ch)==1){
                    map.remove(ch);
                } else {
                    map.put(ch,map.get(ch)-1);
                }
                if(map.size()>k){
                    continue;
                } else if (map.size()==k){
                    int len=i-j;
                    if(len>ans){
                        ans=len;
                    }
                    break;
                }
            }
            if(flag1==false && flag2==false){
                break;
            }
        }
        return ans==0?-1:ans;

    }
    public static int minimumMountainRemovals(int[] nums) {
        int topPoint=0;
        for (int i = 1; i <nums.length-1 ; i++) {
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i]){
                topPoint=i;
                break;
            }
        }
        int start=0;
        int min=0;
        while(start<topPoint){
            if(nums[start]>=nums[start+1]){
                min++;

            }
            start++;
        }
        int end=nums.length-1;
        while (end>topPoint){
            if(nums[end]>=nums[end-1]){
                min++;

            }
            end--;
        }

return min;
    }
    public static int lisFunction(int[] nums,int[] nums2){
        int[][] dp=new int[nums.length+1][nums2.length+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if(nums[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[nums.length][nums2.length];
    }
    public static int minimumMountainRemovalsUtil(int[] nums){
        int[] dp=new int[nums.length];
        int lis=0;
        for (int i = 0; i <dp.length ; i++) {
            int max=0;
            for (int j = 0; j <=i ; j++) {
                if(nums[i]>nums[j]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>lis){
                lis=dp[i];
            }
        }
        int[] dp1=new int[nums.length];
        int lds=0;
        for (int i = 0; i <dp1.length ; i++) {
            int max1=0;
            for (int j = 0; j <=i ; j++) {
                if(nums[i]<nums[j]){
                    if(dp1[j]>max1){
                        max1=dp1[j];
                    }
                }
            }
            dp1[i]=max1+1;
            if(dp1[i]>lds){
                lds=dp1[i];
            }
        }
        int lbs=0;
        for (int i = 0; i <nums.length ; i++) {
            int sol=dp[i]+dp1[i]-1;
            if(sol>lbs){
                lbs=sol;
            }
        }
        return lbs;

    }
    public static String reverseUtil(String str,int i){
        if(str.length()==0){
            return "";
        }
        return reverseUtil(str.substring(i+1),i+1) +str.charAt(i);
    }
    public static String reverseWord(String str)
    {

        return reverseUtil(str,0);
    }

    public static int lisOn2(int[] nums){
        int[] dp=new int[nums.length];
        int lis=0;
        for (int i = 0; i <dp.length ; i++) {
            int max=0;
            for (int j = 0; j <=i ; j++) {
                if(nums[i]>nums[j]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>lis){
                lis=dp[i];
            }
        }
return lis;

    }
    public static int lisOnlognBinarySeach(int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]>ans.get(ans.size()-1)){
                ans.add(nums[i]);
            } else {
                int low=Collections.binarySearch(ans,nums[i]);
                if(low<0){
                    low=-(low+1);
                }
                ans.set(low,nums[i]);
            }
        }
        return ans.size();
    }
    public static  String flipCoins(int N,String s) {
        // Code here
        int n=s.length();
        int i=0;

        while(i<n){
            if(s.charAt(i)=='1'){
                i++;
                continue;
            }
            if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                i=i+2;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
   /*static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
 /* static   Node removeDuplicates(Node head)
    {
        // Your code here
        Node temp=head;
        while(temp!=null){
            if(temp.next!=null && temp.next.data==temp.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    static class Pair{
        int length;
        int index;
        int value;
        String psf;
        Pair(int length,int index,int value,String psf){
            this.length=length;
            this.index=index;
            this.value=value;
            this.psf=psf;
        }

    }*/
   /* public static ArrayList<Integer> longestIncreasingSubsequence(int N, int arr[]){
        // Code here
        int[] dp=new int[N];
        int omax=0;
        int oi=0;

        for (int i = 0; i <dp.length ; i++) {
            int max=0;
            for (int j = 0; j <i ; j++) {
                if(arr[j]<arr[i]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>omax){
                omax=dp[i];
                oi=i;
            }
        }

        Deque<Pair> deque=new ArrayDeque<>();
        deque.add(new Pair(omax,oi,arr[oi],arr[oi]+""));
        while (deque.isEmpty()){
            Pair p=deque.remove();
            if(p.length==1){
                System.out.println(p.psf);
            }
            for (int i = p.index-1; i >=0 ; i++) {
                if(dp[i]==p.length-1 && arr[i]<=p.value){
                    deque.add(new Pair(dp[i],i,arr[i],p.psf+arr[i]+" "));
                }
            }

        }


    }*/
   public static int boxStacking(int[][] cuboids) {

       for (int i = 0; i < cuboids.length ; i++) {
           Arrays.sort(cuboids[i]);
       }
       Arrays.sort(cuboids,Comparator.comparingDouble(o->o[0]));
       printdp(cuboids);
       int[] dp=new int[cuboids.length];
       int omax=0;
       for (int i = cuboids.length-1; i >=0 ; i--) {
           int max=0;
           for (int j = cuboids.length-1; j >=i ; j--){
               if(cuboids[j][0]<=cuboids[i][0] &&  cuboids[j][1]<=cuboids[i][1] &&  cuboids[j][2]<=cuboids[i][2]){
                  dp[i]=Math.max(dp[i],dp[j]+cuboids[i][2]);
               }
           }
           omax=Math.max(dp[i],omax);

       }
       return omax;
   }
    static class Box implements Comparable<Box>{
       int h,w,l,area;
       Box(int h,int w,int l){
           this.h=h;
           this.w=w;
           this.l=l;
       }

        @Override
        public int compareTo(Box o) {
            return o.area-this.area;
        }
    }
    public static int maximumStackHeight(Box[] arr,int n){
       Box[] rotations=new Box[3*n];
        for (int i = 0; i < n; i++) {
            Box b=arr[i];
            rotations[3*i]=new Box(b.h,Math.max(b.w,b.l),Math.min(b.w,b.l));
            rotations[3*i+1]=new Box(b.w,Math.max(b.h,b.l),Math.min(b.h,b.l));
            rotations[3*i+2]=new Box(b.l,Math.max(b.h,b.w),Math.min(b.h,b.w));
        }
        for (int i = 0; i <rotations.length ; i++) {
            rotations[i].area=rotations[i].w*rotations[i].l;
        }
        Arrays.sort(rotations);
        int[] msh=new int[rotations.length];

int omax=0;
        for (int i = 0; i <msh.length; i++) {

            int max=0;
            Box box=arr[i];
            for (int j = 0; j <i ; j++) {
                Box prev=arr[j];
            if(prev.w<box.w && prev.l<box.l){
                if(msh[j]>max){
                    max=msh[j];
                }
            }

            }
            msh[i]=max+box.h;
            if(omax>msh[i]){
                omax=msh[i];
            }
        }
        return omax;
    }
    public static int maxHeight(int[] height, int[] width, int[] length, int n)
    {
        Box[] arr=new Box[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=new Box(height[i],width[i],length[i]);
        }
        return maximumStackHeight(arr,n);
        }

    public static boolean isValidIndex(int[][] matrix,int x,int y){
        return (x>=0 && x<matrix.length) && (y>=0 && y<matrix[0].length);
    }
    public static int lipUtil(int[][] matrix,int[] row,int[] col,int i,int j,int[][] dp){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }


        for (int k = 0; k <4 ; k++) {
            if(isValidIndex(matrix,i+row[k],j+col[k]) && matrix[i][j]<matrix[i+row[k]][j+col[k]]){
                dp[i][j]=Math.max(dp[i][j],lipUtil(matrix,row,col,i+row[k],j+col[k],dp));

            }
        }
        return ++dp[i][j];
    }
    public static int longestIncreasingPath(int matrix[][], int n, int m) {
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        int max=0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                dp[i][j]=-1;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                max=Math.max(max,1+lipUtil(matrix,row,col,i,j,dp));
            }
        }
        return max;
    }

    public static Node reverseLL(Node head){
       Node prev=null;
       Node cur=head;
       Node next=null;
       while(cur!=null){
           next=cur.next;
           cur.next=prev;
           prev=cur;
           cur=next;

       }
       return prev;
    }
    public static Node compute(Node head)
    {
       head=reverseLL(head);
       Node cur=head;
       Node prev=head;
       head=prev.next;
       int maxValue=head.data;
       while(head!=null){
           if(head.data<maxValue){

               prev.next=head.next;
               head=prev.next;

           } else {
               prev=head;
               head=head.next;
               maxValue=prev.data;
           }
       }
       return reverseLL(cur);
    }
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i]<buy){
                buy=prices[i];
            } else {
                profit=Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
    }

    Node deleteNode(Node head, int x)
    {
        if(x==1){
            return head.next;
        }
        Node cur=head;
        Node prev=null;
        int i=1;
        while(i!=x){
            prev=cur;
            cur=cur.next;

            i++;
        }

        prev.next=cur.next;
        return head;
    }

    boolean isPalindrome(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node cur=slow;
        Node prev=null;
        Node next=null;
        prev=reverseLL(cur);

        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.equals(fast)){
                return true;
                break;
            }


        }
        return false;
    }
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
       boolean cycle=false;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.equals(fast)){
               cycle=true;
                break;
            }


        }
        if(cycle) {
            slow = head;

            if (slow != fast) {
                while (fast!= slow) {

                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }


        }
    }
    public static int buySellStock(int[] prices){
    int[][] dp=new int[prices.length+1][2];
        for (int i=dp.length-1;i>=0;i++) {
            int profit=0;
            for (int buy = 0; buy <=1 ; buy++) {
                if(buy==1){
                    profit=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);

                } else {
                    profit=Math.max(-prices[i]+dp[i+1][1],dp[i+1][0]);

                }
                dp[i][buy]=profit;
            }
        }



        return dp[0][1];
    }
    public static int maxProfit1(int[] prices) {

    return buySellStock(prices);
    }
    public static  Node inorderSuccessor(Node root){
        Node temp=root;
        while (temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    public static int getBalanceFactor(Node root){
        if(root==null){
            return 0;
        }
        return height(root.left) -height(root.right);
    }
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }
    public static Node deleteNode(Node root, int key)
    {
        // code here.
        if(root==null){
            return root;

        }
        if(key< root.data){
            root.left=deleteNode(root.left,key);
        } else if(key>root.data){
            root.right=deleteNode(root.right,key);
        } else {
            if(root.left==null || root.right==null){
                Node temp=null;
                if(temp==root.left){
                    temp=root.right;
                } else {
                    temp=root.left;
                }

                if(temp==null){
                    temp=root;
                    root=null;


                } else {
                    root=temp;
                }
            } else {
                Node inorderSuccess=inorderSuccessor(root.right);
                root.data=inorderSuccess.data;
                root.right=deleteNode(root.right,inorderSuccess.data);
            }

        }
        if(root==null){
            return root;
        }
        root.height=Math.max(height(root.left),height(root.right))+1;
        int bf=getBalanceFactor(root);



        if(bf>1 && getBalanceFactor(root.left)>=0){
            return rightRotate(root);
        }
        if(bf< -1 && getBalanceFactor(root.right)<=0){
            return leftRotate(root);
        }
        if(bf>1 && getBalanceFactor(root.left)<0){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf< -1 && getBalanceFactor(root.right)>0){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     System.out.println("Enter the number of rows");
            //     int rows=sc.nextInt();
            //     System.out.println("Enter the number of columnss");
            //     int col=sc.nextInt();
            //    int[][] num=new int[rows][col];
            //    int[] num1=new int[5];

            // for(int i=0;i<rows;i++){
            //     for(int j=0;j<col;j++){
            //         num[i][j]=sc.nextInt();
            //     }
            // }
            // // for(int i=0;i<rows;i++){
            // //     for(int j=0;j<col;j++){
            // //        System.out.println("Location of the num arraay at index"+i+ " "+j+);
            // //     }
            // // }
            // for(int i=0; i<rows; i++) {
            //     for(int j=0; j<col; j++) {
            //     System.out.print(num[i][j]+" ");
            //     }
            //     System.out.println();
            //     }
            // }

            // @Override
            // public void add(int a, int b) {
            //     // TODO Auto-generated method stub

            // }
            // LocalDate myObj = LocalDate.now();
//     String pattern = "MM-dd-yyyy";
//     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
// System.out.println(simpleDateFormat.format(new Date()));


// List<Integer> list=new ArrayList<Integer>();
// list.add(5);
// list.add(8);

// Iterator<Integer> i=list.iterator();
// while(i.hasNext()){
//     System.out.println(i.next());
// }

// list.forEach((n)->{
//     System.out.println(n);
// System.out.println(n);
// });

// String originalstr="Ashish";
// String rev="";
// for(int i=0;i<originalstr.length();i++){
//     rev=originalstr.charAt(i);

// }
// System.out.println(rev);


//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//String s=bf.readLine();
//System.out.println(s);

//int[] arr={5,3,2,3,5,3,6,3,2,2,2};
//int sum=21;
//Main m=new Main();
//int maxcount=m.majority(arr);
//        System.out.println();
//        System.out.println(maxcount);

//String s="geeksforgeeks";
//    StringBuilder arr1 = new Main().removeDuplicates(s);
//        System.out.println(arr1);

//        int x=5;
//        int y=(x < 1)?2:5;
//        System.out.println(y);

//    String url="jdbc:oracle:thin:@localhost:1521:xe";
//    String username="system";
//    String pwd="828126";
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Connection conn=DriverManager.getConnection(url,username,pwd);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Connected Established");
//    ArrayList<Integer> arr=new ArrayList<Integer>();
//    arr.add(3);
//    arr.add(5);
//    arr.forEach((n)-> {
//        if (n == 3) {
//            System.out.println("It is three");
//        } else {
//            System.out.println("It is other number");
//        }
//    });


//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//
//        if((a>=b) && (a>=c)){
//            System.out.println(a+"is largest");
//        } else if (b>=c) {
//            System.out.println(b+"is largest");
//
//        } else {
//            System.out.println(c+"is largest");
//        }

//        String s=sc.next();
//
//        switch (s) {
//            case "Ashish" -> {
//                System.out.println("Ashish Name is entered");
//            }
//            case "Om" -> {
//                System.out.println("Om name is entered");
//            }
//            case "Sunil" -> {
//                System.out.println("Sunil name is entered");
//            }
//            default -> {
//                System.out.println("Out of range name is entered");
//            }
//        Scanner sc=new Scanner(System.in);
//        int range=sc.nextInt();
//       int sum=0;
//       int counter=1;
//       while(counter <=range){
//           sum+=counter;
//           counter++;
//       }
//        System.out.println(sum);

            // Scanner sc = new Scanner(System.in);

//    int number=sc.nextInt();
//    int rev=0;
//    while (number>0){
//        int rem=number%10;
//        rev=rev*10+rem;
//        number/=10;
//
//    }
//        System.out.println(rev);
//   while (true){
//       int i= sc.nextInt();
//       if(i%10==0){
//           continue;
//       }
//       System.out.println("Number entered"+i);
//   }

//        Scanner scanner=new Scanner(System.in);
//        int num=sc.nextInt();
//        boolean isPrime=true;
//        for (int i = 2; i <=Math.sqrt(num); i++) {
//            if(num%i==0){
//                isPrime=false;
//            }
//        }
//        if(isPrime){
//            System.out.println(num+" is a prime number.");
//        } else {
//            System.out.println(num+" is not a prime number.");
//        }


//        int evensum = 0;
//        int oddsum = 0;
//        int choice=0;
//        do {
//            int num = sc.nextInt();
//            if (num != 1) {
//                if (num % 2 == 0) {
//                    evensum += num;
//                } else{
//                    oddsum+=num;
//                }
//            }
//            System.out.println("Enter the exit code");
//             choice=sc.nextInt();
//        } while (choice != 1);
//        System.out.println("Sum of the even numbers:"+evensum);
//        System.out.println("Sum of the odd numbers:"+oddsum);

//        char c='A';
//        for (int i = 1; i <=4; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//        }
//INVERTED HALF-PYRAMID
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <=4-i+1 ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int z = 1; z<=i ; z++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//        int c=1;
//        for (int i = 1; i <=4; i++) {
//          Main m=new Main();
//
//          m.spaceInvertedHalfPyramid(i);
//            m.halfPyramid(i);
//            m.HalfPyramidWithEnter(i);
//
//            System.out.println();
//        }
//        for (int i = 1; i <=4; i++) {
//            Main m1=new Main();
//            m1.invertedHalfPyramid(i);
//            m1.spaceHalfPyramid(i);
//            m1.spaceHalfPyramid(i);
//            m1.invertedHalfPyramid(i);
//
//            System.out.println();
//        }
//        for (int i = 1; i <=4; i++) {
//            Main m=new Main();
//
//            m.spaceHalfPyramid(i);
//            m.invertedHalfPyramid(i);
//            m.invertedHalfPyramidWithEnterInverted(i);
//
//
//            System.out.println();
//        }

//        for (int i = 1; i <=5; i++) {
//            Main m=new Main();
//
//            m.spaceInvertedHalfPyramid(i);
//            m.numberPatter(i);
//            m.numberPatter(i);
//            System.out.println();
//        }
//        for (int i = 1; i <=5 ; i++) {
//            Main m=new Main();
//            m.spaceInvertedHalfPyramid(i);
//            m.halfPyramid(i);
//            for (int j = 1; j <5 ; j++) {
//                System.out.print(" ");
//            }
//            m.invertedHalfPyramid(i);
//            for (int j = 1; j <5 ; j++) {
//                System.out.print(" ");
//            }
//            m.halfPyramid(i);
//            System.out.println();
//        }

            //    System.out.println(dTB(1));
//    for (int i = 1; i <=5; i++) {
//        for (int j = 1; j <=5-i+1 ; j++) {
//            System.out.print(j);
//
//        }
//        System.out.println();
//    }
//    int[] arr={4,2,0,6,3,1,5};
//    reverseArray(arr);
//    for (int i:
//         arr) {
//        System.out.println(i);
//
//    }
//       int[] nums = {5,2,6,2,1};
//      coutingSort(nums);


//        System.out.println("Enter the row length");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println("Enter the column length");
//        int m=sc.nextInt();
//        int[][] arr=new int[n][m];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[0].length ; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("Your 2D array is :-");
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[0].length ; j++) {
//                max=Math.max(max,arr[i][j]);
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("The maximum element in this arrays is:-"+ max);


//        System.out.println(searchInSortedMatrix(arr,153));
//            String name="Ashish";
//            String title=" Jha";
//
//        for (int i = 0; i <name.length() ; i++) {
//            System.out.print(name.charAt(i));
//        }

//       String[] str={"ashish","om"};
//        String largest=str[0];
//        for (int i = 1; i <str.length ; i++) {
//            if(largest.compareTo(str[i])<0){
//                largest=str[i];
//            }
//        }
//        System.out.println(largest);


//          anagrams("raceh","careg");
//       String str=new String("Ahish").intern();
//       String s1="Ahish";
//        System.out.println(str==s1);


//        System.out.println(modularExponentiation(2,5,13));


            //Swapping two numbers without using any third variable



/*        int x=3,y=4;
        System.out.println("Before swap: x = "+x+" and y = "+y);
        //swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap: x = "+x+" and y = "+y);*/


            //add 1 to to numnber using bit manipulation

           /* int x=6;
        System.out.println(-~x);*/

//        for(char ch='A';ch<='Z';ch++) {
//            System.out.println((char)(ch|' '));
//        }


            /* System.out.println((char)('A'|' '));*/


//Sharks s=new Sharks();
//s.noveg();
//
//s.breathe();;
//s.swims();
//
//String s1="one two three four";
//String[] str=s1.split(" ");
//        int[] arr1={4,5,8,5,6,7};
//        System.out.println( lastOccurence(arr1,5,0));

//       removeduplicates("appnacollegee",0,new StringBuilder(),new boolean[26]);
//        System.out.println(friendsPairing(3));
//        binaryString(3,0,"");
//        int[] arr1={3, 2, 4, 5, 6, 2, 7, 2, 2};
//
//        allOccurences(arr1,2,0);
//        numberToString(2019);
//        System.out.println(  lengthOfString("ashish")
//);
//        String str="abcab";
//        System.out.println(countOfString(str,0,str.length()-1,str.length()));

//        towerOfHanoi(10,"S","H","D");

//        mergeSort(arr1,0, arr1.length-1);
//        quickSort(arr1,0,arr1.length-1);
//        for (int i:
//             arr1) {
//            System.out.print(i+" ");
//
//        }

//        System.out.println(sortedAndRotatedArraySearch(arr1,0, arr1.length-1,1));
//        String[] arr2 = { "sun", "earth", "mars", "mercury"};
//        String output[]=mergeSort(arr2,0,arr2.length-1);
//        for (String s:
//             output) {
//            System.out.print(s+" ");
//
//        }
//
//        int[] nums = {2, 4, 1, 3, 5};
//        System.out.println(invesionCount(nums,0,nums.length-1));
//        System.out.println(power(2,5));
//        int arr[]=new int[5];
//        backtrackingInArray(arr,0,1);
//        for (int i:
//             arr) {
//            System.out.print(i+" ");
//        }
//    }


//        subsetsofString("abc",new StringBuilder(),0);

//        permutaionOfString("ashish","");
//        int n=2;
//        char board[][]=new char[n][n];
//        for (int i = 0; i <board.length; i++) {
//            for (int j = 0; j <board.length ; j++) {
//                board[i][j]='x';
//            }
//
//        }
//
//        if(nQueens(board,0)){
//            System.out.println("Solution is available");
//        } else{
//            System.out.println("Solution is not available");
//        }
//        System.out.println("Total number of ways of solving n queens problem "+


//        System.out.println(gridWays(5,5));

//
//        int sudoko[][] =  { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
//                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
//                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
//                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
//                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
//                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
//                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
//
//        if (sudokosolver(sudoko, 0, 0)) {
//            for (int i = 0; i < sudoko.length; i++) {
//                for (int j = 0; j < sudoko.length; j++) {
//                    System.out.print(sudoko[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//        }

//        int[][] maze={ {1,0,0,0},
//                {1,1,0,1},
//                {0,1,0,0},
//                {1,1,1,1} };
//        int[][] solution=new int[4][4];
//        for (int i = 0; i <solution.length ; i++) {
//            for (int j = 0; j < solution.length ; j++) {
//                solution[i][j]=0;
//            }
//        }
//        if(solveMaze(maze,solution,0,0)){
//            for (int i = 0; i < solution.length ; i++) {
//                for (int j = 0; j < solution.length; j++) {
//                    System.out.print(solution[i][j]+" ");
//                }
//                System.out.println();
//            }
//        } else{
//            System.out.println("Solution Does not exits");
//        }

//                int[][] sol=new int[N][N];
//        for (int i = 0; i < sol.length ; i++) {
//            for (int j = 0; j < sol.length; j++) {
//                sol[i][j]=-1;
//            }
//        }
//        sol[7][7]=0;
//        if(!knighttour(sol,7,7,1)){
//            System.out.println("Solution does not exist");
//        } else {
//            for (int i = 0; i < sol.length ; i++) {
//                for (int j = 0; j < sol.length; j++) {
//                    System.out.print(  sol[i][j]+" ");
//                }
//                System.out.println();
//            }
//        }

//        keypadCombinaions(0,new StringBuilder(""),"82");

//        int[] arr={4,5,6};
//        ArrayList<Integer> a1=new ArrayList<>();
//        System.out.println();

//        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
//        ArrayList<Integer> list=new ArrayList<>();
//        ArrayList<Integer> list1=new ArrayList<>();
//        ArrayList<Integer> list2=new ArrayList<>();
//
//        for (int i = 1; i <=5 ; i++) {
//            list.add(1*i);
//            list1.add(2*i);
//            list2.add(3*i);
//        }
//            mainlist.add(list);
//        mainlist.add(list1);
//        mainlist.add(list2);
//
//        for (int i = 0; i <mainlist.size() ; i++) {
//            for (int j = 0; j <mainlist.get(i).size() ; j++) {
//                System.out.print(mainlist.get(i).get(j)+"  ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(mainlist);


//            ArrayList<Integer> height = new ArrayList<>();
//        height.add(11);
//        height.add(15);
//            height.add(1);
//            height.add(100);
//            height.add(200);
//            height.add(1);
//            height.add(100);


//        System.out.println(    pairSum2(height,50));
//        Iterator<Integer> i =height.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        ArrayList<Integer> arr=new ArrayList<>();


//        System.out.println(monotonicArrayList(height));


//        System.out.println(findLonely(height));

//        System.out.println(mostFrequentNumberFollowingKey(height,1));
//            LinkedList ll = new LinkedList();
//            ll.addFirst(5);
//            ll.printLL();
//            ll.addFirst(8);
//            ll.printLL();
//            System.out.println(ll.size);
//            ll.addLast(6);
//            ll.printLL();
//            ll.addAtMiddle(2, 66);
//            ll.printLL();
//        System.out.println(ll.size);
//        ll.removeFirst();
//        ll.printLL();
//        ll.removeLast();
//        System.out.println(ll.iterativeSearch(5));
//        System.out.println(ll.recursiveSearch(ll.head,99));
//        ll.reverseLL();
//        ll.deleteNthNodeFromEnd(3);
//            ll.addFirst(1);
//            ll.addFirst(2);
//            ll.addFirst(2);
//
//            ll.addFirst(1);

//

//          ll.head=new LinkedList.Node(1);
//            LinkedList.Node n=new LinkedList.Node(2);
//            ll.head.next=n;
//            ll.head.next.next=new LinkedList.Node(3);
//            ll.head.next.next.next=n;
//
//            ll.printLL();
//
//
//            if(ll.isCycle()){
//                System.out.println("Cycle exists");
//            } else {
//                System.out.println("Not exits");
//            }
//
//            ll.removeCycle();
//            ll.printLL();
//            if (ll.checkPalindrome()) {
//                System.out.println("LL is palindrome");
//            } else {
//                System.out.println("LL is not a palindrome");
//            }

//
//            ll.addFirst(1);
//            ll.addFirst(2);
//            ll.addFirst(3);
//            ll.addFirst(4);
//            ll.addFirst(5);
//            ll.addFirst(6);


//        ll.printLL();
//            ll.head=ll.mergeSort(ll.head);
//            ll.printLL();
//            ll.zigZag();
//            ll.printLL();


//            DoublyLL dl=new DoublyLL();
//            dl.addFirst(2);
//            dl.addFirst(1);
//
//            dl.printDLLInc();
//            dl.addLast(3);
//            dl.printDLLInc();
//
//
//            dl.reverseDL();
//            dl.printDLLInc();
//            System.out.println(dl.size);

       /* LinkedList ll=new LinkedList();
            LinkedList.Node head1,head2;


            head1 = new LinkedList.Node(10);
            head2 = new LinkedList.Node(3);


            LinkedList.Node newNode = new LinkedList.Node(6);
            head2.next = newNode;
            newNode = new LinkedList.Node(9);
            head2.next.next = newNode;
            newNode = new LinkedList.Node(15);
            head1.next = newNode;
            head2.next.next.next = newNode;
            newNode = new LinkedList.Node(30);
            head1.next.next = newNode;
            head1.next.next.next = null;


            LinkedList.Node intersectionPoint
                    = ll.getIntersectionPoint(head1, head2);
            if (intersectionPoint == null) {
                System.out.print(" No Intersection Point \n");
            }
            else {
                System.out.print("Intersection Point: "
                        + intersectionPoint.data);
            }


            ll.deleteNAfterM(head2,1,2);
            ll.printLL();*/

//        Stack st=new Stack();
//
//            Stack.push(3);
//            Stack.push(4);
//            Stack.push(5);
//
//        while (!Stack.isEmpty()){
//            System.out.println(Stack.peek());
//            Stack.pop();
//        }

//            java.util.Stack<Integer> st=new java.util.Stack<>();
//            st.push(100);
//            st.push(80);
//            st.push(60);
//            st.push(70);
//            st.push(60);
//            st.push(85);
//            st.push(100);
//                int[] stock={100,80,60,70,60,85,100};
//            int[] span=new int[stock.length];
          /*  int[] arr={6,8,0,1,3};
            int[] nextGreater=new int[arr.length];
            nextGreaterElement(arr,nextGreater);*/

//
//            pushAtBottom(st,9);
//
//            while (!st.isEmpty()){
//            System.out.println(st.peek());
//            st.pop();
//        }
//           String string= reverseAStringUsingStack("Ashsih");
//            System.out.println(string);

//            reverseStack(st);
//            stockSpanProblem(stock,span);
//            while (!st.isEmpty()){
//            System.out.println(st.peek());
//            st.pop();
//        }
//
//            for (int i = 0; i < nextGreater.length; i++) {
//                System.out.print(nextGreater[i]+" ");
//            }
//            System.out.println();

//            System.out.println(  duplicateParenthesis("(a+b)"));
//        int[] height={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//            System.out.println(maxAreaInHistogram(height));

//            System.out.println(simplifyPath("/apna///as"));

//            System.out.println(trappingRainwaterUsingStacks(height));

//            System.out.println(decodeString("3[b2[v]]L"));

//                LinkedList linkedList=new LinkedList();
//                linkedList.addFirst(4);
//                linkedList.addFirst(5);
//                linkedList.addFirst(6);
//                linkedList.addFirst(7);
//                linkedList.addFirst(8);
//                linkedList.printLL();
////                linkedList.swappingNodeLL(8,4);
//
//
//            linkedList.oddAndEvenLL();
//            linkedList.printLL();

           /* Node[] lists = new LinkedList.Node[3];

            lists[0] = new Node(1);
            lists[0].next = new LinkedList.Node(5);
            lists[0].next.next = new LinkedList.Node(7);

            lists[1] = new LinkedList.Node(2);
            lists[1].next = new LinkedList.Node(3);
            lists[1].next.next = new LinkedList.Node(6);
            lists[1].next.next.next = new LinkedList.Node(9);

            lists[2] = new LinkedList.Node(4);
            lists[2].next = new LinkedList.Node(8);
            lists[2].next.next = new LinkedList.Node(10);
linkedList.printLL();
            // Merge all lists into one
            LinkedList.Node head = LinkedList.mergeKList(lists);

            linkedList.printLL();*/

/*
Queue<Integer> queue=new ArrayDeque<>();
queue.add(5);
queue.add(6);
queue.add(7);

while (!queue.isEmpty()){
    System.out.println(queue.remove());
}
*/

//            Queue queue=new Queue();
//            queue.add(1);
//            queue.add(2);
//            queue.add(3);
//
//            System.out.println(queue.remove());
//            queue.add(4);
//            System.out.println(queue.remove());
//            queue.add(5);
//            while (!queue.isEmpty()){
//                System.out.println(queue.remove());
//            }


//            Queue q=new Queue();
//            q.add(5);
//            q.add(6);
//            q.add(7);
//
//            while (!q.isEmpty()){
//                System.out.println(q.remove());
//            }

//            Stack stack=new Stack();
//            stack.push(5);
//            stack.push(6);
//            stack.push(7);
//
//            while (!stack.isEmpty()){
//                System.out.println(stack.pop());
//            }

//            firstNonRepeatingLetter("aabccxb");
            /*Queue<Integer> q=new ArrayDeque<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.add(7);
            q.add(8);*/
//            interleaveTwoHalvesOfQueue(q);

//            while (!q.isEmpty()){
//                System.out.print(q.remove()+" ");
//            }
//            System.out.println();
//            System.out.println(q);
//            reverseQueue(q);


            /*Stack stack=new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Peek element - "+stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());*/

           /* Queue q=new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println("Peek element - "+q.peek());
            System.out.println(q.remove());
            System.out.println(q.remove());


            PriorityQueue<Integer> pq=new PriorityQueue<>();*/
//            generateBinaryNumber(15);
           /* Queue<Integer> q=new ArrayDeque<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            reverseFirstElementsOfQueue(q,3);
            Iterator<Integer> iterator=q.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
*/
            /*int[] arr={ 12, 1, 78, 90, 57, 89, 56,50,44 };
            maxSubArrayElementOfSizeK(arr,3);*/
          /*  String str="AShish";
            String str1="AShish";
            str.compareTo(str1);*/
//            activitySelection();


          /*  int[] value={60,100,120};
            int[] weight={10,20,30};
            int knapsackSize=50;
            fractionalKnapsack(value,weight,knapsackSize);*/

//            minSumAbsoluteDiff();
//            maxLengthOfChainOfPairs();
//            indianCoins();
//            jobSequencing();
//            chocolaProblem();
//            maxBalanceStringPartitions();
//            kthLargestOddNumber();
//            System.out.println(getSmallestString(5,42));;

           /* int[] preorder={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root=BinaryTree.buildTreePreorder(preorder);*/


//            BinaryTree.preOrderTraversal(root);
//            BinaryTree.inOrderTraversal(root);
     /*       Node root=new Node(4);
            root.leftChild=new Node(2);
            root.rightChild=new Node(7);*/
         /*   root.leftChild.leftChild=new Node(4);
            root.leftChild.rightChild=new Node(5);
            root.rightChild.leftChild=new Node(4);
            root.rightChild.rightChild=new Node(5);
//            BinaryTree.postOrderTraversal(root);
            BinaryTree.levelTraversal(root);*/
/*
            System.out.println(BinaryTree.heightOfTree(root));
            System.out.println(BinaryTree.countOfNodes(root));
            System.out.println(BinaryTree.sumOfNodes(root));*/
//            System.out.println(BinaryTree.diameter(root).dia);
          /*  int[] subrootTree={2,4,-1,-1,5,1,-1,-1,-1};
    i=-1;
            Node subroot=BinaryTree.buildTreePreorder(subrootTree);
            BinaryTree.levelTraversal(subroot);
            System.out.println(    BinaryTree.isSubtree(root,subroot));*/
//        BinaryTree.topViewOfTree(root);

//            BinaryTree.kthLevel(root,1,3);
//            BinaryTree.kthLevelBFS(root,2 );
//            System.out.println(BinaryTree.lca2(root,4,5).data);
//            System.out.println(BinaryTree.minDist(root,4,5));
//            System.out.println(BinaryTree.kthAncesstor(root,7,3));

//            System.out.println(BinaryTree.transformSumTree(root));
//            BinaryTree.levelTraversal(root);
//            System.out.println(BinaryTree.univalued(root));;
//            BinaryTree.mirrorBT(root);
//            BinaryTree.deleteLeaf(root,5);
           /* BinaryTree.dupSubtrees(root);
            System.out.println(BinaryTree.arrayList);*/

      /*      BinaryTree.maximumSum(root);
            System.out.println( BinaryTree.maxSum);
*/


              /* int[] arr={2,3,4,5,6,7,8};
               Node root1=null;
               root1=createBBSTFromARR(arr,0,arr.length-1);
                    int[] arr2={3,6,8,10,11,15,18};

        Node root2=null;
        root2=createBBSTFromARR(arr2,0,arr2.length-1);*/

             /*  for (int i = 0; i < arr.length ; i++) {
                  root=buildBST(root,arr[i]);
               }*/
//               inorderBST(root);
              /* levelTraversal(root);*/
               System.out.println();
//               System.out.println(   searchInBST(root,88));
//              root= deleteNode(root,1);
//               printInRange(root,3,5);
//               inorderBST(root);
//               rootToLeafPaths(root);
//        System.out.println(isValidBST(root,null,null));
          /*  Node root=new Node(50);
            root.leftChild=new Node(30);
            root.rightChild=new Node(60);
            root.leftChild.leftChild=new Node(5);
            root.leftChild.rightChild=new Node(20);
        root.rightChild.leftChild=new Node(45);
        root.rightChild.rightChild=new Node(70);
        root.rightChild.rightChild.leftChild=new Node(65);
        root.rightChild.rightChild.rightChild=new Node(80);
*/
      /* Node root1=createBBSTFromARR(arr,0,arr.length-1);
        levelTraversal(root1);
        System.out.println();
        int[] arr1={13,14,15,17,18,19};
        Node root2=createBBSTFromARR(arr1,0,arr1.length-1);
        levelTraversal(root2);
        System.out.println();*/



    /*   Node root= createBBSTFromARR(arr,0, arr.length-1);*/
//        levelTraversal(root);
//        System.out.println();
//        root=balancingBST(root);
       /* Info info=largestBst(root);*/

/*
       Node root= merge2BST(root1,root2);
        Node root3=createBBSTFromARR(mergeBst,0,mergeBst.size()-1);
        System.out.println(mergeBst);*/
//        levelTraversal(root3);
//
//        inorderBST(root);
//        System.out.println(maxSizeBST);


    /*    PriorityQueue<Student> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(new Student("A",5));
        priorityQueue.add(new Student("A",1));
        priorityQueue.add(new Student("A",8));
        priorityQueue.add(new Student("A",2));
        while (!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue);
            System.out.println(priorityQueue.peek().name+"-> "+priorityQueue.peek().rank);
            priorityQueue.remove();
        }*/



       /* AVLTrees.root=AVLTrees.add(AVLTrees.root,10);
        AVLTrees.root=AVLTrees.add(AVLTrees.root,20);
        AVLTrees.root=AVLTrees.add(AVLTrees.root,30);
        AVLTrees.root=AVLTrees.add(AVLTrees.root,40);
        AVLTrees.root=AVLTrees.add(AVLTrees.root,50);
        AVLTrees.root=AVLTrees.add(AVLTrees.root,25);

            AVLTrees.preorderTraversal(AVLTrees.root);*/
/*
Node root=new Node(5);
root.leftChild=new Node(9);
root.rightChild=new Node(2);
root.leftChild.leftChild=new Node(6);
        root.rightChild.rightChild=new Node(3);
        root.leftChild.leftChild.leftChild=new Node(8);
        root.leftChild.leftChild.rightChild=new Node(7);
*/

      /*  maxSumBSTInBT(root);
        inorderBST(root);
        System.out.println(maxSum);*/




        /*countOfPairsEqualToSum(root1,root2,15);
        System.out.println();
        System.out.println(countofpairs);
*/
//levelTraversal(root);
//        System.out.println();


       /* Heap.add(2);
        Heap.add(4);
        Heap.add(3);
        Heap.add(1);
        Heap.add(5);

        while (!Heap.isEmpty()){
            System.out.println(Heap.peek());
            Heap.remove();
        }*/
      /*  int[] arr={2,5,1,3,4};
            Heap.heapSort(arr);
        for (int i:
            arr ) {
            System.out.print(i+" ");
        }*/
       /* int[] arr={10, 20, 11, 70, 50, 40, 100, 5};
        for (int value:
            arr ) {
            System.out.println( Heap.kthLargestElementInStream(value,3));
        }

        int N = 3;
        Node[] a = new Node[N];
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
        head3.next.next = new Node(10);
        head3.next.next.next = new Node(11);
        Node res = Heap.mergeKSortedLL(a,N);
        if (res != null){
            Node temp=res;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }

        System.out.println();*/
       /* int[] arr={1, 2, 3, 4, 5};
        int k=2;
        int n= 6;
       Heap.minTimeToFillNSlots(arr,k,n);*/


        /*HashMap<String,Integer> map=new HashMap<>();

        //insert operation in maps
        map.put("India",150);
        map.put("China",140);
        map.put("US",35);
        map.put("Pakistan",20);

        System.out.println(map);

        // get method in maps
        System.out.println(map.get("India"));

        //remove method in maps
        System.out.println(map.remove("Pakistan"));

        // contains key operation
        System.out.println(map.containsKey("US"));

        //contains value operation
        System.out.println(map.containsValue(150));


        //iteration over maps
        Set<String> keys=map.keySet();

        System.out.println(keys);

        for (String str:
             keys) {
            System.out.println("Key="+str+",value="+map.get(str));
        }
        //entrySet
        System.out.println(map.entrySet());


        //size
        System.out.println(map.size());

        System.out.println(map.values());
        //clear operation in maps
      map.clear();

        //isEmpty
        System.out.println(map.isEmpty());
*/



        /*HashMap<String,Integer> map=new HashMap<>();
        map.put("India",150);
        map.put("China",140);
        map.put("US",35);
        map.put("Pakistan",20);

        ArrayList<String> keys=map.keySet();

        System.out.println(keys);

        for (String str:
                keys) {
            System.out.println("Key="+str+",value="+map.get(str));
        }


        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("China",140);
        lhm.put("US",35);
        lhm.put("Pakistan",20);
        System.out.println(lhm);

        System.out.println();
        TreeMap<String,Integer> treeMap=new TreeMap<>(Collections.reverseOrder());
        treeMap.put("India",150);
        treeMap.put("China",140);
        treeMap.put("US",35);
        treeMap.put("Pakistan",20);
        System.out.println(treeMap);
*/

//        majorityElement();
        /*System.out.println(isAnagram("race","care"));*/

        /*List<Integer> list=Arrays.asList(2,4,1,3,5);
        List res=list.stream().map(x-> x*x).sorted().collect(Collectors.toList());
        System.out.println(res);*/




       /* HashSet<Integer> set=new HashSet<>();

        set.add(2);
        set.add(8);
        set.add(9);
        System.out.println(set);
        System.out.println("Size "+set.size());
        set.remove(8);
        System.out.println("Size "+set.size());

        if(set.contains(2)){
            System.out.println("available");
        }
        Iterator<Integer> iterator=set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
       /* unionAndIntersection();*/
  /*      String[] words={"the","a","there","their","any","thee"};
        for (int i = 0; i < words.length ; i++) {
            Trie.insert(words[i]);
        }

        System.out.println(Trie.startsWith("theid"));*/
       /* String[] words={"zebra","dog","duck","dove"};
        for (int i = 0; i < words.length ; i++) {
            PrefixProblem.insert(words[i]);
        }
        PrefixProblem.root.freq=-1;
        PrefixProblem.findPrefix(PrefixProblem.root,"");*/

       /* String str="ababa";
        for (int i = 0; i <str.length() ; i++) {
            Trie.insert(str.substring(i));
        }

        System.out.println(Trie.countNodes(Trie.root));
*/
        /*String[] words={"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length ; i++) {
            Trie.insert(words[i]);
        }
        Trie.longestWordWithAllPrefixes(Trie.root,new StringBuilder(""));
        System.out.println(Trie.finalString);*/

      /*  String[] words ={"eat","tea","tan","ate","nat","bat"};
        for (int i = 0; i < words.length ; i++) {
            GroupAnagramProblem.insert(words[i]);
        }

        GroupAnagramProblem.grouping(GroupAnagramProblem.TrieNode.root);
        System.out.println(GroupAnagramProblem.ans);*/

      /*  Node root= new Node (20) ;
        root.leftChild=new Node(8);
        root.rightChild=new Node(22);
        root.leftChild.leftChild=new Node(5);
        root.leftChild.rightChild=new Node(3);
        root.rightChild.leftChild=new Node(4);
        root.rightChild.rightChild=new Node(25);
        root.leftChild.rightChild.leftChild=new Node(10);
        root.leftChild.rightChild.rightChild=new Node(14);
        TreeMap<Integer,int[]> map=new TreeMap<>();
        bottomViewOfTree(root,0,0,map);
        for (int[] i:
             map.values()) {
            System.out.println(i[0]);

        }*/

       /* int target=9;
        int[] arr={2, 7, 11, 15};
        for (int i:
             twoSum(target,arr)) {
            System.out.println(i);
        }*/

        /*LRUCacheNew lruCacheNew=new LRUCacheNew(3);
        lruCacheNew.refer(1);
        lruCacheNew.refer(2);
        lruCacheNew.refer(3);
        lruCacheNew.refer(2);
        lruCacheNew.display();*/


//        createGraph(graph);
//        bfs(graph);
//        dfs(graph,0);
//        System.out.println( hasPath(0,1));;
        /*System.out.println(detectCycleInUndirected(graph));*/
      /*  allPathFromDestinationUtil(graph,5,1,"");*/
//        dijkstraAlgorithm(graph,0);
//        bellmanFordAlgorithm(graph,0);
//     primsAlgorithm(graph);
       /* Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root. leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);
        System.out.println(minDepthBT(root));*/

        /*System.out.println(  minRotTime(arr));*/
       /* Set<String> D = new HashSet<String>();
        D.add("poon");
        D.add("plee");
        D.add("same");
        D.add("poie");
        D.add("plie");
        D.add("poin");
        D.add("plea");
        String start = "toon";
        String target = "plea";
        System.out.print("Length of shortest chain is: "
                + wordLadder(D,start, target));*/

      /*  System.out.println(largestRegionSize(matrix));*/
       /* int n = 4;
        int flights[][]={{0,1,1},{0,2,5},{1,2,1},{2,3,1}};
        int src = 0, dst = 3, k = 1;
        System.out.println(findCheapestPrice(n,flights,src,dst,k));*/
   /*    int[][] cities={{0, 1, 1, 100, 0, 0},
               {1, 0, 1, 0, 0, 0},
               {1, 1, 0, 0, 0, 0},
               {100, 0, 0, 0, 2, 2},
               {0, 0, 0, 2, 0, 2},
               {0, 0, 0, 2, 2, 0}};
        connectingCitiesWithMinimumCost(cities);*/
        int v=5;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();


//        kosarajuAlgorithm(graph);
//        tarjansAlgorithm(graph,v);
//        articulationPoint(graph,v);
     /*   int M[][] = { { 0, 0, 1, 1, 0 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1 } };
        largestRegion(M);
        int n=5;*/
       /* int[] dp=new int[n+1];
        System.out.println(fibonacciDP(n,dp));*/
//        System.out.println(fibonacciTabulation(n));

       /* int[][] prerequisite={{1,0},{0,1}};

        System.out.println(    taskPossibleToFinish(graph,prerequisite,v));*/
      /*  int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 0, 0, 1 },
                { 0, 1, 0, 1, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1 } };
        System.out.println( closedIsland(matrix));

*/
       /* String[] words = {"baa", "abcd", "abca", "cab", "cad"};
        int n = words.length;
        int k = 4;
        alianDictionary(words,n,k);*/

//        System.out.println((1&1));
       /* int[] dp=new int[6];
        Arrays.fill(dp,-1);
        System.out.println(climbingStairs(5,dp));
        System.out.println(climbingStairsTabulation(5));*/

       /* int val[]= {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4 } ;
        int W = 7;
        int[][] dp=new int[val.length+1][W+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                dp[i][j]=-1;
            }
        }
        int[] arr={4,2,7,1,3};
        int sum=20;*/
       /* System.out.println(zeroOneKnapSack(val,wt,W, val.length));
        System.out.println(zeroOneKnapSackMemo(val,wt,W, val.length,dp));
        System.out.println(zeroOneKnapSackTabulation(val,wt,W, val.length));
        System.out.println(targetSumSubSet(arr,sum));*/
//        System.out.println(unboundedKnapsackTabulation(val,wt,W));
        /*int[] coins={1,2,3};
        System.out.println(coinChange(coins,4));*/
     /*   String str1="abcde";
        String str2="ace";
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
            dp[i][j]=-1;
            }
        }*/
/*        System.out.println(lcs(str1,str2,str1.length(),str2.length()));
        System.out.println(lcsMemoization(str1,str2,str1.length(),str2.length(),dp));
        System.out.println(lcsTabulation(str1,str2,str1.length(),str2.length()));*/
//        System.out.println(longestCommonSubstring("ABCDE","ABGCE",5,5));
     /*   System.out.println(catlanNumber(500));*/
       /* int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=dp[1]=1;
        System.out.println(catlanNumberMemoization(n,dp));*/
       /* System.out.println(numTrees(255));*/
       String s="bbbab";
       int n=s.length();

        int[][] dp=new int[n+1][n+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                dp[i][j]=-1;
            }
        }
     /*   System.out.println(mcm(arr,1,n-1));
        System.out.println(mcmMemoization(arr,1,n-1,dp));
        System.out.println(mcmTabulation(arr));*/
       /* int[] nums={1,6,11,5};
        System.out.println(minimumDifference(nums));*/
        /*String num="4";
        System.out.println((num.charAt(0)-'0')+4);*/
       /* System.out.println(multiplyStrings("11","23"));
        System.out.println(11*23);*/
       /* int[] nums={114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        System.out.println(rob(nums));*/

       /* System.out.println(longestPalindromeSubseq(s));*/
      /*  int[] nums={2,1,1,5,6,2,3,1};
        System.out.println(minimumMountainRemovalsUtil(nums));*/
//        System.out.println(reverseWord("Ashish"));
//        System.out.println(flipCoins(8,"11001100"));
        int[][] cuboids={
                {50,45,20},{95,37,53},{45,23,12}
        };
        System.out.println(boxStacking(cuboids));
    }


}




    // Inheritance

/*
class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breates");
    }
}
class Mammal extends Animal{
    void walks(){
        System.out.println("Walks");
    }
}
class Dog extends Mammal{
    void barks(){
        System.out.println("Barks");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}
class Sharks extends Fish{
    void noveg(){
        System.out.println("Non- veg");
    }
}
*/
