package myjava.mybignumber;

/**
 * Tác giả: Nguyễn Hữu Nhân.
 * Description.
 * Class MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi.
 * Hàm sum trong Class MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số
 */

public class MyBigNumber {

    /**
     * Để thực hiện phép cộng, ta cần 2 chuỗi làm tham số cho hàm sum trong đó:
     * 2 chuỗi này đều chỉ chứa các kí số từ '0' đến '9'.
     * <br/>
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số s1 và s2.
     */
    public String sum(String s1, String s2) {
        // Buoc 1: lay do dai 2 chuoi
        // Phan khai bao
    	if (s1 == null || s1 == "") {
    		s1 = "0";
    	}
    	
    	if (s2 == null || s2 == "") {
    		s2 = "0";
    	}

        String result = "";
        int length1 = s1.length();// do dai chuoi thu 1
        int length2 = s2.length();// do dai chuoi thu 2
        int max = (length1 > length2) ? length1 : length2;// lay do dau lon nhat giua a va b
        int nho = 0;// Khởi tạo số nhớ = 0 để khi cộng sẽ có vài trường hợp lớn hơn 9
        int pos1 = 0;// Vị trí chuỗi s1
        int pos2 = 0;// Vị trí chuỗi s2
        char c1;// kí tự c1 dùng để lấy kí tự cuối cùng của chuỗi s1
        char c2;// kí tự c2 dùng để lấy kí tự cuối cùng của chuỗi s2
        int tong = 0;// Khởi tạo biến tổng = 0 để cộng 2 kí tự cuối cùng lại với nhau

        // Lặp từ 0 đến max lần
        for (int i = 0; i < max; i++) {
            pos1 = length1 - i - 1;// cập nhật lại vị trí chuỗi s1
            pos2 = length2 - i - 1;// cập nhật lại vị trí chuỗi s2

            // Xét vị trí của 2 chuỗi xem có >= 0 hay không
            
            c1 = (pos1 > -1) ? s1.charAt(pos1) : '0';

            c2 = (pos2 >= 0) ? s2.charAt(pos2) : '0';

            tong = (c1 - '0') + (c2 - '0') + nho;// chuyển kí tự thành số xong cộng cho số nhớ
            result = (tong % 10) + result;// Lấy kết quả tổng ở trên chia lấy dư cho 10 và ghép vào chuỗi kết quả
            nho = tong / 10;// Cập nhật lại số nhớ
        }

        if (nho > 0) {
            result = 1 + result;// Nếu số nhớ còn dư thì ghép vào chuỗi kết quả
        }

        return result;// Trả về kết quả thu được
    }
}
