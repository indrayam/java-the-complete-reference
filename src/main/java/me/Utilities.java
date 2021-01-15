package me;

class ManyToOne {
    private final String type = "Many-to-One";

    public String getType() {
        return type;
    }
}

class OneToOne {
    private final String type = "One-to-One";

    public String getType() {
        return type;
    }
}

interface IWork {
    void doSomething();
}
