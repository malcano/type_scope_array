import java.util.Arrays;
class Array {
    public static void main(String[] args) {

        // 길이 10의 정수형 1차원 배열변수 a를 new 연산자를 이용해 생성한다.
        int a[] = new int[10];

        // 배열 a의 원소에 순서대로 0부터 9까지의 값을 할당한다.
        for(int i = 0 ; i<10; i++)
        {
            a[i] = i;
        }
        // 5x2 크기를 갖는 정수형 2차원 배열변수 b를 new 연산자를 이용해 생성한다.
        int b[][] = new int [5][2];
        int k = 0;
        // 배열 b의 원소에 순서대로 0부터 9까지의 값을 할당한다.
        for(int i =0;i<5;i++)
        {
            for(int j = 0; j<2;j++)
            {
                b[i][j] = k;
                k++;
            }
        }

        // 두 배열을 README.md에 적힌 형식으로 출력한다.
        System.out.println("a:");
        System.out.println(Arrays.toString(a).replaceAll("\\[","").replaceAll("\\]",""));
        System.out.println("b:");
        for(int i=0;i<5;i++)
        {
            System.out.println(Arrays.toString(b[i]).replaceAll("\\[","").replaceAll("\\]",""));
        }
        //Arrays.toString을 통해 출력될 리스트에서 대괄호를 대체하여 출력하였습니다.
    }
}
