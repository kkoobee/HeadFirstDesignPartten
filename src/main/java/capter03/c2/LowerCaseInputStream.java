package capter03.c2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int i = super.read();
		return (i==-1 ? i : Character.toLowerCase((char)i));
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int r =  super.read(b, off, len);
		for(int i=off; i<off+len; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return r;
	}
}
