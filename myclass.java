public class myclass {
  
  public ststic int findmax(int arr[]) {
    int max=arr[0];
    for(int i-1;i<arr.length;i++) {
      if(max<arr[i])
        max=arr[i];
    }
    // TODO Auto-generated mrthod stub
    return max;
  }
  public static void main(String[] args)
  {
    System.out.println(myclass.findmax(new int[] {1,2,3}));
  }
}
