class maxDemo{


}
public class Max {
    static void MaxArr(){
        int arr[]={3,3,32,54,5,54};
        int ans=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i]>ans){
                ans=arr[i];
            }

        }
        System.out.println(ans);

    }
    public static void main(String[] args) {

        MaxArr();
    }
}
