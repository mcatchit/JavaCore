package collections.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Server {

    private class RequestRecord{
        private Request request;
        private Date time;
    }

    private List<RequestRecord> requestsHistory = new ArrayList<>();

    public void executeRequest(Request request, Client client){

    }
}
