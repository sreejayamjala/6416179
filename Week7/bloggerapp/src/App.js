// src/App.js
import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [section, setSection] = useState('books');

  let content; // Using element variable

  // if/else conditional rendering
  if (section === 'books') {
    content = <BookDetails />;
  } else if (section === 'blogs') {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  return (
    <div className="App" style={{ padding: 20 }}>
      <h1>📖 Blogger App</h1>

      <div style={{ marginBottom: 20 }}>
        <button onClick={() => setSection('books')}>Show Books</button>
        <button onClick={() => setSection('blogs')}>Show Blogs</button>
        <button onClick={() => setSection('courses')}>Show Courses</button>
      </div>

      {/* Rendered using element variable */}
      {content}

      {/* Ternary conditional rendering */}
      <p>
        Currently Viewing:{" "}
        {section === 'books'
          ? "Books"
          : section === 'blogs'
          ? "Blogs"
          : "Courses"}
      </p>

      {/* Short-circuit conditional rendering */}
      {section === 'courses' && (
        <p style={{ color: "green" }}>You are exploring courses!</p>
      )}
    </div>
  );
}

export default App;
