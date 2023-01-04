package Java_Collection;

public class RuntimeExceptionTest {
    public static void main(String[] args){

        try{
        System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
        printMyName("abc");
        printMyName(null);
    }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException 발생!");
        }
        catch (NullPointerException e){
            System.out.println("NullPointException 발생!");
            System.out.println("e.getMessage " + e.getMessage());
            System.out.println("e.toString " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("[프로그램 종료]");
        }
    }

    static void printMyName(String str){
        String upperCaseAlphabet = str.toUpperCase();
        System.out.println(upperCaseAlphabet);

    }
}
