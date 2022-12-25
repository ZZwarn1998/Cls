package com.dachuang.servlet.tchr_operation;

import com.dachuang.servlet.login.StuRegisterServlet;
import com.dachuang.util.EncodeImage;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;
import junit.framework.TestCase;

public class TchrUpdateServletTest extends TestCase {
    private final String REQUEST_URL = "http://localhost/TchrUpdate";

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception{
        super.tearDown();
    }

    public void testDoPost(){
        try{
            ServletRunner sr = new ServletRunner();
            sr.registerServlet("TchrUpdate", TchrUpdateServlet.class.getName());
            ServletUnitClient sc = sr.newClient();
            WebRequest req = new GetMethodWebRequest(REQUEST_URL);
            req.setParameter("t_id", "T12133434");
            req.setParameter("t_name", "stanfordu");
            req.setParameter("t_gen", "F");
            InvocationContext ic = sc.newInvocation(req);
//            System.out.println(req.toString());
            WebResponse resp = sc.getResponse(req);
            System.out.println(resp.getText());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}