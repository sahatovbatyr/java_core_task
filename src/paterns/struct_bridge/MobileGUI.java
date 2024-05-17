package paterns.struct_bridge;

// Реализация абстракции для мобильных платформ
class MobileGUI extends GUI {
    public MobileGUI(GUIComponent component) {
        super(component);
    }

    @Override
    void drawGUI() {
        System.out.println("Drawing mobile GUI:");
        component.draw();
    }
}
