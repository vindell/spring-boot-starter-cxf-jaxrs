package org.apache.cxf.spring.boot.utils;

import org.apache.commons.lang3.builder.Builder;

import cn.wensiqun.asmsupport.client.DummyClass;
import cn.wensiqun.asmsupport.client.block.MethodBody;
import cn.wensiqun.asmsupport.client.def.var.LocVar;

public class DummyClassJaxrsApiBuilder implements Builder<DummyClass> {

	// 构建动态对象
	private DummyClass dummy = null;
	
	public DummyClassJaxrsApiBuilder(final String className) {
		this.dummy = new DummyClass(className);
	}
	
	public DummyClassJaxrsApiBuilder output(String classOutPutPath) {
		dummy.public_().setClassOutPutPath(classOutPutPath);
		return this;
	}
	
	public DummyClassJaxrsApiBuilder method(Object body) {
	 dummy.newMethod("main").public_().static_().argTypes(String[].class).body(new MethodBody() {
            @Override
            public void body(LocVar... args) {
                val(System.class).field("out").call("println", val("Hello ASMSupport."));
                return_();
            }
        });
		return this;
	}
	
	@Override
	public DummyClass build() {
		return dummy;
	}

}
