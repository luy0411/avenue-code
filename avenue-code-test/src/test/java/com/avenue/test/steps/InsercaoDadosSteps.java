package com.avenue.test.steps;

import com.avenue.test.config.IntegrationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {IntegrationConfiguration.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class InsercaoDadosSteps {

//    @Value("${IA_REPORT_MANAGER_INSERT_URL}")
//    private String IA_REPORT_MANAGER_INSERT_URL;
//
//    private List<Product> expectedData;
//    private List<Product> realData;
//
//    @Dado("^que sejam recebidos os dados do relatorio (.*)$")
//    public void que_sejam_recebidos_os_dados_do_relatorio(String dataFile){
//        try {
//            Path data = Paths.get(ClassLoader.getSystemResource(dataFile).toURI());
//            JsonReader reader = new JsonReader(new FileReader(data.toFile()));
//            Type type = new TypeToken<List<Product>>() {}.getType();
//            this.expectedData = new Gson().fromJson(reader, type);
//        } catch (URISyntaxException | FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Quando("^o servico de insercao de dados for chamado$")
//    public void o_servico_de_insercao_de_dados_for_chamado() {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List<Product>> response = restTemplate.exchange(
//                IA_REPORT_MANAGER_INSERT_URL, HttpMethod.POST, new HttpEntity<>(expectedData),
//                new ParameterizedTypeReference<List<Product>>(){}
//        );
//        realData = response.getBody();
//    }
//
//    @Entao("^todos os dados informados serao persistidos e retornados ao componente$")
//    public void todos_os_dados_informados_serao_persistidos_e_retornados_ao_componente() {
//        Assert.assertTrue(expectedData.containsAll(realData));
//    }

}
