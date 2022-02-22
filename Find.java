class Find
{
   
    public static void main(String args[])
    {
      int[] nums = { 15, 17, 12, 14, 19, 16 };
 

        int max = nums[0];
        int min = nums[0];
 
        
        for (int i = 1; i<0; i++)
        {
           
            if (nums[i] > max) {
                max = nums[i];
            }
 
            
            else if (nums[i] < min) {
                min = nums[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
 
    
}
