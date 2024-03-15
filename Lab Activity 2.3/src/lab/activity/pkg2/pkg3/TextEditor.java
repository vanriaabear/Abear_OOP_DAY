
package lab.activity.pkg2.pkg3;


public class TextEditor {
    
   private String text;

    public TextEditor(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String newText) {
        text += newText;
    }

    public void delete(int n) {
        if (n <= text.length()) {
            text = text.substring(0, text.length() - n);
        }
    }
}
    

