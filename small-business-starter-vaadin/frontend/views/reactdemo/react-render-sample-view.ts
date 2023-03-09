import {html} from 'lit';
import {customElement, state} from 'lit/decorators.js';
import {View} from "Frontend/views/view";
import "./example-css.css";
import "./example-scss.scss";
import classes from './example-css-module.module.css';
import {createRoot} from "react-dom/client";
import {ReactDemo} from "Frontend/views/reactdemo/react-demo";


@customElement('react-render-sample-view')
export class ReactRenderSampleView extends View {
    @state()
    private delayedImport = "NO VALUE YET, Wait for it...";

    protected firstUpdated() {
        setTimeout(async () => {
            let delayedImported = await import("./delayed-imported");
            this.delayedImport = delayedImported.DelayedImported.getString();
        }, 3000);

        createRoot(document.getElementById("root")!)
            .render(new ReactDemo({
                num: 99,
                funk: (s) => "(FUNK Param Str)" + s
            }).render());
        document.getElementById("cssModuleBlue")!.className = (classes as any).cssModuleBlue;

    }

    render() {
        return html`
            <div style="display: inline-grid;grid-template-columns: auto auto;column-gap:1rem;row-gap: 0.3rem ">
                <h3>React</h3>
                <div></div>
                <div>REACT RENDER:</div>
                <div id="root">ROT FOR REACT RENDER</div>

                <h3>CSS</h3>
                <div></div>
                <div>Style from CSS import:</div>
                <div class="cssRed">CSS RED</div>

                <div>Style from CSS module import:</div>
                <div id="cssModuleBlue">CSS MODULE BLUE (getElementById)</div>

                <div>Style from CSS module import:</div>
                <div class="${(classes as any).cssModuleBlue}">CSS MODULE BLUE (direct)</div>

                <h3>SCSS</h3>
                <div></div>
                <div>Style from SCSS import:</div>
                <div class="scssGreen">SCSS GREEN</div>

                <h3>Delayd import</h3>
                <div></div>
                <div>Delayed import:</div>
                <div>${this.delayedImport}</div>
            </div>

        `;
    }
}
