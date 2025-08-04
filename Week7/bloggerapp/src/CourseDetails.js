// src/CourseDetails.js
import React from 'react';

const CourseDetails = () => {
  const courses = [
    { id: 101, name: "React for Beginners", level: "Basic" },
    { id: 102, name: "Advanced React", level: "Advanced" },
  ];

  return (
    <div>
      <h2>🎓 Course List</h2>
      <ul>
        {courses.map(course => (
          <li key={course.id}>
            {course.name} — Level: {course.level}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CourseDetails;
