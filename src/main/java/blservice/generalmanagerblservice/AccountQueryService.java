package blservice.generalmanagerblservice;

import java.rmi.Remote;

import vo.generalmanagervo.Accountvo;

public interface AccountQueryService extends Remote {

public Accountvo showAccount();

}
