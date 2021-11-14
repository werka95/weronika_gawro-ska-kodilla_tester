public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook= new Notebook(600,1000,2014);
        System.out.println(notebook.weight + "g " + notebook.price + " price " + notebook.year + " year" );
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkValue();


        Notebook heavyNotebook = new Notebook(2000,1500,2021);
        System.out.println(heavyNotebook.weight+ "g " + heavyNotebook.price + " price " + heavyNotebook.year + " year ");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkValue();


        Notebook oldNotebook = new Notebook(1600,500,2018);
        System.out.println(oldNotebook.weight+ "g " + oldNotebook.price + " price " + oldNotebook.year + " year ");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkValue();

    }
}

