package yichang;
class AddException extends Exception{
	public AddException(String msg) {
		super(msg);
	}
}


public class yootk {
	public static void main(String args[]) {
		int x=0;
		try {
			if(x>127)//Integer��Χ����ô��ɣ�Ī���������������˼��
				System.out.println(x);
				throw new AddException("��ֵ���ݹ���");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Ŷ��������");
		}
		
	}
	public int fun(int x) {
		for(int i=0;i<=127;i++) {
			x++;
		}
		return x;
	}
}
