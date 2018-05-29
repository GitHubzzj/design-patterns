/**
 * FileName :Base64Test
 * Author :zengzhijun
 * Date : 2018/4/20 11:06
 * Description:
 */
package com.zzj;

import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Base64Test {


    private static final String encodeFile = "D:\\20180530.txt";
    private String imageURL = "D:\\design-patterns.zip";
    @Test
    public void testBase64Encoder(){
        BASE64Encoder encoder = new BASE64Encoder();

        try {
            StringBuilder pictureBuffer = new StringBuilder();
            InputStream input = new FileInputStream(new File(imageURL));
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] temp = new byte[1024];
            for(int len = input.read(temp); len != -1;len = input.read(temp)){
                out.write(temp, 0, len);
                pictureBuffer.append(encoder.encode(out.toByteArray()));
                //out(pictureBuffer.toString());
                out.reset();
            }

            out(pictureBuffer.toString());
            out("Encoding the picture Success");
            Path path = Paths.get(encodeFile);

            Files.write(path, pictureBuffer.toString().getBytes());


            /*BASE64Decoder decoder = new BASE64Decoder();
            FileOutputStream write = new FileOutputStream(new File("D:\\myreference\\20180420_1.tar.gz"));
            byte[] decoderBytes = decoder.decodeBuffer(pictureBuffer.toString());
            write.write(decoderBytes);
            out("Decoding the picture Success");*/

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void out(Object o){
        System.out.println(o.toString());
    }

    @Test
    public void testDecoder() throws FileNotFoundException,IOException {
        String value = Files.readAllLines(Paths.get(encodeFile)).stream().map(Object::toString).collect(Collectors.joining());
        BASE64Decoder decoder = new BASE64Decoder();
        FileOutputStream write = new FileOutputStream(new File(imageURL));
        byte[] decoderBytes = decoder.decodeBuffer(value);
        write.write(decoderBytes);
        out("Decoding the picture Success");
    }
}
