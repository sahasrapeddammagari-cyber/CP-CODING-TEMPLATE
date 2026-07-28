import java.io.*;
import java.util.*;

public class Main {

    /*------------------------------------------------------------*
     |                     CONSTANTS                              |
     *------------------------------------------------------------*/

    static final long MOD = 1_000_000_007L;
    static final long INF = Long.MAX_VALUE;
    static final int[] DX4 = {-1, 1, 0, 0};
    static final int[] DY4 = {0, 0, -1, 1};
    static final int[] DX8 = {-1,-1,-1,0,0,1,1,1};
    static final int[] DY8 = {-1,0,1,-1,1,-1,0,1};

    static FastIO io = new FastIO();
    static PrintWriter out = new PrintWriter(System.out);

    /*------------------------------------------------------------*
     |                     FAST INPUT                             |
     *------------------------------------------------------------*/

    static class FastIO {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while(st==null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException{
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException{
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException{
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException{
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException{
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=nextInt();
            return arr;
        }

        long[] nextLongArray(int n) throws IOException{
            long[] arr=new long[n];
            for(int i=0;i<n;i++)
                arr[i]=nextLong();
            return arr;
        }

        String[] nextStringArray(int n) throws IOException{
            String[] arr=new String[n];
            for(int i=0;i<n;i++)
                arr[i]=next();
            return arr;
        }
    }

    /*------------------------------------------------------------*
     |                     MATH UTIL                              |
     *------------------------------------------------------------*/

    static class MathUtil{

        static long gcd(long a,long b){
            while(b!=0){
                long t=b;
                b=a%b;
                a=t;
            }
            return a;
        }

        static long lcm(long a,long b){
            return (a/gcd(a,b))*b;
        }

        static long power(long a,long b){
            long ans=1;
            while(b>0){
                if((b&1)==1)
                    ans*=a;
                a*=a;
                b>>=1;
            }
            return ans;
        }

        static long modPower(long a,long b){
            long ans=1;
            a%=MOD;
            while(b>0){
                if((b&1)==1)
                    ans=(ans*a)%MOD;
                a=(a*a)%MOD;
                b>>=1;
            }
            return ans;
        }

        static boolean isPrime(long n){
            if(n<2) return false;
            if(n==2) return true;
            if(n%2==0) return false;

            for(long i=3;i*i<=n;i+=2)
                if(n%i==0)
                    return false;

            return true;
        }

        static boolean[] sieve(int n){

            boolean[] prime=new boolean[n+1];
            Arrays.fill(prime,true);

            if(n>=0) prime[0]=false;
            if(n>=1) prime[1]=false;

            for(int i=2;i*i<=n;i++)
                if(prime[i])
                    for(int j=i*i;j<=n;j+=i)
                        prime[j]=false;

            return prime;
        }
    }

    /*------------------------------------------------------------*
     |                  ARRAY UTILITIES                           |
     *------------------------------------------------------------*/

    static class ArrayUtil{

        static void reverse(int[] arr){
            int l=0,r=arr.length-1;
            while(l<r){
                int t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r--;
            }
        }

        static long[] prefixSum(int[] arr){

            long[] pre=new long[arr.length+1];

            for(int i=0;i<arr.length;i++)
                pre[i+1]=pre[i]+arr[i];

            return pre;
        }

        static int lowerBound(int[] arr,int x){

            int l=0,r=arr.length;

            while(l<r){

                int mid=(l+r)/2;

                if(arr[mid]<x)
                    l=mid+1;
                else
                    r=mid;
            }

            return l;
        }

        static int upperBound(int[] arr,int x){

            int l=0,r=arr.length;

            while(l<r){

                int mid=(l+r)/2;

                if(arr[mid]<=x)
                    l=mid+1;
                else
                    r=mid;
            }

            return l;
        }
    }

    /*------------------------------------------------------------*
     |                    BIT UTILITIES                           |
     *------------------------------------------------------------*/

    static class BitUtil{

        static boolean isSet(long n,int k){
            return ((n>>k)&1)==1;
        }

        static long setBit(long n,int k){
            return n|(1L<<k);
        }

        static long clearBit(long n,int k){
            return n&(~(1L<<k));
        }

        static long toggleBit(long n,int k){
            return n^(1L<<k);
        }

        static int countBits(long n){
            return Long.bitCount(n);
        }

        static boolean isPowerOfTwo(long n){
            return n>0 && (n&(n-1))==0;
        }
    }

    /*------------------------------------------------------------*
     |                       PAIR                                 |
     *------------------------------------------------------------*/

    static class Pair{

        int first;
        int second;

        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }

    /*------------------------------------------------------------*
     |                     DEBUG                                  |
     *------------------------------------------------------------*/

    static class Debug{

        static void print(int[] arr){
            System.err.println(Arrays.toString(arr));
        }

        static void print(long[] arr){
            System.err.println(Arrays.toString(arr));
        }

        static void print(Object obj){
            System.err.println(obj);
        }
    }

    /*------------------------------------------------------------*
     |                       SOLVE                                |
     *------------------------------------------------------------*/

    static void solve() throws Exception{

        // Write your solution here

    }

    public static void main(String[] args) throws Exception{

        int t=1;

        // t=io.nextInt();

        while(t-->0)
            solve();

        out.flush();
    }
}
