package week3;

public class Calculator {
    private double result;

    // 덧셈
     public void add(int a, int b) {
         result = a + b;
     }

    public void add(int a, double b) {
        result = a + b;
    }

    public void add(double a, int b) {
        result = a + b;
    }

    public void add(double a, double b) {
        result = a + b;
    }

    // 뺄셈
     public void sub(int a, int b) {
         result = a - b;
     }

    public void sub(double a, int b) {
        result = a - b;
    }

    public void sub(int a, double b) {
        result = a - b;
    }

    public void sub(double a, double b) {
        result = a - b;
    }

    // 곱셈
     public void mul(int a, int b) {
         result = a * b;
     }

    public void mul(double a, int b) {
        result = a * b;
    }

    public void mul(int a, double b) {
        result = a * b;
    }

    public void mul(double a, double b) {
        result = a * b;
    }

    // 나눗셈
    public void div(int a, int b) {
         if (b != 0) {
             result = (double) a / b;
         }
     }

    public void div(double a, int b) {
        if (b != 0) {
            result = a / b;
        }
    }

    public void div(int a, double b) {
        if (b != 0) {
            result = a / b;
        }
    }

    public void div(double a, double b) {
        if (b != 0) {
            result = a / b;
        }
    }

    // getter
    public double getResult() {
        return result;
    }

    //setter
    private void setResult(double result) {
        this.result = result;
    }
}
