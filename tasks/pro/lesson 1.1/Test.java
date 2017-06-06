package tasks.pro.lesson_1_1

import java.lang.annotation.*;


@Retention(value= RetentionPolicy.RUNTIME)
@interface Test  {
    int a();
    int b();

}
