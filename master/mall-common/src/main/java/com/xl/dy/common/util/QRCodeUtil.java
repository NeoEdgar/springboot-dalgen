package com.xl.dy.common.util;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/***
 * <p><strong>二维码工具类</strong></p>
 * 功能实现：<br>
 * 1）生成不同格式（bmp/jpg/jpeg/gif/png）的二维码，
 *      并且可以生成包含logo的二维码，
 *      也可以生成彩色的二维码（此工具类默认采用utf-8编码）<br>
 *      （注：不能使用白色作为填充色，会导致无法解析，使用此方法时需要注意测试生成后的二维码是否可用）<br>
 * 2）解析二维码（可以是图片文件，也可以是图片数据流）
 */
public class QRCodeUtil {
    private static final int BLANK = 0xFF000000;//RGB黑色对应值
    private static final int WHITE = 0xFFFFFFFF;//RGB白色对应值
    private static final String CHARTSET = "utf-8";//
    //图片格式
    private static final String PNG = "png";
    private static final String JPG = "jpg";
    private static final String GIF = "gif";
    private static final String JPEG = "jpeg";
    private static final String BMP = "bmp";
    //默认值
    private static final int QRCODE_SIZE = 300;
    private static final int LOGO_SIZE = 60;

    /**
     * 生成二维码编码，字符集默认采用utf-8
     * @param content 二维码内容（可以是url，也可以是文本）
     * @param width 生成二维码的长度
     * @param height 生成二维码的高度
     * @return WriterException
     * @version 1.0.0
     */
    public BitMatrix encode(String content, int width, int height) throws WriterException {
        //用于设置QR二维码参数
        Hashtable<EncodeHintType, Object> hints = new Hashtable<>();
        // 设置QR二维码的纠错级别——这里选择最高H级别(暂时未涉及此部分内容，不设置也行，出于后续优化考虑，放在这里)
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        //设置编码方式，此工具类默认采用utf-8(后续升级可以考虑支持多种编码)
        hints.put(EncodeHintType.CHARACTER_SET, CHARTSET);
        //告诉系统二维码扫描后的内容，以及采用的编码形式，生成图片的大小；
        //参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
                BarcodeFormat.QR_CODE, width, height, hints);
        return bitMatrix;
    }

    /**
     * 生成默认大小的二维码编码，字符集默认采用utf-8
     * @param content 二维码内容（可以是url，也可以是文本）
     */
    public BitMatrix encode(String content) throws WriterException {
        return encode(content, QRCODE_SIZE, QRCODE_SIZE);
    }

    /**
     * <p>创建文件<p>
     * 如果存储路径不存在则会创建文件
     * @param storePath 存储路径
     * @param fileName 文件名 （如果文件名包含该文件格式后缀会去重）
     * @param format 文件格式
     * @version 1.0.0
     */
    public File mkdirs(String storePath, String fileName, String format) {
        File file = new File(storePath);
        if(!file.exists() && !file.isDirectory()) {
            file.mkdirs();
        }
        if(fileName.contains("." + format)) {
            return new File(storePath + File.separator + fileName);
        }
        return new File(storePath + File.separator + fileName
                + "." + format.toLowerCase());
    }

    /**
     * 将生成的二维码转换成RBG类型的图片
     * @param bitMatrix 二维码编码
     * @param fillColor 填充部分的RGB颜色编码
     * @param blankColor 空白部分的RBG颜色编码
     */
    public BufferedImage toBufferedImage(BitMatrix bitMatrix, int fillColor,
                                         int blankColor) {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? fillColor : blankColor);
            }
        }
        return image;
    }

    /**
     * 生成默认颜色样式的二维码（RBG黑白）
     * @param bitMatrix 二维码编码
     */
    public BufferedImage toBufferedImage(BitMatrix bitMatrix) {
        return toBufferedImage(bitMatrix, BLANK, WHITE);
    }

    /**
     * 将二维码图片数据写入文件（输出）
     * @param image 二维码图片数据
     * @param format 图片格式
     * @param file 将要写入的文件
     * @throws IOException
     */
    public void writeToFile(BufferedImage image, String format, File file)
            throws IOException {
        if (!ImageIO.write(image, format, file)) {
            throw new IOException("Could not write an image of format "
                    + format + " to " + file);
        }
    }

    /**
     * 将二维码图片数据写入文件（输出）
     * @param image 二维码图片数据
     * @param format 图片格式
     * @param stream 输出流
     * @throws IOException
     */
    public void writeToStream(BufferedImage image, String format,
                              OutputStream stream) throws IOException {
        if (!ImageIO.write(image, format, stream)) {
            throw new IOException("Could not write an image of format "
                    + format);
        }
    }

    /**
     * 类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createQRcode(String content, String format, int width, int height,
                             String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        writeToFile(toBufferedImage(encode(content, width, height),
                fillColor, blankColor), format, mkdirs(storePath, fileName, format));
    }

    /**
     * 类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createQRcode(String content, String format, int width, int height,
                             String storePath, String fileName)
            throws WriterException, IOException {
        createQRcode(content, format, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * 类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createQRcode(String content, String format, int length,
                             String storePath, String fileName) throws WriterException, IOException {
        createQRcode(content, format, length, length, storePath, fileName);
    }

    /**
     * 类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createQRcode(String content, String format,String storePath, String fileName)
            throws WriterException, IOException {
        createQRcode(content, format, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * 类型五：创建二维码，可以设定二维码的命名，存储路径（颜色默认RGB黑白，尺寸默认300*300，格式为jpg）
     */
    public void createQRcode(String content,String storePath, String fileName)
            throws WriterException, IOException {
        createQRcode(content, JPG, storePath, fileName);
    }

    /**
     * PNG类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createPngQRcode(String content, int width, int height,
                                String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        createQRcode(content, PNG, width, height, storePath, fileName, fillColor, blankColor);
    }

    /**
     * PNG类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createPngQRcode(String content, int width, int height,
                                String storePath, String fileName)
            throws WriterException, IOException {
        createPngQRcode(content, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * PNG类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createPngQRcode(String content, int length,
                                String storePath, String fileName) throws WriterException, IOException {
        createPngQRcode(content, length, length, storePath, fileName);
    }

    /**
     * PNG类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createPngQRcode(String content,String storePath, String fileName)
            throws WriterException, IOException {
        createPngQRcode(content, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * JPG类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createJpgQRcode(String content, int width, int height,
                                String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        createQRcode(content, JPG, width, height, storePath, fileName, fillColor, blankColor);
    }

    /**
     * JPG类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createJpgQRcode(String content, int width, int height,
                                String storePath, String fileName)
            throws WriterException, IOException {
        createJpgQRcode(content, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * JPG类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createJpgQRcode(String content, int length,
                                String storePath, String fileName) throws WriterException, IOException {
        createJpgQRcode(content, length, length, storePath, fileName);
    }

    /**
     * JPG类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createJpgQRcode(String content, String storePath, String fileName)
            throws WriterException, IOException {
        createJpgQRcode(content, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * JPEG类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createJpegQRcode(String content, int width, int height,
                                 String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        createQRcode(content, JPEG, width, height, storePath, fileName, fillColor, blankColor);
    }

    /**
     * JPEG类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createJpegQRcode(String content, int width, int height,
                                 String storePath, String fileName)
            throws WriterException, IOException {
        createJpegQRcode(content, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * JPEG类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createJpegQRcode(String content, int length,
                                 String storePath, String fileName) throws WriterException, IOException {
        createJpegQRcode(content, length, length, storePath, fileName);
    }

    /**
     * JPEG类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createJpegQRcode(String content,String storePath, String fileName)
            throws WriterException, IOException {
        createJpegQRcode(content, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * GIF类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createGifQRcode(String content, int width, int height,
                                String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        createQRcode(content, GIF, width, height, storePath, fileName, fillColor, blankColor);
    }

    /**
     * GIF类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createGifQRcode(String content, int width, int height,
                                String storePath, String fileName)
            throws WriterException, IOException {
        createGifQRcode(content, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * GIF类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createGifQRcode(String content, int length,
                                String storePath, String fileName) throws WriterException, IOException {
        createGifQRcode(content, length, length, storePath, fileName);
    }

    /**
     * GIF类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createGifQRcode(String content, String storePath, String fileName)
            throws WriterException, IOException {
        createGifQRcode(content, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * BMP类型一：创建二维码，可以设定二维码的尺寸，颜色，格式，命名，存储路径
     */
    public void createBmpQRcode(String content, int width, int height,
                                String storePath, String fileName, int fillColor, int blankColor)
            throws WriterException, IOException {
        createQRcode(content, BMP, width, height, storePath, fileName, fillColor, blankColor);
    }

    /**
     * BMP类型二：创建二维码，可以设定二维码的尺寸，格式，命名，存储路径（颜色默认RGB黑白）
     */
    public void createBmpQRcode(String content, int width, int height,
                                String storePath, String fileName)
            throws WriterException, IOException {
        createBmpQRcode(content, width, height, storePath, fileName, BLANK, WHITE);
    }

    /**
     * BMP类型三：创建二维码，可以设定二维码的格式，长度（长和宽等值），命名，存储路径（颜色默认RGB黑白）
     */
    public void createBmpQRcode(String content, int length,
                                String storePath, String fileName) throws WriterException, IOException {
        createBmpQRcode(content, length, length, storePath, fileName);
    }

    /**
     * BMP类型四：创建二维码，可以设定二维码的格式，命名，存储路径（颜色默认RGB黑白，尺寸默认300*300）
     */
    public void createBmpQRcode(String content, String storePath, String fileName)
            throws WriterException, IOException {
        createBmpQRcode(content, QRCODE_SIZE, storePath, fileName);
    }

    /**
     * 向二维码图片中插入logo图片
     * @param source 二维码图片流
     * @param imgPath logo图片路径
     * @param needCompress 是否需要压缩
     */
    public BufferedImage insertImage(BufferedImage source, String imgPath,
                                     boolean needCompress) throws IOException {
        File file = new File(imgPath);
        if(!file.exists()) {
            throw new FileNotFoundException("Could not find the file or the "
                    + "file does not exist : " + imgPath);
        }
        Image image = ImageIO.read(file);
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        if(needCompress) {//压缩(这里是固定大小压缩，可以修改成可选大小)
            width = LOGO_SIZE;
            height = LOGO_SIZE;
            Image img = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage target = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g = target.getGraphics();
            g.drawImage(img, 0, 0, null);
            image = img;
        }
        Graphics2D g2D = source.createGraphics();
        int x = (source.getWidth() - width) / 2;
        int y = (source.getHeight() - width) / 2;
        g2D.drawImage(image, x, y, width, height, null);
        Shape shape = new RoundRectangle2D.Float(x, y, width, height, 6, 6);
        g2D.setStroke(new BasicStroke(3f));
        g2D.draw(shape);
        g2D.dispose();
        return source;
    }

    public void createLogoQRcode(String content, String format, int width, int height,
                                 String storePath, String fileName, int fillColor, int blankColor, String logoPath)
            throws WriterException, IOException {
        writeToFile(insertImage(toBufferedImage(encode(content, width, height),
                fillColor, blankColor), logoPath, true), format, mkdirs(storePath, fileName, format));
    }

    public void createLogoQRcode(String content, String format,String storePath,
                                 String fileName, int fillColor, int blankColor, String logoPath)
            throws WriterException, IOException {
        createLogoQRcode(content, format, QRCODE_SIZE, QRCODE_SIZE, storePath,
                fileName, fillColor, blankColor, logoPath);
    }

    public void createLogoQRcode(String content, String format,String storePath, int length,
                                 String fileName, int fillColor, int blankColor, String logoPath)
            throws WriterException, IOException {
        createLogoQRcode(content, format, length, length, storePath,
                fileName, fillColor, blankColor, logoPath);
    }

    public void createLogoQRcode(String content, String format,String storePath,
                                 String fileName, String logoPath)throws WriterException, IOException {
        createLogoQRcode(content, format, storePath, fileName, BLANK, WHITE, logoPath);
    }

    public void createLogoQRcode(String content, String storePath,
                                 String fileName, String logoPath)throws WriterException, IOException {
        createLogoQRcode(content, JPG, storePath, fileName, BLANK, WHITE, logoPath);
    }

    /**
     * 通过二维码文件流解析二维码
     */
    public String analyticalQRCode(BufferedImage image) throws NotFoundException{
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result;
        Hashtable<DecodeHintType, String> hints = new Hashtable<DecodeHintType, String>();
        //解码设置编码方式：utf-8
        hints.put(DecodeHintType.CHARACTER_SET, CHARTSET);
        result = new MultiFormatReader().decode(bitmap, hints);
        return result.getText();
    }

    /**
     * 通过二维码文件解析二维码
     * @param file 二维码文件
     */
    public String analyticalQRCode(File file) throws IOException, NotFoundException {
        BufferedImage image = ImageIO.read(file);
        if (image == null) {
            throw new FileNotFoundException("can't found file or it's null");
        }
        return analyticalQRCode(image);
    }

    /**
     * 通过二维码路径解析二维码
     * @param path 二维码路径
     */
    public String analyticalQRCode(String path) throws IOException, NotFoundException {
        File file = new File(path);
        if(!file.exists()) {
            throw new FileNotFoundException("Could not find the file or the "
                    + "file does not exist : " + path);
        }
        return analyticalQRCode(file);
    }

    public static void main(String[] args) {
        int grey = 0xFFBEBEBE;
        String logo = "D:/360downloads/wpcache/360wallpaper.jpg";
        try {
            new QRCodeUtil().createQRcode("https://www.baidu.com", JPG, 300, 300, "D:", "code2", BLANK, WHITE);
            //new QRCodeUtil().createJpgQRcode("https://www.baidu.com", "D:/", "code1");
            //new QRCodeUtil().createLogoQRcode("https://www.baidu.com", JPG, 300, 300, "D:", "code2", BLANK, grey, logo);
            System.out.println(new QRCodeUtil().analyticalQRCode(new File("D:/code.jpg")));
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }
}