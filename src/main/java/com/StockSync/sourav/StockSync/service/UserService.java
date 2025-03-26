package com.StockSync.sourav.StockSync.service;

import com.StockSync.sourav.StockSync.dto.LoginRequest;
import com.StockSync.sourav.StockSync.dto.RegisterRequest;
import com.StockSync.sourav.StockSync.dto.Response;
import com.StockSync.sourav.StockSync.dto.UserDTO;
import com.StockSync.sourav.StockSync.entity.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUser();

    User getCurrentLoggedInUser();

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);


}
