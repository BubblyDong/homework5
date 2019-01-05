mport java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prodeal {
    public static void main(String args[]) {
        File file = new File("output6/clusteredInstances/part-m-00000");
        BufferedReader reader = null;
        int[] x=new int[100];
        int[] y=new int[100];
        int[] color=new int[100];
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                String[] s=tempString.split("[ \\s,,]");//    \\s表示n空白字符  这一行表示以空白字符和逗号为分隔标志
                for(int i=0;i<3;i++){
                    x[line-1]=Integer.parseInt(s[0]);
                    y[line-1]=Integer.parseInt(s[1]);
                    color[line-1]=Integer.parseInt(s[2]);
                }
                line++;
            }
            for(int i=0;i<x.length;i++)
                System.out.print(x[i]+" ");
            System.out.println();
            for(int i=0;i<x.length;i++)
                System.out.print(y[i]+" ");
            System.out.println();
            for(int i=0;i<x.length;i++)
                System.out.print(color[i]+" ");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
