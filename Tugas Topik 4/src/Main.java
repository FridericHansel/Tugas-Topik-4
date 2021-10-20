class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku (String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void setJudul (String judul){
        this.judul = judul;
    }
    public void setPengarang (String pengarang){
        this.pengarang = pengarang;
    }
    public void setHarga (double harga){
        this.harga = harga;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public double getHarga(){
        return harga;
    }

    public static class Main {
        public static void main(String[] args) {
            Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
            Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

            System.out.println();
            System.out.println("Daftar Buku: ");
            System.out.println("Judul : " + buku1.getJudul() + "\n" + "Pengarang: " + buku1.getPengarang() + "\n" + "Harga: " + buku1.getHarga());
            System.out.println();
            System.out.println("Judul : " + buku2.getJudul() + "\n" + "Pengarang: " + buku2.getPengarang() + "\n" + "Harga: " + buku2.getHarga());
        }
    }
}

