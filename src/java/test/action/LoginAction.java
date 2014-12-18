/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.action;

/**
 *
 * @author patelan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Anas
 */
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/User")
@ResultPath(value="/")
@Result(name="success",location="/login.jsp")
public class LoginAction extends ActionSupport{
 
}