public enum DrinksMachine {
    COFFEE{
        public void preparingDrink() {
            System.out.println("Please wait until your coffee will be ready.\nPlace cup...\nBoil water...\n" +
                    "Mix hot water, coffee, milk and sugar...\nYour coffee is ready, enjoy it!");
        };
    },
    TEA{
        public void preparingDrink() {
            System.out.println("Please wait until your tea will be ready.\nPlace cup...\nBoil water...\n" +
                    "Mix hot water, tea and sugar...\nYour tea is ready, enjoy it!");
        };
    },
    LEMONADE{
        public void preparingDrink() {
            System.out.println("Please wait until your lemonade will be ready.\nPlace cup...\n" +
                    "Drop few cube of ice...\nMix water, lemon juice and sugar...\n" +
                    "Your lemonade is ready, enjoy it!");
        };
    },
    MOJITO{
        public void preparingDrink() {
            System.out.println("Please wait until your tea will be ready.\nPlace cup...\nDrop few cubes of ice...\n" +
                    "Mix water, lime juice, fresh mint and sugar...\nYour mojito is ready, enjoy it!");
        };
    },
    MINERAL_WATER{
        public void preparingDrink() {
            System.out.println("Please wait until your tea will be ready.\nPlace cup...\nDrop few cubes of ice...\n" +
                    "Pouring mineral water...\nYour mineral water is ready, enjoy it!");
        };
    },
    COCA_COLA{
        public void preparingDrink() {
            System.out.println("Please wait until your tea will be ready.\nPlace cup...\nDrop few cubes of ice...\n" +
                    "Pouring coca-cola...\nYour coca-cola is ready, enjoy it!");
        };
    };

    public abstract void preparingDrink();
}
