import '@vaadin/vaadin-button';
import '@vaadin/vaadin-ordered-layout/vaadin-horizontal-layout';
import '@vaadin/vaadin-text-field';
import {html} from 'lit';
import {customElement, state} from 'lit/decorators.js';
import {View} from "Frontend/views/view";
import {DemoEndpoint} from "Frontend/generated/endpoints";
import {HelloUtil} from "FrontendLib/src/util/hello-util";
import "FrontendLib/css/my-core-frontend-colors.scss";
import EnpointJavaRecord from "Frontend/generated/com/smallbusiness/core/sampledata/EndpointData/EnpointJavaRecord";

@customElement('core-module-testing-view')
export class CoreModuleTestingView extends View {
    @state()
    private helloFromEndpoint!: EnpointJavaRecord;
    @state()
    private helloFromCoreFrontendLib!: string;

    connectedCallback() {
        super.connectedCallback();
        this.classList.add('flex', 'p-m', 'gap-m');
        DemoEndpoint.helloFromCoreModule().then(value => this.helloFromEndpoint = value);
        this.helloFromCoreFrontendLib = new HelloUtil().helloFromBackendTypescript();
    }

    render() {
        return html`
            <vaadin-vertical-layout id="content" theme="spacing">

                <h3>Typescript</h3>
                <div style="display: inline-grid;grid-template-columns: auto auto;" class="gap-x-xl gap-y-s bg-contrast-5">
                    <div>From core-module/frontend-lib:</div>
                    <div>${this.helloFromCoreFrontendLib}</div>

                    <div>Backend @Endpoint:</div>
                    <div>${this.helloFromEndpoint?.s}</div>

                    <div>Lit import backend</div>
                    <div>${new HelloUtil().bluevioletHelloWrapper()}</div>
                </div>

                <h3>Style</h3>
                <div style="display: inline-grid;grid-template-columns: auto auto;" class="gap-x-xl gap-y-s bg-contrast-5">
                    <div>Theme/styles.css @import "FrontendLib/theme/my-core-theme-colors.css"</div>
                    <div class="core-theme-yellow-bk"></div>

                    <div>SCSS loaded backend ./../../core-module/frontend-lib/css/my-core-backend-colors.scss</div>
                    <div class="core-resources-red-bk" style="width: 100px"></div>

                    <div>SCSS frontend-lib/css/my-core-frontend-colors.scss</div>
                    <div class="core-frontend-blue-bk"></div>
                </div>

                <h3>Assets</h3>
                <div style="display: inline-grid;grid-template-columns: auto auto;" class="gap-x-xl gap-y-s bg-contrast-5">
                    <div>Image loaded backend from core-module jar in META-INF/resources/images</div>
                    <div id="backendImage"></div>

                    <div>Image loaded frontend from core-module jar in META-INF/resources/images</div>
                    <img src="./images/hospital.png" alt="">
                </div>

            </vaadin-vertical-layout>`;
    }
}
