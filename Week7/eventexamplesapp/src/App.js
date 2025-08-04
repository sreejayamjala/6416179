import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello = () => {
    alert("Hello! Counter has been updated.");
  }

  sayWelcome = (message) => {
    alert(message);
  }

  handleSyntheticEvent = (event) => {
    alert("I was clicked");
    console.log(event); // synthetic event
  }

  render() {
    return (
      <div style={{ padding: 20 }}>
        <h1>🎯 React Event Handling Examples</h1>
        <h2>Counter: {this.state.counter}</h2>

        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement} style={{ marginLeft: 10 }}>Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.handleSyntheticEvent}>
          Trigger Synthetic Event
        </button>

        <br /><br />
        
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
