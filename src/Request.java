public class Request {
    private String request;
    private String sender;
    public String receiver;

    public Request(String sender, String request, String receiver) {
        this.sender = sender;
        this.request = request;
        this.receiver = receiver;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    public void sendRequest(Request newRequest) {
        System.out.println("Request " + newRequest.getSender() + " to " + newRequest.getReceiver() +
                ": " + newRequest.getRequest());
    }

    public void updateRequest(Request updatedRequest) {
        this.request = updatedRequest.getRequest();
        this.sender = updatedRequest.getSender();
        this.receiver = updatedRequest.getReceiver();
        System.out.println("Request update: " + this.toString());
    }

    public void cancelRequest() {
        System.out.println("Request " + this.sender + " to " + this.receiver + "cancelled");
        this.request = null;
        this.sender = null;
        this.receiver = null;
    }

    @Override
    public String toString() {
        return "Request:" + "request='" + request + " sender='" + sender  + " receiver='" + receiver;

    }
}
