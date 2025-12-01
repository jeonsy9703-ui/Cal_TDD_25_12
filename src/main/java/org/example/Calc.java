package org.example;

public class Calc {
    public static int run(String exp) {

<<<<<<< HEAD
        boolean needToPlus = exp.contains("+");
        boolean needToMinus = exp.contains("-");

        String[] bits = null;

        if (needToPlus) {
            bits = exp.split(" \\+ ");
        } else if (needToMinus) {
            bits = exp.split(" - ");
        }
=======
        String[] bits = exp.split(" \\+ ");
>>>>>>> 1213afaffb63d9b86e23670f1fcb5755f93b4047

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

<<<<<<< HEAD
        if (needToPlus) {
            return a + b;
        } else if (needToMinus) {
            return a - b;
        }

        throw new RuntimeException("해석 불가 : 올바른 계산식이 아님");
    }
}
=======
        return a + b;
    }
}
>>>>>>> 1213afaffb63d9b86e23670f1fcb5755f93b4047
