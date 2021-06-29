package Bai_15_IO_TextFile.practice.ReadAndWriteFile;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteFile {
    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Codegym\\C04212G1_NguyenVanCong_Module2\\C04212G1_NguyenVanCong_Module_2\\src\\Bai_15_IO_TextFile\\practice\\ReadAndWriteFile\\source");
        System.out.println(numbers);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Codegym\\C04212G1_NguyenVanCong_Module2\\C04212G1_NguyenVanCong_Module_2\\src\\Bai_15_IO_TextFile\\practice\\ReadAndWriteFile\\result", maxValue);
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai noi dung nay ");
        }
        return numbers;
    }

    //    ham viet gia tri lon nhat
    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter br1 = new BufferedWriter(writer);
            br1.write("gia tri lon nhat la " + max);
            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //    Hàm tìm giá trị lớn nhất
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println(max);
        return max;
    }
}
