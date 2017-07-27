public class MainApp {

    public static void main(String[] args) {

        Toolbox toolbox1 = new Toolbox("red", "metal");
        Toolbag toolbag1 = new Toolbag("black", "canvas", "Kleinman");

        // changed color of toolbag to 'brown'
        System.out.println(toolbag1.getColor());
        toolbag1.setColor("brown");
        System.out.println(toolbag1.getColor());
        System.out.println();

        // changed material of toolbag to 'nubuck'
        System.out.println(toolbag1.getMaterial());
        toolbag1.setMaterial("nubuck");
        System.out.println(toolbag1.getMaterial());
        System.out.println();

        // changed brand of toolbag from 'Kleinman' to 'Craftline'
        System.out.println(toolbag1.getBrandName());
        toolbag1.setBrandName("Craftline");
        System.out.println(toolbag1.getBrandName());
        System.out.println();

    }
}
