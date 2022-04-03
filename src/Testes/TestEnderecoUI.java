package Testes;

import Modelos.Endereco;
import UIntefaces.EndUI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEnderecoUI {
    @Test
    void testSetAtributes() {
        String street = "descendo a ladeira";
        String complemento = "esquina";
        String cidade = "guarulhos";
        String bairro = "aldeota nebulosa";
        String pais = "brasil";
        String estado = "bg";
//        String cep1 = "415003%#!-[]¬2^^/1a0"; // Aqui é para retorna 00.000-000
        String cep1 = "415003%#!-[]¬2^^/1a"; // Aqui é para retorna 41.500-000
        int number = 1099;
        String ruaTeste = "Descendo A Ladeira";
        String complementoTest = "Esquina";
        String cidadeTest = "Guarulhos";
        String cepTest1 = "41.500-321";
//        String cepTest1 = "00.000-000";
        String bairroTest = "Aldeota Nebulosa";
        String ufTest = "BG";
        String countryTest = "Brasil";
        Endereco end = EndUI.novoEndereco(street, number, complemento, bairro, cidade, cep1, estado, pais);
        String rua = end.getStreet();
        String comp = end.getComplement();
        String conjunto = end.getBairro();
        String cit = end.getCity();
        String cep = end.getCep();
        String uefi = end.getUF();
        String country = end.getCountry();
        Assertions.assertEquals(ruaTeste, rua);
        Assertions.assertEquals(complementoTest, comp);
        Assertions.assertEquals(bairroTest, conjunto);
        Assertions.assertEquals(cidadeTest, cit);
        Assertions.assertEquals(cepTest1, cep);
        Assertions.assertEquals(ufTest, uefi);
        Assertions.assertEquals(countryTest, country);
    }

}