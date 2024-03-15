
package lab.activity.pkg2.pkg3;


public class PrintTextEditor extends TextEditor{
    
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(getText());
    }
}
