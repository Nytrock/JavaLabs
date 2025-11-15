import java.util.Scanner;

abstract class Component {
    protected final int price;
    protected final String name;

    public Component(String name, int price){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getClassName();
}

class Processor extends Component{
    private final int coresCount;
    private final int threadsCount;
    private final double frequency;

    public Processor(String name, int price, int coresCount, int threadsCount, double frequency) {
        super(name, price);
        this.coresCount = coresCount;
        this.threadsCount = threadsCount;
        this.frequency = frequency;
    }

    @Override
    public String getClassName() {
        return "Процессор";
    }

    @Override
    public String toString() {
        return name + ", " + coresCount + " ядра " + threadsCount + " потоков, " + frequency + " ГГц, " +
                price + " рублей";
    }
}

class Motherboard extends Component {
    private final String formFactor;

    public Motherboard(String name, int price, String formFactor) {
        super(name, price);
        this.formFactor = formFactor;
    }

    @Override
    public String getClassName() {
        return "Материнская плата";
    }

    @Override
    public String toString() {
        return name + ", Форм-фактор " + formFactor + ", " + price + " рублей";
    }
}

class GraphicCard extends Component{
    private final int memory;

    public GraphicCard(String name, int price, int memory) {
        super(name, price);
        this.memory = memory;
    }

    @Override
    public String getClassName() {
        return "Видеокарта";
    }

    @Override
    public String toString() {
        return name + ", " + memory + " ГБ, " + price + " рублей";
    }
}

class Storage extends Component {
    private final int capacity;
    private final String capacityUnit;

    public Storage(String name, int price, int capacity, String capacityUnit) {
        super(name, price);
        this.capacity = capacity;
        this.capacityUnit = capacityUnit;
    }

    @Override
    public String getClassName() {
        return "Устройство хранения";
    }

    @Override
    public String toString() {
        return name + ", " + capacity + " " + capacityUnit + ", " + price + " рублей";
    }
}

class Ram extends Component {
    private final int memory;
    private final String type;
    private final int frequency;

    public Ram(String name, int price, int memory, String type, int frequency) {
        super(name, price);
        this.memory = memory;
        this.frequency = frequency;
        this.type = type;
    }

    @Override
    public String getClassName() {
        return "Оперативная память";
    }

    @Override
    public String toString() {
        return name + ", " + memory + " ГБ " + type + " " + frequency + " МГц , " + price + " рублей";
    }
}

class Monitor extends Component {
    private final int size;
    private final int frequency;

    public Monitor(String name, int price, int size, int frequency) {
        super(name, price);
        this.size = size;
        this.frequency = frequency;
    }

    @Override
    public String getClassName() {
        return "Монитор";
    }

    @Override
    public String toString() {
        return name + ", " + size + "\", " + frequency + " Гц, " + price + " рублей";
    }
}

class Shop {
    private final String[] mainMenuOptions;
    private final Component[][] components;
    private final Component[] selectedComponents;

    public Shop() {
        components = new Component[6][5];
        selectedComponents = new Component[6];

        components[0] = new Processor[] {
                new Processor("AMD Ryzen 3 4100", 6100, 4, 8, 3.8),
                new Processor("AMD Ryzen 5 5600", 12300, 6, 12, 3.5),
                new Processor("Intel Core i3-12100F", 7400, 4, 8, 3.3),
                new Processor("Intel Core i5-12400F", 12500, 6, 12, 2.5),
                new Processor("AMD Ryzen 7 5800X", 20500, 8, 16, 3.8)
        };
        components[1] = new Motherboard[] {
                new Motherboard("ASRock B450M-HDV", 3800, "mATX"),
                new Motherboard("ASUS PRIME H610M-E", 7200, "ATX"),
                new Motherboard("MSI A520M-A PRO", 4100, "ATX"),
                new Motherboard("Gigabyte B760M DS3H", 9200, "mATX"),
                new Motherboard("ASRock Z690 Steel Legend", 18500, "ATX")
        };
        components[2] = new GraphicCard[] {
                new GraphicCard("ASUS GTX 1650 Phoenix", 11800, 4),
                new GraphicCard("MSI GTX 1660 Super Ventus", 18500, 6),
                new GraphicCard("Gigabyte RTX 3050 Eagle", 23500, 8),
                new GraphicCard("MSI RTX 3060 Ventus 2X", 29500, 12),
                new GraphicCard("ASUS Radeon RX 6600 Dual", 22500, 8)
        };
        components[3] = new Storage[] {
                new Storage("Kingston A400 SSD", 2500, 240, "ГБ"),
                new Storage("WD Blue HDD", 3200, 1000, "ГБ"),
                new Storage("Seagate Barracuda", 4200, 2000, "ГБ"),
                new Storage("Samsung 870 EVO", 5600, 500, "ГБ"),
                new Storage("Crucial MX500", 7800, 1000, "ГБ")
        };
        components[4] = new Ram[] {
                new Ram("Kingston Fury Beast", 2200, 8, "DDR4", 3200),
                new Ram("Crucial Ballistix", 4200, 16, "DDR4", 3200),
                new Ram("Patriot Viper Steel", 4700, 16, "DDR4", 3600),
                new Ram("Corsair Vengeance LPX", 2100, 8, "DDR4", 3000),
                new Ram("G.Skill Ripjaws V", 9500, 32, "DDR4", 3200)
        };
        components[5] = new Monitor[]{
                new Monitor("AOC 24B1XHS", 7200, 24, 75),
                new Monitor("Samsung LF24T350FHI", 8800, 24, 75),
                new Monitor("LG 27MP60", 12500, 27, 75),
                new Monitor("MSI Optix G241", 16500, 24, 144),
                new Monitor("ASUS VG27AQ", 31000, 27, 165)
        };

        mainMenuOptions = new String[components.length];
        for (int i = 0; i < components.length; i++)
            mainMenuOptions[i] = components[i][0].getClassName();
    }

    public void start(){
        while (true) {
            cleanConsole();
            showMainMenu();

            int select = getOptionSelect(mainMenuOptions.length);
            cleanConsole();

            if (select == 0)
                openList();
            else
                openComponentSelect(select - 1);
        }
    }

    private void openComponentSelect(int componentIndex) {
        Component[] componentsToSelect = components[componentIndex];
        String returnOption = "Возврат к списку комплектующих";
        Component selectedComponent = selectedComponents[componentIndex];

        while (true) {
            if (selectedComponent != null)
                System.out.println("Выбранный компонент: " + selectedComponent);

            printOptions(componentsToSelect, returnOption);
            int select = getOptionSelect(componentsToSelect.length);

            if (select != 0) {
                selectedComponent = components[componentIndex][select - 1];
                selectedComponents[componentIndex] = selectedComponent;
            } else {
                break;
            }
        }
    }

    private void openList() {
        System.out.println("Вы выбрали:");

        while (true) {
            int price = 0;
            int counter = 1;

            for (Component component : selectedComponents){
                if (component == null)
                    continue;

                price += component.getPrice();
                System.out.println("[" + counter + "] " + component);
                counter++;
            }

            System.out.println("[0] Назад");
            System.out.println("Итоговая сумма: " + price);

            int select = getOptionSelect(counter);

            if (select == 0){
                break;
            } else {
                counter = 0;
                for (int i = 0; i < selectedComponents.length; i++){
                    if (selectedComponents[i] == null)
                        continue;

                    counter++;
                    if (counter == select){
                        selectedComponents[i] = null;
                        break;
                    }
                }
            }
        }
    }

    private void cleanConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showMainMenu() {
        String listOption = "Корзина";
        printOptions(mainMenuOptions, listOption);
    }

    public void printOptions(Object[] options, Object zeroOption){
        for (int i = 0; i < options.length; i++)
            System.out.println("[" + (i + 1) + "] " + options[i].toString());
        System.out.println("[0] " + zeroOption.toString());
    }

    public int getOptionSelect(int maxValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите опцию:");
        int value = scanner.nextInt();

        while (value >= maxValue || value < 0){
            System.out.println("Команда не найдена. Попробуйте ещё раз");
            value = scanner.nextInt();
        }

        return value;
    }
}

public class Final {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.start();
    }
}
