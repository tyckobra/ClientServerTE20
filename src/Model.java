import java.io.PrintWriter;
import java.net.Socket;

//HUR SKA DET GÖRAS?

public class Model {
    private Socket server;
    private PrintWriter print;

    View v;
    Model m;

    public Model () {
        this.m = m;
        this.v = v;

        this.getPrint();
        this.getServer();

    }


    public PrintWriter getPrint() {
        return print;
    }

    public Socket getServer() {
        return server;
    }
}
