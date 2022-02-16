public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long sum = 0;
        for (int i = 0; i<sizes.length; i++){
            if(sizes[i]%clusterSize!=0){
                sum+= ((sizes[i]/clusterSize)+1)*clusterSize;
            }
            else{
                sum+= sizes[i];
            }
        }

        return sum;
    }
}