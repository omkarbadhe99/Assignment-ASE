public class Pangram {
    public static void main(String[] args) {

        String s = "the quick brown fox jumps over the lazy dog";
        if(ispangram(s)){
            System.out.println("The input is a pangram.");
        }else {
            System.out.println("The input is not a pangram.");
        }

    }

    public static boolean ispangram(String s)
    {
        if(s.length()<26)
        {
            return false;
        }
        else
        {
            for(char ch='a'; ch<='z'; ch++)
            {
                if(s.indexOf(ch)<0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

