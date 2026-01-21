package TUF.LearnBasic.recursion;

public class dryRun {
    static int cnt = 0;
    static void print() {
        if(cnt == 4){
            return;
        }
        System.out.println(cnt);
        cnt++;
        print();
    }
    
    public static void main(String[] args){
        print();
    }
}
