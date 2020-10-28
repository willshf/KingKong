public class KingKong
{
    private int zahl = 0;
    public boolean teilbar3()
    {
        if( zahl % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean teilbar7()
    {
        if( zahl % 7 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void zahlreiheAusgeben(int maximum)
    {
       for(int i=0; i<=maximum; i++)
       {
           teilbar3();
           if(true)
           {
               teilbar7();
               if(true)
               {
                   System.out.print("KingKong");
                   zahl++;
                }
                else
                {
                    teilbar7();
                    if(true)
                    {
                        System.out.print("Kong");
                        zahl++;
                    }
                    else
                    {
                        System.out.print("King");
                        zahl++;
                    }
                }
           }
           else
           {
                System.out.print(zahl);
                zahl++;
           }
           zahl++;
       }
    }
    public int zahlAusgeben()
    {
        return zahl;
    }
    public void zahlausgeben3()
    {
        if(zahl%3==0)
        {
            System.out.print("King");
        }
        else
        {
            System.out.print(zahl);
        }
    }
}
