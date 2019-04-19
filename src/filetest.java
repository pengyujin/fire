import java.io.File;
/*
 boolean mkdir() :  创建此抽象路径名指定的目录。
 boolean mkdirs() :  创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
 理解
 mkdir()：只能创建一层目录
 mkdirs(): 创建多层目录
 */
public class filetest {
    public static void main(String[] args) {
        String path="D:/英雄时刻1/nmsl666/";
        File file= new File(path);
        file.mkdirs();
    }
}
