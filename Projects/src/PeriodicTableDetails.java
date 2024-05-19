import java.util.*;

public class PeriodicTableDetails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the atomic number of the element: ");
        int atomicNumber = scanner.nextInt();

        scanner.close();

        HashMap<Integer, ElementDetails> periodicTable = new HashMap<>();

        periodicTable.put(1, new ElementDetails("H", 1.008, "Hydrogen", -259.16, -252.87));
        periodicTable.put(2, new ElementDetails("He", 4.0026, "Helium", -272.2, -268.9));
        periodicTable.put(3, new ElementDetails("Li", 6.94, "Lithium", 180.5, 1342));
        periodicTable.put(4, new ElementDetails("Be", 9.0122, "Beryllium", 1278, 2970));
        periodicTable.put(5, new ElementDetails("B", 10.81, "Boron", 2075, 3927));
        periodicTable.put(6, new ElementDetails("C", 12.011, "Carbon", 3500, 4827));
        periodicTable.put(7, new ElementDetails("N", 14.007, "Nitrogen", -210.0, -195.8));
        periodicTable.put(8, new ElementDetails("O", 15.999, "Oxygen", -218.79, -182.96));
        periodicTable.put(9, new ElementDetails("F", 18.998, "Fluorine", -219.67, -188.12));
        periodicTable.put(10, new ElementDetails("Ne", 20.180, "Neon", -248.67, -246.05));
        periodicTable.put(11, new ElementDetails("Na", 22.990, "Sodium", 97.8, 883));
        periodicTable.put(12, new ElementDetails("Mg", 24.305, "Magnesium", 650, 1090));
        periodicTable.put(13, new ElementDetails("Al", 26.982, "Aluminum", 660.32, 2519));
        periodicTable.put(14, new ElementDetails("Si", 28.085, "Silicon", 1414, 3265));
        periodicTable.put(15, new ElementDetails("P", 30.974, "Phosphorus", 44.1, 280.0));
        periodicTable.put(16, new ElementDetails("S", 32.06, "Sulfur", 112.8, 444.6));
        periodicTable.put(17, new ElementDetails("Cl", 35.45, "Chlorine", -101.5, -34.04));
        periodicTable.put(18, new ElementDetails("Ar", 39.948, "Argon", -189.3, -185.9));
        periodicTable.put(19, new ElementDetails("K", 39.098, "Potassium", 63.65, 759));
        periodicTable.put(20, new ElementDetails("Ca", 40.078, "Calcium", 839, 1484));
        periodicTable.put(21, new ElementDetails("Sc", 44.955908, "Scandium", 1541, 2836));
        periodicTable.put(22, new ElementDetails("Ti", 47.867, "Titanium", 1668, 3287));
        periodicTable.put(23, new ElementDetails("V", 50.9415, "Vanadium", 1910, 3407));
        periodicTable.put(24, new ElementDetails("Cr", 51.9961, "Chromium", 1907, 2671));
        periodicTable.put(25, new ElementDetails("Mn", 54.938044, "Manganese", 1246, 2061));
        periodicTable.put(26, new ElementDetails("Fe", 55.845, "Iron", 1538, 2861));
        periodicTable.put(27, new ElementDetails("Ni", 58.6934, "Nickel", 1453, 2732));
        periodicTable.put(28, new ElementDetails("Co", 58.933194, "Cobalt", 1495, 2870));
        periodicTable.put(29, new ElementDetails("Cu", 63.546, "Copper", 1084, 2567));
        periodicTable.put(30, new ElementDetails("Zn", 65.38, "Zinc", 419, 907));
        periodicTable.put(31, new ElementDetails("Ga", 69.723, "Gallium", 29.76, 2403));
        periodicTable.put(32, new ElementDetails("Ge", 72.63, "Germanium", 938.25, 2833));
        periodicTable.put(33, new ElementDetails("As", 74.921595, "Arsenic", 817, 614));
        periodicTable.put(34, new ElementDetails("Se", 78.971, "Selenium", 494, 958));
        periodicTable.put(35, new ElementDetails("Br", 79.904, "Bromine", 265.8, 332));
        periodicTable.put(36, new ElementDetails("Kr", 83.798, "Krypton", -157.36, -153.22));
        periodicTable.put(37, new ElementDetails("Rb", 85.4678, "Rubidium", 39.31, 688));
        periodicTable.put(38, new ElementDetails("Sr", 87.62, "Strontium", 769, 1384));
        periodicTable.put(39, new ElementDetails("Y", 88.90584, "Yttrium", 1526, 3345));
        periodicTable.put(40, new ElementDetails("Zr", 91.224, "Zirconium", 1855, 4409));
        periodicTable.put(41, new ElementDetails("Nb", 92.90637, "Niobium", 2468, 4927));
        periodicTable.put(42, new ElementDetails("Mo", 95.95, "Molybdenum", 2623, 4639));
        periodicTable.put(43, new ElementDetails("Tc", 98, "Technetium", 2157, 4265));
        periodicTable.put(44, new ElementDetails("Ru", 101.07, "Ruthenium", 2334, 4150));
        periodicTable.put(45, new ElementDetails("Rh", 102.90550, "Rhodium", 1966, 3727));
        periodicTable.put(46, new ElementDetails("Pd", 106.42, "Palladium", 1554.9, 2963));
        periodicTable.put(47, new ElementDetails("Ag", 107.8682, "Silver", 961.78, 2162));
        periodicTable.put(48, new ElementDetails("Cd", 112.414, "Cadmium", 321, 765));
        periodicTable.put(49, new ElementDetails("In", 114.818, "Indium", 156.6, 2080));
        periodicTable.put(50, new ElementDetails("Sn", 118.710, "Tin", 231.93, 2602));
        periodicTable.put(51, new ElementDetails("Sb", 121.760, "Antimony", 630.74, 1750));
        periodicTable.put(52, new ElementDetails("Te", 127.60, "Tellurium", 449.51, 990));
        periodicTable.put(53, new ElementDetails("I", 126.90447, "Iodine", 113.7, 184.3));
        periodicTable.put(54, new ElementDetails("Xe", 131.293, "Xenon", -111.79, -108.12));
        periodicTable.put(55, new ElementDetails("Cs", 132.90545196, "Cesium", 28.44, 671));
        periodicTable.put(56, new ElementDetails("Ba", 137.327, "Barium", 727, 1870));
        periodicTable.put(57, new ElementDetails("La", 138.904, "Lanthanum", 918, 3464));
        periodicTable.put(58, new ElementDetails("Ce", 140.116, "Cerium", 795, 3257));
        periodicTable.put(59, new ElementDetails("Pr", 140.90766, "Praseodymium", 931, 3512));
        periodicTable.put(60, new ElementDetails("Nd", 144.242, "Neodymium", 1011, 3127));
        periodicTable.put(61, new ElementDetails("Pm", 145, "Promethium", 1042, 3000));
        periodicTable.put(62, new ElementDetails("Sm", 150.36, "Samarium", 1072, 1900));
        periodicTable.put(63, new ElementDetails("Eu", 151.964, "Europium", 822, 1597));
        periodicTable.put(64, new ElementDetails("Gd", 157.25, "Gadolinium", 1312, 3233));
        periodicTable.put(65, new ElementDetails("Tb", 158.92535, "Terbium", 1360, 3041));
        periodicTable.put(66, new ElementDetails("Dy", 162.500, "Dysprosium", 1412, 2567));
        periodicTable.put(67, new ElementDetails("Ho", 164.93033, "Holmium", 1470, 2720));
        periodicTable.put(68, new ElementDetails("Er", 167.259, "Erbium", 1522, 2510));
        periodicTable.put(69, new ElementDetails("Tm", 168.93422, "Thulium", 1545, 1727));
        periodicTable.put(70, new ElementDetails("Yb", 173.045, "Ytterbium", 824, 1466));
        periodicTable.put(71, new ElementDetails("Lu", 174.9668, "Lutetium", 1663, 3395));
        periodicTable.put(72, new ElementDetails("Hf", 178.49, "Hafnium", 2233, 4603));
        periodicTable.put(73, new ElementDetails("Ta", 180.94788, "Tantalum", 3017, 5458));
        periodicTable.put(74, new ElementDetails("W", 183.84, "Tungsten", 3422, 5555));
        periodicTable.put(75, new ElementDetails("Re", 186.207, "Rhenium", 3180, 5627));
        periodicTable.put(76, new ElementDetails("Os", 190.23, "Osmium", 3033, 5012));
        periodicTable.put(77, new ElementDetails("Ir", 192.217, "Iridium", 2719, 4701));
        periodicTable.put(78, new ElementDetails("Pt", 195.084, "Platinum", 2041.4, 4098));
        periodicTable.put(79, new ElementDetails("Au", 196.966569, "Gold", 1337.33, 3129));
        periodicTable.put(80, new ElementDetails("Hg", 200.592, "Mercury", -38.83, 356.73));
        periodicTable.put(81, new ElementDetails("Tl", 204.38, "Thallium", 304, 1457));
        periodicTable.put(82, new ElementDetails("Pb", 207.2, "Lead", 327.5, 1740));
        periodicTable.put(83, new ElementDetails("Bi", 208.98040, "Bismuth", 271.4, 1564));
        periodicTable.put(84, new ElementDetails("Po", 209, "Polonium", 254, 962));
        periodicTable.put(85, new ElementDetails("At", 210, "Astatine",  0, 0));
        periodicTable.put(86, new ElementDetails("Rn", 222, "Radon", -71, -61.7));
        periodicTable.put(87, new ElementDetails("Fr", 223, "Francium", 27, 677));
        periodicTable.put(88, new ElementDetails("Ra", 226, "Radium", 700, 1413));
        periodicTable.put(89, new ElementDetails("Ac", 227, "Actinium", 1050, 3200));
        periodicTable.put(90, new ElementDetails("Th", 232.0377, "Thorium", 1750, 4790));
        periodicTable.put(91, new ElementDetails("Pa", 231.03588, "Protactinium", 1568, 4000));
        periodicTable.put(92, new ElementDetails("U", 238.02891, "Uranium", 1132.2, 4131));
        periodicTable.put(93, new ElementDetails("Np", 237, "Neptunium", 644, 3902));
        periodicTable.put(94, new ElementDetails("Pu", 244, "Plutonium", 912, 3501));
        periodicTable.put(95, new ElementDetails("Am", 243, "Americium", 1449, 2880));
        periodicTable.put(96, new ElementDetails("Cm", 247, "Curium", 1340, 3100));
        periodicTable.put(97, new ElementDetails("Bk", 247, "Berkelium", -1, -1));
        periodicTable.put(98, new ElementDetails("Cf", 251, "Californium", -1, -1));
        periodicTable.put(99, new ElementDetails("Es", 252, "Einsteinium", -1, -1));
        periodicTable.put(100, new ElementDetails("Fm", 257, "Fermium", -1, -1));
        periodicTable.put(101, new ElementDetails("Md", 258, "Mendelevium", -1, -1));
        periodicTable.put(102, new ElementDetails("No", 259, "Nobelium", -1, -1));
        periodicTable.put(103, new ElementDetails("Lr", 262, "Lawrencium", -1, -1));
        periodicTable.put(104, new ElementDetails("Rf", 267, "Rutherfordium", -1, -1));
        periodicTable.put(105, new ElementDetails("Db", 270, "Dubnium", -1, -1));
        periodicTable.put(106, new ElementDetails("Sg", 271, "Seaborgium", -1, -1));
        periodicTable.put(107, new ElementDetails("Bh", 270, "Bohrium", -1, -1));
        periodicTable.put(108, new ElementDetails("Hs", 277, "Hassium", -1, -1));
        periodicTable.put(109, new ElementDetails("Mt", 276, "Meitnerium", -1, -1));
        periodicTable.put(110, new ElementDetails("Ds", 281, "Darmstadtium", -1, -1));
        periodicTable.put(111, new ElementDetails("Rg", 280, "Roentgenium", -1, -1));
        periodicTable.put(112, new ElementDetails("Cn", 285, "Copernicium", -1, -1));
        periodicTable.put(113, new ElementDetails("Nh", -1, "Nihonium", -1, -1));
        periodicTable.put(114, new ElementDetails("Fl", -1, "Flerovium", -1, -1));
        periodicTable.put(115, new ElementDetails("Mc", -1, "Moscovium", -1, -1));
        periodicTable.put(116, new ElementDetails("Lv", -1, "Livermorium", -1, -1));
        periodicTable.put(117, new ElementDetails("Ts", -1, "Tennessine", -1, -1));
        periodicTable.put(118, new ElementDetails("Og", -1, "Oganesson", -1, -1));

        
        ElementDetails elementDetails = periodicTable.get(atomicNumber);
        if (elementDetails != null) {
            printElementDetails(elementDetails);
        } else {
            System.out.println("Element with atomic number " + atomicNumber + " not found in the database.");
        }
    }

    private static void printElementDetails(ElementDetails elementDetails) {
        System.out.println("\nElement Details:");
        System.out.println("Symbol: " + elementDetails.symbol);
        if(elementDetails.atomicWeight == -1){
            System.out.println("Atomic Weight: " + "No specific Atomic Weight available");
        }else {
            System.out.println("Atomic Weight: " + elementDetails.atomicWeight);
        }
        System.out.println("Full Name: " + elementDetails.fullName);
        if(elementDetails.meltingPoint == -1){
            System.out.println("Melting Point: " + "No specific melting point available");
        }else {
            System.out.println("Melting Point: " + elementDetails.meltingPoint + " °C");
        }
        if(elementDetails.boilingPoint == -1){
            System.out.println("Boiling Point: " + "No specific melting point available");
        }else {
            System.out.println("Boiling Point: " + elementDetails.boilingPoint + " °C");
        }

    }

    private static class ElementDetails {
        private String symbol;
        private double atomicWeight;
        private String fullName;
        private double meltingPoint;
        private double boilingPoint;

        public ElementDetails(String symbol, double atomicWeight, String fullName, double meltingPoint, double boilingPoint) {
            this.symbol = symbol;
            this.atomicWeight = atomicWeight;
            this.fullName = fullName;
            this.meltingPoint = meltingPoint;
            this.boilingPoint = boilingPoint;
        }
    }
}
