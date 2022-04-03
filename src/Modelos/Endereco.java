package Modelos;

public class Endereco {
    private String street;
    private int number;
    private String complement;
    private String bairro;
    private String city;
    private String cep;
    private String UF;
    private String country;

    public Endereco(String street, int number, String complement, String bairro, String city, String cep, String UF, String pais) {
        this.street = street;
        this.complement = complement;
        this.bairro = bairro;
        this.city = city;
        this.cep = cep;
        this.UF = UF;
        this.country = pais;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Endereco: [" +
                "Rua='" + street + '\'' +
                ", Numero=" + number +
                ", Complemento='" + complement + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", City='" + city + '\'' +
                ", CEP='" + cep + '\'' +
                ", UF='" + UF + '\'' +
                ", País='" + country + '\'' +
                ']';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}