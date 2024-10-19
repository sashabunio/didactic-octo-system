package program;
import сhancellery.Pencil;

public class PencilContainsEraser {
    public static void pencilContainsEraserInput() { // не вижу метод, когда пытаюсь привязать его к объекту. Видимо проблема в модификаторе доступа. Что нужно изменить?
        Pencil userPencil = new Pencil(true, "blue", 2.4, "locket");
        System.out.println("Does your pencil contain eraser? Enter 1 is yes, enter 2 if no:\n");
        userPencil.setContainEraser();
    }
}
