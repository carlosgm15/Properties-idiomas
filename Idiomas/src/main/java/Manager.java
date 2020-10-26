import java.util.HashMap;
import java.util.ResourceBundle;

public class Manager {

    private static Manager manager;
    HashMap<String, ResourceBundle> data;


    private Manager(){

        this.data = new HashMap<String, ResourceBundle>();

        ResourceBundle ca = ResourceBundle.getBundle("ca");
        ResourceBundle es = ResourceBundle.getBundle("es");
        ResourceBundle en = ResourceBundle.getBundle("en");

        this.data.put("es",es);
        this.data.put("ca",ca);
        this.data.put("en",en);
    }

    public static Manager getInstance(){
        if(manager==null) manager = new Manager();
        return manager;
    }
    public String getText(String lenguage, String key){
        String result = null;
        result = this.data.get(lenguage).getString(key);
        return result;
    }

    public static void main(String[] args){
        String msg1 = Manager.getInstance().getText("ca", "l1");
        String msg2 = Manager.getInstance().getText("en", "l1");
        String msg3= Manager.getInstance().getText("es", "l1");

        String msg4 = Manager.getInstance().getText("ca", "l2");
        String msg5 = Manager.getInstance().getText("en", "l2");
        String msg6= Manager.getInstance().getText("es", "l2");

        System.out.println(msg1);
        System.out.println(msg2);


    }




}
