package me;

class AThing {
    int a;
    int b;

    AThing(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void callByReferenceMethod(AThing obj) {
        obj.a *= 2;
        obj.b /= 2;
    }

}

public class CallByReference {
    public static void main(String[] args) {
        AThing obj = new AThing(15, 20);
        System.out.printf("obj.a and obj.b before the method call: %d and %d%n", obj.a, obj.b);
        obj.callByReferenceMethod(obj);
        System.out.printf("obj.a and obj.b after the call: %d and %d%n", obj.a, obj.b);
    }
}
