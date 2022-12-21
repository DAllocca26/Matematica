package util;

public class mathUtil 
{
    /**
     * Metodo che calcola il fattoriale del parametro n
     * es:  4! = 1*2*3*4    = 24
     * es2: 5! = 1*2*3*4*5  = 120
     * @param n
     * @return
     */
    public static int calcFattoriale(int n)
    {
        int res = n;

        for(int i=n-1;i>1;i--)
        {
            res*=i;
        }

        return res;
    }

    


}
