import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("src\\file.txt");
//        sayHello("intiformation");
//        sayHello(null);
//        une exeption est lancé -> throw an exception
        try (
                FileReader fileReader = new FileReader("src\\file.txt");
                FileWriter fileWriter = new FileWriter("src\\file.txt")
                ) {
           // FileReader fileReader = new FileReader("file.txt");
           // FileReader fileReader = new FileReader("src\\file.txt");
           // FileReader fileReader = new FileReader("src\\file.txt");
            fileReader.read();
            //fileReader.close();
            new SimpleDateFormat().parse("");
        } catch (IOException  | ParseException e) {
            e.printStackTrace();


      }
/*        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
//        catch (ParseException e) {
//            e.printStackTrace();
//        }
        //catch (FileNotFoundException e) {
//            System.out.println("File not found");
 //           System.out.println(e.getMessage());
    //   e.printStackTrace();
    //}

    }

        public static void sayHello (String text){
        System.out.println("Hello " + text.toUpperCase());
    }
}

// stacktrace ordre d'execution mais inversé
/*
* 3 type d'exeption
*
* checked -> à anticiper (ex: accès à un fichier)
*
* unchecked -> RunTimeExcepion , pas obligé à gérer car généralemnt du à une erreur de programation,
* on peut les gérer mais il faut des bonnes pratiques et faire des tests automatisés
* NullPointerException, ArithmecticException, IllegalArgumentExceptions, indexOutOfBondsExceptions,...
*
* Error -> ex: stackOverFlow (version de Java), outOfMemory (pas assez de mémoire)
*
*
*
* Throwable a deux argemnts utiles -> message et stacktrace
*
*
* la doc https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html
*
* */
