import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter Name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        JOptionPane.showMessageDialog(null, age + "years");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        JOptionPane.showMessageDialog(null, height + "cm");
    }
}
