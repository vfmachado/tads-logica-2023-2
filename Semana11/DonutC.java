import java.util.Arrays;

public class DonutC {
    public static void main(String[] args) throws Exception {
        int k;
        
        double A=0, B=0, i, j;
        double[] z = new double[1760];
        char[] b = new char[1760];
        System.out.print("\033\143");

    for(; ; ) {
        // memset(b,32,1760);
        Arrays.fill(b, 0, 1760, (char) 32);        
        Arrays.fill(z, 0, 1760, (char) 0);
        
        // memset(z,0,7040);
        for(j=0; 6.28>j; j+=0.07) {
            for(i=0; 6.28 >i; i+=0.02) {
                double sini=Math.sin(i),
                      cosj=Math.cos(j),
                      sinA=Math.sin(A),
                      sinj=Math.sin(j),
                      cosA=Math.cos(A),
                      cosj2=cosj+2,
                      mess=1/(sini*cosj2*sinA+sinj*cosA+5),
                      cosi=Math.cos(i),
                      cosB=Math.cos(B),
                      sinB=Math.sin(B),
                      t=sini*cosj2*cosA-sinj* sinA;
                int x= (int) (40+30*mess*(cosi*cosj2*cosB-t*sinB)),
                    y= (int) (12+15*mess*(cosi*cosj2*sinB +t*cosB)),
                    o=x+80*y,
                    N= (int) (8*((sinj*sinA-sini*cosj*cosA)*cosB-sini*cosj*sinA-sinj*cosA-cosi *cosj*sinB));
                if(22>y&&y>0&&x>0&&80>x&&mess>z[o]){
                    z[o]=mess;
                    b[o]=".,-~:;=!*#$@".toCharArray()[N>0?N:0];
                }
            }
        }
        System.out.print("\033\143");

        
        for(k=0; 1760>k; k++)
            System.out.print( k % 80 != 0 ? b[k] : "\n");
            
        
        A+=0.04;
        B+= 0.02;

       Thread.sleep(16);
    }


    }
}
