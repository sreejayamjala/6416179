import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'React Bootcamp',
      status: 'ongoing',
      startDate: '2025-07-01',
      endDate: '2025-08-01'
    },
    {
      name: 'Java Spring Cohort',
      status: 'completed',
      startDate: '2025-06-01',
      endDate: '2025-07-01'
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          name={cohort.name}
          status={cohort.status}
          startDate={cohort.startDate}
          endDate={cohort.endDate}
        />
      ))}
    </div>
  );
}

export default App;
