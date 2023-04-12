public class TestComplexe {
    public static void main(String[] args) {
        Complexe complexe1=new Complexe(1,1);
        Complexe complexe2=new Complexe(3,-5);
        System.out.println(Complexe.ajouter(complexe1,complexe2).toString());
        System.out.println(Complexe.soustraire(complexe1,complexe2).toString());
    }
}
