package paterns.struct_bridge;

// Реализация абстракции для iOS
class IOSGUIComponent implements GUIComponent {
    @Override
    public void draw() {
        System.out.println("Drawing GUI components for iOS.");
    }
}
