import logo from './logo.svg';
import React from 'react';
import './App.css';

function App() {
  // Object for single office
  const singleOffice = {
    name: "Urban Hive",
    rent: 55000,
    address: "Banjara Hills, Hyderabad",
    image: "https://via.placeholder.com/300x200?text=Office+Image"
  };

  // Array of office objects
  const officeList = [
    {
      name: "Tech Park",
      rent: 45000,
      address: "Gachibowli, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=Tech+Park"
    },
    {
      name: "Sky Towers",
      rent: 70000,
      address: "HiTech City, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=Sky+Towers"
    },
    {
      name: "BizHub",
      rent: 62000,
      address: "Kondapur, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=BizHub"
    },
  ];

  // Inline CSS logic
  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>

      <h2>{singleOffice.name}</h2>
      <img src={singleOffice.image} alt="Office" width="300" />
      <p><strong>Address:</strong> {singleOffice.address}</p>
      <p><strong>Rent:</strong> <span style={getRentStyle(singleOffice.rent)}>{singleOffice.rent}</span></p>

      <hr />

      <h2>Available Office Spaces</h2>
      {officeList.map((office, index) => (
        <div key={index} style={{ border: "1px solid #ccc", padding: 10, margin: 10 }}>
          <h3>{office.name}</h3>
          <img src={office.image} alt={office.name} width="300" />
          <p><strong>Address:</strong> {office.address}</p>
          <p><strong>Rent:</strong> <span style={getRentStyle(office.rent)}>{office.rent}</span></p>
        </div>
      ))}
    </div>
  );
}

export default App;
