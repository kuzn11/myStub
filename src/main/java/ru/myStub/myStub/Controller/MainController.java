package ru.myStub.myStub.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.myStub.myStub.model.MainModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.myStub.myStub.model.XmlToJava;

import java.text.ParseException;

@Validated
@RestController
public class MainController {
    int times = 2900;

    @GetMapping(value = "/date", consumes =  "application/xml; charset = UTF8")
    public String response(@RequestBody String dat) throws ParseException {
        try {
            Thread.sleep(times);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        XmlToJava ob = new XmlToJava();
        String m = ob.xmltoJava(dat);
        MainModel model = new MainModel();
        String b = model.mainModel(m);
        return b;
    }
}

