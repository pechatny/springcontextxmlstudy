package ru.pechatny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    @Autowired
    @Qualifier("cat")
    Animal cat;

    @Autowired
    @Qualifier("dog")
    Animal dog;

    public void zooSpeaks(){
        cat.sound();
        dog.sound();
    }
}
