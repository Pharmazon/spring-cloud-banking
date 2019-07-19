package ru.shcheglov.cloud;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    /**
     * Fix bug with wrong StringUtils.getFilename() which doesn't work
     * with Windows path having \ symbols.
     */
    public static void windowsFix() {
        try {
            ClassPool pool = ClassPool.getDefault();
            CtClass cc = pool.get("org.springframework.util.StringUtils");
            CtMethod m = cc.getDeclaredMethod("getFilename");
            m.insertBefore("$1 = $1.replaceAll(\"\\\\\\\\\",\"/\");System.out.println(\"PATH: \"+$1);");
            cc.toClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        windowsFix();
        SpringApplication.run(ConfigServer.class, args);
    }
}
