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
			if(x>127)//Integer范围是这么大吧？莫非这道题是其他意思？
				System.out.println(x);
				throw new AddException("数值传递过大");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("哦豁！结束了");
		}
		
	}
	public int fun(int x) {
		for(int i=0;i<=127;i++) {
			x++;
		}
		return x;
	}
}
