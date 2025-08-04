// src/CurrencyConverter.js
import React, { Component } from 'react';

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: null,
    };
  }

  handleInputChange = (event) => {
    this.setState({ rupees: event.target.value });
  }

  handleSubmit = () => {
    const euroRate = 0.011; // 1 INR = 0.011 EUR (example rate)
    const euros = parseFloat(this.state.rupees) * euroRate;
    this.setState({ euros: euros.toFixed(2) });
  }

  render() {
    return (
      <div style={{ marginTop: 30 }}>
        <h2>💱 Currency Converter</h2>
        <input
          type="number"
          value={this.state.rupees}
          onChange={this.handleInputChange}
          placeholder="Enter INR"
        />
        <button onClick={this.handleSubmit} style={{ marginLeft: 10 }}>
          Convert
        </button>

        {this.state.euros && (
          <p>💶 Euros: €{this.state.euros}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConverter;
