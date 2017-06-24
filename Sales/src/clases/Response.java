package clases;

/**
 *
 * @author Luis Ureña
 */
public class Response {
    protected boolean succed;
    protected String message;

    public Response(boolean succed) {
        this.succed = succed;
    }

    public Response(String message) {
        this.message = message;
        this.succed = false;
    }

    public boolean isSucced() {
        return succed;
    }

    public String getMessage() {
        return message;
    }
    
    
}
