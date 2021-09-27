import java.util.*;
class AllocateHouse{
	static int N=(int)Math.pow(10,5),B,T;
    public static void main(String[] args){
        int n;
        int[] Ai = new int[N];
        int[] maxHouses=null;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        //T=(int)(Math.random() *(100-1+1))+1;
        maxHouses = new int[T];
        if(T<1 || T>100) return; //Constraint #1
        /*long startTime = 0;
        long endTime = 0;*/
        for(int i = 0; i < T;i++){
        	//startTime = System.currentTimeMillis();
            n=sc.nextInt(); //no.of houses in each test case
            //N=(int)(Math.random()*(100-1+1))+1;
            B=sc.nextInt(); // Budget for each test case
            //B=(int)(Math.random()*(100-1+1))+1;
            if(B<1 || B > Math.pow(10,5)) return; //Constraint #2
            
            for(int j=0;j<n;j++){
                Ai[j]=sc.nextInt();
                //Ai[i] = (int)(Math.random() *(1000-1+1))+1;
                if(Ai[j]<1 || Ai[j] > 1000) return; //Constraint #3
            }
            
            maxHouses[i] = maxOfHouses(Ai,n,B);
            /*endTime = System.currentTimeMillis();
            System.out.println("\nTime taken for Test Case :"+(endTime-startTime)/1000);*/
        }//for loop
        for(int k=0;k<maxHouses.length;k++){
                System.out.println("Case #"+(k+1)+": "+maxHouses[k]);
            }
    }//main
    public static int maxOfHouses(int[] Ai, int n, int B){
        
        int sum=0,count=0;
        Arrays.sort(Ai);  //increment order - O(nlogn)
        if(B<Ai[0] ) return 0;// eliminating the Loop if true
        while(count<=n && B>Ai[count]){
        	B=B-Ai[count];
        	count++;
        }//while
        /*for(int i=0;i<n;i++){
        
            sum = Ai[i]+sum;
            if (sum < B){
                count++; 
                System.out.print(" -> "+count);
            }
            else if(sum>B) {
                break;
            }
            else{//sum == B 
                count++;
                break;
            }
            
        }//for*/
        return count;
        }//maxOfHouses(-,-)
}//class
