import { UserConfigFn } from 'vite';
import { overrideVaadinConfig } from './vite.generated';
import * as path from "path";
const frontendCorePath = path.resolve(__dirname, "../core-module");
const customConfig: UserConfigFn = (env) => ({
    server: {
        fs: {
            allow: [
                frontendCorePath
            ]
        }
    },
    resolve: {
        alias: {
            "FrontendLib": path.resolve(frontendCorePath, "frontend-lib"),
        },
    }
});

export default overrideVaadinConfig(customConfig);
