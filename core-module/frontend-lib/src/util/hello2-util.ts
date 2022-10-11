import {html} from "lit";

export class Hello2Util {
    static bluevioletHello() {
        return html`
            <div style="background-color: blueviolet;color: #FFFFFF">Hello Lit-html in backend</div>
        `;
    }
}