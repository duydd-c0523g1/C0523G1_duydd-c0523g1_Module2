package mvc_practice.controller;

import mvc_practice.model.Clients;
import mvc_practice.service.ClientsServiceImpl;
import mvc_practice.service.IClientsService;
/*
Em biết là bài này phải tự làm nhưng mà có nhiều chỗ khó quá em vẫn phải Google ạ.
Em sẽ note lại những khó khăn để hỏi anh sau ạ :((
*/
public class ClientsController {
    private static IClientsService clientsService = new ClientsServiceImpl();

    public static void main(String[] args) {
        // Thêm khách hàng
        clientsService.addCustomer(new Clients(1, "John Smith", 30, "Regular"));
        clientsService.addCustomer(new Clients(2, "Emma Johnson", 25, "VIP"));
        clientsService.addCustomer(new Clients(3, "Michael Brown", 40, "Regular"));

        // Hiển thị danh sách khách hàng
        clientsService.showCustomerList();

        // Xoá khách hàng theo Id
        clientsService.removeCustomerById(2);

        // Hiển thị danh sách khách hàng sau khi xoá
        clientsService.showCustomerList();

        // Tìm kiếm gần đúng theo tên
        clientsService.searchCustomerByName("Brown");
    }
}
