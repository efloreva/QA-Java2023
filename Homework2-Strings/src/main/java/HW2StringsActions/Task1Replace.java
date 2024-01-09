package HW2StringsActions;
//Task: Заместете даден под-string в даден string с друг текст:
//
//    Пример: “My name is <myName>” – заместете Test с нещо, което чете от конзолата.

public class Task1Replace {

    public static void main(String[] args) {
        String userName = "My name is Slim Shady. ";
        System.out.printf(userName);

        System.out.println(userName.replace("Slim Shady","Marshall"));
    }
}
