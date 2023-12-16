public class Services {
    int portNumber;
    String serviceType;

    public Services(int portNumber, String serviceType) {
        this.portNumber = portNumber;
        this.serviceType = serviceType;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return
                "portNumber = " + portNumber +
                        "\t\tserviceType = " + serviceType  ;
    }
}

