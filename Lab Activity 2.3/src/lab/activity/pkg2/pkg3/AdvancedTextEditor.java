
package lab.activity.pkg2.pkg3;

import java.util.Stack;


public class AdvancedTextEditor extends TextEditor {
    
   private Stack<String> history;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        history = new Stack<>();
    }

    @Override
    public void append(String newText) {
        super.append(newText);
        history.push("append " + newText);
    }

    @Override
    public void delete(int n) {
        if (n <= getText().length()) {
            history.push("delete " + getText().substring(getText().length() - n));
        }
        super.delete(n);
    }

    public void undo() {
        if (!history.isEmpty()) {
            String lastOperation = history.pop();
            if (lastOperation.startsWith("append")) {
                int length = lastOperation.split(" ")[1].length();
                super.delete(length);
            } else if (lastOperation.startsWith("delete")) {
                String deletedText = lastOperation.split(" ")[1];
                super.append(deletedText);
            }
        }
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



