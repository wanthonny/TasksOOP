public class Main {
    public static void main(String[] args) {
        try {
            Hero name1 = new Hero("Grut");
            Hero name2 = new Hero("Loki");
            AvengersBase avengersBase = new AvengersBase();

            avengersBase.enterBase(name1);
            avengersBase.enterBase(name2);
            System.out.println(avengersBase.getSecretDocuments(name1, " Доступ представлен груту"));
            System.out.println(avengersBase.getSecretDocuments(name2, " Доступ не предоставлен локи"));
        } catch (SecurityBreachException exp) {
            System.out.println("Security Exception " + exp.getMessage());
        } catch (UnauthorizedAccessAttemptException exp) {
            System.out.println("Unauthorized Access Exception " + exp.getMessage());
        }
    }
}