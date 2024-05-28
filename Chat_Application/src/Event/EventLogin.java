/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Event;


import model.Model_Register;

public interface EventLogin {

    public void login();

    public void register(Model_Register data, EventMessage message);

    public void goRegister();

    public void goLogin();
}
