package com.rest.demoRest;

import com.rest.demoRest.testTopo.Topo;
import com.rest.demoRest.validate.BaseTest;
import org.json.JSONObject;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
//        String s ="testCrmPass234";
//        System.out.println(Base64.getEncoder());
//        String value = " \\ ";
//        System.out.println(value);
//        String a ="83432281452";
//        System.out.println(a.length());
        Base64.Decoder decoder = Base64.getUrlDecoder();

        String token = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJSYWZxNHl0U3RueHFlc2xxRVJQM1UwZEtMcW5lQ3hKVWxVbGlGQ1FINUZFIn0.eyJleHAiOjE2OTcxMDk5MjEsImlhdCI6MTY5NzEwOTMyMSwiYXV0aF90aW1lIjoxNjk3MTA2Njk0LCJqdGkiOiIxYTQwYWZhZC1mNjI1LTQ3MzAtYjkxMS1jYWM3MDdlMTIzZDEiLCJpc3MiOiJodHRwczovL2QwaWFtLmF0Yi5zdS9yZWFsbXMvZm9tcCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJlMzcxYzExNS01Nzk0LTRlZmEtOWJjNi04YzQ1NzBjZWUzOTciLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJmb21wLWZyb250ZW5kIiwibm9uY2UiOiJmNGM0NTc1OC05ZWZiLTQyN2QtODI4ZC03ZDI1ODhlNWViNWQiLCJzZXNzaW9uX3N0YXRlIjoiY2ViNGY5YjYtNWNmMy00N2NhLTk3ZGEtZDU4ZGZkYzBhNGQ4IiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwczovL2QwYXN0YW5hLmF0Yi5zdSIsImh0dHBzOi8vZDBwYXJuYXMuYXRiLnN1IiwiaHR0cDovL2xvY2FsaG9zdDo5MDAwIiwiaHR0cHM6Ly9kMGZwYnMtbmd4MDEuaXguYXRiLnN1Il0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIiwiZGVmYXVsdC1yb2xlcy1mb21wIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiZm9tcC1mcm9udGVuZCI6eyJyb2xlcyI6WyJDT1JQX0NSTV9HTyJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZW1haWwgcHJvZmlsZSIsInNpZCI6ImNlYjRmOWI2LTVjZjMtNDdjYS05N2RhLWQ1OGRmZGMwYTRkOCIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJuYW1lIjoidGVzdF9jcm1fZ28iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJ0ZXN0X2NybV9nbyJ9.ZkccpoBNPAcew_iRjEWeDLKATRiE1x1LD12G7P1PF8VCCgPr1p0NRCcuWFFa1kvDGMcmEQaysI0OMcUzeKHzMoRy7uDtkJloLrs5WqamWWFeRmAnefT0YJbn2CeVmLh80bak3f0Ba6Dxv4zlrdzaAvS3y0E6bz3EjtFXKG9Qs0qBvxzJiVtClKSVU0e47T58aXZJGWYSrMFl_Sd8NgcdKyVarqRs0KuxdVDlBZGUGeFxOd5_DX_Wrk_uGozdIYNioGIxB6AglB9mDL8u2qgxTgDIkYY882uffZAvHMw0uWdOkgGRYhe27Bzq5NgoQVvnLMTuJ1tuUzZkYw3X555EdA";
        token = token.split(" ")[1];
        String[] chunks = token.split("\\.");
        String payload = new String(decoder.decode(chunks[1]));
        JSONObject jsonObject = new JSONObject(payload);
        String name = jsonObject.getString("name");
        System.out.println(name);
        BaseTest b = new BaseTest();
        b.setId(1L);
        System.out.println(b.getId());

    }

    private static String getTopoValue(Topo topo) {
        return topo != null ? topo.getTopoValue() : null;
    }
}
