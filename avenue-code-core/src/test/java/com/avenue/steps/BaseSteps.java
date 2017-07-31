package com.avenue.steps;

import com.avenue.util.DataUtil;
import com.avenue.entity.Product;
import cucumber.api.java.pt.Dado;
import org.springframework.beans.factory.annotation.Autowired;
import com.avenue.repository.ProductRepository;

import java.util.List;
import java.util.Map;

public class BaseSteps {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private DataUtil dataUtil;

    @Dado("^que o banco de dados esteja populado:$")
    public void queOBancoDeDadosEstejaPopulado(List<Map<String, String>> data) throws Throwable {
        for (Map<String, String> map : data) {
            Product report = new Product();
            report.setName(map.get("name"));
            this.dataUtil.getAllData().put(map.get("id"), report);
            this.repository.save(report);
        }
    }
}
