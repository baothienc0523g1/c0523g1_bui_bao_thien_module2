package view;

import controller.FuramaController;

public class FuramaView {
    private static FuramaController furamaController = new FuramaController();

    public static void main(String[] args) {
        furamaController.display();
    }
}
