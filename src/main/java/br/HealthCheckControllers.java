package br;
import br.utils.ResponseResult;
import com.google.gson.Gson;
import org.apache.catalina.connector.Response;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthCheckControllers {

    @GetMapping(path="/check", produces = "application/json")
    @ResponseBody
    public Object checkStatus() {
        Gson gson = new Gson();
        ResponseResult resp = new ResponseResult("OK");
        return gson.toJson(resp.Message);
    }
}