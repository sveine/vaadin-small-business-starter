import '@vaadin/vaadin-button';
import '@vaadin/vaadin-ordered-layout/vaadin-horizontal-layout';
import '@vaadin/vaadin-text-field';
import {html} from 'lit';
import {customElement} from 'lit/decorators.js';
import {Notification} from "@vaadin/notification";
import {View} from "Frontend/views/view";

@customElement('hello-lit-view')
export class HelloLitView extends View {

    connectedCallback() {
        super.connectedCallback();
        this.classList.add('flex', 'p-m', 'gap-m');
    }

    render() {
        return html`
            <vaadin-vertical-layout id="content" theme="spacing">
                <vaadin-button @click="${this.clickButton}">Click me</vaadin-button>
            </vaadin-vertical-layout>`;
    }

    private clickButton() {
        Notification.show("Hey you!", {position: "middle"});
    }
}
