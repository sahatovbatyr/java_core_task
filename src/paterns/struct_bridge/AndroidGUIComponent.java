package paterns.struct_bridge;

// Реализация абстракции для Android
class AndroidGUIComponent implements GUIComponent {
    @Override
    public void draw() {
        System.out.println("Drawing GUI components for Android.");
    }
}

