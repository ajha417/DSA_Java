import java.util.PriorityQueue;
//here the time complexity will be O(nlogn)
public class ConnectingNRopes {
    public static void main(String[] args) {
        //here is given the array of length of ropes
        //constraint is if we connect any rope then its cost becomes its sum of the length
        //so here we have to connect rope in such a way that its cost comes to be minimum
        int a[] = {2,5,4,8,6,9};
        //here in rope
        //naive solution may be
        //2+5=11   11+4=15   15+8=23 23+6=29   29+9=38
        //11+15+23+29+38=106

        //now optimized solution
        //add two shorter length ropes first and in same way others also
        //here in array 2 and 4 are shortest
       /* [5,6,8,6,9]
        now shorter is 5 and 6                 6+11+14+20+34=85
            [11,8,6,9]
        now 6 and 8
            [11,14,9]
        now 9 and 11
            [20,14]=34
*/

        int cost = findMinCost(a);
        System.out.println("The minimum cost is "+cost);
    }
    static int findMinCost(int a[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int first = pq.poll();   //be default it will pop out the smallest number
            int second = pq.poll();  //it will second, the smallest number
            ans = ans+ first +second;
            pq.add(first+second);

        }
        return ans;
    }
}
