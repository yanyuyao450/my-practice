package com.yan.utils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;

/**
 * @author yanyuyao
 */
public class MyFileUtils {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/yanyuyao/Downloads/a.txt");
        File target = new File("/Users/yanyuyao/Downloads/target.txt");
        reWriteFile(file, target);
    }

    /**
     * 文本转内容格式
     * 根据接口文档生成实体类
     * 接口文档格式
     * 文本格式(.txt)
     * 接口文档内容格式
     * field type remark
     * eg.id Long 赔付id
     *
     * @param file 文件
     * @throws Exception 读写异常
     */
    public static void reWriteFile(File file, File target) throws Exception {
        String content = FileUtils.readFileToString(file);
        String[] lines = content.split("\n|\r|\r\n|\n\r");
        List<String> res = Lists.newArrayListWithExpectedSize(lines.length);
        for (String line : lines) {
            StringBuilder sb = new StringBuilder("private ");
            line = line.replaceAll("\\s+", " ");
            String[] words = line.split("\\s");
            sb.append(words[1]).append(" ").append(words[0]).append(";");
            String format = String.format("/**\n* %s\n*/\n", words[2]);
            sb.insert(0, format);
            res.add(sb.toString());
        }
        FileUtils.writeStringToFile(target, Joiner.on("\n").join(res));
    }
}
