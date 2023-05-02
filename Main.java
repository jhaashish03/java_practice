import java.security.PublicKey;
import  java.util.*;
public class Main {

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


        public  static void coutingSort(int arr[]){
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

        }
    public static void main(String[] args){
            //     Scanner sc=new Scanner(System.in);
            //     System.out.println("Enter the number of rows");
            //     int rows=sc.nextInt();
            //     System.out.println("Enter the number of columns");
            //     int col=sc.nextInt();
            //    int[][] num=new int[rows][col];\
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
    int[] arr={4,2,0,6,3,1,5};
//    reverseArray(arr);
//    for (int i:
//         arr) {
//        System.out.println(i);
//
//    }
       int[] nums = {5,2,6,2,1};
      coutingSort(nums);
        }
    }

