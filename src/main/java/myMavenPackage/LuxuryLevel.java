package myMavenPackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface LuxuryLevel {
    String car () default "Fine";
    String restaurant();
    int boat ();
    int bankAccount ();
    int house () ;
}
