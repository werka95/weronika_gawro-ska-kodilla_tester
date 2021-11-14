public class Notebook {
        int weight;
        int price;
        int year;





        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;

        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price > 600 && this.price < 1000) {
                        System.out.println("This notebook is good");
                } else {
                        System.out.println("This notebook is expensive");
                }
        }
        public void checkWeight() {
                if (this.weight < 600) {
                        System.out.println("This notebook is light");
                } else if (this.weight > 600 && this.weight < 1650) {
                        System.out.println("This notebook is quite heavy");
                } else {
                        System.out.println("This notebook is really heavy");
                }

        }


        public void checkYear() {
        }

        public void checkValue() {
                if (this.year < 2016 && this.price < 1000) {
                        System.out.println("The price is low comparing to quality");
                } else if (this.year < 2016 && this.price >= 1000) {
                        System.out.println("The price is high comparing to quality");
                } else if (this.year > 2016 && this.price < 1300) {
                        System.out.println("The price is low comparing to quality");
                } else if (this.year > 2016 && this.price >= 1300) {
                        System.out.println("The price is high comparing to quality");
                }
        }
}