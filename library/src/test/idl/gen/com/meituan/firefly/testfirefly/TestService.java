package com.meituan.firefly.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.thrift.TException;

import com.meituan.firefly.annotations.*;


public interface TestService {
    
    @Func(oneway = true, value = { })
    public void notify (@Field(id = 1, required = true) Integer id) throws TException;
    
    @Func(oneway = false, value = { @Field(id = -1, required = false)})
    public UnionB get (@Field(id = -1, required = false) Integer id) throws TestException, TException;
    
    @Func(oneway = false, value = { })
    public List<UnionB> getList (@Field(id = -1, required = false) List<Short> ids) throws TException;
}
