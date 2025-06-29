public class Test4 {
    public static void main(String [] args){
        int a= 10;
    
        //pre-increment ---> x= x+1, x+=1;
        System.out.println(a++); //10
        System.out.println(++a); //12

        int x1= 5;
        int y = x1++;
        int x2= 5; 
        int z = ++x2;

        System.out.println(x1);  //6
        System.out.println(y);   //5
        System.out.println(x2);  //6
        System.out.println(z);   //6

        int p1 = 5;
        int q = p1--;
        int p2 = 5;
        int r = --p2;

        System.out.println(p1);  //4
        System.out.println(q);   //5
        System.out.println(p2);  //4
        System.out.println(r);   //4


        int x=10;

        x += 5; //x = x + 5
        System.out.println(x);

        x -= 5; //x = x -5
        System.out.println(x);

        x *= 5; // x = x * 5
        System.out.println(x);

        x /= 5; //x = x / 5
        System.out.println(x);

        x %= 5; //  x = x % 5
        System.out.println(x);

    }
    
}
