package com.rest.demoRest.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public enum OfficialTypeEnum {
    LEGAL_INDIVIDUAL("юридическое/индивидуальный препрениматель"),
    PHYSICAL("физическое лицо");

    private String name;

    public String toString() {
        return name;
    }

    public static OfficialTypeEnum getEnumByString(String code) {
        for (OfficialTypeEnum e : OfficialTypeEnum.values()) {
            if (e.name.equals(code)) return e;
        }
        return null;
    }

}