class Human {
    void intro() {
        System.out.println("나는 사람입니다.");
    }
}

class JavaTest {
    public static void main(String[] args) {
        Human lee = new Human() {
            void intro() {
                System.out.println("나는 학생입니다.");
            }
        };
        lee.intro();
    }
}

