import {Hello2Util} from "FrontendLib/src/util/hello2-util";

export class HelloUtil {
    helloFromBackendTypescript() {
        return "Hey from backend Typescript";
    }

    bluevioletHelloWrapper() {
        return Hello2Util.bluevioletHello();
    }
}