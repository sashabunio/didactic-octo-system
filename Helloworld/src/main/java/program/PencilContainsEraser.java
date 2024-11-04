package program;
import сhancellery.Eraser;
import сhancellery.Pencil;

public class PencilContainsEraser {
    public static void pencilContainsEraserInput() {
        Pencil userPencil = new Pencil(true, "blue", 2.4, "locket");
        System.out.println("Does your pencil contain eraser? Enter 1 is yes, enter 2 if no:\n");
        userPencil.setContainEraser();
    }
}
