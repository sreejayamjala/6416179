// src/App.js
import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    // Element variables for conditional rendering
    let content;
    let button;

    if (this.state.isLoggedIn) {
      content = <UserPage />;
      button = <button onClick={this.handleLogout}>Logout</button>;
    } else {
      content = <GuestPage />;
      button = <button onClick={this.handleLogin}>Login</button>;
    }

    return (
      <div className="App" style={{ padding: 20 }}>
        <h1>✈️ Ticket Booking App</h1>
        {button}
        <hr />
        {content}
      </div>
    );
  }
}

export default App;
