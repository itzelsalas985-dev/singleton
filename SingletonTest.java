import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SingletonTest {

    public static void main(String[] args)
            throws NoSuchFieldException {

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setTheme("Dark");
        config1.setLanguage("ES");

        boolean mismaInstancia = config1 == config2;

        boolean estadoCompartido =
                config2.getTheme().equals("Dark")
                && config2.getLanguage().equals("ES");

        Field campoInstance =
                AppConfig.class.getDeclaredField("instance");

        boolean campoCorrecto =
                Modifier.isStatic(campoInstance.getModifiers())
                && Modifier.isFinal(campoInstance.getModifiers());

        boolean constructorPrivado = true;

        for (Constructor<?> constructor
                : AppConfig.class.getDeclaredConstructors()) {

            if (!Modifier.isPrivate(
                    constructor.getModifiers())) {
                constructorPrivado = false;
            }
        }

        boolean resultado =
                mismaInstancia
                && estadoCompartido
                && campoCorrecto
                && constructorPrivado;

        System.out.println(
                "Prueba Singleton: " + resultado
        );
    }
}