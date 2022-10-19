import * as React from "react";
import "./example-css.css";

interface SomeProps {
    funk: (x: string) => string;
    num: number;
}

interface SomeStates {
    isMounted: boolean;
    count: number;
}

export class ReactDemo extends React.Component<SomeProps, SomeStates> {
    constructor(props: SomeProps) {
        super(props);
        this.state = {count: 0, isMounted: false}
    }

    componentDidMount() {
        this.setState(prevState => {
            return {count: prevState.count + 1, isMounted: true}
        });
    }

    render() {
        return (
            <>
                <div className={"cssRed"}>Num:{this.props.num}</div>
                <div>Fun val: {this.props.funk.call(this, "---PAR---")}</div>
            </>
        )
    }

}