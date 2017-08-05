package com.example.demo;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/")
public class Api {

    // mpd: https://d2vow3x5tzuxc5.cloudfront.net/u/Assets/a1/FB/5E/a1-2493999/s1-20208598/a1-2493999-s1-20208598.mpd
    // ca url: https://api.dmlib.com/v1/dms/modular/f561e118-fd16-4c01-b224-e9adbd88827a?token=v%3D1.0%3Bcid%3Df561e118-fd16-4c01-b224-e9adbd88827a%3Bp%3D-1%3Br%3D-1%3Ba%3Dfffb027c-2659-4c98-a05b-fcb465fd8b01%3Bc%3DSAU%3Bl%3D0%3Bpn%3Dd3_default%3Brt%3DSubscription%3Bn%3D3beb77ae-c7ea-4f34-94a2-e4a73e47f85a%3Bt%3D2017-08-05T10%3A24%3A37Z%3Bsig%3DWssRjupj64lP9BGOg%2FatH13QQmM8du2AW46vh9Mqt4TjUJrlVbNmEbLAoYkVthbKIztKXpLCsA%2FN3gAitdXMrhmCSSGWiUsjaXjEmApc7%2B697DKr2Wr23icCvM%2BOCOswodZZgNZT%2Fe1irHvHocWYZfJxZbyo%2F%2Fwnp%2BnG62gU2zysGdpE5kXXl%2Fbq1oeyLwsqjYiecBlN5kBDhaNgzXeNJT%2Fdey65LAGm9CWgogZlYIxOIzNDcQpf%2BqgBsIXskgEN6lSX6WEwa5U1qlijrJsM8Vz1c3ifNR0JOZ8G6L3g52ddTqjeWk0DjL%2BJjFv9pggjLCamfN3PlpD0Acd46Cj4fw%3D%3D

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/cert", produces = "application/octet-stream")
    public byte[] cert() throws IOException {
        byte[] bytes = FileCopyUtils.copyToByteArray(DemoApplication.class.getClassLoader().getResourceAsStream("cert"));
        System.out.println(bytes.length);
        return bytes;
    }

}
