public class MergeArray {
    public static void main(String[] args) {

        int[]a ={1,2,3,4,5};
        int[]b={6,7,8,9,10};
        int[]c = new int[a.length+b.length];
        int count =0;
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
            count++;
        }
        for (int i = 0; i < b.length; i++) {
            c[count++]=b[i];
        }
        System.out.println("mảng gộp từ a và b");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+",");
        }
    }
}
