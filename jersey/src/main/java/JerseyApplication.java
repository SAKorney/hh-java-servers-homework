public class JerseyApplication {

  public static void main(String[] args) throws Exception {
    // run, Jetty, run!
    LocalJettyServer.create(8081).run();
  }
}
