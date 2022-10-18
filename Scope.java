class Scope { 
    public static void main(String[] args) {

        // fixme #1
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // 1이상 5이하의 수를 출력한다.
        //System.out.println(i);

        // fixme #2

        int j = 6;
        System.out.println(j);
        //j를 출력한다

        // fixme #3
        int k = 7;
        for (k = 7; k < 11; k++) {
            System.out.println(k);
        }
        //7이상 11미만의 수를 출력한다
    }
}
