package com.rest.demoRest.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    // Класс, который даёт простой доступ к брокеру сообщений RabbitMQ
    // Позволяет отправлять и получать сообщения
    @Autowired
    RabbitTemplate rabbitTemplate;

    // Метод, выполняющий отправку сообщений
    public void sendMessage() {

        // Отправляем сообщение в обменник с ключом "key"
        // В зависимости от ключа, сообщение будет отправлено в нужную очередь
        rabbitTemplate.convertAndSend("exchange", "key", "<Account><JETName>ИП ГРИГОРЬЕВА ОЛЬГА НИКОЛАЕВНА</JETName><JETFullName> ГРИГОРЬЕВА ОЛЬГА НИКОЛАЕВНА</JETFullName><JETINN>423007343084</JETINN><JETOGRN>323420500046261</JETOGRN><JETTypeValue>Юридическое лицо</JETTypeValue><JETPrimaryOrganizationLocation>001-000</JETPrimaryOrganizationLocation><ListOfCifAccountReference><CifAccountReference><SystemNumber>IBSO</SystemNumber><ExternalId1>54427741710</ExternalId1><JETExportDate>06/10/2023</JETExportDate></CifAccountReference></ListOfCifAccountReference><ListOfContact><Contact><FirstName>ОЛЬГА</FirstName><LastName>ГРИГОРЬЕВА</LastName><MiddleName>НИКОЛАЕВНА</MiddleName><JETRelTypeCD>РУКОВОДИТЕЛЬ</JETRelTypeCD><ContRecordId>54427741777</ContRecordId><JETIdFase>54427741775</JETIdFase><JETWorkBeg>05/24/2023</JETWorkBeg><JETGBookFlag>N</JETGBookFlag><JETGManagerFlag>Y</JETGManagerFlag><JETGSingTodayFlag>N</JETGSingTodayFlag><JETGFastSingFlag>N</JETGFastSingFlag><ListOfCifContactReference><CifContactReference><SystemNumber>IBSO</SystemNumber><ExternalId1>54427741775</ExternalId1><JETExportDate2>06/10/2023</JETExportDate2></CifContactReference></ListOfCifContactReference></Contact></ListOfContact><ListOfNegativeLists><NegativeLists><TypeCode>LIST_WMD</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:00</CheckLastDate></NegativeLists><NegativeLists><TypeCode>TERROR_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:00</CheckLastDate></NegativeLists><NegativeLists><TypeCode>BLACKLIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:00</CheckLastDate></NegativeLists><NegativeLists><TypeCode>VED_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:15</CheckLastDate></NegativeLists><NegativeLists><TypeCode>DENY_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:00</CheckLastDate></NegativeLists><NegativeLists><TypeCode>OFAC_LIST</TypeCode><CheckResult>N</CheckResult><CheckLastDate>06/10/2023 01:16:00</CheckLastDate></NegativeLists></ListOfNegativeLists></Account>\n");
    }
}
