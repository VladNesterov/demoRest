package com.rest.demoRest.controller;

import com.rest.demoRest.dto.MessageModel;
import com.rest.demoRest.service.Producer;
import com.rest.demoRest.service.RabbitMQProducerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
public class RabbitController {

    private final RabbitMQProducerService rabbitMQProducerService;

    @Autowired
    public RabbitController(RabbitMQProducerService rabbitMQProducerService) {
        this.rabbitMQProducerService = rabbitMQProducerService;
    }

    @PostMapping("/send")
    public void sendMessageToRabbit() {
        String s ="<Account><JETName>ООО Строй Мост</JETName><JETFullName>ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ &quot;СтройМост&quot;</JETFullName><JETINN>2808018549</JETINN><JETKPP>280801001</JETKPP><JETOGRN>1062808007503</JETOGRN><MainEmailAddress>ter@mail.ru</MainEmailAddress><JETTypeValue>Юридическое лицо</JETTypeValue><JETPrimaryOrganizationLocation>014-54</JETPrimaryOrganizationLocation><ListOfCifAccountReference><CifAccountReference><SystemNumber>IBSO</SystemNumber><ExternalId1>69417066</ExternalId1><JETExportDate>10/20/2023</JETExportDate></CifAccountReference></ListOfCifAccountReference><ListOfContact><Contact><FirstName>Абдуахад</FirstName><LastName>Рузиев</LastName><MiddleName>Мамарозикович</MiddleName><JETRelTypeCD>ГЕНЕРАЛЬНЫЙ ДИРЕКТОР</JETRelTypeCD><ContRecordId>1173084147</ContRecordId><JETIdFase>1173086829</JETIdFase><JETWorkBeg>11/16/2006</JETWorkBeg><JETGBookFlag>N</JETGBookFlag><JETGManagerFlag>Y</JETGManagerFlag><JETGSingTodayFlag>N</JETGSingTodayFlag><JETGFastSingFlag>N</JETGFastSingFlag><ListOfCifContactReference><CifContactReference><SystemNumber>IBSO</SystemNumber><ExternalId1>1173086829</ExternalId1><JETExportDate2>10/20/2023</JETExportDate2></CifContactReference></ListOfCifContactReference></Contact></ListOfContact><ListOfJetFinBusinessPhone><JetFinBusinessPhone><PhoneType>1</PhoneType><PhoneNumber>89145649232</PhoneNumber><JETIntegrationId>6405342752</JETIntegrationId></JetFinBusinessPhone><JetFinBusinessPhone><PhoneType>2</PhoneType><PhoneNumber>84165649432</PhoneNumber><JETIntegrationId>6405352377</JETIntegrationId></JetFinBusinessPhone></ListOfJetFinBusinessPhone><ListOfPersonalAddress><PersonalAddress><JETAddressType>CORP</JETAddressType><Country>643</Country><PostalCode>676282</PostalCode><JETRegionCode>Амурская</JETRegionCode><JETSettlement>Тында</JETSettlement><JETStreet>Мохортова</JETStreet><JETHouse>10</JETHouse><JETABSId>69417603</JETABSId><JETFullAddress>РОССИЯ,676282,обл Амурская,,г Тында,ул Мохортова,дом 10,,</JETFullAddress><JETRegionCodeKLADR>28</JETRegionCodeKLADR><JETDistrictKLADR>000</JETDistrictKLADR><JETCityKLADR>006</JETCityKLADR><JETSettlementKLADR>000</JETSettlementKLADR><JETStreetKLADR>0200</JETStreetKLADR><JETKLADRFlag>Y</JETKLADRFlag></PersonalAddress><PersonalAddress><JETAddressType>FACT</JETAddressType><Country>643</Country><PostalCode>676282</PostalCode><JETRegionCode>Амурская</JETRegionCode><JETSettlement>Тында</JETSettlement><JETStreet>Мохортова</JETStreet><JETHouse>10</JETHouse><JETABSId>6405412918</JETABSId><JETFullAddress>РОССИЯ,676282,обл Амурская,,г Тында,ул Мохортова,дом 10,,</JETFullAddress><JETRegionCodeKLADR>28</JETRegionCodeKLADR><JETDistrictKLADR>000</JETDistrictKLADR><JETCityKLADR>006</JETCityKLADR><JETSettlementKLADR>000</JETSettlementKLADR><JETStreetKLADR>0200</JETStreetKLADR><JETKLADRFlag>Y</JETKLADRFlag></PersonalAddress><PersonalAddress><JETAddressType>POST</JETAddressType><Country>643</Country><PostalCode>676282</PostalCode><JETRegionCode>Амурская</JETRegionCode><JETSettlement>Тында</JETSettlement><JETStreet>Мохортова</JETStreet><JETHouse>10</JETHouse><JETABSId>6405415256</JETABSId><JETFullAddress>РОССИЯ,676282,обл Амурская,,г Тында,ул Мохортова,дом 10,,</JETFullAddress><JETRegionCodeKLADR>28</JETRegionCodeKLADR><JETDistrictKLADR>000</JETDistrictKLADR><JETCityKLADR>006</JETCityKLADR><JETSettlementKLADR>000</JETSettlementKLADR><JETStreetKLADR>0200</JETStreetKLADR><JETKLADRFlag>Y</JETKLADRFlag></PersonalAddress></ListOfPersonalAddress><ListOfNegativeLists><NegativeLists><TypeCode>LIST_WMD</TypeCode><CheckResult>N</CheckResult><CheckLastDate>02/16/2023 10:44:14</CheckLastDate></NegativeLists><NegativeLists><TypeCode>TERROR_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>07/14/2023 20:21:46</CheckLastDate></NegativeLists><NegativeLists><TypeCode>BLACKLIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>04/14/2021 18:00:37</CheckLastDate></NegativeLists><NegativeLists><TypeCode>FREEZE_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>04/25/2023 10:19:27</CheckLastDate></NegativeLists><NegativeLists><TypeCode>VED_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>03/15/2023 15:23:13</CheckLastDate></NegativeLists><NegativeLists><TypeCode>DENY_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>07/13/2023 14:35:17</CheckLastDate></NegativeLists><NegativeLists><TypeCode>OFAC_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>12/16/2022 19:36:10</CheckLastDate></NegativeLists><NegativeLists><TypeCode>CRS</TypeCode><CheckResult>N</CheckResult><CheckLastDate>07/06/2023 07:25:33</CheckLastDate></NegativeLists><NegativeLists><TypeCode>FATCA</TypeCode><CheckResult>N</CheckResult><CheckLastDate>07/03/2023 12:39:46</CheckLastDate></NegativeLists><NegativeLists><TypeCode>LIST_MOFA</TypeCode><CheckResult>N</CheckResult><CheckLastDate>07/08/2022 15:40:05</CheckLastDate></NegativeLists><NegativeLists><TypeCode>LIST_EU</TypeCode><CheckResult>N</CheckResult><CheckLastDate>03/17/2021 16:52:21</CheckLastDate></NegativeLists></ListOfNegativeLists><ListOfProperties><Properties><PropertiesRecordId>55619480636</PropertiesRecordId><JETPropertiesBeg>10/11/2023</JETPropertiesBeg><JETGroupProp>ATB_CLIENT_MANAGER</JETGroupProp><JETProp>ALGANAEV</JETProp></Properties><Properties><PropertiesRecordId>55619480736</PropertiesRecordId><JETPropertiesBeg>10/11/2023</JETPropertiesBeg><JETGroupProp>ATB_CLIENT_PRIOR</JETGroupProp><JETProp>Приоритетный</JETProp></Properties></ListOfProperties></Account>";
        rabbitMQProducerService.sendMessage(s,"testRoutingKey");
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}