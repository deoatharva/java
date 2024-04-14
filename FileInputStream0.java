class FileInputStream0
{
	public static void main(String[] args) {
		int size;
		try(FileInputStream f=new FileInputStream("FileInputStream0.java")){
			System.out.println("total available Bytes"+(size=f.available()));
			int n=size/40;
			System.out.println("First"+n+"byte of file one read() at a time");
			for (int i=0;i<n; i++) {
				System.out.println((char)f.read());
			}
			System.out.println("still avaliable "+f.avaliable());

			System.out.println("reading the next"+n+"with one read(b[])");
			byte b[]=new byte[n];
			if(f.read(b)!=n)
			{
				System.err.println("couldn't read "+n+" bytes");
			}
			System.out.println(new String(b,0,n));
			System.out.println("still avaliable "+(s=f.available()));
			System.out.println("skipping half");
			f.skip(size/2);
			System.out.println(new String(b,0,n));
		}
	}
}