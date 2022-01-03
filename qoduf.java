

// class qoduf {
    // public static void main(String[] args) {
        // int[] score = new int[5];
        // int k = 1;

        // score[0] = 50;
        // score[1] = 60;
        // score[k+1] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // for(int i=0; i<5; i++) {
        //     System.out.printf("score[%d]:%d%n", i, score[i]);
        // }
        // System.out.printf("length : %d%n", score.length);
        // System.out.printf("score[%d]:%d%n", 7, score[7]); 
        
        // int[] score = new int[] {50, 60, 70, 80 90};
        // int[] score = {50, 60, 70, 80, 90}
        // int[] score = new int[5];
        // for (int i = 0; i < score.length; i++ ) {
        //     score[i] = 50 + i*10;
        // }
        // System.out.println(score[0] + score[score.length-1]);

        // char[] chArr = new char[5];
        // for (int i = 0; i < chArr.length; i++) {
        //     chArr[i] = (char)('a' + i);
        //     System.out.printf("chArr[%d]:%c%n", i , chArr[i]);

        // }
        // boolean[] boolArr = new boolean[5];
        // for (int i = 0; i < boolArr.length; i++) {
        //     boolArr[i] = true ;

        // }
        // int[] score = {79, 88, 91, 33, 100, 55, 95};
        // int temp = -1;


        // for(int i=0; i < score.length; i++) {
        //     if(score[i] > score[i+1]) {
        //         temp = score[i];
        //         score[i] = score[i+1];
        //         score[i+1] = temp;
        //         System.out.printf("%d%n",score[i]);
        //     }

        // }
        // int[] numArr = new int[10];
        // for(int i = 0; i < numArr.length; i++) {
        //     numArr[i] = i;
        //     System.out.print(numArr[i]);
        // }
        
        // System.out.println();

        // for (int i=0; i < 100; i++) {
        //     int n = (int)(Math.random() * 10);
        //     int tmp = numArr[0];
        //     numArr[0] = numArr[n];
        //     numArr[n] = tmp;
        // }

        // for (int i=0; i < numArr.length; i++)
        //     System.out.print(numArr[i]);
        // int[] arr = new int[5];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = (int)(Math.random()*5);
        //     System.out.print(arr[i]);
        // }
        // Scanner scan = new Scanner(System.in);
        // int[] coin = {500 , 100 , 50 , 10};
        // int money;
        // System.out.printf("거스름돈:");
        // money = scan.nextInt();
        
        // for (int i = 0; i < coin.length; i++) {
        //     System.out.println(coin[i]+"원 :" + money / coin[i]);
        //     money%= coin[i];
        // }
        // int []arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        
        // int minIndex = 0; //가장 적은 원소의 인덱스
        
        // for(int i=0; i < arr.length; i++){
        //     for(int j=i+1 ; j < arr.length; j++){
        //         if(arr[minIndex] > arr[j])
        //             minIndex = j;
        //             int tmp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = tmp;
        //     }
            
        //     //스와프

        // }
        // System.out.println(Arrays.toString(arr));
    //     int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
        
    //     quickSort(array, 0, array.length -1);
        
    //     for (int i : array) {
    //         System.out.printf("%d ",i);
    //     }
    // }
    
//     public static void quickSort(int array[], int start, int end){
        
//         if(start>=end) //원소가 1개인 경우 종료
//         return;
        
//         int pivot = start; //피벗은 첫 번째 원소
//         int left = start+1;
//         int right = end;
        
//         while ( left <= right){
            
//             //피벗보다 큰 데이터를 찾을 때까지 반복
//             while (left <= end && array[left] <= array[pivot])
//                 left+=1;
            
//             //피벗보다 작은 데이터를 찾을 때까지 반복
//             while(right > start && array[right] >= array[pivot])
//                 right-=1;
            
//             if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
//                 int tmp = array[right];
//                 array[right] = array[pivot];
//                 array[pivot] = tmp;
//             }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
//                 int tmp = array[right];
//                 array[right] = array[left];
//                 array[left] = tmp;
//             }
            
//             //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
//             quickSort(array, start, right -1);
//             quickSort(array, right +1, end);
//         }





//     }
// }
// class QuickExam {
    
//     public static void main(String[] args){
        
//         int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
        
//         quickSort(array, 0, array.length -1);
        
//         for (int i : array) {
//             System.out.printf("%d ",i);
//         }
//     }
    
//     public static void quickSort(int array[], int start, int end){
        
//         if(start>=end) //원소가 1개인 경우 종료
//         return;
        
//         int pivot = start; //피벗은 첫 번째 원소
//         int left = start+1;
//         int right = end;
        
//         while ( left <= right){
            
//             //피벗보다 큰 데이터를 찾을 때까지 반복
//             while (left <= end && array[left] <= array[pivot])
//                 left+=1;
            
//             //피벗보다 작은 데이터를 찾을 때까지 반복
//             while(right > start && array[right] >= array[pivot])
//                 right-=1;
            
//             if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
//                 int tmp = array[right];
//                 array[right] = array[pivot];
//                 array[pivot] = tmp;
//             }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
//                 int tmp = array[right];
//                 array[right] = array[left];
//                 array[left] = tmp;
//             }
            
//             //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
//             quickSort(array, start, right -1);
//             quickSort(array, right +1, end);
//         }
//     }
// }
 