package com.jd.blockchain.binaryproto.impl;

import com.jd.blockchain.utils.io.NumberMask;

public class Int64LongWrapperEncodingConverter extends NumberEncodingConverter{
	
	public Int64LongWrapperEncodingConverter(NumberMask numberMask) {
		super(numberMask, Long.class);
	}
	
	@Override
	public Object getDefaultValue() {
		return 0;
	}

	@Override
	protected long encode(Object value) {
		return (long)value;
	}

	@Override
	protected Object decode(long value) {
		return (long)value;
	}


}
