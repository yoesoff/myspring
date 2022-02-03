package com.yoesoff.myspring.dummy.controller;

import com.yoesoff.myspring.dto.request.FooRequestDTO;
import com.yoesoff.myspring.dto.response.GeneralResponseDTO;
import com.yoesoff.myspring.dto.response.MessageResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FooController extends BaseController {

    @GetMapping("/")
    public ResponseEntity<GeneralResponseDTO> index() {
        String[] users = new String[]{"Eelinda", "Jhonny", "Ferey"};
        List<MessageResponseDTO> myList = new ArrayList<>();
        for (String user: users) {
            myList.add(new MessageResponseDTO(user));
        }
        return ResponseEntity.ok().body(response(myList,true, "Index page"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralResponseDTO> view(@PathVariable(value = "id") Integer id) {
        Map<String, String> data  = new HashMap<>() {{
            put("key1", "value" + id.toString());
        }};

        GeneralResponseDTO response = new GeneralResponseDTO();
        response.setMessage("View page");
        response.setData(data);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GeneralResponseDTO> delete(@PathVariable(value = "id") Integer id) {
        Map<String, String> data  = new HashMap<>() {{
            put("key1", "value" + id.toString());
        }};

        GeneralResponseDTO response = new GeneralResponseDTO();
        response.setMessage("Delete page");
        response.setData(data);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(
        path = "/",
        consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity<GeneralResponseDTO> create(FooRequestDTO fooRequestDTO) throws Exception {
        Map<String, String> data  = new HashMap<>() {{
            put("key1", "value1");
        }};

        GeneralResponseDTO response = new GeneralResponseDTO();
        response.setMessage("Create page");
        response.setData(fooRequestDTO);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneralResponseDTO> update(@PathVariable(value = "id") Integer id) {
        Map<String, String> data  = new HashMap<>() {{
            put("key1", "value" + id.toString());
        }};

        GeneralResponseDTO response = new GeneralResponseDTO();
        response.setMessage("Update page");
        response.setData(data);
        return ResponseEntity.ok().body(response);
    }
}
