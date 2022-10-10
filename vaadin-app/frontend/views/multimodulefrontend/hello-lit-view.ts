import '@vaadin/vaadin-button';
import '@vaadin/vaadin-ordered-layout/vaadin-horizontal-layout';
import '@vaadin/vaadin-text-field';
import {html} from 'lit';
import {customElement, state} from 'lit/decorators.js';
import {Notification} from "@vaadin/notification";
import {View} from "Frontend/views/view";
import EnpointJavaRecord from "Frontend/generated/org/vaadin/multimodule/example/endpoint/EndpointData/EnpointJavaRecord";
import {DemoEndpoint} from "Frontend/generated/endpoints";

@customElement('hello-lit-view')
export class HelloLitView extends View {
    @state()
    private helloFromEndpoint!: EnpointJavaRecord;

    async connectedCallback() {
        super.connectedCallback();
        this.classList.add('flex', 'p-m', 'gap-m');
        this.helloFromEndpoint = await DemoEndpoint.helloFromCoreModule();
    }

    render() {
        return html`
            <vaadin-vertical-layout id="content" theme="spacing">
                Backend @Endpoint: ${this.helloFromEndpoint?.s}
                <vaadin-button @click="${this.clickButton}">Click me</vaadin-button>
            </vaadin-vertical-layout>`;
    }

    private clickButton() {
        Notification.show("Hey you!", {position: "middle"});
    }
}
