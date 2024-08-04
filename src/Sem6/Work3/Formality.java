package Sem6.Work3;

public class Formality {
    private String formality;

    public String greet() {
        return switch (this.formality) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            default -> "Hello.";
        };
    }
//    public String greet() {
//        switch (this.formality) {
//            case "formal":
//                return "Good evening, sir.";
//            case "casual":
//                return "Sup bro?";
//            case "intimate":
//                return "Hello Darling!";
//            default:
//                return "Hello.";
//        }
//    }
//
}
