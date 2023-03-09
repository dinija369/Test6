public class connection {
    public void transmissionOfInformation() {
        try {
            URL u = new URL("http://www.secret.example.org/");
            HttpURLConnection hu = (HttpURLConnection) u.openConnection();
            hu.setRequestMethod("PUT");
            hu.connect();
            OutputStream os = hu.getOutputStream();
            hu.disconnect();
            }
            catch (IOException e) {
                System.out.println("Ooops");
            }
    }
}