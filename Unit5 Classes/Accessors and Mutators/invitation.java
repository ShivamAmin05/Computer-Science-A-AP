public class invitation {
    // instance variables
    private String hostName;
    private String address;
  
    // constructors
    public invitation() {
      hostName = null;
      address = null;
    }
  
    public invitation(String hostname) {
      this.hostName = hostname;
      address = null;
    }
  
    public invitation(String hostname, String address) {
      this.hostName = hostname;
      this.address = address;
    }
  
    // accessors / mutators
    public String getName() {
      return hostName;
    }
  
    public String getAddress()
    {
      return address;
    }
    
    public void setName(String hostName)
    {
      this.hostName = hostName;
    }
    
    public void setAddress(String address)
    {
      this.address = address;
    }
    // toString() method
    public String toString()
    {
      return hostName + " is hosting at " + address;
    }
  }