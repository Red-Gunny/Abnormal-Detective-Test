package cloud_club.translate_test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class RecieveController {

    @PostMapping("/rcv")
    public ResponseEntity<RecieveDto> testPostMessage(@RequestBody Message message) {
        log.info(message.getMessage());
        RecieveDto dto = new RecieveDto();
        dto.setMessage(message.getMessage());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
