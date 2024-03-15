
package lab.activity.pkg2.pkg3;

import java.util.Scanner;




public class LabActivity23 {

   
    public static void main(String[] args) {
  
       Scanner scanner = new Scanner (System.in);
       
       System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();

        if (editorType == 1) {
            PrintTextEditor editor = new PrintTextEditor(initialText);
            editor.print();
        } else if (editorType == 2) {
            AdvancedTextEditor editor = new AdvancedTextEditor(initialText);

            System.out.print("Enter code: ");
            int code = scanner.nextInt();

            if (code == 1) {
                editor.append("SUCCESS");
            } else if (code == 2) {
                editor.delete(3);
            }

            editor.undo();
            editor.print();
        }

        scanner.close();
    }
}
    
    

