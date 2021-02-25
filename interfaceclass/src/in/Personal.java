package in;

public interface Personal{
    public void study();
    public void session();
}

class Pervokursnik implements Personal{

    public void study(){
        System.out.println("Сейчас во втором семестре");
    }

    public void session(){
        System.out.println("Готовится к второй сессии");
    }

    protected int sessionmark;

    public void setSessionmark(int m) {
        this.sessionmark = m;
    }

    public int getSessionmark(){
        return sessionmark;
    }

}

class Vtorokursnik extends Pervokursnik{

    @Override
    public void study() {
        System.out.println("Сейчас в четвёртом семестре");
    }

    @Override
    public void session() {
        System.out.println("Готовится к четвёртой сессии");
    }

    public void setSessionmark(int m) {
        this.sessionmark = m;
    }

    public int getSessionmark(){
        return sessionmark;
    }
}

class Tretekursnik extends Vtorokursnik{

    @Override
    public void session() {
        System.out.println("Готовится к шестой сессии");
    }

    @Override
    public void study() {
        System.out.println("Сейчас в шестом семестре");
    }

    public void setSessionmark(int m) {
        this.sessionmark = m;
    }

    public int getSessionmark(){
        return sessionmark;
    }

}

class Diploma extends Tretekursnik{

    @Override
    public void session() {
        System.out.println("Готовится к сдаче диплома");
    }

    @Override
    public void study() {
        System.out.println("Сейчас в восьмом семестре");
    }

    public void setSessionmark(int m) {
        this.sessionmark = m;
    }

    public int getSessionmark(){
        return sessionmark;
    }

}

class Program {
    public static void main(String[] args) {
        Pervokursnik sidorov = new Pervokursnik();
        sidorov.setSessionmark(7);
        System.out.println("Первокурсник - Сидоров");
        System.out.print("Оценка за сессию -  ");
        System.out.println(sidorov.getSessionmark());
        sidorov.study();
        sidorov.session();

        System.out.println("");

        Vtorokursnik ivanov = new Vtorokursnik();
        ivanov.setSessionmark(5);
        System.out.println("Второкурсник - Иванов");
        System.out.print("Оценка за сессию - ");
        System.out.println(ivanov.getSessionmark());
        ivanov.study();
        ivanov.session();

        System.out.println("");

        Tretekursnik petrov = new Tretekursnik();
        petrov.setSessionmark(9);
        System.out.println("Третьекурсник - Петров");
        System.out.print("Оценка за сессию - ");
        System.out.println(petrov.getSessionmark());
        petrov.study();
        petrov.session();

        System.out.println("");

        Diploma luzkaya = new Diploma();
        luzkaya.setSessionmark(8);
        System.out.println("Дипломник - Луцкая");
        System.out.print("Оценка за сессию - ");
        System.out.println(luzkaya.getSessionmark());
        luzkaya.study();
        luzkaya.session();
    }
}