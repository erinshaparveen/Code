package May2026;

public class tiplers {
    public static void main(String[] args) {
        int[] array = {2 ,6 ,18 ,54 ,16 ,30 ,32 ,64};
        for(int i = 0 ; i < array.length ;i++) {
            int first = array[i];
            int second = first * 3;
            int third = second * 3;
            boolean secondFound = false;
            boolean thirdFound = false;
            for (int j = i + 1; j < array.length; j++)
            {
                if(array[j]==second)
                {
                    secondFound=true;
                    break;
                }
            }
            if(secondFound)
            {
                for (int j = i + 1; j < array.length; j++)
                {
                    if(array[j]==third)
                    {
                        thirdFound = true;
                        break;
                    }
                }
            }
            if (secondFound &&  thirdFound)
            {
                System.out.println(array[i]+ " "+second+ " "+third);
            }
        }
    }
}
