import java.lang.*;

//getclass.getSimpleName.toLowerCase를 출력하는 제네릭 클래스를 통해 코드를 구현하였습니다.
//int, char 형의 경우 각각 integer, character로 출력되는 이유로 instanceof 를 통해 예외를 처리하였습니다.

class Type {

    public static void main(String[] args) {
        Block block = new Block();
        byte a = 12;
        short b = 123;
        int c = 12345;
        long d = 123456789L;
        char e = 'A';
        float f = 12.34F;
        double g = 123.456;
        boolean h = false;
        block.print(a);
        block.print(b);
        block.print(c);
        block.print(d);
        block.print(e);
        block.print(f);
        block.print(g);
        block.print(h);
    }
}

class Block<T> {
    char i = 'a';
    Block() {
    }

    public void print(T var) {

        if(var instanceof Integer)
            System.out.println("int " + this.i + ": " + var);
        else if(var instanceof Character)
            System.out.println("char " + this.i + ": " + var);
        else
            System.out.println(var.getClass().getSimpleName().toLowerCase()+ " " + this.i + ": " + var);

        ++this.i;
    }
}

